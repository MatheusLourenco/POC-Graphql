package com.graphql.webflux.api

import com.graphql.webflux.domain.Customer
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CustomerController {
    private val db = listOf(Customer(1, "A"), Customer(2, "B"))

    @QueryMapping
    fun customers() = db

    @QueryMapping
    fun customerByName(@Argument name: String) = db.filter { it.name == name }
}
