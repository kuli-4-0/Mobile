package com.bangkit.elise.modules.eventdetailsaudition.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityEventDetailsAuditionBinding
import com.bangkit.elise.modules.eventdetailsaudition.`data`.model.ListbagRowModel
import com.bangkit.elise.modules.eventdetailsaudition.`data`.viewmodel.EventDetailsAuditionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventDetailsAuditionActivity :
    BaseActivity<ActivityEventDetailsAuditionBinding>(R.layout.activity_event_details_audition) {
  private val viewModel: EventDetailsAuditionVM by viewModels<EventDetailsAuditionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbagAdapter = ListbagAdapter(viewModel.listbagList.value?:mutableListOf())
    binding.recyclerListbag.adapter = listbagAdapter
    listbagAdapter.setOnItemClickListener(
    object : ListbagAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbagRowModel) {
        onClickRecyclerListbag(view, position, item)
      }
    }
    )
    viewModel.listbagList.observe(this) {
      listbagAdapter.updateData(it)
    }
    binding.eventDetailsAuditionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListbag(
    view: View,
    position: Int,
    item: ListbagRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENT_DETAILS_AUDITION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventDetailsAuditionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
