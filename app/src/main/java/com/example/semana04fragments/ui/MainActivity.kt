package com.example.semana04fragments.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.semana04fragments.R
import com.example.semana04fragments.databinding.ActivityMainBinding
import com.example.semana04fragments.ui.model.ProductModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navprincipal, R.id.navregistro, R.id.navmusica
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    class SharedViewModel : ViewModel() {
        var globalVariable: String = "hola"
    }

    class SharedClassViewModel: ViewModel(){
        var productModel: ProductModel? = null
        init {
            // Configura valores predeterminados para productModel aquí
            productModel = ProductModel(
                name = "Nombre predeterminado",
                description = "Descripción predeterminada",
                price = 0.0,
                category = "Categoría predeterminada"
            )
        }
    }
}