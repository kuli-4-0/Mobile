package com.bangkit.elise.modules.paymentcontactdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.paymentcontactdetail.`data`.model.PaymentContactDetailModel
import com.bangkit.elise.modules.paymentcontactdetail.`data`.model.SpinnerNamefieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentContactDetailVM : ViewModel(), KoinComponent {
  val paymentContactDetailModel: MutableLiveData<PaymentContactDetailModel> =
      MutableLiveData(PaymentContactDetailModel())

  var navArguments: Bundle? = null

  val spinnerNamefieldList: MutableLiveData<MutableList<SpinnerNamefieldModel>> = MutableLiveData()
}
