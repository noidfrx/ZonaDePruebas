package com.example.zonadepruebas.cursoGaston.navigationComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.zonadepruebas.R

class PrimerNavigationFragment : Fragment(R.layout.fragment_primer_navigation) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnirados).setOnClickListener {
            findNavController().navigate(R.id.action_primerNavigationFragment_to_segundoNavigationFragment)
        }
    }
}