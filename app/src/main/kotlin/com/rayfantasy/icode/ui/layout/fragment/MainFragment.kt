package com.rayfantasy.icode.ui.layout.fragment

import com.benny.library.kbinding.view.ViewBinderComponent
import com.rayfantasy.icode.R
import com.rayfantasy.icode.extension.generateViewId
import com.rayfantasy.icode.extension.lparams
import com.rayfantasy.icode.theme.colorPrimaryDark
import com.rayfantasy.icode.theme.observe
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.support.v4.swipeRefreshLayout

/**
 * Created by Allen on 2016/4/3.
 */
class MainFragment : ViewBinderComponent<MainFragment> {
    companion object{
        val ID_SWIPE    = generateViewId()
        val ID_RECYCLER = generateViewId()
        val ID_FAB      = generateViewId()
    }
    override fun builder(): AnkoContext<*>.() -> Unit  = {
        relativeLayout {


            swipeRefreshLayout {
                id = ID_SWIPE
                recyclerView {
                    id = ID_RECYCLER
                }.lparams(matchParent, matchParent)

            }.lparams(matchParent, matchParent)


            floatingActionButton {
                id = ID_FAB
                setImageResource(R.mipmap.ic_create_new)
                observe(colorPrimaryDark){setBackgroundColor(it)}
            }.lparams(dip(40),dip(40)){}

        }.lparams(matchParent, matchParent)
    }
}