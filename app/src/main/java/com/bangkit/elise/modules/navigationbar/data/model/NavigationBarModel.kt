package com.bangkit.elise.modules.navigationbar.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class NavigationBarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDhakaBanglade: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_yourk_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiJay: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_jay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_upcoming_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArmanrokni: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_36_guild_street)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNearbyEvent: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearby_event)

)
