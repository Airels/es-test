package fr.airels.estest.repository;

import fr.airels.estest.model.Author;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuthorRepository extends ElasticsearchRepository<Author, String> {

}
