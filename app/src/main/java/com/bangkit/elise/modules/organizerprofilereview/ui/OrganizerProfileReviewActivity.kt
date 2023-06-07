package com.bangkit.elise.modules.organizerprofilereview.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityOrganizerProfileReviewBinding
import com.bangkit.elise.modules.organizerprofilereview.`data`.viewmodel.OrganizerProfileReviewVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class OrganizerProfileReviewActivity :
    BaseActivity<ActivityOrganizerProfileReviewBinding>(R.layout.activity_organizer_profile_review)
    {
  private val viewModel: OrganizerProfileReviewVM by viewModels<OrganizerProfileReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.organizerProfileReviewVM = viewModel
    val adapter = OrganizerProfileReviewActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup1371,binding.viewPagerViewpager) { tab, position ->
      tab.text = OrganizerProfileReviewActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "ORGANIZER_PROFILE_REVIEW_ACTIVITY"

    }
  }
