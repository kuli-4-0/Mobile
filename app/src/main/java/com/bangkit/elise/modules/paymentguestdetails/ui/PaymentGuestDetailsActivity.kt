package com.bangkit.elise.modules.paymentguestdetails.ui

import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityPaymentGuestDetailsBinding
import com.bangkit.elise.modules.paymentguestdetails.`data`.model.SpinnerNamefieldModel
import com.bangkit.elise.modules.paymentguestdetails.`data`.viewmodel.PaymentGuestDetailsVM
import kotlin.String
import kotlin.Unit

class PaymentGuestDetailsActivity :
    BaseActivity<ActivityPaymentGuestDetailsBinding>(R.layout.activity_payment_guest_details) {
  private val viewModel: PaymentGuestDetailsVM by viewModels<PaymentGuestDetailsVM>()

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
    binding.paymentGuestDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_GUEST_DETAILS_ACTIVITY"

  }
}
