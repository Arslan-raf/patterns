package org.example.decorator

import org.example.House

class HouseWithSauna(house: House) : HouseDecorator(house) {

    override fun getPrice(): Float {
        return house.getPrice() + 3000000F;
    }

}