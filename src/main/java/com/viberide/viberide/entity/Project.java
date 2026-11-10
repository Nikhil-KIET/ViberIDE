package com.viberide.viberide.entity;

import org.springframework.security.core.userdetails.User;

import java.time.Instant;

public class Project {
    Long id;
    String name;
    User owner;
    Boolean isPublic;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
