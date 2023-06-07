package com.bangkit.elise.modules.eventdetailsaudition.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowListbagBinding
import com.bangkit.elise.modules.eventdetailsaudition.`data`.model.ListbagRowModel
import kotlin.Int
import kotlin.collections.List

class ListbagAdapter(
  var list: List<ListbagRowModel>
) : RecyclerView.Adapter<ListbagAdapter.RowListbagVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbagVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbag,parent,false)
    return RowListbagVH(view)
  }

  override fun onBindViewHolder(holder: RowListbagVH, position: Int) {
    val listbagRowModel = ListbagRowModel()
    // TODO uncomment following line after integration with data source
    // val listbagRowModel = list[position]
    holder.binding.listbagRowModel = listbagRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbagRowModel>) {
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
      item: ListbagRowModel
    ) {
    }
  }

  inner class RowListbagVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbagBinding = RowListbagBinding.bind(itemView)
  }
}
