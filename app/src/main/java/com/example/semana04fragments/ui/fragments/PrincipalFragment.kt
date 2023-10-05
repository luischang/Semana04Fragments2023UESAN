package com.example.semana04fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.semana04fragments.R
import com.example.semana04fragments.ui.MainActivity

class PrincipalFragment : Fragment() {
    private lateinit var sharedViewModel: MainActivity.SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtener una instancia del ViewModel compartido
        sharedViewModel = ViewModelProvider(requireActivity()).get(MainActivity.SharedViewModel::class.java)
    }
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
          val view: View =  inflater.inflate(R.layout.fragment_principal, container, false)
          val tvGlobal: TextView = view.findViewById(R.id.tvGlobal)

          sharedViewModel.globalVariable = "Hola v2"
          tvGlobal.text = sharedViewModel.globalVariable
          return view
    }
}