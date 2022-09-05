package com.realworld.realworld.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
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
        Integer articleId = 1;
        Article article = new Article(
                articleId,
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

        Optional<Article> articleFound = underTest.findById(articleId);
        // Then
        assertTrue(articleFound.isPresent());
//        assertTrue(articleFound.equals(article));
    }

    @Test
    void itShouldFindArticleById() {
        // Given
        Integer articleId = 1;
        Article article = new Article(
                articleId,
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
        Optional<Article> articleFound = underTest.findById(articleId);
        // Then
        assertThat(articleFound)
                .isPresent()
                .hasValueSatisfying(a -> {
                    assertThat(a.getArticle_id()).isEqualTo(article.getArticle_id());
                    assertThat(a.getDescription()).isEqualTo(article.getDescription());
                    assertThat(a.getCreatedAt()).isEqualTo(article.getCreatedAt());
                });
    }

    @Test
    void itShouldFindAllArticles() {

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

        Article article2 = new Article(
                2,
                "slug2",
                "username",
                "title2",
                "description2",
                "body2",
                LocalDate.of(2021, 01, 31),
                LocalDate.of(2021, 01, 31),
                false,
                0
        );
        // When
        underTest.save(article);
        underTest.save(article2);


        List<Article> allArticles = underTest.findAll();
        // Then

        //article 1
        assertThat(allArticles.get(0).getArticle_id()).isEqualTo(article.getArticle_id());
        assertThat(allArticles.get(0).getDescription()).isEqualTo(article.getDescription());
        assertThat(allArticles.get(0).getCreatedAt()).isEqualTo(article.getCreatedAt());
        // article 2
        assertThat(allArticles.get(1).getArticle_id()).isEqualTo(article2.getArticle_id());
        assertThat(allArticles.get(1).getDescription()).isEqualTo(article2.getDescription());
        assertThat(allArticles.get(1).getCreatedAt()).isEqualTo(article2.getCreatedAt());

        assertThat(allArticles.size()).isEqualTo(2);
    }

    @Test
    void itShouldDeleteArticleById() {
        // Given
        Integer articleId = 1;
        Article article = new Article(
                articleId,
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
        Optional<Article> articleFound = underTest.findById(articleId);
        // Then
        assertThat(articleFound)
                .isPresent()
                .hasValueSatisfying(a -> {
                    assertThat(a.getArticle_id()).isEqualTo(article.getArticle_id());
                    assertThat(a.getDescription()).isEqualTo(article.getDescription());
                    assertThat(a.getCreatedAt()).isEqualTo(article.getCreatedAt());
                });

        underTest.deleteById(1);
        Optional<Article> articleFound2 = underTest.findById(1);

        assertThat(articleFound2)
                .isNotPresent();
    }
}