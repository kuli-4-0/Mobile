package com.bangkit.elise.modules.organizerprofileabout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.elise.modules.organizerprofileabout.`data`.model.OrganizerProfileAboutModel
import org.koin.core.KoinComponent

class OrganizerProfileAboutVM : ViewModel(), KoinComponent {
  val organizerProfileAboutModel: MutableLiveData<OrganizerProfileAboutModel> =
      MutableLiveData(OrganizerProfileAboutModel())

  var navArguments: Bundle? = null
}
