package com.example.epoxytest.controller

import com.airbnb.epoxy.Typed2EpoxyController
import com.example.epoxytest.model.ShowCase
import com.example.epoxytest.model.ShowCaseHeader
import com.example.epoxytest.viewholder.headerShowCase
import com.example.epoxytest.viewholder.showCase


class ShowCaseController : Typed2EpoxyController<List<ShowCase>, ShowCaseHeader>() {

    override fun buildModels(dataShowCase: List<ShowCase>?, dataShowCaseHeader: ShowCaseHeader?) {

        headerShowCase {
            id(HEADER)
            title("Header")
        }

        dataShowCase?.forEachIndexed { index, item ->
            showCase {
                id(index.toString())
                title(item.title)
                subTitle(item.subTitle)
                miniText(item.miniText)
                image(item.image)
                button(item.button)

                headerShowCase {
                    id(HEADER)

                    when (index) {
                        0 -> {
                            title("Reviews")
                        }
                        1 -> {
                            title("Games")
                        }
                        2 -> {
                            title("Top games")
                        }
                    }
                }
            }
        }

        headerShowCase {
            id(FOOTER)
            title("Footer")
        }
    }

    companion object {
        private const val HEADER = "header_id"
        private const val FOOTER = "footer_id"
    }
}