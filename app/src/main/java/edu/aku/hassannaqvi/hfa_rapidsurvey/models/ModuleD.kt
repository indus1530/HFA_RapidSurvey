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


class ModuleD : BaseObservable() {
    private val TAG = "ModuleD"

    @Transient
    private var propertyChangeRegistry: PropertyChangeRegistry = PropertyChangeRegistry()

    private var projectName: String = PROJECT_NAME
    private var id: String = _EMPTY_
    private var uid: String = _EMPTY_
    private var userName = _EMPTY_
    private var sysdate = _EMPTY_
    private var istatus = _EMPTY_
    private var istatus96x = _EMPTY_
    private val endingTime = _EMPTY_
    private var deviceID = _EMPTY_
    private var deviceTag = _EMPTY_
    private var synced = _EMPTY_
    private var syncDate = _EMPTY_
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
        setd50222c(when d50222 . equals ("1") -> this.d50222c else "")
        notifyPropertyChanged(BR.d50222)
    }

    @get:Bindable
    var d50222c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50222c)
    }

    @get:Bindable
    var d50231: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        setd50231c(when d50231 . equals ("1") -> this.d50231c else "")
        setd50232(when d50231 . equals ("1") -> this.d50232 else "")
        notifyPropertyChanged(BR.d50231)
    }

    @get:Bindable
    var d50231c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50231c)
    }

    @get:Bindable
    var d50232: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        setd50232c(when d50232 . equals ("1") -> this.d50232c else "")
        notifyPropertyChanged(BR.d50232)
    }

    @get:Bindable
    var d50232c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50232c)
    }

    @get:Bindable
    var d50241: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        setd50241c(when d50241 . equals ("1") -> this.d50241c else "")
        setd50242(when d50241 . equals ("1") -> this.d50242 else "")
        notifyPropertyChanged(BR.d50241)
    }

    @get:Bindable
    var d50241c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.d50241c)
    }

    @get:Bindable
    var d50242: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        setd50242c(when d50242 . equals ("1") -> this.d50242c else "")
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


    private val d07 = _EMPTY_
    private val d0701 = _EMPTY_
    private val d0702 = _EMPTY_
    private val d0703 = _EMPTY_
    private val d0704 = _EMPTY_
    private val d0704a = _EMPTY_
    private val d0704b = _EMPTY_
    private val d0704c = _EMPTY_
    private val d0704d = _EMPTY_
    private val d0704e = _EMPTY_

    private val d08 = _EMPTY_
    private val d0801 = _EMPTY_
    private val d0801a0a = _EMPTY_
    private val d0801a0f = _EMPTY_
    private val d0801a0fq = _EMPTY_
    private val d0801b0a = _EMPTY_
    private val d0801b0f = _EMPTY_
    private val d0801b0fq = _EMPTY_
    private val d0801c0a = _EMPTY_
    private val d0801c0f = _EMPTY_
    private val d0801c0fq = _EMPTY_
    private val d0801d0a = _EMPTY_
    private val d0801d0f = _EMPTY_
    private val d0801d0fq = _EMPTY_
    private val d0801e0a = _EMPTY_
    private val d0801e0f = _EMPTY_
    private val d0801e0fq = _EMPTY_
    private val d0801f0a = _EMPTY_
    private val d0801f0f = _EMPTY_
    private val d0801f0fq = _EMPTY_
    private val d0801g0a = _EMPTY_
    private val d0801g0f = _EMPTY_
    private val d0801g0fq = _EMPTY_
    private val d0801h0a = _EMPTY_
    private val d0801h0f = _EMPTY_
    private val d0801h0fq = _EMPTY_
    private val d0801i0a = _EMPTY_
    private val d0801i0f = _EMPTY_
    private val d0801i0fq = _EMPTY_
    private val d0801j0a = _EMPTY_
    private val d0801j0f = _EMPTY_
    private val d0801j0fq = _EMPTY_


    @Throws(JSONException::class)
    fun Hydrate(cursor: Cursor): ModuleD? {
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
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB)))
        sCHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC)))
        sKHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SK)))
        return this
    }

    @Throws(JSONException::class)
    fun sBHydrate(string: String?) {
        Log.d(TAG, "sBHydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            a114 = json.getString("a14")
            a115 = json.getString("a15")
            a116 = json.getString("a16")
            a117 = json.getString("a17")
            a118 = json.getString("a18")
            a11896x = json.getString("a1896x")
            a119 = json.getString("a19")
            a11996x = json.getString("a1996x")
            a120 = json.getString("a20")
            a121 = json.getString("a21")
            a122 = json.getString("a22")
            b101 = json.getString("b01")
            b102 = json.getString("b02")
            b103 = json.getString("b03")
            b104 = json.getString("b04")
            b105 = json.getString("b05")
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
        json.put(FormsTable.COLUMN_SB, JSONObject(sBtoString()))
        json.put(FormsTable.COLUMN_SC, JSONObject(sCtoString()))
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
}