package com.bangkit.elise.modules.musicianprofileperform.ui

import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityMusicianProfilePerformBinding
import com.bangkit.elise.modules.musicianprofileperform.`data`.model.ListtimeRowModel
import com.bangkit.elise.modules.musicianprofileperform.`data`.viewmodel.MusicianProfilePerformVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MusicianProfilePerformActivity :
    BaseActivity<ActivityMusicianProfilePerformBinding>(R.layout.activity_musician_profile_perform)
    {
  private val viewModel: MusicianProfilePerformVM by viewModels<MusicianProfilePerformVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeAdapter = ListtimeAdapter(viewModel.listtimeList.value?:mutableListOf())
    binding.recyclerListtime.adapter = listtimeAdapter
    listtimeAdapter.setOnItemClickListener(
    object : ListtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeRowModel) {
        onClickRecyclerListtime(view, position, item)
      }
    }
    )
    viewModel.listtimeList.observe(this) {
      listtimeAdapter.updateData(it)
    }
    binding.musicianProfilePerformVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListtime(
    view: View,
    position: Int,
    item: ListtimeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MUSICIAN_PROFILE_PERFORM_ACTIVITY"

  }
}
