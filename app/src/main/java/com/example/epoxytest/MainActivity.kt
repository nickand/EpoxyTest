package com.example.epoxytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.epoxytest.controller.ShowCaseController
import com.example.epoxytest.model.ShowCase
import com.example.epoxytest.model.ShowCaseHeader
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var showCaseController: ShowCaseController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showCaseController = ShowCaseController()

        rvShowCase.layoutManager = LinearLayoutManager(this, EpoxyRecyclerView.VERTICAL, false)

        rvShowCase.setController(showCaseController)

        showCaseController.setData(populateShowCase(), ShowCaseHeader("Header"))
    }

    private fun populateShowCase(): List<ShowCase> {
        val showCases = ArrayList<ShowCase>()
        showCases.add(
            ShowCase(
                "Title 1",
                "Subtitle 1",
                "MiniText 1",
                R.drawable.ic_launcher_background,
                "Button"
            )
        )
        showCases.add(
            ShowCase(
                "Title 2",
                "Subtitle 2",
                "MiniText 2",
                R.drawable.ic_launcher_background,
                "Button"
            )
        )
        showCases.add(
            ShowCase(
                "Title 3",
                "Subtitle 3",
                "MiniText 3",
                R.drawable.ic_launcher_background,
                "Button"
            )
        )

        return showCases
    }
}
