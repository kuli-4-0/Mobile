package com.bangkit.elise.modules.organizerprofilereviewfragment.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class ReviewRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRocksVelkeinje: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rocks_velkeinje)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFebCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCinemasisthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cinemas_is_the)

)
