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
    var c101a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c101a)
    }


    @get:Bindable
    var c101b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c101b)
    }


    @get:Bindable
    var c101c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c101c)
    }


    @get:Bindable
    var c101d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c101d)
    }


    @get:Bindable
    var c101e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c101e)
    }


    @get:Bindable
    var c102a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c102a)
    }


    @get:Bindable
    var c102b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c102b)
    }


    @get:Bindable
    var c102c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c102c)
    }


    @get:Bindable
    var c102d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c102d)
    }


    @get:Bindable
    var c102e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c102e)
    }


    @get:Bindable
    var c103a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c103a)
    }


    @get:Bindable
    var c103b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c103b)
    }


    @get:Bindable
    var c103c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c103c)
    }


    @get:Bindable
    var c103d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c103d)
    }


    @get:Bindable
    var c103e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c103e)
    }


    @get:Bindable
    var c104a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c104a)
    }


    @get:Bindable
    var c104b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c104b)
    }


    @get:Bindable
    var c104c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c104c)
    }


    @get:Bindable
    var c104d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c104d)
    }


    @get:Bindable
    var c104e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c104e)
    }


    @get:Bindable
    var c105a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c105a)
    }


    @get:Bindable
    var c105b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c105b)
    }


    @get:Bindable
    var c105c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c105c)
    }


    @get:Bindable
    var c105d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c105d)
    }


    @get:Bindable
    var c105e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c105e)
    }


    @get:Bindable
    var c106a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c106a)
    }


    @get:Bindable
    var c106b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c106b)
    }


    @get:Bindable
    var c106c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c106c)
    }


    @get:Bindable
    var c106d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c106d)
    }


    @get:Bindable
    var c106e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c106e)
    }


    @get:Bindable
    var c107a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c107a)
    }


    @get:Bindable
    var c107b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c107b)
    }


    @get:Bindable
    var c107c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c107c)
    }


    @get:Bindable
    var c107d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c107d)
    }


    @get:Bindable
    var c107e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c107e)
    }


    @get:Bindable
    var c108a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c108a)
    }


    @get:Bindable
    var c108b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c108b)
    }


    @get:Bindable
    var c108c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c108c)
    }


    @get:Bindable
    var c108d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c108d)
    }


    @get:Bindable
    var c108e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c108e)
    }


    @get:Bindable
    var c109a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c109a)
    }


    @get:Bindable
    var c109b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c109b)
    }


    @get:Bindable
    var c109c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c109c)
    }


    @get:Bindable
    var c109d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c109d)
    }


    @get:Bindable
    var c109e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c109e)
    }


    @get:Bindable
    var c110a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c110a)
    }


    @get:Bindable
    var c110b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c110b)
    }


    @get:Bindable
    var c110c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c110c)
    }


    @get:Bindable
    var c110d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c110d)
    }


    @get:Bindable
    var c110e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c110e)
    }


    @get:Bindable
    var c111a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c111a)
    }


    @get:Bindable
    var c111b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c111b)
    }


    @get:Bindable
    var c111c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c111c)
    }


    @get:Bindable
    var c111d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c111d)
    }


    @get:Bindable
    var c111e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c111e)
    }


    @get:Bindable
    var c112a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c112a)
    }


    @get:Bindable
    var c112b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c112b)
    }


    @get:Bindable
    var c112c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c112c)
    }


    @get:Bindable
    var c112d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c112d)
    }


    @get:Bindable
    var c112e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.c112e)
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
    fun sCHydrate(string: String?) {
        Log.d(TAG, "sCHydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            c101a = json.getString("c101a")
            c101b = json.getString("c101b")
            c101c = json.getString("c101c")
            c101d = json.getString("c101d")
            c101e = json.getString("c101e")
            c102a = json.getString("c102a")
            c102b = json.getString("c102b")
            c102c = json.getString("c102c")
            c102d = json.getString("c102d")
            c102e = json.getString("c102e")
            c103a = json.getString("c103a")
            c103b = json.getString("c103b")
            c103c = json.getString("c103c")
            c103d = json.getString("c103d")
            c103e = json.getString("c103e")
            c104a = json.getString("c104a")
            c104b = json.getString("c104b")
            c104c = json.getString("c104c")
            c104d = json.getString("c104d")
            c104e = json.getString("c104e")
            c105a = json.getString("c105a")
            c105b = json.getString("c105b")
            c105c = json.getString("c105c")
            c105d = json.getString("c105d")
            c105e = json.getString("c105e")
            c106a = json.getString("c106a")
            c106b = json.getString("c106b")
            c106c = json.getString("c106c")
            c106d = json.getString("c106d")
            c106e = json.getString("c106e")
            c107a = json.getString("c107a")
            c107b = json.getString("c107b")
            c107c = json.getString("c107c")
            c107d = json.getString("c107d")
            c107e = json.getString("c107e")
            c108a = json.getString("c108a")
            c108b = json.getString("c108b")
            c108c = json.getString("c108c")
            c108d = json.getString("c108d")
            c108e = json.getString("c108e")
            c109a = json.getString("c109a")
            c109b = json.getString("c109b")
            c109c = json.getString("c109c")
            c109d = json.getString("c109d")
            c109e = json.getString("c109e")
            c110a = json.getString("c110a")
            c110b = json.getString("c110b")
            c110c = json.getString("c110c")
            c110d = json.getString("c110d")
            c110e = json.getString("c110e")
            c111a = json.getString("c111a")
            c111b = json.getString("c111b")
            c111c = json.getString("c111c")
            c111d = json.getString("c111d")
            c111e = json.getString("c111e")
            c112a = json.getString("c112a")
            c112b = json.getString("c112b")
            c112c = json.getString("c112c")
            c112d = json.getString("c112d")
            c112e = json.getString("c112e")
        }
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

    @Throws(JSONException::class)
    fun sCtoString(): String? {
        Log.d(TAG, "sCtoString: ")
        val json = JSONObject()
        json.put("c101a", c101a)
            .put("c101b", c101b)
            .put("c101c", c101c)
            .put("c101d", c101d)
            .put("c101e", c101e)
            .put("c102a", c102a)
            .put("c102b", c102b)
            .put("c102c", c102c)
            .put("c102d", c102d)
            .put("c102e", c102e)
            .put("c103a", c103a)
            .put("c103b", c103b)
            .put("c103c", c103c)
            .put("c103d", c103d)
            .put("c103e", c103e)
            .put("c104a", c104a)
            .put("c104b", c104b)
            .put("c104c", c104c)
            .put("c104d", c104d)
            .put("c104e", c104e)
            .put("c105a", c105a)
            .put("c105b", c105b)
            .put("c105c", c105c)
            .put("c105d", c105d)
            .put("c105e", c105e)
            .put("c106a", c106a)
            .put("c106b", c106b)
            .put("c106c", c106c)
            .put("c106d", c106d)
            .put("c106e", c106e)
            .put("c107a", c107a)
            .put("c107b", c107b)
            .put("c107c", c107c)
            .put("c107d", c107d)
            .put("c107e", c107e)
            .put("c108a", c108a)
            .put("c108b", c108b)
            .put("c108c", c108c)
            .put("c108d", c108d)
            .put("c108e", c108e)
            .put("c109a", c109a)
            .put("c109b", c109b)
            .put("c109c", c109c)
            .put("c109d", c109d)
            .put("c109e", c109e)
            .put("c110a", c110a)
            .put("c110b", c110b)
            .put("c110c", c110c)
            .put("c110d", c110d)
            .put("c110e", c110e)
            .put("c111a", c111a)
            .put("c111b", c111b)
            .put("c111c", c111c)
            .put("c111d", c111d)
            .put("c111e", c111e)
            .put("c112a", c112a)
            .put("c112b", c112b)
            .put("c112c", c112c)
            .put("c112d", c112d)
            .put("c112e", c112e)
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