package com.bangkit.elise.modules.organizerprofileabout.ui

import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentOrganizerProfileAboutBinding
import com.bangkit.elise.modules.organizerprofileabout.`data`.viewmodel.OrganizerProfileAboutVM
import kotlin.String
import kotlin.Unit

class OrganizerProfileAboutFragment :
    BaseFragment<FragmentOrganizerProfileAboutBinding>(R.layout.fragment_organizer_profile_about) {
  private val viewModel: OrganizerProfileAboutVM by viewModels<OrganizerProfileAboutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.organizerProfileAboutVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ORGANIZER_PROFILE_ABOUT_FRAGMENT"

  }
}
