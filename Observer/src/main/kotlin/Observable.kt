package org.example

import org.example.interfaces.IObservable
import org.example.interfaces.IObserver

class Observable : IObservable{
    private var observers : ArrayList<IObserver> = arrayListOf()

    override fun addObserver(o: IObserver) {
        observers.add(o)
    }

    override fun notiftyObservers() {
        for (observer in observers){
            observer.update()
        }
    }

    override fun removeObserver(o: IObserver) {
        observers.remove(o)
    }

    override fun removeAllObservers() {
        observers.clear()
    }

}