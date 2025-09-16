package com.example.lab_week_04_76847

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.Fragment

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val cafeName = when (position) {
            0 -> "Starbucks"
            1 -> "Janji Jiwa"
            2 -> "Kopi Kenangan"
            else -> "Unknown"
        }
        return CafeDetailFragment.newInstance(cafeName)
    }
}

