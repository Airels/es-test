package fr.airels.estest.repository;

import fr.airels.estest.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

    Page<Article> findByTitle(String title, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"title\": \"?0\"}}]}}")
    Page<Article> findByTitleUsingCustomQuery(String title, Pageable pageable);

    @Query("{ \"bool\": { \"must\": [ { \"bool\": { \"should\": [ { \"author.firstname\": \":firstname\" }, { \"author.lastname\": \":lastname\" } ] } } ] } }")
    Page<Article> findByAuthorsName(@Param("firstname") String firstname, @Param("lastname") String lastname, Pageable pageable);
}
