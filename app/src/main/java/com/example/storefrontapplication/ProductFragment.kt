package com.example.storefrontapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.storefrontapplication.databinding.FragmentProductBinding

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_product, container, false)
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onStart() {
        super.onStart()
        productAdapter = ProductAdapter(
            listOf(
                Product("https://p.kindpng.com/picc/s/111-1112837_cherries-fruit-png-clipart-clipart-fruits-png-transparent.png", "Cereza", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/121-1215402_citruses-fruit-png-transparent-background-transparent-background-fruits.png", "Papaya", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/121-1215936_fruits-clipart-passion-fruit-dragon-fruit-half-png.png", "Granadilla silvestre", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/358-3581729_strawberry-pie-fruit-clip-art-all-red-fruit.png", "Fresas", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/85-853356_fruit-juice-splash-png-transparent-png.png", "Naranja", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/111-1113384_passion-fruit-transparent-background-hd-png-download.png", "Maracuya", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/111-1112837_cherries-fruit-png-clipart-clipart-fruits-png-transparent.png", "Cereza", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/121-1215402_citruses-fruit-png-transparent-background-transparent-background-fruits.png", "Papaya", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/121-1215936_fruits-clipart-passion-fruit-dragon-fruit-half-png.png", "Granadilla silvestre", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/358-3581729_strawberry-pie-fruit-clip-art-all-red-fruit.png", "Fresas", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/85-853356_fruit-juice-splash-png-transparent-png.png", "Naranja", "$ 8.500", "Deliciosa fruta para llevar"),
                Product("https://p.kindpng.com/picc/s/111-1113384_passion-fruit-transparent-background-hd-png-download.png", "Maracuya", "$ 8.500", "Deliciosa fruta para llevar")
            )
        )

        productAdapter.listener = object : OnProductListener {
            override fun onClick(product: Product) {
                Log.d("click", product.name)
            }
        }
        productManager = GridLayoutManager(requireContext(), 2)
        binding.productRecycle.apply {
            adapter = productAdapter
            layoutManager = productManager
        }
    }
}