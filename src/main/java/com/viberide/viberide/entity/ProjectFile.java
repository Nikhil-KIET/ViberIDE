package com.viberide.viberide.entity;

import java.time.Instant;

public class ProjectFile {
    Long id;
    Project projectId;
    String path;
    String minioObjectKey;
    Users createdBy;
    Users updatedBy;
    Instant createdAt;
    Instant updatedAt;

}
