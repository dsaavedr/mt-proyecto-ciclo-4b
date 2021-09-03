package com.example.storefrontapplication.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.storefrontapplication.R
import com.example.storefrontapplication.ui.listeners.OnProductListener
import com.example.storefrontapplication.ui.adapters.ProductAdapter
import com.example.storefrontapplication.data.models.Product
import com.example.storefrontapplication.databinding.FragmentProductBinding
import com.example.storefrontapplication.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [ProductFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductFragment : Fragment() {


    private var _binding: FragmentProductBinding? = null

    private val binding get() = _binding!!

    private lateinit var productAdapter: ProductAdapter
    private lateinit var productManager: GridLayoutManager

    private val productViewModel: ProductViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onStart() {
        super.onStart()
        productViewModel.loadProducts()
        productAdapter = ProductAdapter(
            listOf()
        )

        productAdapter.listener = object : OnProductListener {
            override fun onClick(product: Product) {
                Log.d("click", product.name)
                productViewModel.selectProduct(product)
                findNavController().navigate(R.id.action_productFragment_to_productDetailFragment)
            }
        }
        productManager = GridLayoutManager(requireContext(), 2)
        binding.productRecycle.apply {
            adapter = productAdapter
            layoutManager = productManager
        }
        productViewModel.product.observe(viewLifecycleOwner, Observer { products ->
            productAdapter.newDataSet(products)
        })
    }
}