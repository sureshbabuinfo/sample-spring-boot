package com.formsdirectinc.applicationcenter.dao

import javax.persistence.*
import javax.validation.constraints.NotNull


@Entity
@Table(name = "user", uniqueConstraints=[UniqueConstraint(columnNames=arrayOf("emailId"))])
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        @Column(name = "emailId")
        @NotNull
        var emailId: String? = null,
        @Column
        var name: String? = null
)