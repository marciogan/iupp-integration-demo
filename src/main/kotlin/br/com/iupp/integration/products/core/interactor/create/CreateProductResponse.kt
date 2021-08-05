package br.com.iupp.integration.products.core.interactor.create

import br.com.iupp.integration.products.core.domain.Product
import java.math.BigDecimal

data class CreateProductResponse(
    val id: String,
    val sku: String,
    val name: String,
    val price: BigDecimal,
    val color: String
)

internal fun Product.toResponse() = CreateProductResponse(id.toString() , sku, name, price, color)
