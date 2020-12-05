package com.xtha.zujal.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitdemo.adapter.MyAdapter
import com.xtha.zujal.recyclerviewexample.datasource.DataSource
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_layout.*

class MainActivity : AppCompatActivity() {


    private val myAdapter by lazy { MyAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerview()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        myAdapter.setData(data)
    }

    private fun setupRecyclerview() {
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}