package org.example

//ConcreteComponent: конкретная реализация компонента, в которую с помощью декоратора добавляется новая функциональность
class BrickHouse : House {
    override fun getPrice(): Float {
        return 12000000F;
    }
}