package com.bangkit.elise.modules.verification.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityVerificationBinding
import com.bangkit.elise.modules.home.ui.HomeActivity
import com.bangkit.elise.modules.verification.`data`.viewmodel.VerificationVM
import kotlin.String
import kotlin.Unit

class VerificationActivity :
    BaseActivity<ActivityVerificationBinding>(R.layout.activity_verification) {
  private val viewModel: VerificationVM by viewModels<VerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBtncontinue.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VERIFICATION_ACTIVITY"

  }
}
