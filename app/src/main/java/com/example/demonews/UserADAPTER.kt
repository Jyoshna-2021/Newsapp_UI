package com.example.demonews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserADAPTER :
    RecyclerView.Adapter<UserADAPTER.userViewHolder>() {
    private var mListuser: List<user>? = null
    fun setData(list: List<user>?) {
        mListuser = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserADAPTER.userViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return userViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: UserADAPTER.userViewHolder,
        position: Int
    ) {
        val UserCategory = mListuser!![position] ?: return
        holder.Imgcatagory.setImageResource(UserCategory.resourceId)
        holder.textcatagory.setText(UserCategory.name)
    }

    override fun getItemCount(): Int {
        return if (mListuser != null) {
            mListuser!!.size
        } else 0
    }

    class userViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Imgcatagory: ImageView
        val textcatagory: TextView

        init {
            Imgcatagory = itemView.findViewById(R.id.list_image_View)
            textcatagory = itemView.findViewById(R.id.list_text_view)
        }
    }
}