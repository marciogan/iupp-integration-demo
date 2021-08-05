package br.com.iupp.integration.products.core.domain

import java.math.BigDecimal
import java.util.*

data class Product(
    val id: UUID?,
    val sku: String,
    val name: String,
    val price: BigDecimal,
    val color: String
)
