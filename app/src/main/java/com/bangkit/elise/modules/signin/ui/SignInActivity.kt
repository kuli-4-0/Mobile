package com.bangkit.elise.modules.signin.ui

import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivitySignInBinding
import com.bangkit.elise.modules.home.ui.HomeActivity
import com.bangkit.elise.modules.signin.`data`.viewmodel.SignInVM
import com.bangkit.elise.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.txtForgotPassword.setOnClickListener {
        // TODO please, add your navigation code here
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
        finish()
      }
      binding.linearGooglesignin.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGN_IN_ACTIVITY"

    }
  }
