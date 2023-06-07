package com.bangkit.elise.modules.eventdetailsaudition.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class EventDetailsAuditionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeliever: String? = MyApp.getInstance().resources.getString(R.string.lbl_live)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInternationalB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextnameeventor: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ashfak_sayem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNowPlaying: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_organizer)
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
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_ticket_120)

)
