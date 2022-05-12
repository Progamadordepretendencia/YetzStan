package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentImcBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class IMCFragment : Fragment() {

    private var _binding: FragmentImcBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentImcBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculate.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            //Log.d("altura", binding.edHeight.text.toString())
            // Entrada
            var altura = binding.edHeight.text.toString().toFloat()
            var peso = binding.edWeight.text.toString().toFloat()
            //Processamento
            var imc = peso / (altura*altura)
            var situacao = ""
            if (imc < 18.5) situacao = "muito abaixo do peso #daniel"
            else if (imc < 20) situacao = "Abaixo do peso"
            else if (imc < 25) situacao = "peso normal"
            else if (imc < 30) situacao = "acima do peso"
            else if (imc < 35) situacao = "obesidade I"
            else if (imc < 40) situacao = "obesidade II"
            else  situacao = "baleia terrestre"

            //Saida
            binding.tvResult.setText(String.format("%.2f", imc) +"\n"+situacao)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}