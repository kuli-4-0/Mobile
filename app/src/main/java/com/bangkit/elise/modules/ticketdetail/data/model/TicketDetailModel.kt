package com.bangkit.elise.modules.ticketdetail.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class TicketDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTittleTicket: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSerialcode: String? = MyApp.getInstance().resources.getString(R.string.msg_9824_0972_1742)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.msg_verification_ti)

)
