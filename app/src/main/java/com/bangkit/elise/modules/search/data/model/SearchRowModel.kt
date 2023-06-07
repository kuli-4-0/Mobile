package com.bangkit.elise.modules.search.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAudition: String? = MyApp.getInstance().resources.getString(R.string.lbl_audition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_jo_malone_londo)

)
