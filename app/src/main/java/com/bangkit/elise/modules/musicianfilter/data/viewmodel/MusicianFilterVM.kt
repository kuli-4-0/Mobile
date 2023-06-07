package com.bangkit.elise.modules.musicianfilter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.musicianfilter.`data`.model.MusicianFilterModel
import org.koin.core.KoinComponent

class MusicianFilterVM : ViewModel(), KoinComponent {
  val musicianFilterModel: MutableLiveData<MusicianFilterModel> =
      MutableLiveData(MusicianFilterModel())

  var navArguments: Bundle? = null
}
