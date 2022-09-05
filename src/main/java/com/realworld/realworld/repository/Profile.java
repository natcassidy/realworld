package com.realworld.realworld.repository;

import javax.persistence.Entity;
import java.util.UUID;


public class Profile {
    private UUID profileId;

    public Profile(UUID profileId) {
        this.profileId = profileId;
    }
}
