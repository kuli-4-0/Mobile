package com.bangkit.elise.modules.musicianprofileperform.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class MusicianProfilePerformModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicianName: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayu_chandra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtD: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerform: String? = MyApp.getInstance().resources.getString(R.string.lbl_perform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_2_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_virtual_eveni)

)
