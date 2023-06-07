package com.bangkit.elise.modules.ticketdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.ticketdetail.`data`.model.TicketDetailModel
import com.bangkit.elise.modules.ticketdetail.`data`.model.TicketDetailRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TicketDetailVM : ViewModel(), KoinComponent {
  val ticketDetailModel: MutableLiveData<TicketDetailModel> = MutableLiveData(TicketDetailModel())

  var navArguments: Bundle? = null

  val ticketDetailList: MutableLiveData<MutableList<TicketDetailRowModel>> =
      MutableLiveData(mutableListOf())
}
