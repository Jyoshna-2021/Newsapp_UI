package com.example.demonews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demonews.R.*
import com.example.demonews.catagoryadapter.catagoryViewHolder

class catagoryadapter :
    RecyclerView.Adapter<catagoryViewHolder>() {
    private var mListcatagory: List<catagory>? = null
    fun setData(list: List<catagory>?) {
        mListcatagory = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): catagoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent, false)
        return catagoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: catagoryViewHolder, position: Int) {
        val Category = mListcatagory!![position] ?: return
        holder.Imgcatagory.setImageResource(Category.resourceId)
        holder.textcatagory.setText(Category.title)
    }

    override fun getItemCount(): Int {
        return if (mListcatagory != null) {
            mListcatagory!!.size
        } else 0
    }

     class catagoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Imgcatagory: ImageView
        val textcatagory: TextView

        init {
            Imgcatagory = itemView.findViewById(R.id.Image_View)
            textcatagory = itemView.findViewById(R.id.text_view_1)
        }
    }
}

