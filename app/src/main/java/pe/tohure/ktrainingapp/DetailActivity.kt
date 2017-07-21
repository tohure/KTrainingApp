package pe.tohure.ktrainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_ID = "DetailActivity:id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        init();
    }

    private fun init() {
        val id = intent.getLongExtra(EXTRA_ID,-1)
        val item = getItems().firstOrNull { it.id == id }

        if (item != null){
            imgItem.loadUrl(item.url)
            lblItem.text = item.title
        }
    }
}