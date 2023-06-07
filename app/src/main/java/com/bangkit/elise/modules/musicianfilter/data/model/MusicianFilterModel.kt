package com.bangkit.elise.modules.musicianfilter.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class MusicianFilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTipe: String? = MyApp.getInstance().resources.getString(R.string.lbl_tipe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenre: String? = MyApp.getInstance().resources.getString(R.string.lbl_genre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_singer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_orchestra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenreThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_tradisional)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewYourkUSA: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_yourk_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectpricera: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_price_ra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_120)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
