package com.bangkit.elise.modules.payment.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class PaymentRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayu_chandra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne2: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)

)
