package com.bangkit.elise.modules.eventdetailslive.ui

import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityEventDetailsLiveBinding
import com.bangkit.elise.modules.eventdetailslive.`data`.model.Listbag1RowModel
import com.bangkit.elise.modules.eventdetailslive.`data`.viewmodel.EventDetailsLiveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventDetailsLiveActivity :
    BaseActivity<ActivityEventDetailsLiveBinding>(R.layout.activity_event_details_live) {
  private val viewModel: EventDetailsLiveVM by viewModels<EventDetailsLiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbagAdapter = ListbagAdapter(viewModel.listbagList.value?:mutableListOf())
    binding.recyclerListbag.adapter = listbagAdapter
    listbagAdapter.setOnItemClickListener(
    object : ListbagAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbag1RowModel) {
        onClickRecyclerListbag(view, position, item)
      }
    }
    )
    viewModel.listbagList.observe(this) {
      listbagAdapter.updateData(it)
    }
    binding.eventDetailsLiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListbag(
    view: View,
    position: Int,
    item: Listbag1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENT_DETAILS_LIVE_ACTIVITY"

  }
}
