package com.bangkit.elise.modules.organizerprofileabout.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class OrganizerProfileAboutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo)

)
