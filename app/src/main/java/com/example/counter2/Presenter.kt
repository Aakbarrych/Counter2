package com.example.counter2

import android.graphics.Color

class Presenter {

    private val model = Injector.getModel()
    private lateinit var counterView: CounterView

    fun increment(){
        model.increment()
        counterView.showNewCount(model.count)
        if (model.count == 10){
            counterView.showToast("Congrats!")
        } else if(model.count == 15){
            counterView.showColor(Color.GREEN)
        } else {
            counterView.showColor(Color.BLACK)
        }
    }
    fun decrement(){
        model.decrement()
        counterView.showNewCount(model.count)
        if (model.count == 10){
            counterView.showToast("Congrats!")
        } else if(model.count == 15){
            counterView.showColor(Color.GREEN)
        } else {
            counterView.showColor(Color.BLACK)
        }
    }
    fun fillCounterView(counterView: CounterView) {
        this.counterView = counterView
    }
    fun toast() {
        if(model.count == 10){
            counterView.showToast("Congrats!")
        }
    }
}