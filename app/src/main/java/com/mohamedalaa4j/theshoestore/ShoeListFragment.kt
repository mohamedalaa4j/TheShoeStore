package com.mohamedalaa4j.theshoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.mohamedalaa4j.theshoestore.databinding.FragmentShoeListBinding
import com.mohamedalaa4j.theshoestore.databinding.ItemBinding

class ShoeListFragment : Fragment() {
    private lateinit var binding: FragmentShoeListBinding
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        setupShoesListView(sharedViewModel.shoesList.value!!)

        return binding.root
    }

    private fun setupShoesListView(list: ArrayList<Shoe>) {
        for (item in list) {
            val shoeView = ItemBinding.inflate(LayoutInflater.from(context), null, false)
            shoeView.apply {
                this.tvName.text = item.name
                this.tvSize.text = item.size.toString()
                this.tvCompany.text = item.company
                this.tvDescription.text = item.description
            }
            binding.linearLayout.addView(shoeView.root)
        }
    }

}