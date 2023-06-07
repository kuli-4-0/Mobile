package com.bangkit.elise.modules.organizerprofilereviewfragment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.elise.R
import com.bangkit.elise.databinding.RowReviewBinding
import com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.model.ReviewRowModel
import kotlin.Int
import kotlin.collections.List

class ReviewAdapter(
  var list: List<ReviewRowModel>
) : RecyclerView.Adapter<ReviewAdapter.RowReviewVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_review,parent,false)
    return RowReviewVH(view)
  }

  override fun onBindViewHolder(holder: RowReviewVH, position: Int) {
    val reviewRowModel = ReviewRowModel()
    // TODO uncomment following line after integration with data source
    // val reviewRowModel = list[position]
    holder.binding.reviewRowModel = reviewRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReviewRowModel>) {
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
      item: ReviewRowModel
    ) {
    }
  }

  inner class RowReviewVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowReviewBinding = RowReviewBinding.bind(itemView)
  }
}
