package com.xiaoxiao.testgithubpackages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiaoxiao.common.Calculate
import com.xiaoxiao.testgithubpackages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mBinding.root)

        mBinding.tvText.text = Calculate.add(20, 100).toString()
    }
}