package pe.tohure.ktrainingapp

/**
 * Created by crhto on 19/07/2017.
 */
data class Item (val id: Long, val title: String, val url: String)

fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(), "Cat $it","http://lorempixel.com/400/400/cats/$it/") }
}