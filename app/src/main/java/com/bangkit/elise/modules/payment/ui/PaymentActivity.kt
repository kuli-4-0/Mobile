package com.bangkit.elise.modules.payment.ui

import android.view.View
import androidx.activity.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseActivity
import com.bangkit.elise.databinding.ActivityPaymentBinding
import com.bangkit.elise.modules.payment.`data`.model.PaymentRowModel
import com.bangkit.elise.modules.payment.`data`.viewmodel.PaymentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentActivity : BaseActivity<ActivityPaymentBinding>(R.layout.activity_payment) {
  private val viewModel: PaymentVM by viewModels<PaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val paymentAdapter = PaymentAdapter(viewModel.paymentList.value?:mutableListOf())
    binding.recyclerPayment.adapter = paymentAdapter
    paymentAdapter.setOnItemClickListener(
    object : PaymentAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PaymentRowModel) {
        onClickRecyclerPayment(view, position, item)
      }
    }
    )
    viewModel.paymentList.observe(this) {
      paymentAdapter.updateData(it)
    }
    binding.paymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPayment(
    view: View,
    position: Int,
    item: PaymentRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_ACTIVITY"

  }
}
