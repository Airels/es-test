package fr.airels.estest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "fr.airels.estest.repository")
public class ElasticsearchConfig {

}
