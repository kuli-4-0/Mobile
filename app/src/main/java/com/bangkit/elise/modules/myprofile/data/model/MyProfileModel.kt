package com.bangkit.elise.modules.myprofile.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicianName: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayu_chandra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextnumberfollo: String? = MyApp.getInstance().resources.getString(R.string.lbl_350)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowingmyprof: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextnumberfolloOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_346)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtD: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableforh: String? = MyApp.getInstance().resources.getString(R.string.lbl_genre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_orchestra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_pop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_dangdut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etChangeButtonValue: String? = null
)
