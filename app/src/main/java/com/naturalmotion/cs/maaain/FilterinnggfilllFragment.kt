package com.naturalmotion.cs.maaain

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.naturalmotion.cs.R
import com.naturalmotion.cs.gaaamemem.GaamammuumumumActivity2
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.adaadadadad
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtgtuigtgtu
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtjiotgjitgjigt
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.cdvdgcdtdf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.ccvccfcr
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gijij
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.hyujujuj
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.jifrrfhrfurf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gbngnjggtj
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtkogtgthugthu
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.hypkohykpyhhyk
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.fojgitgtji
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtjtgjgttgdede
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtjoitgjitgji
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtpltggtkohyko
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.frokrkoro
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.ngjtngmbnmv
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.jijiji
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FilterinnggfilllFragment : Fragment() {
    private lateinit var gtotgtgjigtj: Context
    val vgtmgtjiotgjigt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtotgtgjigtj = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filterinnggfilll, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gthugt = vgtmgtjiotgjigt.getString(ccvccfcr, null)
        val rfjij = vgtmgtjiotgjigt.getString("appCamp", null)
        val gtmgnjgtnjgt = vgtmgtjiotgjigt.getString("deepSt", null)
        val gtoijgtjogtjoi = vgtmgtjiotgjigt.getString(cdvdgcdtdf, null)
        val frggdeed = vgtmgtjiotgjigt.getString(gtgtuigtgtu, null)
        val gtgtjigtji = vgtmgtjiotgjigt.getString(jijiji, null)
        val gthyujujju = vgtmgtjiotgjigt.getString("mainId", null)
        val cdvfvfvf = fojgitgtji
        val gtkotkgt = Build.VERSION.RELEASE
        val frfrojgtji = vgtmgtjiotgjigt.getString(gbngnjggtj, null)
        val frfrigtgtgt: String? = vgtmgtjiotgjigt.getString(gijij, null)

        val gtgthy555 = Intent(activity, VeeeveveveveActivity2::class.java)
        val fekdjdejiedjed = Intent(activity, GaamammuumumumActivity2::class.java)

        val fgjgtgthyyh = AppsFlyerLib.getInstance().getAppsFlyerUID(gtotgtgjigtj)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        vgtmgtjiotgjigt.edit().putString(gtjiotgjitgjigt, fgjgtgthyyh).apply()

        val deejirfjfrji = "$gtgtjigtji$gtpltggtkohyko$rfjij&$hypkohykpyhhyk$fgjgtgthyyh&$adaadadadad$gthyujujju&$gtjoitgjitgji$cdvfvfvf&$gtjtgjgttgdede$gtkotkgt&$frokrkoro$gtkogtgthugthu"
        val frgtjigtjigt = "$gtgtjigtji$hypkohykpyhhyk$frfrojgtji&$adaadadadad$frfrigtgtgt&$gtjoitgjitgji$cdvfvfvf&$gtjtgjgttgdede$gtkotkgt&$frokrkoro$gtkogtgthugthu"
        val rfgtjogtjoji = "$gtgtjigtji$gtpltggtkohyko$gtmgnjgtnjgt&$hypkohykpyhhyk$fgjgtgthyyh&$adaadadadad$gthyujujju&$gtjoitgjitgji$cdvfvfvf&$gtjtgjgttgdede$gtkotkgt&$frokrkoro$ngjtngmbnmv"
        val frkgjvnnjvbv = "$gtgtjigtji$gtpltggtkohyko$gtmgnjgtnjgt&$hypkohykpyhhyk$frfrojgtji&$adaadadadad$frfrigtgtgt&$gtjoitgjitgji$cdvfvfvf&$gtjtgjgttgdede$gtkotkgt&$frokrkoro$ngjtngmbnmv"

        when(frggdeed) {
            "1" ->
                if(rfjij!!.contains(hyujujuj)) {
                    vgtmgtjiotgjigt.edit().putString(jifrrfhrfurf, deejirfjfrji).apply()
                    vgtmgtjiotgjigt.edit().putString("WebInt", "campaign").apply()
                    startActivity(gtgthy555)
                    activity?.finish()
                } else if (gtmgnjgtnjgt!=null||gtoijgtjogtjoi!!.contains(gthugt.toString())) {
                    vgtmgtjiotgjigt.edit().putString(jifrrfhrfurf, rfgtjogtjoji).apply()
                    vgtmgtjiotgjigt.edit().putString("WebInt", "deepLink").apply()
                    startActivity(gtgthy555)
                    activity?.finish()
                } else {
                    startActivity(fekdjdejiedjed)
                    activity?.finish()
                }
            "0" ->
                if(gtmgnjgtnjgt!=null) {
                    vgtmgtjiotgjigt.edit().putString(jifrrfhrfurf, frkgjvnnjvbv).apply()
                    vgtmgtjiotgjigt.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(gtgthy555)
                    activity?.finish()
                } else if (gtoijgtjogtjoi!!.contains(gthugt.toString())) {
                    vgtmgtjiotgjigt.edit().putString(jifrrfhrfurf, frgtjigtjigt).apply()
                    vgtmgtjiotgjigt.edit().putString("WebInt", "geo").apply()
                    startActivity(gtgthy555)
                    activity?.finish()
                } else {
                    startActivity(fekdjdejiedjed)
                    activity?.finish()
                }
        }
    }
}