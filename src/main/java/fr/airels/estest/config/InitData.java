package fr.airels.estest.config;

import fr.airels.estest.model.Article;
import fr.airels.estest.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class InitData {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitData.class);

    private final ArticleRepository articleRepository;

    @Bean
    public void populate() {
        LOGGER.info("Init data");

        articleRepository.deleteAll();

        List<Article> articles = List.of(
                new Article("Spring Boot", "Spring Boot is a framework that allows you to build stand-alone, production-grade Spring based Applications easily.", "John", "Doe"),
                new Article("Spring Data JPA", "Spring Data JPA is a framework that allows you to easily implement JPA based repositories.", "John", "Doe"),
                new Article("Spring Data Elasticsearch", "Spring Data Elasticsearch is a framework that allows you to easily implement Elasticsearch based repositories.", "John", "Doe"),
                new Article("Spring Data MongoDB", "Spring Data MongoDB is a framework that allows you to easily implement MongoDB based repositories.", "John", "Doe"),
                new Article("Spring Data Neo4j", "Spring Data Neo4j is a framework that allows you to easily implement Neo4j based repositories.", "John", "Doe"),
                new Article("Spring Data Redis", "Spring Data Redis is a framework that allows you to easily implement Redis based repositories.", "John", "Doe"),
                new Article("Spring Data for Apache Cassandra", "Spring Data for Apache Cassandra is a framework that allows you to easily implement Cassandra based repositories.", "John", "Doe"),
                new Article("Spring Data for Apache Geode", "Spring Data for Apache Geode is a framework that allows you to easily implement Geode based repositories.", "John", "Doe")
        );

        articleRepository.saveAll(articles);


        LOGGER.info("Data inserted");
    }
}
