package org.example.interfaces

class Observer(
    var name : String
) : IObserver {
    override fun update() {
        println(name)
        //что то делает обновляется )
    }
}