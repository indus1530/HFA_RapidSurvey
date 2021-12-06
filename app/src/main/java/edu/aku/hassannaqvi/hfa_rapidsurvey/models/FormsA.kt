package edu.aku.hassannaqvi.hfa_rapidsurvey.models

import android.database.Cursor
import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.PropertyChangeRegistry
import edu.aku.hassannaqvi.hfa_rapidsurvey.BR
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables.FormsTable
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp._EMPTY_
import edu.aku.hassannaqvi.hfa_rapidsurvey.utils.CreateTable.PROJECT_NAME
import org.json.JSONException
import org.json.JSONObject
import kotlin.properties.Delegates


class FormsA : BaseObservable() {
    private val TAG = "FormsA"

    @Transient
    private var propertyChangeRegistry: PropertyChangeRegistry = PropertyChangeRegistry()

    private var projectName: String = PROJECT_NAME
    private var id: String = _EMPTY_
    private var uid: String = _EMPTY_
    private var userName = _EMPTY_
    private var sysdate = _EMPTY_
    private var istatus = _EMPTY_
    private var istatus96x = _EMPTY_
    private val endingdatetime = _EMPTY_
    private var deviceID = _EMPTY_
    private var devicetagID = _EMPTY_
    private var synced = _EMPTY_
    private var synced_date = _EMPTY_
    private val synced02 = _EMPTY_
    private val synced_date03 = _EMPTY_
    private var appversion = _EMPTY_
    private var districtCode = _EMPTY_
    private var districtType = _EMPTY_
    private var districtName = _EMPTY_
    private var tehsilCode = _EMPTY_
    private var tehsilName = _EMPTY_
    private var ucCode = _EMPTY_
    private var ucName = _EMPTY_
    private var hfCode = _EMPTY_
    private var hfName = _EMPTY_
    private var a103d = _EMPTY_
    private var a103m = _EMPTY_
    private var a103y = _EMPTY_
    var a110 = _EMPTY_
    var a111 = _EMPTY_


