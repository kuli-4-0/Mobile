package com.bangkit.elise.modules.editlocation.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityEditLocationBinding
import com.bangkit.elise.modules.editlocation.`data`.viewmodel.EditLocationVM
import kotlin.String
import kotlin.Unit

class EditLocationActivity :
    BaseActivity<ActivityEditLocationBinding>(R.layout.activity_edit_location) {
  private val viewModel: EditLocationVM by viewModels<EditLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editLocationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_LOCATION_ACTIVITY"

  }
}
