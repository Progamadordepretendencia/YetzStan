package com.example.yetzstan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_IMCFragment)
        }
        binding.buttonQ1.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_Q1Fragment)
        }
        binding.buttonQ2.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_Q2Fragment)
        }
        binding.buttonQ3.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_q3Fragment)
        }
        binding.buttonQ4.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_q4Fragment)
        }
        binding.buttonQ5.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_q5Fragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}