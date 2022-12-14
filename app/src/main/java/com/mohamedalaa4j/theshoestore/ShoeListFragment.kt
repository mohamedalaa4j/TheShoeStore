package com.mohamedalaa4j.theshoestore

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mohamedalaa4j.theshoestore.databinding.FragmentShoeListBinding
import com.mohamedalaa4j.theshoestore.databinding.ItemBinding

class ShoeListFragment : Fragment() {
    private lateinit var binding: FragmentShoeListBinding
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        setupShoesListView(sharedViewModel.shoesList.value!!)

        activity?.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.logout_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                when (menuItem.itemId) {
                    R.id.loginFragment -> findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToLoginFragment())
                }
                return true
            }

        })
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