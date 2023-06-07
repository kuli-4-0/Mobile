package com.bangkit.elise.modules.payment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowPaymentBinding
import com.bangkit.elise.modules.payment.`data`.model.PaymentRowModel
import kotlin.Int
import kotlin.collections.List

class PaymentAdapter(
  var list: List<PaymentRowModel>
) : RecyclerView.Adapter<PaymentAdapter.RowPaymentVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment,parent,false)
    return RowPaymentVH(view)
  }

  override fun onBindViewHolder(holder: RowPaymentVH, position: Int) {
    val paymentRowModel = PaymentRowModel()
    // TODO uncomment following line after integration with data source
    // val paymentRowModel = list[position]
    holder.binding.paymentRowModel = paymentRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PaymentRowModel>) {
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
      item: PaymentRowModel
    ) {
    }
  }

  inner class RowPaymentVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPaymentBinding = RowPaymentBinding.bind(itemView)
  }
}
