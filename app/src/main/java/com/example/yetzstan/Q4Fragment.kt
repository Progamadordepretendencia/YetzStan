package com.example.yetzstan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yetzstan.databinding.FragmentQ4Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q4Fragment : Fragment() {

    private var _binding:FragmentQ4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQ4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculate.setOnClickListener {
            //ENTRADA
            val numero = binding.tabuadaSomaInput.text.toString().toInt()

            //PROCESSAMENTO
            var som = 1
            var  text = ""
            while (som != 11) {
                text += (numero + som).toString()
                if (som == 10)
                    text += "."
                else
                   text += ","
                som += 1
            }
            binding.tabuadaSomaResult.setText(text)
    }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}