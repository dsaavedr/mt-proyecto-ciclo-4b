package com.example.storefrontapplication.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.storefrontapplication.R
import com.example.storefrontapplication.ui.adapters.CategoriesAdapter
import com.example.storefrontapplication.ui.listeners.OnCategoryListener
import com.example.storefrontapplication.data.models.Category
import com.example.storefrontapplication.databinding.FragmentCategoriesBinding

/**
 * A simple [Fragment] subclass.
 * Use the [CategoriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoriesFragment : Fragment() {

    private var _binding: FragmentCategoriesBinding? = null

    private val binding get() = _binding!!

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var categoriesManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        categoriesManager = LinearLayoutManager(requireContext())
        categoriesAdapter = CategoriesAdapter(
            listOf(
                Category("https://p.kindpng.com/picc/s/111-1112841_transparent-fruits-png-transparent-background-fruit-png-png.png", "Frutas"),
                Category("https://p.kindpng.com/picc/s/46-464276_vegetable-basket-fruit-clip-art-transparent-background-fruits.png", "Verduras"),
                Category("https://p.kindpng.com/picc/s/139-1392294_veal-raw-meats-hd-png-download.png", "Carnes"),
                Category("https://p.kindpng.com/picc/s/241-2413612_grocery-png-image-high-quality-indian-grocery-transparent.png", "Despensa"),
                Category("https://p.kindpng.com/picc/s/30-306806_cleaning-supplies-cleaning-products-hd-png-download.png", "Limpieza"),
                Category("https://p.kindpng.com/picc/s/63-638972_beauty-hygiene-png-transparent-png.png", "Higiene Personal")
            )
        )

        categoriesAdapter.listener = object : OnCategoryListener {
            override fun onClick(category: Category) {
                Log.d("click", category.name)
                findNavController().navigate(R.id.action_categoriesFragment_to_productFragment)
            }
        }

        binding.categoriesRecycle.apply {
            adapter = categoriesAdapter
            layoutManager = categoriesManager
        }
    }

}