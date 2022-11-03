package com.example.bukota

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCityAdapter(private val listCity: ArrayList<City>): RecyclerView.Adapter<ListCityAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_city, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo, information, ) = listCity[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailCity::class.java)
            moveDetail.putExtra(DetailCity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailCity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailCity.EXTRA_INFORMATION, information)
            moveDetail.putExtra(DetailCity.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listCity.size
    }
}