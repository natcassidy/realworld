package com.realworld.realworld.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserDAOTest {

    @Autowired
    private UserDAO underTest;

    @Test
    void itShouldSaveUser() {
        // Given
        User user = new User(
                "slug",
                "token",
                "email",
                "bio",
                "image"
        );
        // When
        User savedUser = underTest.save(user);

        // Then
        assertThat(savedUser.getUsername()).isEqualTo(user.getUsername());
        assertThat(savedUser.getBio()).isEqualTo(user.getBio());
    }

    @Test
    void itShouldFindUserById() {
        String username = "username";
        // Given
        User user = new User(
                username,
                "token",
                "email",
                "bio",
                "image"
        );
        // When
        underTest.save(user);
        Optional<User> userFound = underTest.findById(username);
        // Then
        assertThat(userFound)
                .isPresent()
                .hasValueSatisfying(a -> {
                    assertThat(a.getUsername()).isEqualTo(user.getUsername());
                    assertThat(a.getBio()).isEqualTo(user.getBio());
                });
    }

    @Test
    void itShouldFindAllUsers() {
        String username = "test";
        String username2 = "username";
        User user = new User(
                username,
                "token",
                "email",
                "bio",
                "image"
        );

        User user2 = new User(
                username2,
                "token",
                "email",
                "bio",
                "image"
        );
        // When
        underTest.save(user);
        underTest.save(user2);


        List<User> allUsers = underTest.findAll();
        // Then

//        user 1
        assertThat(allUsers.get(0).getUsername()).isEqualTo(user.getUsername());
        assertThat(allUsers.get(0).getBio()).isEqualTo(user.getBio());
        assertThat(allUsers.get(0).getEmail()).isEqualTo(user.getEmail());
        // user 2
        assertThat(allUsers.get(1).getUsername()).isEqualTo(user2.getUsername());
        assertThat(allUsers.get(1).getBio()).isEqualTo(user2.getBio());
        assertThat(allUsers.get(1).getEmail()).isEqualTo(user2.getEmail());

        assertThat(allUsers.size()).isEqualTo(2);
    }

    @Test
    void itShouldDeleteUserById() {
        // Given
        String username = "username";
        User user = new User(
                username,
                "token",
                "email",
                "bio",
                "image"
        );
        // When
        underTest.save(user);
        Optional<User> userFound = underTest.findById(username);
        // Then
        assertThat(userFound)
                .isPresent()
                .hasValueSatisfying(a -> {
                    assertThat(a.getUsername()).isEqualTo(user.getUsername());
                    assertThat(a.getBio()).isEqualTo(user.getBio());
                    assertThat(a.getEmail()).isEqualTo(user.getEmail());
                });

        underTest.deleteById(username);
        Optional<User> userFound2 = underTest.findById(username);

        assertThat(userFound2)
                .isNotPresent();
    }
}