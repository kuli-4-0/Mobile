package com.bangkit.elise.modules.ticketdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowTicketDetailBinding
import com.bangkit.elise.modules.ticketdetail.`data`.model.TicketDetailRowModel
import kotlin.Int
import kotlin.collections.List

class TicketDetailAdapter(
  var list: List<TicketDetailRowModel>
) : RecyclerView.Adapter<TicketDetailAdapter.RowTicketDetailVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTicketDetailVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ticket_detail,parent,false)
    return RowTicketDetailVH(view)
  }

  override fun onBindViewHolder(holder: RowTicketDetailVH, position: Int) {
    val ticketDetailRowModel = TicketDetailRowModel()
    // TODO uncomment following line after integration with data source
    // val ticketDetailRowModel = list[position]
    holder.binding.ticketDetailRowModel = ticketDetailRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TicketDetailRowModel>) {
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
      item: TicketDetailRowModel
    ) {
    }
  }

  inner class RowTicketDetailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTicketDetailBinding = RowTicketDetailBinding.bind(itemView)
  }
}
