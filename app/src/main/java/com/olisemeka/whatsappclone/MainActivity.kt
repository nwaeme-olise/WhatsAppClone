package com.olisemeka.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.view.MenuProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.olisemeka.whatsappclone.databinding.ActivityMainBinding
import com.olisemeka.whatsappclone.ui.calls.CallsFragment
import com.olisemeka.whatsappclone.ui.calls.NewCallFragment
import com.olisemeka.whatsappclone.ui.chats.ChatsFragment
import com.olisemeka.whatsappclone.ui.chats.NewChatFragment
import com.olisemeka.whatsappclone.ui.status.StatusFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)
//        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
//
//        binding.toolbar.inflateMenu(R.menu.menu_chats)
//        binding.toolbar.setOnMenuItemClickListener {
//                when(it.itemId){
//                    R.id.action_new_broadcast -> {
//                        Snackbar.make(binding.root, "Broadcast!", Snackbar.LENGTH_SHORT).show()
//                        return@setOnMenuItemClickListener true
//                    }
//
//                    R.id.action_new_group ->{
//                        Snackbar.make(binding.root, "Groupie!", Snackbar.LENGTH_SHORT).show()
//                        return@setOnMenuItemClickListener true
//                    }
//                    else -> {
//                        Snackbar.make(binding.root, "Some other condition", Snackbar.LENGTH_SHORT).show()
//                        return@setOnMenuItemClickListener true
//                    }
//                }
//        }

    }
}