package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCharaAdapter(private val listChara: ArrayList<Chara>) : RecyclerView.Adapter<ListCharaAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Chara)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCharaAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_chara, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListCharaAdapter.ListViewHolder, position: Int) {
        val chara = listChara[position]

        Glide.with(holder.itemView.context)
            .load(chara.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = chara.name
        holder.tvDetail.text = chara.detail

        holder.toDetail.setOnClickListener{
            onItemClickCallback.onItemClicked(
                listChara[holder.adapterPosition]
            )
        }

    }

    override fun getItemCount(): Int {
        return listChara.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var toDetail: RelativeLayout = itemView.findViewById(R.id.item_detail)
    }
}