
package com.treportelie.mypokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.treportelie.mypokedex.class_pokemon.metier.Pokemon
import com.treportelie.mypokedex.class_pokemon.technique.http.PokemonHttp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // To refractor in function
        val tv1: TextView = findViewById(R.id.TextView)
        tv1.text = "Salut"
        val apiInterface = PokemonHttp.create().getPostByName("pikachu")

        apiInterface.enqueue( object : Callback<Pokemon>{
            override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                response?.body()?.name?.let { Log.d("Retour", it) }
                Log.d("Message", response?.message().toString())

                if(response?.body() != null)
                    tv1.text = response.body()?.name
            }

            override fun onFailure(call: Call<Pokemon>?, t: Throwable?) {
                Log.d("Retour", t.toString())
                tv1.text = "Error"
            }
        })

    }
}