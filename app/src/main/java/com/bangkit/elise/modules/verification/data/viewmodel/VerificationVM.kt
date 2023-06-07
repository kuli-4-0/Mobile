package com.bangkit.elise.modules.verification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.verification.`data`.model.VerificationModel
import org.koin.core.KoinComponent

class VerificationVM : ViewModel(), KoinComponent {
  val verificationModel: MutableLiveData<VerificationModel> = MutableLiveData(VerificationModel())

  var navArguments: Bundle? = null
}
