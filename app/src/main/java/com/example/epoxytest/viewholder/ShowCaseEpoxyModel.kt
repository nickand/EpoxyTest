package com.example.epoxytest.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.*
import com.example.epoxytest.R

@EpoxyModelClass(layout = R.layout.item_showcase_img_right)
abstract class ShowCaseEpoxyModel : EpoxyModelWithHolder<ShowCaseHolder>() {

    @EpoxyAttribute
    var header: String? = null
    @EpoxyAttribute
    var title: String? = null
    @EpoxyAttribute
    var subTitle: String? = null
    @EpoxyAttribute
    var miniText: String? = null
    @EpoxyAttribute
    var image: Int? = null
    @EpoxyAttribute
    var button: String? = null

    override fun bind(view: ShowCaseHolder) {
        super.bind(view)

        view.header.text = header
        view.title.text = title
        view.subtitle.text = subTitle
        view.txtStatus.text = miniText
        view.imgAvatar.setImageResource(R.drawable.ic_launcher_background)
        view.button.text = button
    }
}

class ShowCaseHolder : EpoxyHolder() {

    lateinit var imgAvatar: AppCompatImageView
    lateinit var header: AppCompatTextView
    lateinit var title: AppCompatTextView
    lateinit var subtitle: AppCompatTextView
    lateinit var txtStatus: AppCompatTextView
    lateinit var button: AppCompatButton

    override fun bindView(itemView: View) {
        imgAvatar = itemView.findViewById(R.id.tmpshowcase_imgvw_right)
        header = itemView.findViewById(R.id.tmp_txvw_header_title)
        title = itemView.findViewById(R.id.tmp_txvw_title)
        subtitle = itemView.findViewById(R.id.tmp_txvw_subtitle)
        txtStatus = itemView.findViewById(R.id.tmp_txvw_minitext)
        button = itemView.findViewById(R.id.tmpshowcase_vw_actions)
    }
}