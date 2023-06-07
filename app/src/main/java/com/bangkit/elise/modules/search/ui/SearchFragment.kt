package com.bangkit.elise.modules.search.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.base.BaseFragment
import com.bangkit.elise.databinding.FragmentSearchBinding
import com.bangkit.elise.modules.search.`data`.model.SearchRowModel
import com.bangkit.elise.modules.search.`data`.viewmodel.SearchVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val searchAdapter = SearchAdapter(viewModel.searchList.value?:mutableListOf())
    binding.recyclerSearch.adapter = searchAdapter
    searchAdapter.setOnItemClickListener(
    object : SearchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchRowModel) {
        onClickRecyclerSearch(view, position, item)
      }
    }
    )
    viewModel.searchList.observe(requireActivity()) {
      searchAdapter.updateData(it)
    }
    binding.searchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerSearch(
    view: View,
    position: Int,
    item: SearchRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_FRAGMENT"


    fun getInstance(bundle: Bundle?): SearchFragment {
      val fragment = SearchFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
