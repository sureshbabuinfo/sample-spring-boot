package com.sfodreamz.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver


@SpringBootApplication
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("com.formsdirectinc"))
@EnableJpaRepositories(basePackages = arrayOf("com.formsdirectinc"))
@EntityScan("com.formsdirectinc")
open class Application: SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(Application::class.java)
	}

    @Bean
    open fun getViewResolver(): ViewResolver {
        val resolver = InternalResourceViewResolver()
        resolver.setPrefix("/WEB-INF/jsp/")
        resolver.setSuffix(".jsp")
        return resolver
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}