package com.bangkit.elise.modules.myprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.myprofile.`data`.model.MyProfileModel
import org.koin.core.KoinComponent

class MyProfileVM : ViewModel(), KoinComponent {
  val myProfileModel: MutableLiveData<MyProfileModel> = MutableLiveData(MyProfileModel())

  var navArguments: Bundle? = null
}
