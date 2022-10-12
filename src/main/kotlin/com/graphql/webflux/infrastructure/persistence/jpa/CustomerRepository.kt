package com.graphql.webflux.infrastructure.persistence.jpa

import com.graphql.webflux.domain.Customer
import org.springframework.stereotype.Repository

@Repository
class CustomerRepository {

    private val db = listOf(Customer(1, "A"), Customer(2, "B"))

    fun getCustomers() = db
    fun getCustomerByName(name: String) = db.filter { it.name == name }
}
