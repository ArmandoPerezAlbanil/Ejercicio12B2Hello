package com.example.armandoedge.ejercicio12b

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count) as TextView
    }




    fun countUp(view: View) {
        mCount++
        if (mShowCount != null)
            mShowCount!!.text = Integer.toString(mCount)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG)
        toast.show()
    }


}
