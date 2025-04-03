package org.example.interfaces

interface IObservable {
    fun addObserver(o: IObserver )
    fun notiftyObservers()
    fun removeObserver(o:IObserver)
    fun removeAllObservers()
}