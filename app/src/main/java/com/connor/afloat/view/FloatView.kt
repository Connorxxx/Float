package com.connor.afloat.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import com.connor.afloat.R
import com.google.android.material.imageview.ShapeableImageView

class FloatView(context: Context, attributeSet: AttributeSet? = null)
    : FrameLayout(context, attributeSet), View.OnTouchListener {

    init {
        initView()
    }

    private var dx = 0f
    private var dy = 0f

    private fun initView() {
        val lp = LayoutParams(1480, 180)
        layoutParams = lp
        val imageView = ShapeableImageView(context)
        imageView.setImageResource(R.drawable.a4489)

        addView(imageView)
        setOnTouchListener(this)
    }


    override fun onTouch(v: View, event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                dx = event.x
                dy = event.y
            }
            MotionEvent.ACTION_MOVE -> {
                offsetTopAndBottom((y - dy).toInt())
                offsetLeftAndRight((x - dx).toInt())
            }
            MotionEvent.ACTION_UP -> {

            }
        }
        return true
    }
}