package com.mohamedalaa4j.theshoestore

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mohamedalaa4j.theshoestore.databinding.FragmentShoeListBinding
import com.mohamedalaa4j.theshoestore.databinding.ItemBinding

class ShoeListFragment : Fragment() {
    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        val layoutParams = ActionBar.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT)


        for (i in 1..20) {
            val shoe = Shoe("name",22.5,"company", "description")
            val view = ItemBinding.inflate(LayoutInflater.from(context), null, false)
            view.tvName.text = shoe.name
            view.tvSize.text = shoe.size.toString()
            view.tvCompany.text = shoe.company
            view.tvDescription.text = shoe.description

            binding.linearLayout.addView(view.root)
        }


        return binding.root

    }



}