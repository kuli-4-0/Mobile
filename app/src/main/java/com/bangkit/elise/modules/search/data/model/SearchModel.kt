package com.bangkit.elise.modules.search.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_search2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_virtual_eveni)

)
