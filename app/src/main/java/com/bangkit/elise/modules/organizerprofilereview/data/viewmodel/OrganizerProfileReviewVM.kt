package com.bangkit.elise.modules.organizerprofilereview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.organizerprofilereview.`data`.model.OrganizerProfileReviewModel
import org.koin.core.KoinComponent

class OrganizerProfileReviewVM : ViewModel(), KoinComponent {
  val organizerProfileReviewModel: MutableLiveData<OrganizerProfileReviewModel> =
      MutableLiveData(OrganizerProfileReviewModel())

  var navArguments: Bundle? = null
}
