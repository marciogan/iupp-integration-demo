package br.com.iupp.integration.products.core.interactor.create

import br.com.iupp.integration.products.core.dataprovider.ProductDataProvider
import javax.inject.Singleton

@Singleton
class CreateProductInteractorImpl(private val productDataProvider: ProductDataProvider) : CreateProductInteractor {

    override fun create(entity: CreateProductRequest): CreateProductResponse {
        val product = entity.toProduct()
        productDataProvider.create(product)
        return product.toResponse()
    }
}