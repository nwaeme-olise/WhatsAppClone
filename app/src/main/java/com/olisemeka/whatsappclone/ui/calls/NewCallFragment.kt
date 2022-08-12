package com.olisemeka.whatsappclone.ui.calls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.databinding.FragmentNewCallBinding
import com.olisemeka.whatsappclone.datasource.DataSource

class NewCallFragment : Fragment() {
    private var _binding: FragmentNewCallBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewCallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = NewCallListAdapter(DataSource.loadContacts())
        binding.recyclerViewNewCalls.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}