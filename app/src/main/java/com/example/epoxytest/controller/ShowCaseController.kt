package com.example.epoxytest.controller

import com.airbnb.epoxy.Typed2EpoxyController
import com.example.epoxytest.model.ShowCase
import com.example.epoxytest.model.ShowCaseHeader
import com.example.epoxytest.viewholder.headerShowCase
import com.example.epoxytest.viewholder.showCase


class ShowCaseController : Typed2EpoxyController<List<ShowCase>, ShowCaseHeader>() {

    override fun buildModels(dataShowCase: List<ShowCase>?, dataShowCaseHeader: ShowCaseHeader?) {

        dataShowCase?.forEachIndexed { index, item ->
            showCase {
                id(index.toString())
                title(item.title)
                subTitle(item.subTitle)
                miniText(item.miniText)
                image(item.image)
                button(item.button)

                dataShowCaseHeader?.let {
                    headerShowCase {
                        id(HEADER)
                        title("${it.title} ${index + 1}")
                    }
                }
            }

        }
    }

    companion object {
        private val HEADER = "header_id"
    }
}