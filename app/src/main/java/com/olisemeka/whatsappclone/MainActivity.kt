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
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)



    }
}