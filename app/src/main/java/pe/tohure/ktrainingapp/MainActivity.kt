package pe.tohure.ktrainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {

        btnClick.setOnClickListener { toast(lblName.text) }

        val items = listOf(Item("title","url"), Item("title2","url2"))

        val result : List<String> = items
                .sortedBy (Item::title )
                .filter { it.url.isNotEmpty() }
                .map (Item::title)
    }
}
