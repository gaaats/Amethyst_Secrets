package com.naturalmotion.cs.maaain

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.naturalmotion.cs.R
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.cdvdgcdtdf
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.jijiji
import com.naturalmotion.cs.yhyhhyhy.JIFjjrrfuhrfhrfhrfhurfgttgtg
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SecccMaMaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_seccc_ma_ma, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fpkofrr = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        frrfijfrj.gt2hy5hy5hyhy.observe(viewLifecycleOwner) {
            if (it != null) {
                val hyhjujuujikikff = it.toString()
                dccdndcbvfv.edit().putString("mainId", hyhjujuujikikff).apply()
            }
        }

        frrfijfrj.hy2hyujjuuj5.observe(viewLifecycleOwner) {
            if (it != null) {

                gtjigtjiigt = it.deidehgfryrf
                vfvfbvfbvf = it.frokfrjgtijgt
                vfbhfbfhvvf = it.gtktkhkykh

                dccdndcbvfv.edit().putString(cdvdgcdtdf, gtjigtjiigt).apply()
                dccdndcbvfv.edit().putString(JOfjruhrfuhhrf.gtgtuigtgtu, vfvfbvfbvf).apply()
                dccdndcbvfv.edit().putString(jijiji, vfbhfbfhvvf).apply()

                forjijgthgthgtu()
            }
        }
    }

    private fun forjijgthgthgtu() {
        findNavController().navigate(R.id.action_secccMaMaFragment_to_preeeFiillterraaaFragment)
    }

    val frrfijfrj by activityViewModel<JIFjjrrfuhrfhrfhrfhurfgttgtg>(named("MainModel"))
    lateinit var gtjigtjiigt: String
    lateinit var vfbhfbfhvvf: String
    lateinit var vfvfbvfbvf: String
    private lateinit var fpkofrr: Context

    val dccdndcbvfv: SharedPreferences by inject(named("SharedPreferences"))
}