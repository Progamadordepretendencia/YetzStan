package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentQ2Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q2Fragment : Fragment() {

    private var _binding:FragmentQ2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculate.setOnClickListener {
            //ENTRADA
            var numero = binding.numeroRealInput.text.toString().toInt()


            //PROCESSAMENTO
            var situacao = ""
            if (numero % 2 == 0) {
                situacao = " é par"
            } else {
                situacao = "é impar"
            }


            //SAÍDA
            binding.numeroResult.setText(String.format(situacao))
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}