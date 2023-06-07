package com.bangkit.elise.modules.navigationbar.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentNavigationBarBinding
import com.bangkit.elise.extensions.loadFragment
import com.bangkit.elise.modules.eventdetailsaudition.ui.EventDetailsAuditionActivity
import com.bangkit.elise.modules.navigationbar.`data`.model.CardsRowModel
import com.bangkit.elise.modules.navigationbar.`data`.model.SpinnerGroupTenModel
import com.bangkit.elise.modules.navigationbar.`data`.viewmodel.NavigationBarVM
import com.bangkit.elise.modules.search.ui.SearchFragment
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NavigationBarFragment :
    BaseFragment<FragmentNavigationBarBinding>(R.layout.fragment_navigation_bar) {
  private val viewModel: NavigationBarVM by viewModels<NavigationBarVM>()

  private val REQUEST_CODE_SEARCH_FRAGMENT: Int = 613


  private val REQUEST_CODE_EVENT_DETAILS_AUDITION_ACTIVITY: Int = 631


  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroupTenList.value = mutableListOf(
    SpinnerGroupTenModel("Item1"),
    SpinnerGroupTenModel("Item2"),
    SpinnerGroupTenModel("Item3"),
    SpinnerGroupTenModel("Item4"),
    SpinnerGroupTenModel("Item5")
    )
    val spinnerGroupTenAdapter =
    SpinnerGroupTenAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupTenList.value?:
    mutableListOf())
    binding.spinnerGroupTen.adapter = spinnerGroupTenAdapter
    val cardsAdapter = CardsAdapter(viewModel.cardsList.value?:mutableListOf())
    binding.recyclerCards.adapter = cardsAdapter
    cardsAdapter.setOnItemClickListener(
    object : CardsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardsRowModel) {
        onClickRecyclerCards(view, position, item)
      }
    }
    )
    viewModel.cardsList.observe(requireActivity()) {
      cardsAdapter.updateData(it)
    }
    binding.navigationBarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSearchbar.setOnClickListener {
      val destFragment = SearchFragment.getInstance(null)
      requireActivity().loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SearchFragment.TAG,
      addToBackStack = true,
      add = true,
      enter = null,
      exit = null,
      )
      requireActivity().onBackPressed()
    }
    binding.linearContainerevent.setOnClickListener {
      val destIntent = EventDetailsAuditionActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_EVENT_DETAILS_AUDITION_ACTIVITY)
      requireActivity().onBackPressed()
    }
    binding.txtSearchOne.setOnClickListener {
      val destFragment = SearchFragment.getInstance(null)
      requireActivity().loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SearchFragment.TAG,
      addToBackStack = true,
      add = true,
      enter = null,
      exit = null,
      )
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCards(
    view: View,
    position: Int,
    item: CardsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NAVIGATION_BAR_FRAGMENT"


    fun getInstance(bundle: Bundle?): NavigationBarFragment {
      val fragment = NavigationBarFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
