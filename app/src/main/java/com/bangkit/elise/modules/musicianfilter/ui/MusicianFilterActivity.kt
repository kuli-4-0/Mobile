package com.bangkit.elise.modules.musicianfilter.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.appcomponents.views.ImagePickerFragmentDialog
import com.bangkit.elise.databinding.ActivityMusicianFilterBinding
import com.bangkit.elise.modules.musicianfilter.`data`.viewmodel.MusicianFilterVM
import kotlin.String
import kotlin.Unit

class MusicianFilterActivity :
    BaseActivity<ActivityMusicianFilterBinding>(R.layout.activity_musician_filter) {
  private val viewModel: MusicianFilterVM by viewModels<MusicianFilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.musicianFilterVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "MUSICIAN_FILTER_ACTIVITY"

  }
}
