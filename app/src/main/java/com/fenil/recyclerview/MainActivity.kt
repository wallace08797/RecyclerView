package com.fenil.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val song:MutableList<songs> = mutableListOf<songs>()
        song.add(songs("hey ari","song by lauv"))
        song.add(songs("love alone","song by mokita"))
        song.add(songs("closer","song by chainsmokers"))
        song.add(songs("changes","song by lauv"))
        song.add(songs("i like me better","song by lauv"))
        song.add(songs("love somebody","song by lauv"))
        song.add(songs("chasing fire","song by lauv"))
        song.add(songs("easy love","song by lauv"))
        song.add(songs("mean it","song by lauv"))
        val recyclerview:RecyclerView=findViewById(R.id.recycler1)
        recyclerview.adapter=myAdapter(song)
        recyclerview.layoutManager=LinearLayoutManager(this)

    }
}