package br.com.iupp.integration.products.core.interactor.create

import br.com.iupp.integration.products.core.domain.Product
import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import java.util.*

@Introspected
data class CreateProductRequest(
    val sku: String,
    val name: String,
    val price: BigDecimal,
    val color: String
)

internal fun CreateProductRequest.toProduct(id: UUID = UUID.randomUUID()) = Product(id, sku, name, price, color)
