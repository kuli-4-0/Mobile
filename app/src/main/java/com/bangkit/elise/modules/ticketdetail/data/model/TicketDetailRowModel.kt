package com.bangkit.elise.modules.ticketdetail.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class TicketDetailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPassengers: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIlona: String? = MyApp.getInstance().resources.getString(R.string.lbl_guntur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDatevalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_1_2021)

)
