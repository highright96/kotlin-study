package lec19

import lec18.Fruit

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

data class UltraSuperGuardianTribe(
    val name: String
)