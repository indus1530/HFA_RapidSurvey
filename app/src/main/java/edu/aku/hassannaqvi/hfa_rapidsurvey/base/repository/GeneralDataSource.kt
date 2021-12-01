package edu.aku.hassannaqvi.hfa_rapidsurvey.base.repository

import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.UsersContract

interface GeneralDataSource {

    //For login Start
    suspend fun getLoginInformation(username: String, password: String): UsersContract
    //For login End

}