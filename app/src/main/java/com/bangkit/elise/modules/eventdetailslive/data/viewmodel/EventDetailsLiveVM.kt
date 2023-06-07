package com.bangkit.elise.modules.eventdetailslive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.eventdetailslive.`data`.model.EventDetailsLiveModel
import com.bangkit.elise.modules.eventdetailslive.`data`.model.Listbag1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventDetailsLiveVM : ViewModel(), KoinComponent {
  val eventDetailsLiveModel: MutableLiveData<EventDetailsLiveModel> =
      MutableLiveData(EventDetailsLiveModel())

  var navArguments: Bundle? = null

  val listbagList: MutableLiveData<MutableList<Listbag1RowModel>> = MutableLiveData(mutableListOf())
}
