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


class ModuleE : BaseObservable(), Observable {
    private val TAG = "ModuleE"

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
    }

    @get:Bindable
    var e101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e101)
    }

    @get:Bindable
    var e102a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102a)
    }

    @get:Bindable
    var e102b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102b)
    }

    @get:Bindable
    var e102c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102c)
    }

    @get:Bindable
    var e102d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102d)
    }

    @get:Bindable
    var e102e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102e)
    }

    @get:Bindable
    var e102f: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102f)
    }

    @get:Bindable
    var e102g: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102g)
    }

    @get:Bindable
    var e102h: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102h)
    }

    @get:Bindable
    var e102i: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102i)
    }

    @get:Bindable
    var e102j: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e102j)
    }

    @get:Bindable
    var e103a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e103a)
    }

    @get:Bindable
    var e103b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e103b)
    }

    @get:Bindable
    var e104a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104a)
    }

    @get:Bindable
    var e104b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104b)
    }

    @get:Bindable
    var e104c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104c)
    }

    @get:Bindable
    var e104d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104d)
    }

    @get:Bindable
    var e104e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104e)
    }

    @get:Bindable
    var e104e96x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e104e96x)
    }

    @get:Bindable
    var e201 String by Delegates.observable(_EMPTY_)
    {
        prop, old, new ->
        notifyPropertyChanged(BR.e201)
    }

    @get:Bindable
    var e202a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202a)
    }

    @get:Bindable
    var e202b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202b)
    }

    @get:Bindable
    var e202c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202c)
    }

    @get:Bindable
    var e202d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202d)
    }

    @get:Bindable
    var e202e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202e)
    }

    @get:Bindable
    var e202f: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e202f)
    }

    @get:Bindable
    var e203a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e203a)
    }

    @get:Bindable
    var e203b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e203b)
    }

    @get:Bindable
    var e204a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e204a)
    }

    @get:Bindable
    var e204b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e204b)
    }

    @get:Bindable
    var e204c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e204c)
    }

    @get:Bindable
    var e204d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e204d)
    }

    @get:Bindable
    var e204d96x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e204d96x)
    }

    @get:Bindable
    var e301: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e301)
    }

    @get:Bindable
    var e302a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e302a)
    }

    @get:Bindable
    var e302b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e302b)
    }

    @get:Bindable
    var e302c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e302c)
    }

    @get:Bindable
    var e302d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e302d)
    }

    @get:Bindable
    var e302e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e302e)
    }

    @get:Bindable
    var e303a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303a)
    }

    @get:Bindable
    var e303b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303b)
    }

    @get:Bindable
    var e303c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303c)
    }

    @get:Bindable
    var e303d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303d)
    }

    @get:Bindable
    var e303e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303e)
    }

    @get:Bindable
    var e303f: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303f)
    }

    @get:Bindable
    var e303g: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303g)
    }

    @get:Bindable
    var e303h: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303h)
    }

    @get:Bindable
    var e303i: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303i)
    }

    @get:Bindable
    var e303j: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303j)
    }

    @get:Bindable
    var e303k: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303k)
    }

    @get:Bindable
    var e303l: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303l)
    }

    @get:Bindable
    var e303m: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303m)
    }

    @get:Bindable
    var e303n: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e303n)
    }

    @get:Bindable
    var e304a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e304a)
    }

    @get:Bindable
    var e304b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e304b)
    }

    @get:Bindable
    var e304c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e304c)
    }

    @get:Bindable
    var e304d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e304d)
    }

    @get:Bindable
    var e305a: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e305a)
    }

    @get:Bindable
    var e305b: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e305b)
    }

    @get:Bindable
    var e305c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e305c)
    }

    @get:Bindable
    var e305d: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e305d)
    }

    @get:Bindable
    var e305e: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (!e305e.equals("96")) this.e305e96x = ""
        notifyPropertyChanged(BR.e305e)
    }

    @get:Bindable
    var e305e96x: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e305e96x)
    }


    @get:Bindable
    var e3061: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3061.equals("2")) {
            this.e3061c = ""
            this.e3062 = ""
            this.e3062c = ""
        }
        notifyPropertyChanged(BR.e3061)
    }

    @get:Bindable
    var e3061c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3061c)
    }

    @get:Bindable
    var e3062: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3062.equals("2")) this.e3062c = ""
        notifyPropertyChanged(BR.e3062)
    }

    @get:Bindable
    var e3062c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3062c)
    }


    @get:Bindable
    var e3071: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3071.equals("2")) {
            this.e3071c = ""
            this.e3072 = ""
            this.e3072c = ""
        }
        notifyPropertyChanged(BR.e3071)
    }

    @get:Bindable
    var e3071c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3071c)
    }

    @get:Bindable
    var e3072: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3072.equals("2")) this.e3072c = ""
        notifyPropertyChanged(BR.e3072)
    }

    @get:Bindable
    var e3072c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3072c)
    }


    @get:Bindable
    var e3081: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3081.equals("2")) {
            this.e3081c = ""
            this.e3082 = ""
            this.e3082c = ""
        }
        notifyPropertyChanged(BR.e3081)
    }

    @get:Bindable
    var e3081c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3081c)
    }

    @get:Bindable
    var e3082: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3082.equals("2")) this.e3082c = ""
        notifyPropertyChanged(BR.e3082)
    }

    @get:Bindable
    var e3082c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3082c)
    }


    @get:Bindable
    var e3091: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3091.equals("2")) {
            this.e3091c = ""
            this.e3092 = ""
            this.e3092c = ""
        }
        notifyPropertyChanged(BR.e3091)
    }

    @get:Bindable
    var e3091c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3091c)
    }

    @get:Bindable
    var e3092: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3092.equals("2")) this.e3092c = ""
        notifyPropertyChanged(BR.e3092)
    }

    @get:Bindable
    var e3092c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3092c)
    }


    @get:Bindable
    var e3101: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3101.equals("2")) {
            this.e3101c = ""
            this.e3102 = ""
            this.e3102c = ""
        }
        notifyPropertyChanged(BR.e3101)
    }

    @get:Bindable
    var e3101c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3101c)
    }

    @get:Bindable
    var e3102: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3102.equals("2")) this.e3102c = ""
        notifyPropertyChanged(BR.e3102)
    }

    @get:Bindable
    var e3102c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3102c)
    }


    @get:Bindable
    var e3111: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3111.equals("2")) {
            this.e3111c = ""
            this.e3112 = ""
            this.e3112c = ""
        }
        notifyPropertyChanged(BR.e3111)
    }

    @get:Bindable
    var e3111c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3111c)
    }

    @get:Bindable
    var e3112: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3112.equals("2")) this.e3112c = ""
        notifyPropertyChanged(BR.e3112)
    }

    @get:Bindable
    var e3112c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3112c)
    }


    @get:Bindable
    var e3121: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3121.equals("2")) {
            this.e3121c = ""
            this.e3122 = ""
            this.e3122c = ""
        }
        notifyPropertyChanged(BR.e3121)
    }

    @get:Bindable
    var e3121c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3121c)
    }

    @get:Bindable
    var e3122: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3122.equals("2")) this.e3122c = ""
        notifyPropertyChanged(BR.e3122)
    }

    @get:Bindable
    var e3122c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3122c)
    }


    @get:Bindable
    var e3131: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3131.equals("2")) {
            this.e3131c = ""
            this.e3132 = ""
            this.e3132c = ""
        }
        notifyPropertyChanged(BR.e3131)
    }

    @get:Bindable
    var e3131c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3131c)
    }

    @get:Bindable
    var e3132: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3132.equals("2")) this.e3132c = ""
        notifyPropertyChanged(BR.e3132)
    }

    @get:Bindable
    var e3132c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3132c)
    }


    @get:Bindable
    var e3141: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3141.equals("2")) {
            this.e3141c = ""
            this.e3142 = ""
            this.e3142c = ""
        }
        notifyPropertyChanged(BR.e3141)
    }

    @get:Bindable
    var e3141c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3141c)
    }

    @get:Bindable
    var e3142: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3142.equals("2")) this.e3142c = ""
        notifyPropertyChanged(BR.e3142)
    }

    @get:Bindable
    var e3142c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3142c)
    }


    @get:Bindable
    var e3151: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3151.equals("2")) {
            this.e3151c = ""
            this.e3152 = ""
            this.e3152c = ""
        }
        notifyPropertyChanged(BR.e3151)
    }

    @get:Bindable
    var e3151c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3151c)
    }

    @get:Bindable
    var e3152: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3152.equals("2")) this.e3152c = ""
        notifyPropertyChanged(BR.e3152)
    }

    @get:Bindable
    var e3152c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3152c)
    }


    @get:Bindable
    var e3161: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3161.equals("2")) {
            this.e3161c = ""
            this.e3162 = ""
            this.e3162c = ""
        }
        notifyPropertyChanged(BR.e3161)
    }

    @get:Bindable
    var e3161c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3161c)
    }

    @get:Bindable
    var e3162: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3162.equals("2")) this.e3162c = ""
        notifyPropertyChanged(BR.e3162)
    }

    @get:Bindable
    var e3162c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3162c)
    }


    @get:Bindable
    var e3171: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3171.equals("2")) {
            this.e3171c = ""
            this.e3172 = ""
            this.e3172c = ""
        }
        notifyPropertyChanged(BR.e3171)
    }

    @get:Bindable
    var e3171c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3171c)
    }

    @get:Bindable
    var e3172: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3172.equals("2")) this.e3172c = ""
        notifyPropertyChanged(BR.e3172)
    }

    @get:Bindable
    var e3172c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3172c)
    }


    @get:Bindable
    var e3181: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3181.equals("2")) {
            this.e3181c = ""
            this.e3182 = ""
            this.e3182c = ""
        }
        notifyPropertyChanged(BR.e3181)
    }

    @get:Bindable
    var e3181c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3181c)
    }

    @get:Bindable
    var e3182: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3182.equals("2")) this.e3182c = ""
        notifyPropertyChanged(BR.e3182)
    }

    @get:Bindable
    var e3182c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3182c)
    }


    @get:Bindable
    var e3191: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3191.equals("2")) {
            this.e3191c = ""
            this.e3192 = ""
            this.e3192c = ""
        }
        notifyPropertyChanged(BR.e3191)
    }

    @get:Bindable
    var e3191c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3191c)
    }

    @get:Bindable
    var e3192: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3192.equals("2")) this.e3192c = ""
        notifyPropertyChanged(BR.e3192)
    }

    @get:Bindable
    var e3192c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3192c)
    }


    @get:Bindable
    var e3201: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3201.equals("2")) {
            this.e3201c = ""
            this.e3202 = ""
            this.e3202c = ""
        }
        notifyPropertyChanged(BR.e3201)
    }

    @get:Bindable
    var e3201c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3201c)
    }

    @get:Bindable
    var e3202: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3202.equals("2")) this.e3202c = ""
        notifyPropertyChanged(BR.e3202)
    }

    @get:Bindable
    var e3202c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3202c)
    }


    @get:Bindable
    var e3211: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3211.equals("2")) {
            this.e3211c = ""
            this.e3212 = ""
            this.e3212c = ""
        }
        notifyPropertyChanged(BR.e3211)
    }

    @get:Bindable
    var e3211c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3211c)
    }

    @get:Bindable
    var e3212: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3212.equals("2")) this.e3212c = ""
        notifyPropertyChanged(BR.e3212)
    }

    @get:Bindable
    var e3212c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3212c)
    }


    @get:Bindable
    var e3221: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3221.equals("2")) {
            this.e3221c = ""
            this.e3222 = ""
            this.e3222c = ""
        }
        notifyPropertyChanged(BR.e3221)
    }

    @get:Bindable
    var e3221c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3221c)
    }

    @get:Bindable
    var e3222: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3222.equals("2")) this.e3222c = ""
        notifyPropertyChanged(BR.e3222)
    }

    @get:Bindable
    var e3222c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3222c)
    }


    @get:Bindable
    var e3231: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3231.equals("2")) {
            this.e3231c = ""
            this.e3232 = ""
            this.e3232c = ""
        }
        notifyPropertyChanged(BR.e3231)
    }

    @get:Bindable
    var e3231c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3231c)
    }

    @get:Bindable
    var e3232: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        if (e3232.equals("2")) this.e3232c = ""
        notifyPropertyChanged(BR.e3232)
    }

    @get:Bindable
    var e3232c: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e3232c)
    }

    @get:Bindable
    var e324: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e324)
    }

    @get:Bindable
    var e325: String by Delegates.observable(_EMPTY_) { prop, old, new ->
        notifyPropertyChanged(BR.e325)
    }


    //ModuleE
    private val e401 = _EMPTY_
    private val e402 = _EMPTY_
    private val e403 = _EMPTY_
    private val e403a = _EMPTY_
    private val e403b = _EMPTY_
    private val e403c = _EMPTY_
    private val e404 = _EMPTY_
    private val e405 = _EMPTY_
    private val e406 = _EMPTY_
    private val e407 = _EMPTY_
    private val e407a = _EMPTY_
    private val e407b = _EMPTY_
    private val e407c = _EMPTY_
    private val e407d = _EMPTY_
    private val e408 = _EMPTY_
    private val e409 = _EMPTY_
    private val e410 = _EMPTY_
    private val e410a = _EMPTY_
    private val e410b = _EMPTY_
    private val e410c = _EMPTY_
    private val e410d = _EMPTY_
    private val e410e = _EMPTY_
    private val e410f = _EMPTY_
    private val e411 = _EMPTY_
    private val e412 = _EMPTY_
    private val e413 = _EMPTY_
    private val e414 = _EMPTY_
    private val e415 = _EMPTY_
    private val e416 = _EMPTY_


    private val e5 = _EMPTY_
    private val e501 = _EMPTY_
    private val e502 = _EMPTY_
    private val e502a = _EMPTY_
    private val e502b = _EMPTY_
    private val e502c = _EMPTY_
    private val e502d = _EMPTY_
    private val e502e = _EMPTY_
    private val e502f = _EMPTY_
    private val e502g = _EMPTY_
    private val e502h = _EMPTY_
    private val e502i = _EMPTY_
    private val e503 = _EMPTY_
    private val e504 = _EMPTY_
    private val e505 = _EMPTY_
    private val e506 = _EMPTY_
    private val e507 = _EMPTY_
    private val e508 = _EMPTY_
    private val e509 = _EMPTY_


    private val e6 = _EMPTY_
    private val e601 = _EMPTY_
    private val e602 = _EMPTY_
    private val e603 = _EMPTY_
    private val e604 = _EMPTY_
    private val e605 = _EMPTY_
    private val e605a = _EMPTY_
    private val e605b = _EMPTY_
    private val e605c = _EMPTY_
    private val e605d = _EMPTY_
    private val e606 = _EMPTY_
    private val e607 = _EMPTY_
    private val e608 = _EMPTY_
    private val e609 = _EMPTY_
    private val e610 = _EMPTY_
    private val e611 = _EMPTY_


    private val e7 = _EMPTY_
    private val e701 = _EMPTY_
    private val e702 = _EMPTY_
    private val e702a = _EMPTY_
    private val e702b = _EMPTY_
    private val e702c = _EMPTY_
    private val e702d = _EMPTY_
    private val e702e = _EMPTY_
    private val e702f = _EMPTY_
    private val e702g = _EMPTY_
    private val e702h = _EMPTY_
    private val e702i = _EMPTY_
    private val e702j = _EMPTY_
    private val e702k = _EMPTY_
    private val e702l = _EMPTY_
    private val e703 = _EMPTY_
    private val e703a = _EMPTY_
    private val e703b = _EMPTY_
    private val e703c = _EMPTY_
    private val e703d = _EMPTY_
    private val e704 = _EMPTY_
    private val e704a = _EMPTY_
    private val e704b = _EMPTY_
    private val e704c = _EMPTY_
    private val e704d = _EMPTY_
    private val e704e = _EMPTY_
    private val e704f = _EMPTY_
    private val e704g = _EMPTY_
    private val e705 = _EMPTY_


    private val e705a0a = _EMPTY_
    private val e705a0f = _EMPTY_
    private val e705b0a = _EMPTY_
    private val e705b0f = _EMPTY_
    private val e705c0a = _EMPTY_
    private val e705c0f = _EMPTY_
    private val e705d0a = _EMPTY_
    private val e705d0f = _EMPTY_
    private val e705ea = _EMPTY_
    private val e705ef = _EMPTY_


    private val e8 = _EMPTY_
    private val e801 = _EMPTY_
    private val e802 = _EMPTY_
    private val e803 = _EMPTY_
    private val e804 = _EMPTY_
    private val e805 = _EMPTY_
    private val e806 = _EMPTY_
    private val e807 = _EMPTY_
    private val e808 = _EMPTY_
    private val e809 = _EMPTY_
    private val e810 = _EMPTY_
    private val e811 = _EMPTY_
    private val e812 = _EMPTY_
    private val e813 = _EMPTY_
    private val e814 = _EMPTY_


    @Throws(JSONException::class)
    fun Hydrate(cursor: Cursor): ModuleE? {
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
        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD1)))
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
    fun sE1Hydrate(string: String?) {
        Log.d(TAG, "sE1Hydrate: $string")
        if (string != null) {
            var json: JSONObject? = null
            json = JSONObject(string)
            e101 = json.getString("e101")
            e102a = json.getString("e102a")
            e102b = json.getString("e102b")
            e102c = json.getString("e102c")
            e102d = json.getString("e102d")
            e102e = json.getString("e102e")
            e102f = json.getString("e102f")
            e102g = json.getString("e102g")
            e102h = json.getString("e102h")
            e102i = json.getString("e102i")
            e102j = json.getString("e102j")
            e103a = json.getString("e103a")
            e103b = json.getString("e103b")
            e104a = json.getString("e104a")
            e104b = json.getString("e104b")
            e104c = json.getString("e104c")
            e104d = json.getString("e104d")
            e104e = json.getString("e104e")
            e104e96x = json.getString("e104e96x")
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