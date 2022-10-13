package com.connor.afloat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import com.connor.afloat.databinding.ActivityMainBinding
import com.connor.afloat.view.FloatView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initClick()
        Log.d("onCreate", "onCreateTest: ")
    }

    private fun initClick() {
        binding.btnAdd.setOnClickListener {
            val contentView = this.window.decorView.findViewById(android.R.id.content) as FrameLayout
            contentView.addView(FloatView(this))
        }
    }
}