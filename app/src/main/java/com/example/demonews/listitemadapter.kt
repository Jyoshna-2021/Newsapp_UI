package com.example.demonews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demonews.R.*
import com.example.demonews.listitemadapter.listViewHolder

class listitemadapter :
    RecyclerView.Adapter<listViewHolder>() {

    private var mList: List<listitem>? = null
    fun setData(list: List<listitem>?) {
        mList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): listViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout.list_item, parent, false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: listViewHolder,
        position: Int
    ) {
        val itemlist = mList!![position] ?: return
        holder.Imgcatagory.setImageResource(itemlist.resourceId)
        holder.textcatagory.setText(itemlist.title_name)
    }

    override fun getItemCount(): Int {
        return if (mList != null) {
            mList!!.size
        } else 0
    }

    inner class listViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Imgcatagory: ImageView
        val textcatagory: TextView

        init {
            Imgcatagory = itemView.findViewById(R.id.image_View_list)
            textcatagory = itemView.findViewById(R.id.text_view_list)
        }
    }
}

