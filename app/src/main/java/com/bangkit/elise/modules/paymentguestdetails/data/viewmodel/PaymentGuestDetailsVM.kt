package com.bangkit.elise.modules.paymentguestdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.paymentguestdetails.`data`.model.PaymentGuestDetailsModel
import com.bangkit.elise.modules.paymentguestdetails.`data`.model.SpinnerNamefieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentGuestDetailsVM : ViewModel(), KoinComponent {
  val paymentGuestDetailsModel: MutableLiveData<PaymentGuestDetailsModel> =
      MutableLiveData(PaymentGuestDetailsModel())

  var navArguments: Bundle? = null

  val spinnerNamefieldList: MutableLiveData<MutableList<SpinnerNamefieldModel>> = MutableLiveData()
}
