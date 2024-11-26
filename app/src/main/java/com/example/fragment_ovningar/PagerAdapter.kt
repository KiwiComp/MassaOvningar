package com.example.fragment_ovningar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fa:FragmentActivity): FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> AppetizerViewFragment()
            1 -> MainViewFragment()
            2 -> DessertViewFragment()
            else -> MainViewFragment()
        }
    }

    /*private val fragments = listOf(
        AppetizerViewFragment(),
        MainViewFragment(),
        DessertViewFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {

        return fragments[position]
    }*/
}