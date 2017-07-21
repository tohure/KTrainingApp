package pe.tohure.ktrainingapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_row.view.*

/**
 * Created by crhto on 20/07/2017.
 */
class ItemAdapter(val items: List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /*val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
         return ViewHolder(v)*/
        return ViewHolder(parent.inflate(R.layout.item_row))
    }

    //Two ways
    /*  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.lblItem.text = items.get(position).title

        holder.itemView.lblItem.text = items[position].title
        holder.itemView.imgItem.loadUrl(items[position].url)

        with(holder.itemView) {
            lblItem.text = items[position].title
            imgItem.loadUrl(items[position].url)
        }
    }*/

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView) {
        lblItem.text = items[position].title
        imgItem.loadUrl(items[position].url)
        setOnClickListener {
            listener(items[position])
        }
    }

    override fun getItemCount() = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}