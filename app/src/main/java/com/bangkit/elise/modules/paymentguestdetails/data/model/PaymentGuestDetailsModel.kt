package com.bangkit.elise.modules.paymentguestdetails.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class PaymentGuestDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGuestDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_guest_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSameascontact: String? =
      MyApp.getInstance().resources.getString(R.string.msg_same_as_contact)
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
  var txtValueTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_to_payment)

)
