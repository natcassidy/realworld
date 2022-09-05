package com.realworld.realworld.repository;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.UUID;


public class Comment {
    private UUID commentId;

    public Comment(UUID commentId) {
        this.commentId = commentId;
    }
}
