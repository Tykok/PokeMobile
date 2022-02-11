package com.treportelie.mypokedex.class_pokemon.technique.http

import com.treportelie.mypokedex.class_pokemon.metier.Pokemon
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonHttp {

    @GET("pokemon/{pokemon}")
    fun getPostByName(@Path("pokemon") pokemonName: String): Call<Pokemon>

    companion object {

        private const val BASE_URL: String = "https://pokeapi.co/api/v2/"

        fun create() : PokemonHttp {
            var retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(PokemonHttp::class.java)
        }
    }
}