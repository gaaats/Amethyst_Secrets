package com.naturalmotion.cs.gaaamemem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naturalmotion.cs.R
import com.naturalmotion.cs.databinding.FragmentGameOneBinding


class GameOneFragment : Fragment() {


    private var fragmentG1Binding: FragmentGameOneBinding? = null
    private val gtthyhyhyhyhy
        get() = fragmentG1Binding ?: throw RuntimeException("FragmentGameOneBinding = null")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentG1Binding = FragmentGameOneBinding.inflate(inflater, container, false)
        return gtthyhyhyhyhy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            jfjgtjgtijgtjgtjjgti()

        } catch (e: Exception) {
            hyhyjuju5ju5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun jfjgtjgtijgtjgtjjgti() {
        gtthyhyhyhyhy.btnPlaaaa.setOnClickListener {
            gtgjtggtngtngt()
        }
    }


    private fun hyhyjuju5ju5() {
        Snackbar.make(
            gtthyhyhyhyhy.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun gtgjtggtngtngt() {
        findNavController().navigate(R.id.action_gameOneFragment_to_gameTviFragment)
    }

    override fun onDestroy() {
        fragmentG1Binding = null
        super.onDestroy()
    }
}