package edu.aku.hassannaqvi.hfa_rapidsurvey.contracts;

import android.provider.BaseColumns;

public class Tables {

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "Forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "userName";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_TYPE = "districtType";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_TEHSIL_NAME = "tehsilName";
        public static final String COLUMN_UC_CODE = "ucCode";
        public static final String COLUMN_UC_NAME = "ucName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_A103D = "a103d";
        public static final String COLUMN_A103M = "a103m";
        public static final String COLUMN_A103Y = "a103y";
        public static final String COLUMN_A110 = "a110";
        public static final String COLUMN_A111 = "a111";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";
        public static final String COLUMN_SE = "sE";
        public static final String COLUMN_SF = "sF";
        public static final String COLUMN_SG = "sG";
        public static final String COLUMN_SH = "sH";
        public static final String COLUMN_SI = "sI";
        public static final String COLUMN_SJ = "sJ";
        public static final String COLUMN_SK = "sK";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDATE = "gpsdate";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_SYNCED_02 = "synced_02";
        public static final String COLUMN_SYNCED_DATE_02 = "synced_date_02";
        public static final String COLUMN_SYNCED_03 = "synced_03";
        public static final String COLUMN_SYNCED_DATE_03 = "synced_date_03";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class PatientsTable implements BaseColumns {
        public static final String TABLE_NAME = "patients";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_USERNAME = "userName";
        public static final String COLUMN_SERIALNO = "serialno";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_TYPE = "districtType";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_UC_CODE = "ucCode";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_SI1 = "sI1";
        public static final String COLUMN_SI2 = "sI2";
        public static final String COLUMN_SI3 = "sI3";
        public static final String COLUMN_SI4 = "sI4";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }


    public static abstract class StaffingTable implements BaseColumns {
        public static final String TABLE_NAME = "staffing";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_USERNAME = "userName";
        public static final String COLUMN_SERIALNO = "serialno";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_TYPE = "districtType";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_UC_CODE = "ucCode";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_SC2 = "sC2";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";

    }


    public static abstract class HFTable implements BaseColumns {
        public static final String _ID = "_id";
        public static final String TABLE_NAME = "healthfacilities";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";
        public static final String COLUMN_HF_TYPE = "hf_type";
        public static final String COLUMN_HF_NAME = "hf_name";
        public static final String COLUMN_HF_CODE = "hf_uen_code";
    }


    public static abstract class TehsilTable implements BaseColumns {
        public static final String TABLE_NAME = "tehsils";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";
        public static final String COLUMN_TEHSIL_NAME = "tehsil_name";
        public static final String COLUMN_DISTRICT_CODE = "district_code";
    }


    public static abstract class UCTable implements BaseColumns {
        public static final String _ID = "_id";
        public static final String TABLE_NAME = "ucs";
        public static final String COLUMN_UC_CODE = "uc_code";
        public static final String COLUMN_UC_NAME = "uc_name";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";
    }

    public static abstract class UserTable implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String _ID = "id";
        public static final String ROW_USERNAME = "username";
        public static final String ROW_PASSWORD = "password";
        public static final String DIST_ID = "dist_id";
    }

    public static abstract class VersionAppTable implements BaseColumns {
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
    }


}
