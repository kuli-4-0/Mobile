package com.bangkit.elise.modules.navigationbar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.navigationbar.`data`.model.CardsRowModel
import com.bangkit.elise.modules.navigationbar.`data`.model.NavigationBarModel
import com.bangkit.elise.modules.navigationbar.`data`.model.SpinnerGroupTenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NavigationBarVM : ViewModel(), KoinComponent {
  val navigationBarModel: MutableLiveData<NavigationBarModel> =
      MutableLiveData(NavigationBarModel())

  var navArguments: Bundle? = null

  val spinnerGroupTenList: MutableLiveData<MutableList<SpinnerGroupTenModel>> = MutableLiveData()

  val cardsList: MutableLiveData<MutableList<CardsRowModel>> = MutableLiveData(mutableListOf())
}
