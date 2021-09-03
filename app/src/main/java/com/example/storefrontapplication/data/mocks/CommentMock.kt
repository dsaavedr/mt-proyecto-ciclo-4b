package com.example.storefrontapplication.data.mocks

import com.example.storefrontapplication.data.models.Comment

class CommentMock {
    fun loadComments(): List<Comment> {
        return listOf(
            Comment("https://p.kindpng.com/picc/s/74-747522_transparent-pregnant-woman-png-transparent-pregnant-women-png.png", "Yuliana Colorado", "La calidad de los productos son excelentes, frescos, tiene mucha variedad .En el supermercado encuentras todo panadería, carnicería,verduras."),
            Comment("https://p.kindpng.com/picc/s/5-53509_women-exercising-png-image-women-exercise-png-transparent.png", "Ginnis Corredor", " el servicio por parte del personal es muy bueno son muy formales y te ayudan en lo que necesites, hay promociones la mayor parte del tiempo y eso para nuestro bolsillo es muy agradable"),
            Comment("https://p.kindpng.com/picc/s/36-360529_dress-shirt-png-image-mens-dress-boys-png.png", "Gabriel Cardona", "Los productos siempre son frescos y tienen muy buen precio, los recomiendo 100%"),
            Comment("https://p.kindpng.com/picc/s/4-45218_massage-beautiful-woman-with-black-hair-in-rochester.png", "Camila Corredor Arias", "Realice un pedido y tardó más tiempo de lo acordado, sin embargo es el único lugar cercano donde puedo encontrar variedad de productos y a mi alcance"),
            Comment("https://p.kindpng.com/picc/s/218-2188985_voronin-model-men-png-by-feni-png-images.png", "Sergio A Cardona", "Tiene gran variedad de productos y en el encuentro todo lo que necesito"),
            Comment("https://p.kindpng.com/picc/s/4-43879_ogx-is-hair-hd-png-download.png", "Andrea Guarin", "el lugar no es muy grande y cuesta un poco caminar entre los pasillos, el personal es muy amable a la hora de atender y siempre te sorprente con un detalle en compras de alto valor"),
        )
    }
}