    @get:Bindable
    var a114: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a114)
    }

    @get:Bindable
    var a115: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a115)
    }

    @get:Bindable
    var a116: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a116)
    }

    @get:Bindable
    var a117: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a117)
    }

    @get:Bindable
    var a118: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a118)
    }

    @get:Bindable
    var a11896x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a11896x)
    }

    @get:Bindable
    var a119: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a119)
    }

    @get:Bindable
    var a11996x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a11996x)
    }

    @get:Bindable
    var a120: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a120)
    }

    @get:Bindable
    var a121: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a121)
    }

    @get:Bindable
    var a122: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.a122)
    }

    @get:Bindable
    var b101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.b101)
    }

    @get:Bindable
    var b102: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (b102.equals("2")) {
            this.b103 = ""
            this.b104 = ""
            this.b105 = ""
        }
        notifyPropertyChanged(BR.b102)
    }

    @get:Bindable
    var b103: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.b103)
    }

    @get:Bindable
    var b104: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.b104)
    }

    @get:Bindable
    var b105: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.b105)
    }


    @get:Bindable
    var k101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k101)
    }

    @get:Bindable
    var k102: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k102)
    }

    @get:Bindable
    var k1031: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1031.equals("2")) this.k1031x = ""
        notifyPropertyChanged(BR.k1031)
    }

    @get:Bindable
    var k1031x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1031x)
    }

    @get:Bindable
    var k1032: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1032.equals("2")) this.k1032x = ""
        notifyPropertyChanged(BR.k1032)
    }

    @get:Bindable
    var k1032x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1032x)
    }

    @get:Bindable
    var k1033: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1033.equals("2")) this.k1033x = ""
        notifyPropertyChanged(BR.k1033)
    }

    @get:Bindable
    var k1033x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1033x)
    }

    @get:Bindable
    var k1034: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1034.equals("2")) this.k1034x = ""
        notifyPropertyChanged(BR.k1034)
    }

    @get:Bindable
    var k1034x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1034x)
    }

    @get:Bindable
    var k1035: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1035.equals("2")) this.k1035x = ""
        notifyPropertyChanged(BR.k1035)
    }

    @get:Bindable
    var k1035x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1035x)
    }

    @get:Bindable
    var k1036: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1036.equals("2")) this.k1036x = ""
        notifyPropertyChanged(BR.k1036)
    }

    @get:Bindable
    var k1036x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1036x)
    }

    @get:Bindable
    var k1037: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k1037.equals("2")) this.k1037x = ""
        notifyPropertyChanged(BR.k1037)
    }

    @get:Bindable
    var k1037x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k1031x)
    }

    @get:Bindable
    var k10396: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (k10396.equals("2")) {
            this.k10396x = ""
            this.k10396y = ""
        }
        notifyPropertyChanged(BR.k10396)
    }

    @get:Bindable
    var k10396x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k10396x)
    }

    @get:Bindable
    var k10396y: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k10396y)
    }

    @get:Bindable
    var k104: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k104)
    }

    @get:Bindable
    var k10496x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k10496x)
    }

    @get:Bindable
    var k105: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k105)
    }

    @get:Bindable
    var k106: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.k106)
    }


    @Throws(JSONException::class)
    fun Hydrate(cursor: Cursor): FormsA? {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID))
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID))
        this.projectName =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME))
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME))
        this.sysdate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE))
        this.deviceID = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID))
        this.devicetagID =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID))
        this.appversion =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION))
        this.istatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS))
        this.istatus96x =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS96x))
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED))
        this.synced_date =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE))
        this.districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_CODE))
        this.districtType =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_TYPE))
        this.districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_NAME))
        this.tehsilCode =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_TEHSIL_CODE))
        this.tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_TEHSIL_NAME))
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UC_CODE))
        this.ucName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UC_NAME))
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HF_CODE))
        this.hfName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HF_NAME))
        this.a103d = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A103D))
        this.a103m = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A103M))
        this.a103y = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A103Y))
        this.a110 = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A110))
        this.a111 = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A111))
        sKHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SK)))
        return this
    }

    @Throws(JSONException::class)
    fun sKHydrate(string: String?) {
        Log.d(TAG, "sKHydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            this.k101 = json.getString("k101")
            this.k102 = json.getString("k102")
            this.k1031 = json.getString("k1031")
            this.k1031x = json.getString("k1031x")
            this.k1032 = json.getString("k10312")
            this.k1032x = json.getString("k1032x")
            this.k1033 = json.getString("k1033")
            this.k1033x = json.getString("k1033x")
            this.k1034 = json.getString("k1034")
            this.k1034x = json.getString("k1034x")
            this.k1035 = json.getString("k1035")
            this.k1035x = json.getString("k1035x")
            this.k1036 = json.getString("k1036")
            this.k1036x = json.getString("k1036x")
            this.k1037 = json.getString("k1037")
            this.k1037x = json.getString("k1037x")
            this.k10396 = json.getString("k10396")
            this.k10396x = json.getString("k10396x")
            this.k10396y = json.getString("k10396y")
            this.k104 = json.getString("k104")
            this.k10496x = json.getString("k10496x")
            this.k105 = json.getString("k105")
            this.k106 = json.getString("k106")
        }
    }

    @Throws(JSONException::class)
    fun sBHydrate(string: String?) {
        Log.d(TAG, "sBHydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            this.a114 = json.getString("a14")
            this.a115 = json.getString("a15")
            this.a116 = json.getString("a16")
            this.a117 = json.getString("a17")
            this.a118 = json.getString("a18")
            this.a11896x = json.getString("a1896x")
            this.a119 = json.getString("a19")
            this.a11996x = json.getString("a1996x")
            this.a120 = json.getString("a20")
            this.a121 = json.getString("a21")
            this.a122 = json.getString("a22")
            this.b101 = json.getString("b01")
            this.b102 = json.getString("b02")
            this.b103 = json.getString("b03")
            this.b104 = json.getString("b04")
            this.b105 = json.getString("b05")
        }
    }


    @Throws(JSONException::class)
    fun toJSONObject(): JSONObject? {
        val json = JSONObject()
        json.put(FormsTable.COLUMN_ID, this.id)
        json.put(FormsTable.COLUMN_UID, this.uid)
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName)
        json.put(FormsTable.COLUMN_USERNAME, this.userName)
        json.put(FormsTable.COLUMN_SYSDATE, this.sysdate)
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID)
        json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID)
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus)
        json.put(FormsTable.COLUMN_ISTATUS96x, this.istatus96x)
        json.put(FormsTable.COLUMN_SYNCED, this.synced)
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date)
        json.put(FormsTable.COLUMN_APPVERSION, this.appversion)
        json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode)
        json.put(FormsTable.COLUMN_DISTRICT_TYPE, this.districtType)
        json.put(FormsTable.COLUMN_DISTRICT_NAME, this.districtName)
        json.put(FormsTable.COLUMN_TEHSIL_CODE, this.tehsilCode)
        json.put(FormsTable.COLUMN_TEHSIL_NAME, this.tehsilName)
        json.put(FormsTable.COLUMN_UC_CODE, this.ucCode)
        json.put(FormsTable.COLUMN_UC_NAME, this.ucName)
        json.put(FormsTable.COLUMN_HF_CODE, this.hfCode)
        json.put(FormsTable.COLUMN_HF_NAME, this.hfName)
        json.put(FormsTable.COLUMN_A103D, this.a103d)
        json.put(FormsTable.COLUMN_A103M, this.a103m)
        json.put(FormsTable.COLUMN_A103Y, this.a103y)
        json.put(FormsTable.COLUMN_A110, this.a110)
        json.put(FormsTable.COLUMN_A111, this.a111)
        json.put(FormsTable.COLUMN_SK, JSONObject(sKtoString()))
        return json
    }

    @Throws(JSONException::class)
    fun sBtoString(): String? {
        Log.d(TAG, "sBtoString: ")
        val json = JSONObject()
        json.put("a14", a114)
            .put("a15", a115)
            .put("a16", a116)
            .put("a17", a117)
            .put("a18", a118)
            .put("a1896x", a11896x)
            .put("a19", a119)
            .put("a1996x", a11996x)
            .put("a20", a120)
            .put("a21", a121)
            .put("a22", a122)
            .put("b01", b101)
            .put("b02", b102)
            .put("b03", b103)
            .put("b04", b104)
            .put("b05", b105)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sKtoString(): String? {
        Log.d(TAG, "sKtoString: ")
        val json = JSONObject()
        json.put("k101", k101)
            .put("k102", k102)
            .put("k1031", k1031)
            .put("k1031x", k1031x)
            .put("k1032", k1032)
            .put("k1032x", k1032x)
            .put("k1033", k1033)
            .put("k1033x", k1033x)
            .put("k1034", k1034)
            .put("k1034x", k1034x)
            .put("k1035", k1035)
            .put("k1035x", k1035x)
            .put("k1036", k1036)
            .put("k1036x", k1036x)
            .put("k1037", k1037)
            .put("k1037x", k1037x)
            .put("k10396", k10396)
            .put("k10396x", k10396x)
            .put("k10396y", k10396y)
            .put("k104", k104)
            .put("k10496x", k10496x)
            .put("k105", k105)
            .put("k106", k106)
        return json.toString()
    }
}