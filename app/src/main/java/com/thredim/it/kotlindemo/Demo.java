package com.thredim.it.kotlindemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JAIWEI
 * @company Thredim
 * @date on 2018/10/25.
 * @org www.thredim.com (宁波视睿迪光电有限公司)
 * @email thredim@thredim.com
 * @describe 添加描述
 */
public class Demo {
    private void test(){
        List<String> list = new ArrayList<>();
        for (int i = 0;i<=10;i++){
            list.add(i+" 秒");
        }
        list.add("30 秒");
    }

}
