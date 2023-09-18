package fr.tykok.pokemobile

import entity.pokemon.Pokemon
import PokeApi.PokeApi

class PokeMobile {
    val pikachu = PokeApi.get<Pokemon>(1)
}