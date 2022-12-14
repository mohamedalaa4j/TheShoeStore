package com.mohamedalaa4j.theshoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mohamedalaa4j.theshoestore.databinding.FragmentNewShoeDetailBinding


class NewShoeDetailFragment : Fragment() {
    private lateinit var binding: FragmentNewShoeDetailBinding

    //activityViewModels used so that the ViewModel aware of the hosted activity lifecycle
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new_shoe_detail, container, false)

        binding.btnAdd.setOnClickListener {
            if (fieldsIsNotEmpty()) {
                sharedViewModel.addShoe(
                    binding.etName.text.toString(),
                    binding.etSize.text.toString().toDouble(),
                    binding.etCompanyName.text.toString(),
                    binding.etDescription.text.toString(),
                )

                findNavController().navigate(NewShoeDetailFragmentDirections.actionNewShoeDetailFragmentToShoeListFragment())
            } else {
                Toast.makeText(context, "Please enter the shoe details", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnCancel.setOnClickListener {
            findNavController().navigate(NewShoeDetailFragmentDirections.actionNewShoeDetailFragmentToShoeListFragment())
        }

        return binding.root
    }

    private fun fieldsIsNotEmpty(): Boolean {
        return binding.etName.text.isNotEmpty() &&
                binding.etSize.text.isNotEmpty() &&
                binding.etCompanyName.text.isNotEmpty() &&
                binding.etDescription.text.isNotEmpty()

    }
}