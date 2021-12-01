package edu.aku.hassannaqvi.hfa_rapidsurvey.ui.list_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import edu.aku.hassannaqvi.hfa_rapidsurvey.R
import edu.aku.hassannaqvi.hfa_rapidsurvey.adapter.PendingListAdapter
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp
import edu.aku.hassannaqvi.hfa_rapidsurvey.databinding.ActivityPendingFormsBinding
import edu.aku.hassannaqvi.hfa_rapidsurvey.models.Forms


class PendingFormsActivity : AppCompatActivity() {

    lateinit var bi: ActivityPendingFormsBinding
    lateinit var adapter: PendingListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pending_forms)
        bi.callback = this

        val unclosedForms = MainApp.appInfo.dbHelper.unclosedForms
        setupRecyclerView(unclosedForms)
    }

    private fun setupRecyclerView(forms_lst: MutableList<Forms>) {
        adapter = PendingListAdapter(this, forms_lst)
        bi.recyclerView.layoutManager = LinearLayoutManager(this)
        bi.recyclerView.adapter = adapter
    }
}
