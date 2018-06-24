package com.formsdirectinc.applicationcenter.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.orm.hibernate5.HibernateTransactionManager
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*
import javax.sql.DataSource


@SpringBootApplication
@EnableTransactionManagement
open class Application {
    @Bean
    open fun dataSource(): DataSource {
        return HikariDataSource().apply {
            this.jdbcUrl = "jdbc:mysql://10.0.102.202:3306/fr"
            this.username = "sureshbabu"
            this.password = "sureshbabu"
        }
    }

    @Bean
    open fun sessionFactory(): LocalSessionFactoryBean {
        return LocalSessionFactoryBean().apply {
            setDataSource(dataSource())
            hibernateProperties = Properties().apply {
                setProperty("dialect", "org.hibernate.dialect.MySQLDialect")
                setProperty("format_sql", "true")
                setProperty("generator.class", "org.hibernate.id.IdentityGenerator")
                setProperty("current_session_context_class", "thread")
                setProperty("hbm2ddl.auto", "update")
            }
            setPackagesToScan("com.formsdirectinc")
        }
    }

    @Bean
    open fun transactionManager(): HibernateTransactionManager {
        return HibernateTransactionManager().apply {
            sessionFactory = sessionFactory().`object`
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}