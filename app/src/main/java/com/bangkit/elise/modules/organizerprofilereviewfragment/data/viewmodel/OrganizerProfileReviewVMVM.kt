package com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.model.OrganizerProfileReviewModelModel
import com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.model.ReviewRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrganizerProfileReviewVMVM : ViewModel(), KoinComponent {
  val organizerProfileReviewModelModel: MutableLiveData<OrganizerProfileReviewModelModel> =
      MutableLiveData(OrganizerProfileReviewModelModel())

  var navArguments: Bundle? = null

  val reviewList: MutableLiveData<MutableList<ReviewRowModel>> = MutableLiveData(mutableListOf())
}
