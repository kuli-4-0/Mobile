package com.bangkit.elise.modules.eventdetailslive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowListbag1Binding
import com.bangkit.elise.modules.eventdetailslive.`data`.model.Listbag1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbagAdapter(
  var list: List<Listbag1RowModel>
) : RecyclerView.Adapter<ListbagAdapter.RowListbag1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbag1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbag1,parent,false)
    return RowListbag1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbag1VH, position: Int) {
    val listbag1RowModel = Listbag1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbag1RowModel = list[position]
    holder.binding.listbag1RowModel = listbag1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbag1RowModel>) {
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
      item: Listbag1RowModel
    ) {
    }
  }

  inner class RowListbag1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbag1Binding = RowListbag1Binding.bind(itemView)
  }
}
