package com.example.funtest.funcode

import android.view.View
import androidx.annotation.IdRes
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

fun RecyclerView.layout(): RecyclerView {
    this.layoutManager = LinearLayoutManager(context)
    return this
}

fun RecyclerView.layout(orientation: Int): RecyclerView {
    this.layoutManager = LinearLayoutManager(context, orientation, false)
    return this
}

fun RecyclerView.layout(orientation: Int, spanCount: Int, isStaggered: Boolean): RecyclerView {
    if (isStaggered) {
        this.layoutManager = StaggeredGridLayoutManager(spanCount, orientation)
    } else {
        this.layoutManager = GridLayoutManager(context, spanCount, orientation, false)
    }
    return this
}

fun <T> RecyclerView.bindData(
    data: MutableList<T>, layoutId: Int,
    convert: (holder: BaseViewHolder, t: T) -> Unit,
): RecyclerView {
    adapter = object : BaseQuickAdapter<T, BaseViewHolder>(layoutId, data) {
        override fun convert(holder: BaseViewHolder, item: T) {
            convert(holder, item)
        }
    }
    return this
}

fun RecyclerView.onItemChildClick(
    @IdRes vararg viewIds: Int,
    childClick: (adapter: BaseQuickAdapter<*, *>, view: View, position: Int) -> Unit
): RecyclerView {
    for (viewId in viewIds) {
        (adapter as BaseQuickAdapter<*, *>).addChildClickViewIds(viewId)
    }
    (adapter as BaseQuickAdapter<*, *>).setOnItemChildClickListener { adapter, view, position ->
        childClick(
            adapter,
            view,
            position
        )
    }
    return this
}

fun RecyclerView.onItemClick(
    itemClick: (adapter: BaseQuickAdapter<*, *>, view: View, position: Int) -> Unit
): RecyclerView {
    (adapter as BaseQuickAdapter<*, *>).setOnItemClickListener { adapter, view, position ->
        itemClick(adapter, view, position)
    }
    return this
}