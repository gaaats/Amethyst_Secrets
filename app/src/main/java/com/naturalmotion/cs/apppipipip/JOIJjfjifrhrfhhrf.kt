package com.naturalmotion.cs.apppipipip

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET



class Bfrbhbrfbfrbbfrhrf(private val gtjiogtjiogtjitg: UHfufrhfruhfr) {
    suspend fun getDat() = gtjiogtjiogtjitg.frojirjiogjtijgtj()
}
class Ydyfrgfrygfrgfrg(private val cddcdcdeeded: JUfhruhrfrf) {
    suspend fun getDataDev() = cddcdcdeeded.vbjgthgtigt()
}

@Keep
data class FTftdtfetfdeffedt(
    @SerializedName("countryCode")
    val gtgjiogtjgtji: String,
)

interface UHfufrhfruhfr {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun frojirjiogjtijgtj(): Response<FTftdtfetfdeffedt>
}

interface JUfhruhrfrf {
    @GET("kokos.json")
    suspend fun vbjgthgtigt(): Response<Hbfrbrfyrfg>
}


@Keep
data class Hbfrbrfyrfg(
    @SerializedName("personcountry")
    val deidehgfryrf: String,
    @SerializedName("veblinka")
    val gtktkhkykh: String,
    @SerializedName("numberator")
    val frokfrjgtijgt: String,
)