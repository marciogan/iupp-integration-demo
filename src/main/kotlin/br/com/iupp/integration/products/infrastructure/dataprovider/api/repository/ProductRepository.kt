package br.com.iupp.integration.products.infrastructure.dataprovider.api.repository

import br.com.iupp.commons.command.Repository
import br.com.iupp.integration.products.core.domain.Product
import io.micronaut.context.annotation.Value
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import java.util.*
import javax.inject.Singleton

@Singleton
class ProductRepository(private val httpClient: HttpClient): Repository<Product> {

    @Value("\${api.url}")
    private lateinit var url: String

    override fun create(entity: Product): UUID? {
        val req = HttpRequest.POST<Any>(url, entity)
        val responseCode = httpClient.toBlocking().exchange(req, String::class.java).code()
        if(responseCode != 201)
            throw Exception("Erro ao cadastrar produto")
        return entity.id
    }

    override fun get(id: UUID): Product? {
        TODO("Not yet implemented")
    }

    override fun remove(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun list(): List<Product?> {
        TODO("Not yet implemented")
    }

    override fun update(entity: Product) {
        TODO("Not yet implemented")
    }
}