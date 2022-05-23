package edu.aku.hassannaqvi.hfa_rapidsurvey.utils;

import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.DistrictContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.HFContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.PatientsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.StaffingContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables.FormsTable;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.TehsilsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.UCsContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.UsersContract;
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.VersionAppContract;

public final class CreateTable {

    public static final String DATABASE_NAME = "uen_hfa_ml.db";
    public static final String DB_NAME = "uen_hfa_ml_copy.db";
    public static final String PROJECT_NAME = "UEN_HFA_ML2020";
    public static final int DATABASE_VERSION = 1;

    public static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + FormsTable.COLUMN_DISTRICT_TYPE + " TEXT,"
            + FormsTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + FormsTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + FormsTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + FormsTable.COLUMN_UC_CODE + " TEXT,"
            + FormsTable.COLUMN_UC_NAME + " TEXT,"
            + FormsTable.COLUMN_HF_CODE + " TEXT,"
            + FormsTable.COLUMN_HF_NAME + " TEXT,"
            + FormsTable.COLUMN_A103D + " TEXT,"
            + FormsTable.COLUMN_A103M + " TEXT,"
            + FormsTable.COLUMN_A103Y + " TEXT,"
            + FormsTable.COLUMN_A110 + " TEXT,"
            + FormsTable.COLUMN_A111 + " TEXT,"
            + FormsTable.COLUMN_SB + " TEXT,"
            + FormsTable.COLUMN_SC + " TEXT,"
            + FormsTable.COLUMN_SD + " TEXT,"
            + FormsTable.COLUMN_SE + " TEXT,"
            + FormsTable.COLUMN_SF + " TEXT,"
            + FormsTable.COLUMN_SG + " TEXT,"
            + FormsTable.COLUMN_SH + " TEXT,"
            + FormsTable.COLUMN_SI + " TEXT,"
            + FormsTable.COLUMN_SJ + " TEXT,"
            + FormsTable.COLUMN_SK + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCDATE + " TEXT,"
            + FormsTable.COLUMN_SYNCED_02 + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE_02 + " TEXT,"
            + FormsTable.COLUMN_SYNCED_03 + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE_03 + " TEXT"
            + " );";

    public static final String SQL_CREATE_MODULED = "CREATE TABLE "
            + Tables.ModuleDTable.TABLE_NAME + "("
            + Tables.ModuleDTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Tables.ModuleDTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_UID + " TEXT,"
            + Tables.ModuleDTable.COLUMN_USERNAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SYSDATE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_DISTRICT_TYPE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_UC_CODE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_UC_NAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_HF_CODE + " TEXT,"
            + Tables.ModuleDTable.COLUMN_HF_NAME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD1 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD2 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD3 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD4 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD5 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD6 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD7 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SD8 + " TEXT,"
            + Tables.ModuleDTable.COLUMN_APPVERSION + " TEXT,"
            + Tables.ModuleDTable.COLUMN_ISTATUS + " TEXT,"
            + Tables.ModuleDTable.COLUMN_ISTATUS96x + " TEXT,"
            + Tables.ModuleDTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Tables.ModuleDTable.COLUMN_DEVICEID + " TEXT,"
            + Tables.ModuleDTable.COLUMN_DEVICETAG + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SYNCED + " TEXT,"
            + Tables.ModuleDTable.COLUMN_SYNCDATE + " TEXT"
            + " );";


    public static final String SQL_CREATE_TSCONTRACT = "CREATE TABLE " + StaffingContract.StaffingTable.TABLE_NAME + "("
            + StaffingContract.StaffingTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + StaffingContract.StaffingTable.COLUMN_UID + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_UUID + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_SYSDATE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_USERNAME + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_SERIALNO + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_DISTRICT_TYPE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_UC_CODE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_HF_CODE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_SC2 + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_DEVICEID + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_DEVICETAGID + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_SYNCED + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_SYNCED_DATE + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_STATUS + " TEXT,"
            + StaffingContract.StaffingTable.COLUMN_APPVERSION + " TEXT"
            + " );";


    public static final String SQL_CREATE_PSCONTRACT = "CREATE TABLE " + PatientsContract.PatientsTable.TABLE_NAME + "("
            + PatientsContract.PatientsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PatientsContract.PatientsTable.COLUMN_UID + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_UUID + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SYSDATE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_USERNAME + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SERIALNO + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_DISTRICT_TYPE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_UC_CODE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_HF_CODE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SI1 + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SI2 + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SI3 + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SI4 + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_DEVICEID + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_DEVICETAGID + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SYNCED + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_STATUS + " TEXT,"
            + PatientsContract.PatientsTable.COLUMN_APPVERSION + " TEXT"
            + " );";


    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT"
            + " );";


    public static final String SQL_CREATE_VERSIONAPP = "CREATE TABLE " + VersionAppContract.VersionAppTable.TABLE_NAME + " (" +
            VersionAppContract.VersionAppTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VersionAppContract.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
            VersionAppContract.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
            VersionAppContract.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
            ");";


    public static final String SQL_CREATE_DISTRICTS = "CREATE TABLE " + DistrictContract.singleDistrict.TABLE_NAME + "("
            + DistrictContract.singleDistrict._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DistrictContract.singleDistrict.COLUMN_DISTRICT_CODE + " TEXT,"
            + DistrictContract.singleDistrict.COLUMN_DISTRICT_NAME + " TEXT,"
            + DistrictContract.singleDistrict.COLUMN_DISTRICT_TYPE + " TEXT );";


    public static final String SQL_CREATE_TEHSILS = "CREATE TABLE " + TehsilsContract.singleTehsil.TABLE_NAME + "("
            + TehsilsContract.singleTehsil._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TehsilsContract.singleTehsil.COLUMN_TEHSIL_CODE + " TEXT,"
            + TehsilsContract.singleTehsil.COLUMN_TEHSIL_NAME + " TEXT,"
            + TehsilsContract.singleTehsil.COLUMN_DISTRICT_CODE + " TEXT );";


    public static final String SQL_CREATE_UCS = "CREATE TABLE " + UCsContract.singleUCs.TABLE_NAME + "("
            + UCsContract.singleUCs._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCsContract.singleUCs.COLUMN_UC_CODE + " TEXT,"
            + UCsContract.singleUCs.COLUMN_TEHSIL_CODE + " TEXT,"
            + UCsContract.singleUCs.COLUMN_UC_NAME + " TEXT );";


    public static final String SQL_CREATE_HF = "CREATE TABLE " + HFContract.singleHF.TABLE_NAME + "("
            + HFContract.singleHF._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + HFContract.singleHF.COLUMN_HF_CODE + " TEXT,"
            + HFContract.singleHF.COLUMN_TEHSIL_CODE + " TEXT,"
            + HFContract.singleHF.COLUMN_HF_NAME + " TEXT,"
            + HFContract.singleHF.COLUMN_HF_TYPE + " TEXT );";

}
