package pe.tohure.ktrainingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by crhto on 19/07/2017.
 */

fun Context.toast(text: CharSequence){
    Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
}

fun ViewGroup.inflate(layoutRes : Int): View {
    return LayoutInflater.from(context).inflate(layoutRes,this,false)
}

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}