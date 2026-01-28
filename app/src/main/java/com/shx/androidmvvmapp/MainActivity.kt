package com.shx.androidmvvmapp

import com.shx.androidmvvmapp.databinding.ActivityMainBinding
import com.shx.libs.base.BaseMvvmActivity
import com.shx.libs.mvvm.BaseViewModel

class MainActivity : BaseMvvmActivity<BaseViewModel, ActivityMainBinding>() {

    override fun initView() {
        mBinding.tvContent.text = "哈哈哈"
    }

    override fun initData() {
    }

    override fun initObserver() {
    }

}
