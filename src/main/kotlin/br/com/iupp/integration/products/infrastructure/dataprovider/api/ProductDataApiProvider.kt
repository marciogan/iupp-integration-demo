package br.com.iupp.integration.products.infrastructure.dataprovider.api

import br.com.iupp.integration.products.core.dataprovider.ProductDataProvider
import br.com.iupp.integration.products.core.domain.Product
import br.com.iupp.integration.products.infrastructure.dataprovider.api.repository.ProductRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class ProductDataApiProvider(private val productRepository: ProductRepository) : ProductDataProvider {

    override fun create(product: Product) : UUID? {
        return productRepository.create(product)
    }

}