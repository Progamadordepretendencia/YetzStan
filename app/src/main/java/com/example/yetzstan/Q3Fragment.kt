package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentQ3Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q3Fragment : Fragment() {

    private var _binding:FragmentQ3Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ3Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculate.setOnClickListener {
            //ENTRADA
            var som = binding.tabuadaMultiInput.text.toString().toInt()
            //processamento
            val numbers = listOf(0,1, 2, 3, 4, 5, 6,7,8,9,10)
            var text = ""
            for(i in numbers){
                text +=   String.format((i * som).toString()) +","
            }
            binding.tabuadaMultiResult.setText(text)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}