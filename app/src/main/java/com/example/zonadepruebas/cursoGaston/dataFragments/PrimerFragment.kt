package com.example.zonadepruebas.cursoGaston.dataFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import com.example.zonadepruebas.R

class PrimerFragment : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btnirasegundo)
        button.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fcv_container, SegundoFragment.newInstance("Eduardo", "1234"))
                addToBackStack("primerFragment")
            }
        }


    }
}