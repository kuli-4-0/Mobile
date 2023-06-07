package com.bangkit.elise.modules.seeallevents.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class SeeAllEventsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_women_s_leaders)

)
