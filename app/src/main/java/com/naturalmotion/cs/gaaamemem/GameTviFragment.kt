package com.naturalmotion.cs.gaaamemem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naturalmotion.cs.R
import com.naturalmotion.cs.databinding.FragmentGameTviBinding
import kotlin.random.Random


class GameTviFragment : Fragment() {



    private var fragmentGameTviBinding: FragmentGameTviBinding? = null
    private val binding get() = fragmentGameTviBinding ?: throw RuntimeException("FragmentGameTviBinding = null")


    private fun gtjgtgtjjgt() {
        val ngtjngtntgnhynhnyjnhy = Random.nextInt(gbghyhyhyhyhy.size - 1)

        val jgtjitgijgtjgtjigt = (360 - ngtjngtntgnhynhnyjnhy * hujjujuuj5k5i).toFloat()
        val fgrfyfyrgfrgfr = RotateAnimation(
            0f,
            (360f * gbghyhyhyhyhy.size) + jgtjitgijgtjgtjigt,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        fgrfyfyrgfrgfr.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = gbghyhyhyhyhy[ngtjngtntgnhynhnyjnhy]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    hyjuujujhyhyhy = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            binding.imgElfrgtgtgtgt.startAnimation(fgrfyfyrgfrgfr)
        }
    }

    private fun frghj222() {
        val gjitjtgjgtjgjti = Random.nextInt(gbghyhyhyhyhy.size - 1)

        val ngtgtbgtbbgtbgtbh = (360 - gjitjtgjgtjgjti * hujjujuuj5k5i).toFloat()
        val jgtitghgthgtgthgt = RotateAnimation(
            0f,
            (360f * gbghyhyhyhyhy.size) + ngtgtbgtbbgtbgtbh,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        jgtitghgthgtgthgt.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = gbghyhyhyhyhy[gjitjtgjgtjgjti]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    h5ju5j1j5 = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            binding.imgEl1.startAnimation(jgtitghgthgtgthgt)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGameTviBinding = FragmentGameTviBinding.inflate(inflater, container, false)
        return binding.root
    }


    private val gbghyhyhyhyhy = arrayOf(700, 1000, 100, 200, 500, 155, 80, 999, 777)
    private val hyhyjukikik = gbghyhyhyhyhy.clone()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            gjtigtjgtjgt()
            binding.btnSmall.setOnClickListener {
                if (!hyjuujujhyhyhy) {
                    gtjgtgtjjgt()
                    hyjuujujhyhyhy = true
                }
            }

            binding.btnBig.setOnClickListener {
                if (!h5ju5j1j5) {
                    frghj222()
                    h5ju5j1j5 = true
                }
            }

            binding.btnnNexxxt.setOnClickListener {
                findNavController().navigate(R.id.action_gameTviFragment_to_gameThreeFragment)
            }

        } catch (e: Exception) {
            fgthyhy555()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private val hujjujuuj5k5i = 360 / gbghyhyhyhyhy.size
    private var hyjuujujhyhyhy = false
    private var h5ju5j1j5 = false

    override fun onDestroy() {
        fragmentGameTviBinding = null
        super.onDestroy()
    }

    private fun gjtigtjgtjgt() {
        for (i in gbghyhyhyhyhy.indices) {
            hyhyjukikik[i] = (i + 1) * hujjujuuj5k5i
        }
    }




    private fun fgthyhy555() {
        frjrfrfjrjijrfjirfjrfjr()
        vbbrgghgthgt()
    }

    private fun vbbrgghgthgt() {
        requireActivity().onBackPressed()
    }

    private fun frjrfrfjrjijrfjirfjrfjr() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }
}