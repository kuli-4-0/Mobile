package com.bangkit.elise.modules.payment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.payment.`data`.model.PaymentModel
import com.bangkit.elise.modules.payment.`data`.model.PaymentRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentVM : ViewModel(), KoinComponent {
  val paymentModel: MutableLiveData<PaymentModel> = MutableLiveData(PaymentModel())

  var navArguments: Bundle? = null

  val paymentList: MutableLiveData<MutableList<PaymentRowModel>> = MutableLiveData(mutableListOf())
}
