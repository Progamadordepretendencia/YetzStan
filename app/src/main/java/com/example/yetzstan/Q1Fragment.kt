package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentQ1Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q1Fragment : Fragment() {

    private var _binding:FragmentQ1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculate.setOnClickListener {
            //ENTRADA
            var raio = binding.circunferenciaRaioInput.text.toString().toFloat()

            //PROCESSAMENTO
            var pi = 3.14

            var diametro = 2 * raio
            var comprimento = 2*pi*raio
            var area = pi*raio*raio

            //SAÍDA
            binding.circunferenciaDiametroResult.setText(String.format("%.2f", diametro))
            binding.circunferenciaComprimentoResult.setText(String.format("%.2f", comprimento))
            binding.circunferenciaAreaResult.setText(String.format("%.2f", area))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}