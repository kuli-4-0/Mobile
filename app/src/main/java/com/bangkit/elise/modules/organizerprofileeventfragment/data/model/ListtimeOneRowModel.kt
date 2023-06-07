package com.bangkit.elise.modules.organizerprofileeventfragment.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class ListtimeOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_jo_malone_londo)

)
