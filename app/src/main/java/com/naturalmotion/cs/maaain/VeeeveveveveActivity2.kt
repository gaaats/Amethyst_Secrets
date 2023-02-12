package com.naturalmotion.cs.maaain

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.naturalmotion.cs.databinding.ActivityVeeeveveveve2Binding
import com.naturalmotion.cs.gthyhyhy.KOfkfriji
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gtjiotgjitgjigt
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.jifrrfhrfurf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.gbngnjggtj
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VeeeveveveveActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bggb2bg2bg = ActivityVeeeveveveve2Binding.inflate(layoutInflater)
        juki2ki5 = WebView(this)
        setContentView(juki2ki5)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(juki2ki5, true)
        kikolollo5lo5ol.frprfokgtiojgtjgtuh(juki2ki5)

        juki2ki5.webViewClient = Ufhhrfhrfrfgfgrgfr()
        juki2ki5.webChromeClient = HIUhfrhffrygrfgfr()
        juki2ki5.loadUrl(urururururururur())
    }

    private lateinit var bggb2bg2bg: ActivityVeeeveveveve2Binding
    lateinit var juki2ki5: WebView
    private var ju2kiik5ool66: ValueCallback<Array<Uri>>? = null
    private var nmj2mjmj5jm: String? = null
    private  val jj2ik5ki5ik5 = 1

    private val kikolollo5lo5ol by viewModel<KOfkfriji>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != jj2ik5ki5ik5 || ju2kiik5ool66 == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hyjunnhhbgbgbg: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (nmj2mjmj5jm != null) {
                    hyjunnhhbgbgbg = arrayOf(Uri.parse(nmj2mjmj5jm))
                }
            } else {
                val hhyjju55 = data.dataString
                if (hhyjju55 != null) {
                    hyjunnhhbgbgbg = arrayOf(Uri.parse(hhyjju55))
                }
            }
        }
        ju2kiik5ool66!!.onReceiveValue(hyjunnhhbgbgbg)
        ju2kiik5ool66 = null
        return
    }

    inner class Ufhhrfhrfrfgfgrgfr: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (kikolollo5lo5ol.gtgyyhujujuj(url)) {

                    val frirfhrfhrfhu = Intent(Intent.ACTION_VIEW)
                    frirfhrfhrfhu.data = Uri.parse(url)
                    startActivity(frirfhrfhrfhu)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            saveUrl(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VeeeveveveveActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class HIUhfrhffrygrfgfr : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            ju2kiik5ool66?.onReceiveValue(null)
            ju2kiik5ool66 = filePath
            var vgvfbhvfbvfh: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (vgvfbhvfbvfh!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = ifjijj()
                    vgvfbhvfbvfh.putExtra("PhotoPath", nmj2mjmj5jm)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    nmj2mjmj5jm = "file:" + photoFile.absolutePath
                    vgvfbhvfbvfh.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    vgvfbhvfbvfh = null
                }
            }
            val bgnhujiii = Intent(Intent.ACTION_GET_CONTENT)
            bgnhujiii.addCategory(Intent.CATEGORY_OPENABLE)
            bgnhujiii.type = "image/*"
            val jiijuujuj: Array<Intent?> = vgvfbhvfbvfh?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val hnhjujuiiii = Intent(Intent.ACTION_CHOOSER)
            hnhjujuiiii.putExtra(Intent.EXTRA_INTENT, bgnhujiii)
            hnhjujuiiii.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            hnhjujuiiii.putExtra(Intent.EXTRA_INITIAL_INTENTS, jiijuujuj)
            startActivityForResult(hnhjujuiiii, jj2ik5ki5ik5)
            return true
        }

        fun ifjijj(): File? {
            val fhfrjgtgtbjgtbj = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val gthyyhhyhy = "JPEG_" + fhfrjgtgtbjgtbj + "_"
            val vfbgbg5 = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                gthyyhhyhy,
                ".jpg",
                vfbgbg5
            )
        }
    }

    private fun urururururururur(): String {

        val frjirffrhrf = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val frhufrhurffrh = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val gtjhgtgtuhgt = frhufrhurffrh.getString(jifrrfhrfurf, null)
        val vfbvfbhvfhb = frhufrhurffrh.getString(gbngnjggtj, null)
        val cvcvsdfdd = frhufrhurffrh.getString(gtjiotgjitgjigt, null)


        when (frhufrhurffrh.getString("WebInt", null)) {
            "campaign" -> {
                kikolollo5lo5ol.kotkogtokgt(cvcvsdfdd.toString())
            }
            "deepLink" -> {
                kikolollo5lo5ol.kotkogtokgt(cvcvsdfdd.toString())
            }
            "deepLinkNOApps" -> {
                kikolollo5lo5ol.kotkogtokgt(vfbvfbhvfhb.toString())
            }
            "geo" -> {
                kikolollo5lo5ol.kotkogtokgt(vfbvfbhvfhb.toString())
            }
        }
        return frjirffrhrf.getString("SAVED_URL", gtjhgtgtuhgt).toString()
    }

    var urlfififif = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }
    private var exitexitexitexit = false
    override fun onBackPressed() {

        if (juki2ki5.canGoBack()) {
            if (exitexitexitexit) {
                juki2ki5.stopLoading()
                juki2ki5.loadUrl(urlfififif)
            }
            this.exitexitexitexit = true
            juki2ki5.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                exitexitexitexit = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}