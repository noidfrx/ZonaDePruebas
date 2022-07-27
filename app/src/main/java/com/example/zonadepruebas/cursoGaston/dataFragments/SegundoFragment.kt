package com.example.zonadepruebas.cursoGaston.dataFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.zonadepruebas.R

class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    private var nombre = ""
    private var rut = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nombre = requireArguments().getString(NOMBRE)!!
        rut = requireArguments().getString(RUT)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvFUno = view.findViewById<TextView>(R.id.tvDeFragmentUno)
        val btn = view.findViewById<Button>(R.id.btnVolverMsg)
        tvFUno.text = "Nombre: $nombre \nRut: $rut"

        btn.setOnClickListener {
            setFragmentResult("keyResult", bundleOf("segundon" to "Hola amigos soy segundo fragment"))
            requireActivity().supportFragmentManager.popBackStack()
        }

    }

    companion object {
        private val NOMBRE = "NOM"
        private val RUT = "RUT"

        fun newInstance(nombre:String, rut:String) = SegundoFragment().apply {
            arguments = bundleOf(NOMBRE to nombre, RUT to rut)
        }
    }




}