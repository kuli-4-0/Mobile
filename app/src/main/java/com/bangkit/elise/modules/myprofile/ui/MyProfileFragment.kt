package com.bangkit.elise.modules.myprofile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentMyProfileBinding
import com.bangkit.elise.modules.myprofile.`data`.viewmodel.MyProfileVM
import kotlin.String
import kotlin.Unit

class MyProfileFragment : BaseFragment<FragmentMyProfileBinding>(R.layout.fragment_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): MyProfileFragment {
      val fragment = MyProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
