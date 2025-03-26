package org.example.decorator

import org.example.House

class HouseWithGarage(house: House) : HouseDecorator(house) {
    override fun getPrice(): Float {
        return house.getPrice() + 4000000F;
    }
}