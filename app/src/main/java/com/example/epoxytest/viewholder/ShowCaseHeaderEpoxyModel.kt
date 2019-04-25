package com.example.epoxytest.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.*
import com.example.epoxytest.R

@EpoxyModelClass(layout = R.layout.item_header_showcase)
abstract class HeaderShowCaseEpoxyModel : EpoxyModelWithHolder<HeaderShowCaseHolder>() {

    @EpoxyAttribute
    var title: String? = null

    override fun bind(view: HeaderShowCaseHolder) {
        super.bind(view)

        view.title.text = title
    }
}

class HeaderShowCaseHolder : EpoxyHolder() {

    lateinit var title: AppCompatTextView

    override fun bindView(itemView: View) {
        title = itemView.findViewById(R.id.tmp_txvw_title)
    }
}