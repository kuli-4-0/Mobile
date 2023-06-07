package com.bangkit.elise.modules.ticketdetail.ui

import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityTicketDetailBinding
import com.bangkit.elise.modules.ticketdetail.`data`.model.TicketDetailRowModel
import com.bangkit.elise.modules.ticketdetail.`data`.viewmodel.TicketDetailVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TicketDetailActivity :
    BaseActivity<ActivityTicketDetailBinding>(R.layout.activity_ticket_detail) {
  private val viewModel: TicketDetailVM by viewModels<TicketDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val ticketDetailAdapter =
    TicketDetailAdapter(viewModel.ticketDetailList.value?:mutableListOf())
    binding.recyclerTicketDetail.adapter = ticketDetailAdapter
    ticketDetailAdapter.setOnItemClickListener(
    object : TicketDetailAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TicketDetailRowModel) {
        onClickRecyclerTicketDetail(view, position, item)
      }
    }
    )
    viewModel.ticketDetailList.observe(this) {
      ticketDetailAdapter.updateData(it)
    }
    binding.ticketDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerTicketDetail(
    view: View,
    position: Int,
    item: TicketDetailRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TICKET_DETAIL_ACTIVITY"

  }
}
