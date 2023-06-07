package com.bangkit.elise.modules.paymentcontactdetail.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class PaymentContactDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtContactDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_abc_email_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
