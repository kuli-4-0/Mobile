package com.bangkit.elise.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.appcomponents.googleauth.GoogleHelper
import com.bangkit.elise.databinding.ActivitySignUpBinding
import com.bangkit.elise.modules.signup.`data`.model.SignUpRowModel
import com.bangkit.elise.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val signUpAdapter = SignUpAdapter(viewModel.signUpList.value?:mutableListOf())
    binding.recyclerSignUp.adapter = signUpAdapter
    signUpAdapter.setOnItemClickListener(
    object : SignUpAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUpRowModel) {
        onClickRecyclerSignUp(view, position, item)
      }
    }
    )
    viewModel.signUpList.observe(this) {
      signUpAdapter.updateData(it)
    }
    binding.signUpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    fun onClickRecyclerSignUp(
      view: View,
      position: Int,
      item: SignUpRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "SIGN_UP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
