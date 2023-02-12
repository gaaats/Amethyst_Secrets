package com.naturalmotion.cs.gaaamemem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naturalmotion.cs.R
import com.naturalmotion.cs.databinding.FragmentGaameFourBinding


class GaameFourFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val frgtgtgt = ContextCompat.getDrawable(requireActivity(), R.drawable.stoone)

            val gtgtt = listOf(frgtgtgt).shuffled()

            frfrrfrfr.imgMainEnemeefrgy.setImageDrawable(gtgtt.random())


            gtgtgttg()
            ffrrfrf = false
            frfrrfrfr.btnPressMeefrgthy.setOnClickListener {
                if (hyhhyhy == 99) {
                    findNavController().navigate(R.id.action_gaameFourFragment_to_gameOneFragment)
                    hyhhyhy = 1
                }
                frfrrfrfr.progBbbb.progress = hyhhyhy
                hyhhyhy += 1
            }

            gtjojtgjgtihuhtggthgt()


        } catch (e: Exception) {
            mfkrogkt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjojtgjgtihuhtggthgt() {
        frfrrfrfr.btnImgExiterfgt.setOnClickListener {
            frftggt()
        }
    }

    private var hyhhyhy = 1
    private var ffrrfrf = true

    private var gaameFourBinding: FragmentGaameFourBinding? = null
    private val frfrrfrfr
        get() = gaameFourBinding ?: throw RuntimeException("FragmentGaameFourBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gaameFourBinding = FragmentGaameFourBinding.inflate(inflater, container, false)
        return frfrrfrfr.root
    }




    private fun mfkrogkt() {
        Snackbar.make(
            frfrrfrfr.root,
            "I have some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgttg() {
        frfrrfrfr.progBbbb.progress = hyhhyhy
    }

    private fun frftggt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you reaaaaly want to exit, the current data will not be save?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onDestroy() {
        gaameFourBinding = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }
}