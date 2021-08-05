package br.com.iupp.integration.products.core.interactor.create

interface CreateProductInteractor {
    fun create(entity: CreateProductRequest) : CreateProductResponse
}