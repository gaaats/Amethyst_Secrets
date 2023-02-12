package com.naturalmotion.cs.gfrfrfrfr

import android.app.Application
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gbngnjggtj
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*
import android.content.Context
import com.my.tracker.MyTracker
import com.naturalmotion.cs.gtgtgthyhy.frjirfrf
import com.naturalmotion.cs.gtgtgthyhy.rfrfjrfijirf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.jujuikikik
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gijij
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.bngtgtgtjgit


class MotherClasss:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(jujuikikik)

        val gtjiotgigt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val vfbgbgbg = getSharedPreferences("PREFS_NAME", 0)

        val hyhyjuujuj = MyTracker.getTrackerParams()
        val gtyhjuju = MyTracker.getTrackerConfig()
        val hyhyujujuj = MyTracker.getInstanceId(this)
        gtyhjuju.isTrackingLaunchEnabled = true
        val hyujujikik = UUID.randomUUID().toString()

        if (vfbgbgbg.getBoolean("my_first_time", true)) {
            hyhyjuujuj.setCustomUserId(hyujujikik)
            gtjiotgigt.edit().putString(gbngnjggtj, hyujujikik).apply()
            gtjiotgigt.edit().putString(gijij, hyhyujujuj).apply()
            vfbgbgbg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val fbjfrbrfrfg = gtjiotgigt.getString(gbngnjggtj, hyujujikik)
            hyhyjuujuj.setCustomUserId(fbjfrbrfrfg)
        }
        MyTracker.initTracker(bngtgtgtjgit, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MotherClasss)
            modules(
                listOf(
                    rfrfjrfijirf, frjirfrf
                )
            )
        }
    }
}