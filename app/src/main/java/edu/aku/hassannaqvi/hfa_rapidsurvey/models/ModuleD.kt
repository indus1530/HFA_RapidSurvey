package edu.aku.hassannaqvi.hfa_rapidsurvey.models

import android.database.Cursor
import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import edu.aku.hassannaqvi.hfa_rapidsurvey.BR
import edu.aku.hassannaqvi.hfa_rapidsurvey.contracts.Tables.ModuleDTable
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp
import edu.aku.hassannaqvi.hfa_rapidsurvey.core.MainApp._EMPTY_
import edu.aku.hassannaqvi.hfa_rapidsurvey.utils.CreateTable.PROJECT_NAME
import org.json.JSONException
import org.json.JSONObject
import kotlin.properties.Delegates


class ModuleD : BaseObservable(), Observable {
    private val TAG = "ModuleD"

    @Transient
    private var propertyChangeRegistry: PropertyChangeRegistry = PropertyChangeRegistry()

    var projectName: String = PROJECT_NAME
    var id: String = _EMPTY_
    var uid: String = _EMPTY_
    var uuid: String = _EMPTY_
    var userName = _EMPTY_
    var sysdate = _EMPTY_
    var istatus = _EMPTY_
    var istatus96x = _EMPTY_
    val endingTime = _EMPTY_
    var deviceID = _EMPTY_
    var deviceTag = _EMPTY_
    var synced = _EMPTY_
    var syncDate = _EMPTY_
    var appversion = _EMPTY_
    var districtCode = _EMPTY_
    var districtType = _EMPTY_
    var districtName = _EMPTY_
    var tehsilCode = _EMPTY_
    var tehsilName = _EMPTY_
    var ucCode = _EMPTY_
    var ucName = _EMPTY_
    var hfCode = _EMPTY_
    var hfName = _EMPTY_


    fun populateMeta() {
        sysdate = MainApp.form.sysdate
        userName = MainApp.userName
        deviceID = MainApp.deviceId
        uuid = MainApp.form.uid
        appversion = MainApp.appInfo.appVersion
        projectName = PROJECT_NAME
        setVillageCode(MainApp.villageCode)
        setHhid(MainApp.selectedHHID)
    }

