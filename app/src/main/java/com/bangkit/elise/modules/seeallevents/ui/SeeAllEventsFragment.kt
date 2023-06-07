package com.bangkit.elise.modules.seeallevents.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentSeeAllEventsBinding
import com.bangkit.elise.modules.seeallevents.`data`.model.SeeAllEventsRowModel
import com.bangkit.elise.modules.seeallevents.`data`.viewmodel.SeeAllEventsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeeAllEventsFragment :
    BaseFragment<FragmentSeeAllEventsBinding>(R.layout.fragment_see_all_events) {
  private val viewModel: SeeAllEventsVM by viewModels<SeeAllEventsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val seeAllEventsAdapter =
    SeeAllEventsAdapter(viewModel.seeAllEventsList.value?:mutableListOf())
    binding.recyclerSeeAllEvents.adapter = seeAllEventsAdapter
    seeAllEventsAdapter.setOnItemClickListener(
    object : SeeAllEventsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SeeAllEventsRowModel) {
        onClickRecyclerSeeAllEvents(view, position, item)
      }
    }
    )
    viewModel.seeAllEventsList.observe(requireActivity()) {
      seeAllEventsAdapter.updateData(it)
    }
    binding.seeAllEventsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerSeeAllEvents(
    view: View,
    position: Int,
    item: SeeAllEventsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEE_ALL_EVENTS_FRAGMENT"


    fun getInstance(bundle: Bundle?): SeeAllEventsFragment {
      val fragment = SeeAllEventsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
