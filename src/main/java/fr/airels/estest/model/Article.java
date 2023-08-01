package fr.airels.estest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "articles")
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    public Article(String title, String content, String authorFirstname, String authorLastname) {
        this.title = title;
        this.content = content;
        this.author = new Author(authorFirstname, authorLastname);
    }

    @Id
    private String id;

    private String title;

    private String content;

    @Field(type = FieldType.Nested, includeInParent = true)
    private Author author;

}
