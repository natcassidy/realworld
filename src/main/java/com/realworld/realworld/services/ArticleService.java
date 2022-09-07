package com.realworld.realworld.services;

import com.realworld.realworld.repository.Article;
import com.realworld.realworld.repository.ArticleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArticleService {
    @Autowired
    public ArticleDAO articleDAO;

    public List<Article> findAllArticles() {
        return articleDAO.findAll();
    }

    public Optional<Article> findArticleById(UUID id) {
        return articleDAO.findById(id);
    }

    public void createArticle(Article article) {
        articleDAO.save(article);
    }

    public void updateArticle(Article article) {
        articleDAO.save(article);
    }

    public void deleteArticle(UUID id) {
        articleDAO.deleteById(id);
    }
}
