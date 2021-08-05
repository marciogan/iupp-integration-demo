package br.com.iupp.integration.products.infrastructure.entrypoint.rest

import br.com.iupp.integration.products.core.interactor.create.CreateProductInteractor
import br.com.iupp.integration.products.core.interactor.create.CreateProductRequest
import br.com.iupp.integration.products.core.interactor.create.CreateProductResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import javax.validation.Valid

@Controller("/api/v1/products")
class ProductController(private val createProductInteractor: CreateProductInteractor) {

    @Post
    fun create(@Body @Valid createProductRequest: CreateProductRequest) : HttpResponse<CreateProductResponse> {
        val response = createProductInteractor.create(createProductRequest)
        return HttpResponse.created(response)
    }
}