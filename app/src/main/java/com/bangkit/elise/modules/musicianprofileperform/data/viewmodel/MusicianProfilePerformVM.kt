package com.bangkit.elise.modules.musicianprofileperform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.musicianprofileperform.`data`.model.ListtimeRowModel
import com.bangkit.elise.modules.musicianprofileperform.`data`.model.MusicianProfilePerformModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MusicianProfilePerformVM : ViewModel(), KoinComponent {
  val musicianProfilePerformModel: MutableLiveData<MusicianProfilePerformModel> =
      MutableLiveData(MusicianProfilePerformModel())

  var navArguments: Bundle? = null

  val listtimeList: MutableLiveData<MutableList<ListtimeRowModel>> =
      MutableLiveData(mutableListOf())
}
