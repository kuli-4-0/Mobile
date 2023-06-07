package com.bangkit.elise.modules.signup.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class SignUpRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtValueOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_password)

)
