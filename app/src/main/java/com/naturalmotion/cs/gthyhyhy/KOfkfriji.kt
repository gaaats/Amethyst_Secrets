package com.naturalmotion.cs.gthyhyhy

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class KOfkfriji(application: Application): ViewModel() {
    val khykhyokkhy = application.packageManager
    fun frprfokgtiojgtjgtuh(g2gt5hy: WebView): WebSettings{
       val hyh6 = g2gt5hy.settings
        hyh6.javaScriptEnabled = true
        hyh6.useWideViewPort = true
        hyh6.loadWithOverviewMode = true
        hyh6.allowFileAccess = true
        hyh6.domStorageEnabled = true
        hyh6.userAgentString = hyh6.userAgentString.replace("; wv", "")
        hyh6.javaScriptCanOpenWindowsAutomatically = true
        hyh6.setSupportMultipleWindows(false)
        hyh6.displayZoomControls = false
        hyh6.builtInZoomControls = true
        hyh6.allowFileAccess = true
        hyh6.allowContentAccess = true
        hyh6.setSupportZoom(true)
        hyh6.pluginState = WebSettings.PluginState.ON
        hyh6.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyh6.cacheMode = WebSettings.LOAD_DEFAULT
        hyh6.allowContentAccess = true
        hyh6.mediaPlaybackRequiresUserGesture = false
        return hyh6
    }
    fun kotkogtokgt(gtjjgtjigt: String) {
        OneSignal.setExternalUserId(
            gtjjgtjigt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val hyjuikikikik = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $hyjuikikikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtjgt =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtjgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val cfrgtgtgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $cfrgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtgyyhujujuj(uri: String): Boolean {
        try {
            khykhyokkhy.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}