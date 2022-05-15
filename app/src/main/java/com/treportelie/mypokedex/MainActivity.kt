
package com.treportelie.mypokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.widget.TextView
import com.treportelie.mypokedex.class_pokemon.menu.MainMenu
import com.treportelie.mypokedex.class_pokemon.metier.Pokemon
import com.treportelie.mypokedex.class_pokemon.technique.http.PokemonHttp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }


    }