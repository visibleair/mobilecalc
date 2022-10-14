package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mainresult = 0.0
        var result = ""
        binding.btn1.setOnClickListener {
            result = result.plus("1")
            mainresult = result.toDouble()
            binding.mainText.text = result.toString()
        }
        binding.btn2.setOnClickListener {
            result = result.plus("2")
            mainresult = result.toDouble()
            binding.mainText.text = result.toString()
        }
        binding.btn3.setOnClickListener {
            result = result.plus("3")
            binding.mainText.text = result.toString()
        }
        binding.btn4.setOnClickListener {
            result = result.plus("4")
            binding.mainText.text = result.toString()
        }
        binding.btn5.setOnClickListener {
            result = result.plus("5")
            binding.mainText.text = result.toString()
        }
        binding.btn6.setOnClickListener {
            result = result.plus("6")
            binding.mainText.text = result.toString()
        }
        binding.btn7.setOnClickListener {
            result = result.plus("7")
            binding.mainText.text = result.toString()
        }
        binding.btn8.setOnClickListener {
            result = result.plus("8")
            binding.mainText.text = result
        }
        binding.btn9.setOnClickListener {
            result = result.plus("9")
            binding.mainText.text = result
        }
        binding.btnDot.setOnClickListener {
            result = result.plus(".")
            binding.mainText.text = result
        }
        binding.btnPlus.setOnClickListener {
            result = result.plus(" + ")
            binding.mainText.text = result
        }
        binding.btnMinus.setOnClickListener {
            result = result.plus(" - ")
            binding.mainText.text = result
        }
        binding.btnMult.setOnClickListener {
            result = result.plus(" * ")
            mainresult = mainresult.plus()
            binding.mainText.text = result
        }
        binding.btnDiv.setOnClickListener {
            result = result.plus(" / ")
            binding.mainText.text = result
        }
        binding.btn0.setOnClickListener {
            result = result.plus("0")
            binding.mainText.text = result
        }
        binding.btnEquals.setOnClickListener {
            var ch = "5+5"


            binding.mainText.text = ch.toInt().toString()
        }

    }
}