    @get:Bindable
    var d101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d101)
    }

    @get:Bindable
    var d102: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d102)
    }


    @get:Bindable
    var d201: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d201)
    }

    @get:Bindable
    var d202: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d202)
    }

    @get:Bindable
    var d203: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d203)
    }


    @get:Bindable
    var d301: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d301)
    }

    @get:Bindable
    var d302: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d302)
    }

    @get:Bindable
    var d303: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d303)
    }

    @get:Bindable
    var d304: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d304)
    }


    @get:Bindable
    var d401: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d401)
    }

    @get:Bindable
    var d402: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d402)
    }

    @get:Bindable
    var d403: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d403)
    }

    @get:Bindable
    var d404: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d404)
    }

    @get:Bindable
    var d405: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d405)
    }

    @get:Bindable
    var d406: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d406)
    }

    @get:Bindable
    var d407: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d407)
    }

    @get:Bindable
    var d408: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d408)
    }

    @get:Bindable
    var d501: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d501)
    }

    @get:Bindable
    var d50211: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50211.equals("2")) {
            this.d50211c = ""
            this.d50212 = ""
            this.d50212c = ""
        }
        notifyPropertyChanged(BR.d50211)
    }

    @get:Bindable
    var d50211c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50211c)
    }

    @get:Bindable
    var d50212: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50212.equals("2")) this.d50212c = ""
        notifyPropertyChanged(BR.d50212)
    }

    @get:Bindable
    var d50212c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50212c)
    }

    @get:Bindable
    var d50221: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50221.equals("2")) {
            this.d50221c = ""
            this.d50222 = ""
            this.d50222c = ""
        }
        notifyPropertyChanged(BR.d50221)
    }

    @get:Bindable
    var d50221c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50221c)
    }

    @get:Bindable
    var d50222: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50222.equals("2")) this.d50222c = ""
        notifyPropertyChanged(BR.d50222)
    }

    @get:Bindable
    var d50222c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50222c)
    }

    @get:Bindable
    var d50231: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50231.equals("2")) {
            this.d50231c = ""
            this.d50232 = ""
            this.d50232c = ""
        }
        notifyPropertyChanged(BR.d50231)
    }

    @get:Bindable
    var d50231c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50231c)
    }

    @get:Bindable
    var d50232: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50232.equals("2")) this.d50232c = ""
        notifyPropertyChanged(BR.d50232)
    }

    @get:Bindable
    var d50232c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50232c)
    }

    @get:Bindable
    var d50241: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50241.equals("2")) {
            this.d50241c = ""
            this.d50242 = ""
            this.d50242c = ""
        }
        notifyPropertyChanged(BR.d50241)
    }

    @get:Bindable
    var d50241c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50241c)
    }

    @get:Bindable
    var d50242: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d50242.equals("2")) this.d50242c = ""
        notifyPropertyChanged(BR.d50242)
    }

    @get:Bindable
    var d50242c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50242c)
    }

    @get:Bindable
    var d5031: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5031)
    }

    @get:Bindable
    var d5032: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5032)
    }

    @get:Bindable
    var d5033: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5033)
    }

    @get:Bindable
    var d5034: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5034)
    }

    @get:Bindable
    var d5035: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5035)
    }

    @get:Bindable
    var d5036: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5036)
    }

    @get:Bindable
    var d5037: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5037)
    }

    @get:Bindable
    var d5038: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d5038)
    }

    @get:Bindable
    var d601: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d601)
    }

    @get:Bindable
    var d602: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d602)
    }

    @get:Bindable
    var d603: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d603)
    }

    @get:Bindable
    var d604: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d604)
    }

    @get:Bindable
    var d605: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (d605.equals("2")) {
            this.d606 = ""
            this.d607 = ""
        }
        notifyPropertyChanged(BR.d605)
    }

    @get:Bindable
    var d606: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d606)
    }

    @get:Bindable
    var d607: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d607)
    }

    @get:Bindable
    var d608a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608a.equals(d608a)) return@observable
        notifyPropertyChanged(BR.d608a)
    }

    @get:Bindable
    var d608b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608b.equals(d608b)) return@observable
        notifyPropertyChanged(BR.d608b)
    }

    @get:Bindable
    var d608c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608c.equals(d608c)) return@observable
        notifyPropertyChanged(BR.d608c)
    }

    @get:Bindable
    var d608d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608d.equals(d608d)) return@observable
        notifyPropertyChanged(BR.d608d)
    }

    @get:Bindable
    var d608e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608e.equals(d608e)) return@observable
        notifyPropertyChanged(BR.d608e)
    }

    @get:Bindable
    var d608f: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608f.equals(d608f)) return@observable
        notifyPropertyChanged(BR.d608f)
    }

    @get:Bindable
    var d608g: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608g.equals(d608g)) return@observable
        notifyPropertyChanged(BR.d608g)
    }

    @get:Bindable
    var d608h: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608h.equals(d608h)) return@observable
        notifyPropertyChanged(BR.d608h)
    }


    @get:Bindable
    var d608i: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (this.d608i.equals(d608i)) return@observable
        notifyPropertyChanged(BR.d608i)
    }


    @get:Bindable
    var d701: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d70196x = if (d701.equals("96")) this.d70196x else ""
        notifyPropertyChanged(BR.d701)
    }

    @get:Bindable
    var d70196x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d70196x)
    }


    @get:Bindable
    var d702: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d70296x = if (d702.equals("96")) this.d70296x else ""
        notifyPropertyChanged(BR.d702)
    }

    @get:Bindable
    var d70296x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d70296x)
    }


    @get:Bindable
    var d703: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d703)
    }

    @get:Bindable
    var d7041: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d7041)
    }

    @get:Bindable
    var d7042: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d7042)
    }

    @get:Bindable
    var d7043: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d7043)
    }

    @get:Bindable
    var d7044: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d7044)
    }

    @get:Bindable
    var d7045: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d7045)
    }


    @get:Bindable
    var d8011: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8012 = if (d8011.equals("1")) this.d8012 else ""
        notifyPropertyChanged(BR.d8011)
    }

    @get:Bindable
    var d8012: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8012)
    }

    @get:Bindable
    var d8021: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8022 = if (d8021.equals("1")) this.d8022 else ""
        notifyPropertyChanged(BR.d8021)
    }

    @get:Bindable
    var d8022: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8022)
    }

    @get:Bindable
    var d8031: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8032 = if (d8031.equals("1")) this.d8032 else ""
        notifyPropertyChanged(BR.d8031)
    }

    @get:Bindable
    var d8032: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8032)
    }

    @get:Bindable
    var d8041: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8042 = if (d8041.equals("1")) this.d8042 else ""
        notifyPropertyChanged(BR.d8041)
    }

    @get:Bindable
    var d8042: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8042)
    }

    @get:Bindable
    var d8051: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8052 = if (d8051.equals("1")) this.d8052 else ""
        notifyPropertyChanged(BR.d8051)
    }

    @get:Bindable
    var d8052: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8052)
    }

    @get:Bindable
    var d8061: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8062 = if (d8061.equals("1")) this.d8062 else ""
        notifyPropertyChanged(BR.d8061)
    }

    @get:Bindable
    var d8062: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8062)
    }

    @get:Bindable
    var d8071: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8072 = if (d8071.equals("1")) this.d8072 else ""
        notifyPropertyChanged(BR.d8071)
    }

    @get:Bindable
    var d8072: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8072)
    }

    @get:Bindable
    var d8081: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8082 = if (d8081.equals("1")) this.d8082 else ""
        notifyPropertyChanged(BR.d8081)
    }

    @get:Bindable
    var d8082: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8082)
    }

    @get:Bindable
    var d8091: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8092 = if (d8091.equals("1")) this.d8092 else ""
        notifyPropertyChanged(BR.d8091)
    }

    @get:Bindable
    var d8092: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8092)
    }

    @get:Bindable
    var d8101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        this.d8102 = if (d8101.equals("1")) this.d8102 else ""
        notifyPropertyChanged(BR.d8101)
    }

    @get:Bindable
    var d8102: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d8102)
    }


    @Throws(JSONException::class)
    fun Hydrate(cursor: Cursor): ModuleD? {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_ID))
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UID))
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UUID))
        this.projectName =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_PROJECT_NAME))
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_USERNAME))
        this.sysdate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYSDATE))
        this.deviceID = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DEVICEID))
        this.deviceTag =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DEVICETAG))
        this.appversion =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_APPVERSION))
        this.istatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_ISTATUS))
        this.istatus96x =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_ISTATUS96x))
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYNCED))
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYNCDATE))
        this.districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DISTRICT_CODE))
        this.districtType =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DISTRICT_TYPE))
        this.districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DISTRICT_NAME))
        this.tehsilCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_TEHSIL_CODE))
        this.tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_TEHSIL_NAME))
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UC_CODE))
        this.ucName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UC_NAME))
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_HF_CODE))
        this.hfName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_HF_NAME))
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD1)))
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD2)))
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD3)))
        sD4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD4)))
        sD5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD5)))
        sD6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD6)))
        sD7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD7)))
        sD8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD8)))
        return this
    }

    @Throws(JSONException::class)
    fun sD1Hydrate(string: String?) {
        Log.d(TAG, "sD1Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d101 = json.getString("d101")
            d102 = json.getString("d102")
        }
    }

    @Throws(JSONException::class)
    fun sD2Hydrate(string: String?) {
        Log.d(TAG, "sD2Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d201 = json.getString("d201")
            d202 = json.getString("d202")
            d203 = json.getString("d203")
        }
    }

    @Throws(JSONException::class)
    fun sD3Hydrate(string: String?) {
        Log.d(TAG, "sD3Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d301 = json.getString("d301")
            d302 = json.getString("d302")
            d303 = json.getString("d303")
            d304 = json.getString("d304")
        }
    }

    @Throws(JSONException::class)
    fun sD4Hydrate(string: String?) {
        Log.d(TAG, "sD4Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d401 = json.getString("d401")
            d402 = json.getString("d402")
            d403 = json.getString("d403")
            d404 = json.getString("d404")
            d405 = json.getString("d405")
            d406 = json.getString("d406")
            d407 = json.getString("d407")
            d408 = json.getString("d408")
        }
    }

    @Throws(JSONException::class)
    fun sD5Hydrate(string: String?) {
        Log.d(TAG, "sD5Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d501 = json.getString("d501")
            d50211 = json.getString("d50211")
            d50211c = json.getString("d50211c")
            d50212 = json.getString("d50212")
            d50212c = json.getString("d50212c")
            d50221 = json.getString("d50221")
            d50221c = json.getString("d50221c")
            d50222 = json.getString("d50222")
            d50222c = json.getString("d50222c")
            d50231 = json.getString("d50231")
            d50231c = json.getString("d50231c")
            d50232 = json.getString("d50232")
            d50232c = json.getString("d50232c")
            d50241 = json.getString("d50241")
            d50241c = json.getString("d50241c")
            d50242 = json.getString("d50242")
            d50242c = json.getString("d50242c")
            d5031 = json.getString("d5031")
            d5032 = json.getString("d5032")
            d5033 = json.getString("d5033")
            d5034 = json.getString("d5034")
            d5035 = json.getString("d5035")
            d5036 = json.getString("d5036")
            d5037 = json.getString("d5037")
            d5038 = json.getString("d5038")
        }
    }

    @Throws(JSONException::class)
    fun sD6Hydrate(string: String?) {
        Log.d(TAG, "sD6Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d601 = json.getString("d601")
            d602 = json.getString("d602")
            d603 = json.getString("d603")
            d604 = json.getString("d604")
            d605 = json.getString("d605")
            d606 = json.getString("d606")
            d607 = json.getString("d607")
            d608a = json.getString("d608a")
            d608b = json.getString("d608b")
            d608c = json.getString("d608c")
            d608d = json.getString("d608d")
            d608e = json.getString("d608e")
            d608f = json.getString("d608f")
            d608g = json.getString("d608g")
            d608h = json.getString("d608h")
            d608i = json.getString("d608i")
        }
    }

    @Throws(JSONException::class)
    fun sD7Hydrate(string: String?) {
        Log.d(TAG, "sD7Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d701 = json.getString("d701")
            d70196x = json.getString("d70196x")
            d702 = json.getString("d702")
            d70296x = json.getString("d70296x")
            d703 = json.getString("d703")
            d7041 = json.getString("d7041")
            d7042 = json.getString("d7042")
            d7043 = json.getString("d7043")
            d7044 = json.getString("d7044")
            d7045 = json.getString("d7045")
        }
    }

    @Throws(JSONException::class)
    fun sD8Hydrate(string: String?) {
        Log.d(TAG, "sD8Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            d8011 = json.getString("d8011")
            d8012 = json.getString("d8012")
            d8021 = json.getString("d8021")
            d8022 = json.getString("d8022")
            d8031 = json.getString("d8031")
            d8032 = json.getString("d8032")
            d8041 = json.getString("d8041")
            d8042 = json.getString("d8042")
            d8051 = json.getString("d8051")
            d8052 = json.getString("d8052")
            d8061 = json.getString("d8061")
            d8062 = json.getString("d8062")
            d8071 = json.getString("d8071")
            d8072 = json.getString("d8072")
            d8081 = json.getString("d8081")
            d8082 = json.getString("d8082")
            d8091 = json.getString("d8091")
            d8092 = json.getString("d8092")
            d8101 = json.getString("d8101")
            d8102 = json.getString("d8102")
        }
    }


    @Throws(JSONException::class)
    fun toJSONObject(): JSONObject? {
        val json = JSONObject()
        json.put(ModuleDTable.COLUMN_ID, this.id)
        json.put(ModuleDTable.COLUMN_UID, this.uid)
        json.put(ModuleDTable.COLUMN_PROJECT_NAME, this.projectName)
        json.put(ModuleDTable.COLUMN_USERNAME, this.userName)
        json.put(ModuleDTable.COLUMN_SYSDATE, this.sysdate)
        json.put(ModuleDTable.COLUMN_DEVICEID, this.deviceID)
        json.put(ModuleDTable.COLUMN_DEVICETAG, this.deviceTag)
        json.put(ModuleDTable.COLUMN_ISTATUS, this.istatus)
        json.put(ModuleDTable.COLUMN_ISTATUS96x, this.istatus96x)
        json.put(ModuleDTable.COLUMN_SYNCED, this.synced)
        json.put(ModuleDTable.COLUMN_SYNCDATE, this.syncDate)
        json.put(ModuleDTable.COLUMN_APPVERSION, this.appversion)
        json.put(ModuleDTable.COLUMN_DISTRICT_CODE, this.districtCode)
        json.put(ModuleDTable.COLUMN_DISTRICT_TYPE, this.districtType)
        json.put(ModuleDTable.COLUMN_DISTRICT_NAME, this.districtName)
        json.put(ModuleDTable.COLUMN_TEHSIL_CODE, this.tehsilCode)
        json.put(ModuleDTable.COLUMN_TEHSIL_NAME, this.tehsilName)
        json.put(ModuleDTable.COLUMN_UC_CODE, this.ucCode)
        json.put(ModuleDTable.COLUMN_UC_NAME, this.ucName)
        json.put(ModuleDTable.COLUMN_HF_CODE, this.hfCode)
        json.put(ModuleDTable.COLUMN_HF_NAME, this.hfName)
        json.put(ModuleDTable.COLUMN_SD1, JSONObject(sD1toString()))
        json.put(ModuleDTable.COLUMN_SD2, JSONObject(sD2toString()))
        json.put(ModuleDTable.COLUMN_SD3, JSONObject(sD3toString()))
        json.put(ModuleDTable.COLUMN_SD4, JSONObject(sD4toString()))
        json.put(ModuleDTable.COLUMN_SD5, JSONObject(sD5toString()))
        json.put(ModuleDTable.COLUMN_SD6, JSONObject(sD6toString()))
        json.put(ModuleDTable.COLUMN_SD7, JSONObject(sD7toString()))
        json.put(ModuleDTable.COLUMN_SD8, JSONObject(sD8toString()))
        return json
    }

    @Throws(JSONException::class)
    fun sD1toString(): String? {
        Log.d(TAG, "sD1toString: ")
        val json = JSONObject()
        json.put("d101", d101)
            .put("d102", d102)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD2toString(): String? {
        Log.d(TAG, "sD2toString: ")
        val json = JSONObject()
        json.put("d201", d201)
            .put("d202", d202)
            .put("d203", d203)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD3toString(): String? {
        Log.d(TAG, "sD3toString: ")
        val json = JSONObject()
        json.put("d301", d301)
            .put("d302", d302)
            .put("d303", d303)
            .put("d304", d304)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD4toString(): String? {
        Log.d(TAG, "sD4toString: ")
        val json = JSONObject()
        json.put("d401", d401)
            .put("d402", d402)
            .put("d403", d403)
            .put("d404", d404)
            .put("d405", d405)
            .put("d406", d406)
            .put("d407", d407)
            .put("d408", d408)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD5toString(): String? {
        Log.d(TAG, "sD5toString: ")
        val json = JSONObject()
        json.put("d501", d501)
            .put("d50211", d50211)
            .put("d50211c", d50211c)
            .put("d50212", d50212)
            .put("d50212c", d50212c)
            .put("d50221", d50221)
            .put("d50221c", d50221c)
            .put("d50222", d50222)
            .put("d50222c", d50222c)
            .put("d50231", d50231)
            .put("d50231c", d50231c)
            .put("d50232", d50232)
            .put("d50232c", d50232c)
            .put("d50241", d50241)
            .put("d50241c", d50241c)
            .put("d50242", d50242)
            .put("d50242c", d50242c)
            .put("d5031", d5031)
            .put("d5032", d5032)
            .put("d5033", d5033)
            .put("d5034", d5034)
            .put("d5035", d5035)
            .put("d5036", d5036)
            .put("d5037", d5037)
            .put("d5038", d5038)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD6toString(): String? {
        Log.d(TAG, "sD6toString: ")
        val json = JSONObject()
        json.put("d601", d601)
            .put("d602", d602)
            .put("d603", d603)
            .put("d604", d604)
            .put("d605", d605)
            .put("d606", d606)
            .put("d607", d607)
            .put("d608a", d608a)
            .put("d608b", d608b)
            .put("d608c", d608c)
            .put("d608d", d608d)
            .put("d608e", d608e)
            .put("d608f", d608f)
            .put("d608g", d608g)
            .put("d608h", d608h)
            .put("d608i", d608i)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD7toString(): String? {
        Log.d(TAG, "sD7toString: ")
        val json = JSONObject()
        json.put("d701", d701)
            .put("d70196x", d70196x)
            .put("d702", d702)
            .put("d70296x", d70296x)
            .put("d703", d703)
            .put("d7041", d7041)
            .put("d7042", d7042)
            .put("d7043", d7043)
            .put("d7044", d7044)
            .put("d7045", d7045)
        return json.toString()
    }

    @Throws(JSONException::class)
    fun sD8toString(): String? {
        Log.d(TAG, "sD8toString: ")
        val json = JSONObject()
        json.put("d8011", d8011)
            .put("d8012", d8012)
            .put("d8021", d8021)
            .put("d8022", d8022)
            .put("d8031", d8031)
            .put("d8032", d8032)
            .put("d8041", d8041)
            .put("d8042", d8042)
            .put("d8051", d8051)
            .put("d8052", d8052)
            .put("d8061", d8061)
            .put("d8062", d8062)
            .put("d8071", d8071)
            .put("d8072", d8072)
            .put("d8081", d8081)
            .put("d8082", d8082)
            .put("d8091", d8091)
            .put("d8092", d8092)
            .put("d8101", d8101)
            .put("d8102", d8102)
        return json.toString()
    }
}