package com.realworld.realworld.controllers;

import com.realworld.realworld.repository.Article;
import com.realworld.realworld.repository.Comment;
import com.realworld.realworld.repository.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/article")
public class ArticleController {

    @GetMapping("/articles")
    public List<Article> allArticles(@RequestParam String tag,
                                     @RequestParam String author,
                                     @RequestParam String favorited,
                                     @RequestParam int limit,
                                     @RequestParam int offset) {
        return null;
    }

    @GetMapping("/articles/feed")
    public List<Article> feedArticles(@RequestParam int limit,
                                      @RequestParam int offset) {
        return null;
    }

    @GetMapping("/articles/{slug}")
    public Article getArticle(@PathVariable String slug) {
        return null;
    }

    @PostMapping("/articles")
    public Article newArticle(@RequestBody Article article) {
        return null;
    }

    @PutMapping("/articles/{slug}")
    public Article updateArticle(@PathVariable String slug,
                                 @RequestBody Article article) {
        return null;
    }

    @DeleteMapping("/articles/{slug}")
    public Article deleteArticle(@PathVariable String slug) {
        return null;
    }

    @PostMapping("/articles/{slug}/comments")
    public Comment addComment(@PathVariable String slug,
                              @RequestBody Comment comment) {
        return null;
    }

    @GetMapping("/articles/{slug}/comments")
    public List<Comment> addComment(@PathVariable String slug) {
        return null;
    }

    @DeleteMapping("/articles/{slug}/comments/{id}")
    public List<Comment> addComment(@PathVariable String slug,
                                    @PathVariable String id) {
        return null;
    }

    @PostMapping("/articles/{slug}/favorite")
    public Article favoriteArticle(@PathVariable String slug) {
        return null;
    }

    @DeleteMapping("/articles/{slug}/favorite")
    public Article unfavoriteArticle(@PathVariable String slug) {
        return null;
    }

    @GetMapping("/tags")
    public List<Tag> getTags() {return null;}
}
