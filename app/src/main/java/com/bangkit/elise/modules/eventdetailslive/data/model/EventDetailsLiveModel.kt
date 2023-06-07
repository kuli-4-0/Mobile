package com.bangkit.elise.modules.eventdetailslive.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class EventDetailsLiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeliever: String? = MyApp.getInstance().resources.getString(R.string.lbl_audition)
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
  var txtTexteventorgani: String? =
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
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)

)
