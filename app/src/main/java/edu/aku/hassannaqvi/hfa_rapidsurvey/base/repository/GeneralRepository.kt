package edu.aku.hassannaqvi.hfa_rapidsurvey.base.repository

import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.UsersContract
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.DatabaseHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

open class GeneralRepository(private val db: DatabaseHelper) : GeneralDataSource {

    override suspend fun getLoginInformation(username: String, password: String): UsersContract =
        withContext(Dispatchers.IO) {
            db.getLoginUser(username, password)
        }

}