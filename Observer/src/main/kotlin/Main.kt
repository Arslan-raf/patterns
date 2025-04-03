package org.example

import org.example.interfaces.IObservable
import org.example.interfaces.IObserver
import org.example.interfaces.Observer

//*
// IObservable: представляет наблюдаемый объект. Определяет три метода: AddObserver() (для добавления наблюдателя), RemoveObserver() (удаление набюдателя) и NotifyObservers() (уведомление наблюдателей)
// ConcreteObservable: конкретная реализация интерфейса IObservable. Определяет коллекцию объектов наблюдателей.
// IObserver: представляет наблюдателя, который подписывается на все уведомления наблюдаемого объекта. Определяет метод Update(), который вызывается наблюдаемым объектом для уведомления наблюдателя.
// ConcreteObserver: конкретная реализация интерфейса IObserver.
// */
fun main() {
    var observable: IObservable = Observable()
    var observer1: IObserver = Observer("observer1")
    var observer2: IObserver = Observer("observer2")

    observable.addObserver(observer1)
    observable.addObserver(observer2)

    observable.notiftyObservers()

    observable.removeAllObservers()
}