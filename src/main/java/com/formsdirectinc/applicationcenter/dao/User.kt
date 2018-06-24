package com.formsdirectinc.applicationcenter.dao

import javax.persistence.*
import javax.validation.constraints.NotNull


@Entity
@Table(name = "user", uniqueConstraints=[UniqueConstraint(columnNames=arrayOf("email"))])
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        @Column
        @NotNull
        val email: String? = null,
        @Column
        val name: String? = null
)