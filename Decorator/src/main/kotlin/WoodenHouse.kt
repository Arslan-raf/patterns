package org.example

//ConcreteComponent: конкретная реализация компонента, в которую с помощью декоратора добавляется новая функциональность
class WoodenHouse : House {
    override fun getPrice(): Float {
        return 10000000F;
    }
}