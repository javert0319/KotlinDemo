package com.thredim.it.kotlindemo

import java.util.*

/**
 * @company Thredim
 * @date on 2018/9/8.
 * @author JAIWEI
 * @org www.thredim.com (宁波视睿迪光电有限公司)
 * @email thredim@thredim.com
 * @describe 添加描述
 */
class Test{

    companion object {
        val str:String = "Hello World"

        fun sum3(a:Int,b:Int):Int{
            return a+b
        }
    }

    fun sum(a:Int,b:Int):Int{
        return a+b
    }

    fun main(args:Array<String>){
        print("sum of 3 and 5")
        println(sum(3,5))
    }

}