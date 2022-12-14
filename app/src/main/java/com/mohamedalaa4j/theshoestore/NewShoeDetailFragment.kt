package com.mohamedalaa4j.theshoestore

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mohamedalaa4j.theshoestore.databinding.FragmentNewShoeDetailBinding


class NewShoeDetailFragment : Fragment() {
    private lateinit var binding: FragmentNewShoeDetailBinding
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new_shoe_detail, container, false)

        binding.btnAdd.setOnClickListener {
            sharedViewModel.addShoe(
                binding.etName.text.toString(),
                binding.etSize.text.toString().toDouble(),
                binding.etCompanyName.text.toString(),
                binding.etDescription.text.toString(),
            )

            findNavController().navigate(NewShoeDetailFragmentDirections.actionNewShoeDetailFragmentToShoeListFragment())
        }

        binding.btnCancel.setOnClickListener {
            findNavController().navigate(NewShoeDetailFragmentDirections.actionNewShoeDetailFragmentToShoeListFragment())
        }

        return binding.root
    }

}