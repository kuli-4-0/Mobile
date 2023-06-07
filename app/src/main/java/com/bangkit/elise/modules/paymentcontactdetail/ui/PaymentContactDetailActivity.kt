package com.bangkit.elise.modules.paymentcontactdetail.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityPaymentContactDetailBinding
import com.bangkit.elise.modules.paymentcontactdetail.`data`.model.SpinnerNamefieldModel
import com.bangkit.elise.modules.paymentcontactdetail.`data`.viewmodel.PaymentContactDetailVM
import kotlin.String
import kotlin.Unit

class PaymentContactDetailActivity :
    BaseActivity<ActivityPaymentContactDetailBinding>(R.layout.activity_payment_contact_detail) {
  private val viewModel: PaymentContactDetailVM by viewModels<PaymentContactDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerNamefieldList.value = mutableListOf(
    SpinnerNamefieldModel("Item1"),
    SpinnerNamefieldModel("Item2"),
    SpinnerNamefieldModel("Item3"),
    SpinnerNamefieldModel("Item4"),
    SpinnerNamefieldModel("Item5")
    )
    val spinnerNamefieldAdapter =
    SpinnerNamefieldAdapter(this,R.layout.spinner_item,viewModel.spinnerNamefieldList.value?:
    mutableListOf())
    binding.spinnerNamefield.adapter = spinnerNamefieldAdapter
    binding.paymentContactDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_CONTACT_DETAIL_ACTIVITY"

  }
}
