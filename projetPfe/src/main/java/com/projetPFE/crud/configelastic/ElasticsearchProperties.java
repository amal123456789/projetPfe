package com.projetPFE.crud.configelastic;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties("elasticsearch")

public class ElasticsearchProperties {
    private String[] hostAndPort;
    private Duration socketTimeout;
    private Duration connectTimeout;
}

