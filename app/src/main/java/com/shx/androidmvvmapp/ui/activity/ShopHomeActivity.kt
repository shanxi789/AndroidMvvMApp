package com.shx.androidmvvmapp.ui.activity

import android.content.Context
import android.content.Intent
import com.shx.androidmvvmapp.databinding.ActivityShopBinding
import com.shx.androidmvvmapp.ui.fragment.ShopFragment
import com.shx.libs.base.BaseMvvmActivity
import com.shx.libs.base.BaseViewPagerAdapter
import com.shx.libs.mvvm.BaseViewModel

/**
 * @Description: ShopHomeActivity
 * @Author: sihaoxuan
 * @Date: 2026/1/29 上午10:10
 */
class ShopHomeActivity: BaseMvvmActivity<BaseViewModel, ActivityShopBinding>() {

    private val mHomeFragmentPager by lazy { BaseViewPagerAdapter(this) }

    companion object{
        fun startShopHomeActivity(context: Context){
            val intent = Intent(context, ShopHomeActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun initView() {
        mBinding.vpContent.adapter = mHomeFragmentPager
        mHomeFragmentPager.setFragments(mutableListOf(ShopFragment(), ShopFragment(), ShopFragment()))

    }

    override fun initData() {
    }

    override fun initObserver() {
    }
}