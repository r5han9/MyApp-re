package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCharas: RecyclerView
    private var list: ArrayList<Chara> = arrayListOf()
    private val adapterChara = ListCharaAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCharas = findViewById(R.id.rv_charas)
        rvCharas.setHasFixedSize(true)
        rvCharas.adapter = adapterChara

        list.addAll(CharasData.listData)

        showRecylerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)

        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMenu: Int) {
        when(selectedMenu) {
            R.id.profile -> {
                val activityAbout = Intent(this@MainActivity, AboutActivity::class.java)

                startActivity(activityAbout)
            }
        }
    }

    private fun showRecylerList() {
        val listCharaAdapter = ListCharaAdapter(list)
        rvCharas.layoutManager = LinearLayoutManager(this)
        rvCharas.adapter = listCharaAdapter

        listCharaAdapter.setOnItemClickCallback(object: ListCharaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Chara) {
                val toDetail = Intent(this@MainActivity, DetailChara::class.java)

                toDetail.putExtra(DetailChara.EXTRA_IMAGE, data.photo)
                toDetail.putExtra(DetailChara.EXTRA_NAME, data.name)
                toDetail.putExtra(DetailChara.EXTRA_ANIME, data.anime)
                toDetail.putExtra(DetailChara.EXTRA_DETAIL, data.detail)

                startActivity(toDetail)
            }
        })
    }
}