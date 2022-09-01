package com.realworld.realworld.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ArticleDAOTest {

    @Autowired
    private ArticleDAO underTest;

    @Test
    void itShouldSaveArticle() {
        // Given
        Integer article_id = 1;
        Article article = new Article(
                1,
                "slug",
                "username",
                "title",
                "description",
                "body",
                LocalDate.of(2020, 01, 31),
                LocalDate.of(2020, 01, 31),
                false,
                0
                );
        // When
        underTest.save(article);

        Optional<Article> articleFound = underTest.findById(article_id);
        // Then
        assertTrue(articleFound.isPresent());
//        assertTrue(articleFound.equals(article));
    }
}