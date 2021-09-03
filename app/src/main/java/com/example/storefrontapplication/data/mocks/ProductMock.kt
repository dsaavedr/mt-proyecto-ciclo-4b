package com.example.storefrontapplication.data.mocks

import com.example.storefrontapplication.data.models.Product

class ProductMock {
    fun loadProducts(): List<Product> {
        return listOf(
            Product("https://p.kindpng.com/picc/s/111-1112837_cherries-fruit-png-clipart-clipart-fruits-png-transparent.png", "Cereza", "$ 8.500", "Deliciosa fruta para llevar"),
            Product("https://p.kindpng.com/picc/s/121-1215402_citruses-fruit-png-transparent-background-transparent-background-fruits.png", "Papaya", "$ 3.960", "Deliciosa fruta fresca"),
            Product("https://p.kindpng.com/picc/s/121-1215936_fruits-clipart-passion-fruit-dragon-fruit-half-png.png", "Granadilla silvestre", "$ 1.440", "Deliciosa granadilla por unidad"),
            Product("https://p.kindpng.com/picc/s/358-3581729_strawberry-pie-fruit-clip-art-all-red-fruit.png", "Fresas", "$ 5.200", "Presentación bandeja x500 gr"),
            Product("https://p.kindpng.com/picc/s/85-853356_fruit-juice-splash-png-transparent-png.png", "Naranja", "$ 2.500", "Deliciosa fruta fresca x10 unidades"),
            Product("https://p.kindpng.com/picc/s/111-1113384_passion-fruit-transparent-background-hd-png-download.png", "Maracuya", "$ 4.500", "Deliciosa fruta fresca x500 gr"),
            Product("https://p.kindpng.com/picc/s/111-1115706_carrot-png-hd-carrot-png-transparent-png.png", "Zanahoria", "$ 2.660", "Deliciosa zanahoria fresca x500 gr"),
            Product("https://p.kindpng.com/picc/s/93-931205_paris-mushroom-mushrooms-transparent-hd-png-download.png", "Champiñon tajado", "$ 5.560", "Presentación bandeja x250 gr"),
            Product("https://p.kindpng.com/picc/s/486-4863060_boneless-chicken-breast-png-download-chicken-breast-transparent.png", "Pechuga pollo", "$ 21.400", "Filetes de pechuga marinados x2"),
            Product("https://p.kindpng.com/picc/s/118-1185496_shrimp-download-free-png-cooked-tail-on-shrimp.png", "Camarón Tigre", "$ 22.850", "Camarón Tigre precocido x400 gr"),
            Product("https://p.kindpng.com/picc/s/248-2486888_pork-loin-transparent-pork-chops-png-png-download.png", "Lomo de cerdo", "$ 6.925", "Loncha de cerdo porcionada x500 gr"),
            Product("https://p.kindpng.com/picc/s/56-565019_golden-fiesta-premium-oil-golden-fiesta-canola-oil.png", "Aceite vegetal", "$ 20.250", "Aceite vegetal frescampo x3000 ml"),
            Product("https://p.kindpng.com/picc/s/137-1376138_conaprole-whole-milk-carton-1l-png-download-conaprole.png", "Leche entera", "$ 24.050", "Leche entera sixpack"),
            Product("https://p.kindpng.com/picc/s/703-7039787_redpath-white-sugar-hd-png-download.png", "Azucar", "$ 6.800", "Azucar alta pureza x2000 gr"),
            Product("https://p.kindpng.com/picc/s/121-1215299_rice-hd-png-download.png", "Arroz", "$ 9.590", "Arroz vitamor x3000 gr"),
            Product("https://p.kindpng.com/picc/s/9-97064_coffee-roasters-cafe-quality-specialty-coffee-adore-coffee.png", "Café", "$ 9.750", "Cafe fuerte tostado y molido x600 gr"),
            Product("https://p.kindpng.com/picc/s/425-4257748_toilet-paper-hd-png-download.png", "Papel higienico", "$ 17.450", "Papel higienico extra grande x12 rolloss")
        )
    }

}