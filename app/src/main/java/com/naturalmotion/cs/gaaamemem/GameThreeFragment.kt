package com.naturalmotion.cs.gaaamemem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naturalmotion.cs.R
import com.naturalmotion.cs.databinding.FragmentGameThreeBinding


class GameThreeFragment : Fragment() {



    private fun frfrrfr() {
        Snackbar.make(
            hyhyhyyhyh.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var gameThreeBinding: FragmentGameThreeBinding? = null
    private val hyhyhyyhyh get() = gameThreeBinding ?: throw RuntimeException("FragmentGameThreeBinding = null")

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gameThreeBinding = FragmentGameThreeBinding.inflate(inflater, container, false)
        return hyhyhyyhyh.root
    }



    private fun poopopop() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ojgtgtjtggtjgtjjgtjgt()
            rfjfrjjgithuhgtuhgtuhugt()

        } catch (e: Exception) {
            frfrrfr()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun rfjfrjjgithuhgtuhgtuhugt() {
        hyhyhyyhyh.btnUnderstandGameRules.setOnClickListener {
            gtbbgtgtbgtbbgtbgt()
        }
    }

    private fun gtbbgtgtbgtbbgtbgt() {
        findNavController().navigate(R.id.action_gameThreeFragment_to_gaameFourFragment)
    }

    private fun ojgtgtjtggtjgtjjgtjgt() {
        hyhyhyyhyh.btnImgExitInfo.setOnClickListener {
            poopopop()
        }
    }

    override fun onDestroy() {
        gameThreeBinding = null
        super.onDestroy()
    }

}