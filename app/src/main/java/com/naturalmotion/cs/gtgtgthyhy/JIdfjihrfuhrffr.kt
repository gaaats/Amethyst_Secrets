package com.naturalmotion.cs.gtgtgthyhy

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.naturalmotion.cs.apppipipip.UHfufrhfruhfr
import com.naturalmotion.cs.apppipipip.Bfrbhbrfbfrbbfrhrf
import com.naturalmotion.cs.apppipipip.Ydyfrgfrygfrgfrg
import com.naturalmotion.cs.apppipipip.JUfhruhrfrf
import com.naturalmotion.cs.gthyhyhy.KOfkfriji
import com.naturalmotion.cs.yhyhhyhy.JIFjjrrfuhrfhrfhrfhurfgttgtg
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



fun fjigtjigtjigtjigt(): Gson {
    return GsonBuilder().create()
}

val rfrfjrfijirf = module {
    viewModel (named("MainModel")){
        JIFjjrrfuhrfhrfhrfhurfgttgtg((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        KOfkfriji(get())
    }
}

val frjirfrf = module {

    single  <JUfhruhrfrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(JUfhruhrfrf::class.java)
    }

    single <UHfufrhfruhfr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(UHfufrhfruhfr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://amethystsecrets.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Bfrbhbrfbfrbbfrhrf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Ydyfrgfrygfrgfrg(get(named("HostInter")))
    }
    single{
        fjigtjigtjigtjigt()
    }
    single (named("SharedPreferences")) {
        jigtjigtjgtjgtjgti(androidApplication())
    }
}

fun jigtjigtjgtjgtjgti(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}
