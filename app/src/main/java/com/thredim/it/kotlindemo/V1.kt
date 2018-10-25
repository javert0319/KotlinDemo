package com.thredim.it.kotlindemo

import java.util.ArrayList

/**
 * @company Thredim
 * @date on 2018/9/21.
 * @author JAIWEI
 * @org www.thredim.com (宁波视睿迪光电有限公司)
 * @email thredim@thredim.com
 * @describe 添加描述
 */
class V1 {

    fun list(){
        val list = ArrayList<String>()
        for (i in 0..10) {
            list.add(i.toString() + " 秒")
        }
        list.add("30 秒")

    }


}