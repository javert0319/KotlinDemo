package com.thredim.it.kotlindemo

import android.text.TextUtils
import java.util.Arrays

/**
 * @author JAIWEI
 * @company Thredim
 * @date on 2018/10/23.
 * @org www.thredim.com (宁波视睿迪光电有限公司)
 * @email thredim@thredim.com
 * @describe 添加描述
 */
class Test {

    fun getWeek(str: String): String? {
        var result: String? = null
        if(!TextUtils.isEmpty(str)){
            val str2 = str.replace(" ", "")//去掉所用空格
            val list = Arrays.asList(*str2.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
            if (list.size == 7){
                result = "每天"
            }else{
                for (i in list.indices) {
                    when (list[i]) {
                        "1" -> result = "周日 "
                        "2" -> result += "周一 "
                        "3" -> result += "周二 "
                        "4" -> result += "周三 "
                        "5" -> result += "周四 "
                        "6" -> result += "周五 "
                        "7" -> result += "周六"
                        else -> {
                        }
                    }
                }
            }

        }

        return result
    }
}
