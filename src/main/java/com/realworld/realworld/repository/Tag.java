package com.realworld.realworld.repository;

import javax.persistence.Entity;
import java.util.UUID;


public class Tag {
    private UUID tagId;

    public Tag(UUID tagId) {
        this.tagId = tagId;
    }
}

