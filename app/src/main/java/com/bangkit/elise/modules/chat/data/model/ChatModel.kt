package com.bangkit.elise.modules.chat.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPestaRiaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesta_ria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed_8_21_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextBoxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextBoxOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null
)
