package com.graphql.webflux.api

import com.graphql.webflux.infrastructure.persistence.jpa.CustomerRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CustomerController(
    private val customerRepository: CustomerRepository
) {

    @QueryMapping
    fun customers() = customerRepository.getCustomers()

    @QueryMapping
    fun customerByName(@Argument name: String) = customerRepository.getCustomerByName(name)
}
