package com.example.counter2

interface CounterView {
    fun showNewCount(count: Int)
    fun showToast(message: String)
    fun showColor(textColor: Int)
}