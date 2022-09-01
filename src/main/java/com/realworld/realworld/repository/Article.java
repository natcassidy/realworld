package com.realworld.realworld.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Article {
    @Id
    private int article_id;
    private String slug;
    private String username;
    private String title;
    private String description;
    private String body;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private boolean favorited;
    private int favorites_count;

    public Article() {
    }

    public Article(int article_id,
                   String slug,
                   String username,
                   String title,
                   String description,
                   String body,
                   LocalDate createdAt,
                   LocalDate updatedAt,
                   boolean favorited,
                   int favorites_count) {
        this.article_id = article_id;
        this.slug = slug;
        this.username = username;
        this.title = title;
        this.description = description;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.favorited = favorited;
        this.favorites_count = favorites_count;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getCreateAt() {
        return createdAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createdAt = createAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public int getFavorites_count() {
        return favorites_count;
    }

    public void setFavorites_count(int favorites_count) {
        this.favorites_count = favorites_count;
    }
}
