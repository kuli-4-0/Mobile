package com.bangkit.elise.modules.musicianprofileperform.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowListtimeBinding
import com.bangkit.elise.modules.musicianprofileperform.`data`.model.ListtimeRowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeAdapter(
  var list: List<ListtimeRowModel>
) : RecyclerView.Adapter<ListtimeAdapter.RowListtimeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtimeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime,parent,false)
    return RowListtimeVH(view)
  }

  override fun onBindViewHolder(holder: RowListtimeVH, position: Int) {
    val listtimeRowModel = ListtimeRowModel()
    // TODO uncomment following line after integration with data source
    // val listtimeRowModel = list[position]
    holder.binding.listtimeRowModel = listtimeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtimeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListtimeRowModel
    ) {
    }
  }

  inner class RowListtimeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtimeBinding = RowListtimeBinding.bind(itemView)
  }
}
