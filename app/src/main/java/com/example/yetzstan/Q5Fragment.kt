package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentQ5Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q5Fragment : Fragment() {

    private var _binding:FragmentQ5Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ5Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculate.setOnClickListener {
            //ENTRADA

            println("Digite a letra")
            var vogal = binding.letrasVogaisInput.text.toString()

           var tipo = when (vogal) {
                "A" -> "Vogal"
                "E" -> "Vogal"
                "I" -> "Vogal"
                "O" -> "Vogal"
                "U" -> "Vogal"

                else ->"Consoante"
            }
            //SAÍDA
            binding.letrasResult.setText(tipo)
    }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}