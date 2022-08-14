package com.olisemeka.whatsappclone.ui.chats

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.NavHostFragment
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.databinding.FragmentChatsBinding
import com.olisemeka.whatsappclone.datasource.DataSource

class ChatsFragment : Fragment() {
    private var _binding: FragmentChatsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val context = requireContext()
        val chatsRecyclerView = binding.recyclerviewChats

        val chatList = DataSource.loadChats()
        val adapter = ChatListAdapter(context, chatList)
        chatsRecyclerView.adapter = adapter

        binding.chatFab.setOnClickListener {
            val navHostFragment = activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            navController.navigate(R.id.action_viewPager_to_newChatFragment)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}