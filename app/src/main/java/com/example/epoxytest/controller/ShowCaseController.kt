package com.example.epoxytest.controller

import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxytest.model.ShowCase
import com.example.epoxytest.viewholder.showCase


class ShowCaseController : TypedEpoxyController<List<ShowCase>>() {

    override fun buildModels(data: List<ShowCase>?) {

        //showCaseHeader{
            //id(HEADER)
            //title(item.title)
        // }

        data?.forEachIndexed { index, item ->
            showCase {
                id(index.toString())
                title(item.title)
                subTitle(item.subTitle)
                miniText(item.miniText)
                image(item.image)
                button(item.button)
            }
        }
    }


    companion object {
        private val HEADER = "header_id"
    }
}