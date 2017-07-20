package pe.tohure.ktrainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        //config Recycler
        rcvList.layoutManager = GridLayoutManager(this,2)
        rcvList.adapter = ItemAdapter(getItems())
    }
}
