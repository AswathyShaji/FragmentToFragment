package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
                "Aswathy Shaji", "Sreepriya OS", "Suparna Suresh",
                "Pooja Omanakuttan", "Jinu Mamachan"
        )

        var mListView = userlist
        arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

    }
}