package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.other;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.DownloadManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import edu.aku.hassannaqvi.hfa_rapidsurvey.R;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.VersionAppContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper;
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.list_activity.FormsReportDate;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.list_activity.PendingFormsActivity;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.hfa_rapidsurvey.ui.sync.SyncActivity;
import edu.aku.hassannaqvi.hfa_rapidsurvey.utils.CreateTable;

public class MainActivity extends AppCompatActivity {

    static File file;
    private final String TAG = "MainActivity";
    ActivityMainBinding bi;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    String dtToday1 = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    ProgressDialog mProgressDialog;
    ArrayList<String> lablesAreas;
    Map<String, String> AreasMap;
    SharedPreferences sharedPrefDownload;
    SharedPreferences.Editor editorDownload;
    DownloadManager downloadManager;
    String preVer = "", newVer = "";
    VersionAppContract versionAppContract;
    DatabaseHelper db;
    Long refID;

    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(intent.getAction())) {

                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(sharedPrefDownload.getLong("refID", 0));

                downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                assert downloadManager != null;
                Cursor cursor = downloadManager.query(query);
                if (cursor.moveToFirst()) {
                    int colIndex = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
                    if (DownloadManager.STATUS_SUCCESSFUL == cursor.getInt(colIndex)) {

                        editorDownload.putBoolean("flag", true);
                        editorDownload.commit();

                        Toast.makeText(context, "New App downloaded!!", Toast.LENGTH_SHORT).show();
                        bi.lblAppVersion.setText(new StringBuilder(R.string.app_name + " App New Version ").append(newVer).append("  Downloaded"));

                        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
                        List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);

                        if (Objects.requireNonNull(taskInfo.get(0).topActivity).getClassName().equals(MainActivity.class.getName())) {
                            showDialog(newVer, preVer);
                        }
                    }
                }
            }
        }
    };
    private ProgressDialog pd;
    private Boolean exit = false;
    private String rSumText = "";

    private void loadTagDialog() {
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();
        if (!sharedPref.contains("tagName") && sharedPref.getString("tagName", null) == null) {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.tagimg);
            img.setPadding(0, 15, 0, 15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.apply();
                        MainApp.appInfo.setTagName(m_Text);
                        dialog.dismiss();
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }

    }

    void showDialog(String newVer, String preVer) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        DialogFragment newFragment = MyDialogFragment.newInstance(newVer, preVer);
        newFragment.show(ft, "dialog");

    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }

    public void OpenFormFunc(int id) {
        Intent oF = null;
        switch (id) {
            case R.id.formA:
                oF = new Intent(this, SectionAActivity.class);
                break;
           /* case R.id.formB:
                oF = new Intent(this, SectionBActivity.class);
                break;
            case R.id.formC:
                oF = new Intent(this, SectionC1Activity.class);
                break;
            case R.id.formD:
                oF = new Intent(this, SectionD1Activity.class);
                break;
            case R.id.formE:
                oF = new Intent(this, SectionE1Activity.class);
                break;
            case R.id.formF:
                oF = new Intent(this, SectionF1Activity.class);
                break;
            case R.id.formG:
                oF = new Intent(this, SectionG1Activity.class);
                break;
            case R.id.formH:
                oF = new Intent(this, SectionH1Activity.class);
                break;
            case R.id.formI:
                oF = new Intent(this, SectionI1Activity.class);
                break;
            case R.id.formJ:
                oF = new Intent(this, SectionJ1Activity.class);
                break;*/
        }
        startActivity(oF);
    }


    public void openDB() {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void syncServer() {
        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            startActivity(new Intent(this, SyncActivity.class));
        } else {
            Toast.makeText(this, "No network connection available!", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncFamilyMembers() {
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            // Sync Random
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();
            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();
        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity

            startActivity(new Intent(this, LoginActivity.class));

        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.onSync:
                startActivity(new Intent(MainActivity.this, SyncActivity.class));
                break;
        }

        if (item.getItemId() == R.id.checkOpenForms) {
            startActivity(new Intent(MainActivity.this, PendingFormsActivity.class));
        }
        if (item.getItemId() == R.id.formsReportDate) {
            startActivity(new Intent(MainActivity.this, FormsReportDate.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

        Collection<FormsContract> todaysForms = db.getTodayForms(sysdateToday);
        Collection<FormsContract> unsyncedForms = db.getUnsyncedForms(1);
        Collection<FormsContract> unclosedForms = db.getUnclosedForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today" + "(" + dtToday1 + "): " + todaysForms.size() + "\r\n";
        if (todaysForms.size() > 0) {
            String iStatus;
            rSumText += "---------------------------------------------------------\r\n";
            rSumText += "[    Health Facility   ][ S/P ][Form Status][Sync Status]\r\n";
            rSumText += "---------------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                Log.d(TAG, "onCreate: '" + fc.getIstatus() + "'");
                switch (fc.getIstatus()) {
                    case "1":
                        iStatus = "Complete     ";
                        break;
                    case "2":
                        iStatus = "Incomplete   ";
                        break;
                    case "":
                        iStatus = "Open";
                        break;
                    default:
                        iStatus = "\t\tN/A" + fc.getIstatus();
                }

                fc.setHfName(fc.getHfName() + ".......................");
                rSumText += fc.getHfName().substring(0, 21) + "...";


                int staffCount = db.getStaffingsByUUID(fc.get_UID());
                int patientCount = db.getPatientsByUUID(fc.get_UID());
                rSumText += "  " + staffCount + "/" + patientCount + "  ";


                rSumText += iStatus;

                rSumText += (fc.getSynced() == null ? "Not Synced" : "Synced");
                rSumText += "\r\n";
                rSumText += "---------------------------------------------------------\r\n";
            }
        }
        SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
        rSumText += "\r\nDEVICE INFORMATION\r\n";
        rSumText += "  ========================================================\r\n";

        rSumText += "\t|| Open Forms: \t\t\t\t\t\t" + String.format("%02d", unclosedForms.size());
        rSumText += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t||\r\n";
        rSumText += "\t|| Unsynced Forms: \t\t\t\t" + String.format("%02d", unsyncedForms.size());
        rSumText += "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t||\r\n";
        rSumText += "\t|| Last Data Download: \t\t" + syncPref.getString("LastDataDownload", "Never Downloaded   ");
        rSumText += "\t\t\t\t\t\t||\r\n";
        rSumText += "\t|| Last Data Upload: \t\t\t" + syncPref.getString("LastDataUpload", "Never Uploaded     ");
        rSumText += "\t\t\t\t\t\t||\r\n";
        rSumText += "\t|| Last Photo Upload: \t\t" + syncPref.getString("LastPhotoUpload", "Never Uploaded     ");
        rSumText += "\t\t\t\t\t\t||\r\n";
        rSumText += "\t========================================================\r\n";


        if (MainApp.admin) {
            bi.databaseBtn.setVisibility(View.VISIBLE);
        } else {
            bi.databaseBtn.setVisibility(View.GONE);
        }
        Log.d(TAG, "onCreate: " + rSumText);
        bi.recordSummary.setText(rSumText);

        // Auto download app
        sharedPrefDownload = getSharedPreferences("appDownload", MODE_PRIVATE);
        editorDownload = sharedPrefDownload.edit();
        versionAppContract = db.getVersionApp();
        if (versionAppContract.getVersioncode() != null) {

            preVer = MainApp.appInfo.getVersionName() + "." + MainApp.appInfo.getVersionCode();
            newVer = versionAppContract.getVersionname() + "." + versionAppContract.getVersioncode();

            if (MainApp.appInfo.getVersionCode() < Integer.parseInt(versionAppContract.getVersioncode())) {
                bi.lblAppVersion.setVisibility(View.VISIBLE);

                String fileName = CreateTable.DATABASE_NAME.replace(".db", "-New-Apps");
                file = new File(Environment.getExternalStorageDirectory() + File.separator + fileName, versionAppContract.getPathname());

                if (file.exists()) {
                    bi.lblAppVersion.setText(new StringBuilder(R.string.app_name + " New Version ").append(newVer).append("  Downloaded"));
                    showDialog(newVer, preVer);
                } else {
                    NetworkInfo networkInfo = ((ConnectivityManager) Objects.requireNonNull(getSystemService(Context.CONNECTIVITY_SERVICE))).getActiveNetworkInfo();
                    if (networkInfo != null && networkInfo.isConnected()) {
                        bi.lblAppVersion.setText(new StringBuilder(R.string.app_name + " App New Version ").append(newVer).append("  Downloading.."));
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse(MainApp._UPDATE_URL + versionAppContract.getPathname());
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setDestinationInExternalPublicDir(fileName, versionAppContract.getPathname())
                                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                                .setTitle("Downloading " + R.string.app_name + " App new App ver." + newVer);
                        refID = downloadManager.enqueue(request);

                        editorDownload.putLong("refID", refID);
                        editorDownload.putBoolean("flag", false);
                        editorDownload.apply();

                    } else {
                        bi.lblAppVersion.setText(new StringBuilder(R.string.app_name + " App New Version ").append(newVer).append("  Available..\n(Can't download.. Internet connectivity issue!!)"));
                    }
                }

            } else {
                bi.lblAppVersion.setVisibility(View.GONE);
                bi.lblAppVersion.setText(null);
            }
        }
        registerReceiver(broadcastReceiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

//        Testing visibility
        if (Integer.parseInt(MainApp.appInfo.getVersionName().split("\\.")[0]) > 0) {
            bi.testing.setVisibility(View.GONE);
        } else {
            bi.testing.setVisibility(View.VISIBLE);
        }

        //loadTagDialog();

    }

    public void gotoC1(View view) {
    }

    public static class MyDialogFragment extends DialogFragment {

        String newVer, preVer;

        static MyDialogFragment newInstance(String newVer, String preVer) {
            MyDialogFragment f = new MyDialogFragment();

            Bundle args = new Bundle();
            args.putString("newVer", newVer);
            args.putString("preVer", preVer);
            f.setArguments(args);

            return f;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            newVer = getArguments().getString("newVer");
            preVer = getArguments().getString("preVer");

            return new AlertDialog.Builder(getActivity())
                    .setIcon(R.drawable.exclamation)
                    .setTitle(R.string.app_name + " APP is available!")
                    .setCancelable(false)
                    .setMessage(R.string.app_name + " App " + newVer + " is now available. Your are currently using older version " + preVer + ".\nInstall new version to use this app.")
                    .setPositiveButton("INSTALL!!",
                            (dialog, whichButton) -> {
                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                            }
                    )
                    .create();
        }

    }

}
