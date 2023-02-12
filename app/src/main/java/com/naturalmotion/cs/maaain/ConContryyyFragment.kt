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
import com.naturalmotion.cs.vevvvv.JOfjruhrfuhhrf.ccvccfcr
import com.naturalmotion.cs.yhyhhyhy.JIFjjrrfuhrfhrfhrfhurfgttgtg
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ConContryyyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_con_contryyy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        bgnhnhnh = context
    }

    private lateinit var bgnhnhnh: Context


    val ghyhyhy: SharedPreferences by inject(named("SharedPreferences"))
    val hyjujik by activityViewModel<JIFjjrrfuhrfhrfhrfhurfgttgtg>(named("MainModel"))

    lateinit var hyjukikilolol: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hyjujik.gtgt55.observe(viewLifecycleOwner) {
            if (it!=null) {
                hyjukikilolol = it.gtgjiogtjgtji
                ghyhyhy.edit().putString(ccvccfcr, hyjukikilolol).apply()
                frjrfoirfjrfji()
            }
        }
    }

    private fun frjrfoirfjrfji() {
        findNavController().navigate(R.id.action_conContryyyFragment_to_secccMaMaFragment)
    }
}