package com.hongwei.constants

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "jwt")
open class SecurityConfigurations {
    lateinit var authorizationHeader: String
    lateinit var authorizationBearer: String
    lateinit var authorizationDomain: String
    lateinit var authorizationEndpoint: String
    lateinit var corsAllowDomain: String
}