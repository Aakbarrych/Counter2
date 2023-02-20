package com.example.counter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val presenter = Injector.getPresenter()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            incrementBtn.setOnClickListener{
                presenter.increment()
            }
            decrementBtn.setOnClickListener{
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast(message: String) {
        val activateToast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        activateToast.show()
    }

    override fun showColor(textColor: Int) {
        binding.resultTv.setTextColor(textColor)
    }
}