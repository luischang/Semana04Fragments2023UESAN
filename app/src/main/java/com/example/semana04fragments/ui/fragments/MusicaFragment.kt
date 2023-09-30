package com.example.semana04fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.semana04fragments.R
import com.example.semana04fragments.ui.model.SongModel


class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)

        rvMusica.layoutManager = LinearLayoutManager(requireContext())


        return view
    }

    private fun ListSong(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()



        return lstSong
    }


}