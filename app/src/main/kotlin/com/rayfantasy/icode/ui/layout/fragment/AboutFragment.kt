package com.rayfantasy.icode.ui.layout.fragment

import android.app.Activity
import com.benny.library.kbinding.view.ViewBinderComponent
import com.rayfantasy.icode.R
import com.rayfantasy.icode.extension.lparams
import com.rayfantasy.icode.util.getStringResources
import org.jetbrains.anko.*

/**
 * Created by Allen on 2016/4/3.
 */
class AboutFragment(val activity : Activity) : ViewBinderComponent<AboutFragment> {
    override fun builder(): AnkoContext<*>.() -> Unit =  {
        verticalLayout {
            imageView {
                setImageResource(R.mipmap.ic_launcher)
            }.lparams(dip(185),dip(185)){
                topMargin = dip(200)

            }
            textView {
                text = "NULL"
                //getStringResources(activity,R.string.app_name_cn)
            }.lparams(matchParent,wrapContent)
            textView {
                text = "NULL"
                //getStringResources(activity,R.string.app_name_cn)
            }.lparams(matchParent,wrapContent)
        }.lparams(matchParent,matchParent)
    }
}