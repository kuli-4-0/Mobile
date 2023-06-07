package com.bangkit.elise.modules.eventdetailsaudition.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class ListbagRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBelieverOne: String? = MyApp.getInstance().resources.getString(R.string.msg_14_december_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_tuesday_4_00pm)

)
