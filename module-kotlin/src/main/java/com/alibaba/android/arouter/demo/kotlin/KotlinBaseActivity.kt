package com.alibaba.android.arouter.demo.kotlin

import android.app.Activity
import com.alibaba.android.arouter.facade.annotation.Autowired

abstract class KotlinBaseActivity : Activity() {

    @Autowired
    @JvmField
    var parentName: String? = null

    @Autowired
    @JvmField
    var parentAge: Int? = 0
}