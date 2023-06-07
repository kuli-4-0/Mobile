package com.bangkit.elise.modules.editprofile.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeprofile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayu_chndr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamefield: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayu_chandra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_bayu99_example)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamefieldOne: String? = MyApp.getInstance().resources.getString(R.string.msg_cianggur_jawa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)

)
