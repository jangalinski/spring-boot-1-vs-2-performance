package com.xyzz.gsdd.samplereactivespringboot2.controllers

import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController("/persons")
class PersonController {

    @PostMapping
    @ResponseStatus(CREATED)
    fun addPerson(@RequestBody person: Person): Person {
        return Person(person.firstName, person.lastName, UUID.randomUUID())
    }
}

data class Person(val firstName: String, val lastName: String, val id: UUID? = null)