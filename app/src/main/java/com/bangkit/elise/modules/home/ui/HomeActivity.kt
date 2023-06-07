package com.bangkit.elise.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityHomeBinding
import com.bangkit.elise.extensions.loadFragment
import com.bangkit.elise.modules.home.`data`.viewmodel.HomeVM
import com.bangkit.elise.modules.myprofile.ui.MyProfileFragment
import com.bangkit.elise.modules.navigationbar.ui.NavigationBarFragment
import com.bangkit.elise.modules.search.ui.SearchFragment
import com.bangkit.elise.modules.seeallevents.ui.SeeAllEventsFragment
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
    val destFragment = NavigationBarFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = NavigationBarFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearMenu2.setOnClickListener {
      val destFragment = SearchFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SearchFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearMenu5.setOnClickListener {
      val destFragment = MyProfileFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = MyProfileFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearMenu4.setOnClickListener {
      val destFragment = SeeAllEventsFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SeeAllEventsFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearMenu1.setOnClickListener {
      val destFragment = NavigationBarFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = NavigationBarFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
