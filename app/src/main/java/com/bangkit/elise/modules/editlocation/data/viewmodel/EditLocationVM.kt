package com.bangkit.elise.modules.editlocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.editlocation.`data`.model.EditLocationModel
import org.koin.core.KoinComponent

class EditLocationVM : ViewModel(), KoinComponent {
  val editLocationModel: MutableLiveData<EditLocationModel> = MutableLiveData(EditLocationModel())

  var navArguments: Bundle? = null
}
