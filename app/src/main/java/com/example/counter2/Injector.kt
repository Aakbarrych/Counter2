package com.example.counter2

class Injector {
    companion object{
        fun getPresenter() : Presenter{
            return Presenter()
        }
        fun getModel(): Model{
            return Model()
        }
    }
}