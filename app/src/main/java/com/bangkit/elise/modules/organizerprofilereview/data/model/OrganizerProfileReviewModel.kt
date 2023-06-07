package com.bangkit.elise.modules.organizerprofilereview.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class OrganizerProfileReviewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventOrganizer: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesta_ria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalcalories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_event_organizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberfollowing: String? = MyApp.getInstance().resources.getString(R.string.lbl_350)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalcaloriesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberfollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_346)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtD: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)

)
