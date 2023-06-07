package com.bangkit.elise.modules.eventdetailsaudition.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.eventdetailsaudition.`data`.model.EventDetailsAuditionModel
import com.bangkit.elise.modules.eventdetailsaudition.`data`.model.ListbagRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventDetailsAuditionVM : ViewModel(), KoinComponent {
  val eventDetailsAuditionModel: MutableLiveData<EventDetailsAuditionModel> =
      MutableLiveData(EventDetailsAuditionModel())

  var navArguments: Bundle? = null

  val listbagList: MutableLiveData<MutableList<ListbagRowModel>> = MutableLiveData(mutableListOf())
}
