package com.rie.jetheroes.data

import com.rie.jetheroes.model.Hero
import com.rie.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}