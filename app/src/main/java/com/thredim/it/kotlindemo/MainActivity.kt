package com.thredim.it.kotlindemo

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG:String = MainActivity.javaClass.simpleName
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = login("张三", "123456")
        tv_kotlin.text = login

        Log.d("MYDEBUG","sum of 13 and 49 is ${sum1(13,49)}")

        sum2(12,15)

        val a:Int = 1
        val b = 2
        val c:Int
        c = 3
        val sum3 = Test.sum3(10, 12)

        tv_kotlin.setOnClickListener {
            view -> "Hello World"
        }
    }

    fun sum1(a:Int,b:Int) = a+b

    fun sum2(a:Int,b:Int):Unit{
        Log.d("MYDEBUG","sum of $a and $b is ${a + b}")
    }

    fun sum3(a:String,b:String):String{
        return a+b
    }

    fun login(name:String,pass:String):String{
        return "name:$name"+";pass:$pass"
    }

}
