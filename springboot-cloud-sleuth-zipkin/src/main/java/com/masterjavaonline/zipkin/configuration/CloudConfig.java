package com.masterjavaonline.zipkin.configuration;


import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

    @Bean
    public Sampler  alwaysSampler() {
        return  Sampler.ALWAYS_SAMPLE;
    }
}
