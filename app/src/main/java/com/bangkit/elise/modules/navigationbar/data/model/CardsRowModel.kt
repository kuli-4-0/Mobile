package com.bangkit.elise.modules.navigationbar.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class CardsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGiganticKonser: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_gigantic_konser)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_12_7_2002_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_250_meters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)

)
