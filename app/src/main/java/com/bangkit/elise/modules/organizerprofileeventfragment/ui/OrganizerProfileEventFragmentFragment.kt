package com.bangkit.elise.modules.organizerprofileeventfragment.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentOrganizerProfileEventFragmentBinding
import com.bangkit.elise.modules.organizerprofileeventfragment.`data`.model.ListtimeOneRowModel
import com.bangkit.elise.modules.organizerprofileeventfragment.`data`.viewmodel.OrganizerProfileEventVMVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrganizerProfileEventFragmentFragment :
    BaseFragment<FragmentOrganizerProfileEventFragmentBinding>(R.layout.fragment_organizer_profile_event_fragment)
    {
  private val viewModel: OrganizerProfileEventVMVM by viewModels<OrganizerProfileEventVMVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listtimeOneAdapter =
    ListtimeOneAdapter(viewModel.listtimeOneList.value?:mutableListOf())
    binding.recyclerListtimeOne.adapter = listtimeOneAdapter
    listtimeOneAdapter.setOnItemClickListener(
    object : ListtimeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeOneRowModel) {
        onClickRecyclerListtimeOne(view, position, item)
      }
    }
    )
    viewModel.listtimeOneList.observe(requireActivity()) {
      listtimeOneAdapter.updateData(it)
    }
    binding.organizerProfileEventVMVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtimeOne(
    view: View,
    position: Int,
    item: ListtimeOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORGANIZER_PROFILE_EVENT_FRAGMENT_FRAGMENT"

  }
}
