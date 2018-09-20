package com.thredim.it.kotlindemo

import android.app.Application
import com.tencent.bugly.Bugly
import com.tencent.bugly.crashreport.CrashReport

/**
 * @company Thredim
 * @date on 2018/9/8.
 * @author JAIWEI
 * @org www.thredim.com (宁波视睿迪光电有限公司)
 * @email thredim@thredim.com
 * @describe 添加描述
 */
class KotlinApp : Application() {
    override fun onCreate() {
        super.onCreate()
         /* Bugly SDK初始化
          * 参数1：上下文对象
          * 参数2：APPID，平台注册时得到,注意替换成你的appId
          * 参数3：是否开启调试模式，调试模式下会输出'CrashReport'tag的日志
          */
        Bugly.init(applicationContext,"59eb8b5463",true)
        //CrashReport.initCrashReport(applicationContext, "59eb8b5463", true)
    }
}