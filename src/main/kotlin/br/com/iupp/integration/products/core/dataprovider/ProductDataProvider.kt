package br.com.iupp.integration.products.core.dataprovider

import br.com.iupp.integration.products.core.domain.Product
import java.util.*

interface ProductDataProvider {
    fun create(product : Product) : UUID?
}