package com.stephen.demo.sample.activity

import com.stephen.demo.R
import com.stephen.demo.sample.adapter.SampleAdapter
import com.stephen.demo.sample.presenter.SamplePresenter
import com.stephen.demo.sample.vo.SapmleVo
import com.stephen.mvpframework.annotation.InjectLayoutId
import com.stephen.mvpframework.annotation.InjectPresenter
import com.stephen.mvpframework.constraint.IView
import com.stephen.mvpframework.ui.AbstractRecyclerAdapter
import com.stephen.mvpframework.ui.activity.AbstractActivity
import kotlinx.android.synthetic.main.activity_sample.*

/**
 * 示例Activity
 * Created by Stephen on 2018/12/4.
 * StephenYoung0406@hotmail.com
 * <(￣ c￣)y▂ξ
 */
//注入布局ID,便于维护统一查看
@InjectLayoutId(ID = R.layout.activity_sample)
class SampleActivity : AbstractActivity(), IView {
    //自动注入Presenter并绑定
    @InjectPresenter
    private lateinit var presenter: SamplePresenter

    override fun onViewInit() {
        tv_sample.setOnClickListener {
            presenter.doGet()
        }
        SampleAdapter().apply {
            //数据列表
            voList = ArrayList()
            //基础点击
            baseOnItemClickListener = { vo -> }// == {  }
            //顶部margin值
            firstMarginTopValue = 10
        }

    }

    override fun onViewRefresh() {
    }

    fun updateView() {
        tv_sample.text = "hello presenter"
    }
}