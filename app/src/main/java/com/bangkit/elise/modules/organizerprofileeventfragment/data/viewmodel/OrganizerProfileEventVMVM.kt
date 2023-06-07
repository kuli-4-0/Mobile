package com.bangkit.elise.modules.organizerprofileeventfragment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.organizerprofileeventfragment.`data`.model.ListtimeOneRowModel
import com.bangkit.elise.modules.organizerprofileeventfragment.`data`.model.OrganizerProfileEventModelModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrganizerProfileEventVMVM : ViewModel(), KoinComponent {
  val organizerProfileEventModelModel: MutableLiveData<OrganizerProfileEventModelModel> =
      MutableLiveData(OrganizerProfileEventModelModel())

  var navArguments: Bundle? = null

  val listtimeOneList: MutableLiveData<MutableList<ListtimeOneRowModel>> =
      MutableLiveData(mutableListOf())
}
