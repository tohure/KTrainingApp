package pe.tohure.ktrainingapp

import android.content.Context
import android.widget.Toast

/**
 * Created by crhto on 19/07/2017.
 */

fun Context.toast(text: CharSequence){
    Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
}