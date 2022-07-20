package com.realworld.realworld.controllers;

import com.realworld.realworld.repository.Article;
import com.realworld.realworld.repository.Comment;
import com.realworld.realworld.repository.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class ArticleController {

    @GetMapping("/articles")
    public List<Article> allArticles(@RequestParam String tag,
                                     @RequestParam String author,
                                     @RequestParam String favorited,
                                     @RequestParam int limit,
                                     @RequestParam int offset) {}

    @GetMapping("/articles/feed")
    public List<Article> feedArticles(@RequestParam int limit,
                                      @RequestParam int offset) {}

    @GetMapping("/articles/{slug}")
    public Article getArticle(@PathVariable String slug) {}

    @PostMapping("/articles")
    public Article newArticle(@RequestBody Article article) {}

    @PutMapping("/articles/{slug}")
    public Article updateArticle(@PathVariable String slug,
                                 @RequestBody Article article) {}

    @DeleteMapping("/articles/{slug}")
    public Article deleteArticle(@PathVariable String slug) {}

    @PostMapping("/articles/{slug}/comments")
    public Comment addComment(@PathVariable String slug,
                              @RequestBody Comment comment) {}

    @GetMapping("/articles/{slug}/comments")
    public List<Comment> addComment(@PathVariable String slug) {}

    @DeleteMapping("/articles/{slug}/comments/{id}")
    public List<Comment> addComment(@PathVariable String slug,
                                    @PathVariable String id) {}

    @PostMapping("/articles/{slug}/favorite")
    public Article favoriteArticle(@PathVariable String slug) {}

    @DeleteMapping("/articles/{slug}/favorite")
    public Article unfavoriteArticle(@PathVariable String slug) {}

    @GetMapping("/tags")
    public List<Tag> getTags() {}
}
