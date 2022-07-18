package com.olisemeka.whatsappclone

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.olisemeka.whatsappclone.ui.calls.CallsFragment
import com.olisemeka.whatsappclone.ui.chats.ChatsFragment
import com.olisemeka.whatsappclone.ui.status.StatusFragment

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ChatsFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> { throw Resources.NotFoundException("Position Not Found") }
        }
    }
}