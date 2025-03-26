package org.example

import org.example.decorator.HouseWithGarage
import org.example.decorator.HouseWithSauna

fun main() {
    var woodenHouse : House = WoodenHouse();
    println(woodenHouse.getPrice().toString())

    woodenHouse = HouseWithSauna(woodenHouse)
    println(woodenHouse.getPrice().toString())

    woodenHouse = HouseWithGarage(woodenHouse)
    println(woodenHouse.getPrice().toString())
}