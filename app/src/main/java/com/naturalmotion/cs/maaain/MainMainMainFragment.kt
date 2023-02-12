package com.naturalmotion.cs.maaain

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.naturalmotion.cs.R
import com.naturalmotion.cs.yhyhhyhy.JIFjjrrfuhrfhrfhrfhurfgttgtg
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MainMainMainFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        defrvvfvfbgbg=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bgbhhhyhy.h2hy55ujuj51(defrvvfvfbgbg)

        frjfofrojorfi()

    }

    private fun frjfofrojorfi() {
        findNavController().navigate(R.id.action_mainMainMainFragment_to_conContryyyFragment)
    }

    private lateinit var defrvvfvfbgbg: Context

    val bgbhhhyhy by activityViewModel<JIFjjrrfuhrfhrfhrfhurfgttgtg>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_main_main, container, false)
    }
}