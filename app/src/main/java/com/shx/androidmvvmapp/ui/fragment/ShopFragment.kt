package com.shx.androidmvvmapp.ui.fragment

import com.shx.androidmvvmapp.databinding.FragmentShopBinding
import com.shx.libs.base.BaseMvvmFragment
import com.shx.libs.mvvm.BaseViewModel

/**
 * @Description: ShopFragment
 * @Author: sihaoxuan
 * @Date: 2026/1/29 上午10:11
 */
class ShopFragment: BaseMvvmFragment<BaseViewModel, FragmentShopBinding>(){

    override fun initView() {
        mBinding.tvText.text="1"
    }

    override fun initData() {
    }

    override fun initObserver() {
    }
}