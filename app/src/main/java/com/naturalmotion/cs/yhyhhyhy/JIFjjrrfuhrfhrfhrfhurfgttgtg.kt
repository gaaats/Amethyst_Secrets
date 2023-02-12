package com.naturalmotion.cs.yhyhhyhy

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.naturalmotion.cs.apppipipip.FTftdtfetfdeffedt
import com.naturalmotion.cs.apppipipip.Bfrbhbrfbfrbbfrhrf
import com.naturalmotion.cs.apppipipip.Ydyfrgfrygfrgfrg
import com.naturalmotion.cs.apppipipip.Hbfrbrfyrfg
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.apsppspspsaaa
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class JIFjjrrfuhrfhrfhrfhurfgttgtg(
    private val g2hy55hyhy5hy5: Bfrbhbrfbfrbbfrhrf,
    private val hyjuju655959: Ydyfrgfrygfrgfrg,
    private val gt2hg5hy5yh5yh: SharedPreferences,
    val hyjuikkjnnhgbbg: Application
) : ViewModel() {


    private val hyjuujujuj = MutableLiveData<FTftdtfetfdeffedt>()
    val gtgt55: LiveData<FTftdtfetfdeffedt>
        get() = hyjuujujuj

    private val hgccdddede = MutableLiveData<Hbfrbrfyrfg>()
    val hy2hyujjuuj5: LiveData<Hbfrbrfyrfg>
        get() = hgccdddede

    private val frgtgtgt = MutableLiveData<String>()
    val gthyujujkiikik: LiveData<String>
        get() = frgtgtgt

    init {
        viewModelScope.launch(Dispatchers.IO) {
            hy5hy1hy1hy5()
        }
        viewModelScope.launch(Dispatchers.Main) {
            g2hy5yhhy5hy()
        }
    }

    private val hjmjmkiki = MutableLiveData<String?>()
    val gt2hy5hy5hyhy: LiveData<String?>
        get() = hjmjmkiki


    suspend fun g2hy5yhhy5hy() {
        hyjuujujuj.postValue(g2hy55hyhy5hy5.getDat().body())
        g2hy25hy5hyhy()
    }

    suspend fun g2hy25hy5hyhy() {
        hgccdddede.postValue(hyjuju655959.getDataDev().body())
    }

    fun rfoorfgtj(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apsppspspsaaa, gtnjgtnjtg, hyjuikkjnnhgbbg)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun h2hy55ujuj51(hyujujuj: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            hyujujuj
        ) { data: AppLinkData? ->
            data?.let {
                val juujikikik = data.targetUri?.host.toString()
                gt2hg5hy5yh5yh.edit().putString("deepSt", juujikikik).apply()
            }
        }
    }

    private val gtnjgtnjtg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val juikikikik = data?.get("campaign").toString()
            frgtgtgt.postValue(juikikikik)

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun hy5hy1hy1hy5() {
        val ujjikikik = AdvertisingIdClient(hyjuikkjnnhgbbg)
        ujjikikik.start()
        val gngjtngtjnjgt = ujjikikik.info.id.toString()
        hjmjmkiki.postValue(gngjtngtjnjgt)
    }

}