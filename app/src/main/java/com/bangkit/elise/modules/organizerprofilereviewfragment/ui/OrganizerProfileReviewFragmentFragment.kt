package com.bangkit.elise.modules.organizerprofilereviewfragment.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentOrganizerProfileReviewFragmentBinding
import com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.model.ReviewRowModel
import com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.viewmodel.OrganizerProfileReviewVMVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrganizerProfileReviewFragmentFragment :
    BaseFragment<FragmentOrganizerProfileReviewFragmentBinding>(R.layout.fragment_organizer_profile_review_fragment)
    {
  private val viewModel: OrganizerProfileReviewVMVM by viewModels<OrganizerProfileReviewVMVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val reviewAdapter = ReviewAdapter(viewModel.reviewList.value?:mutableListOf())
    binding.recyclerReview.adapter = reviewAdapter
    reviewAdapter.setOnItemClickListener(
    object : ReviewAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReviewRowModel) {
        onClickRecyclerReview(view, position, item)
      }
    }
    )
    viewModel.reviewList.observe(requireActivity()) {
      reviewAdapter.updateData(it)
    }
    binding.organizerProfileReviewVMVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerReview(
    view: View,
    position: Int,
    item: ReviewRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORGANIZER_PROFILE_REVIEW_FRAGMENT_FRAGMENT"

  }
}
