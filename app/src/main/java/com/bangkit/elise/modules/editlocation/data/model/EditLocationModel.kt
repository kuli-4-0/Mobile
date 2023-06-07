package com.bangkit.elise.modules.editlocation.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class EditLocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtURL: String? = MyApp.getInstance().resources.getString(R.string.lbl_url)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenre: String? = MyApp.getInstance().resources.getString(R.string.lbl_genre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFiftySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_orchestra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFiftySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_pop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDangdut: String? = MyApp.getInstance().resources.getString(R.string.lbl_dangdut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameSixty: String? = MyApp.getInstance().resources.getString(R.string.lbl_dangdut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameSixtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rock)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFiftyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_metal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdd: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSeventyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameEightySevenValue: String? = null
)
