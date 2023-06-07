package com.bangkit.elise.modules.organizerprofilereview.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bangkit.elise.R
import com.bangkit.elise.appcomponents.di.MyApp
import com.bangkit.elise.modules.organizerprofileabout.ui.OrganizerProfileAboutFragment
import com.bangkit.elise.modules.organizerprofileeventfragment.ui.OrganizerProfileEventFragment
import com.bangkit.elise.modules.organizerprofilereviewfragment.ui.OrganizerProfileReviewFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class OrganizerProfileReviewActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_about),MyApp.getInstance().resources.getString(R.string.lbl_event2),MyApp.getInstance().resources.getString(R.string.lbl_reviews))

        val viewPages: List<Fragment> =
                listOf(OrganizerProfileAboutFragment(),OrganizerProfileEventFragment(),OrganizerProfileReviewFragment())

    }
}
