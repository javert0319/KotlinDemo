package com.thredim.it.kotlindemo

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG:String = MainActivity.javaClass.simpleName
    }

    val test = Test()
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        automate_iv_edit_delete.setOnClickListener {
            Toast.makeText(this,"删除",Toast.LENGTH_SHORT).show()
        }

        val week = test.getWeek("1,2,3,4,5,6,7")
        Toast.makeText(this,week,Toast.LENGTH_SHORT).show()
    }

}
