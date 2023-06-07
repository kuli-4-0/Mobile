package com.bangkit.elise.modules.payment.`data`.model

import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import kotlin.String

data class PaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.msg_show_order_summ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_105_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCartOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_information)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPay: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_tip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_70)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_64)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueThree: String? = MyApp.getInstance().resources.getString(R.string.msg_thank_you_we_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueFive: String? = MyApp.getInstance().resources.getString(R.string.msg_all_transaction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndmore: String? = MyApp.getInstance().resources.getString(R.string.lbl_and_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_remember_me2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOptionListSingValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldFourValue: String? = null
)
