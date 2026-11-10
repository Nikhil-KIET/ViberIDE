package com.viberide.viberide.entity;

import com.viberide.viberide.entity.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {
    ProjectMemberId id;

    Project project;

    Users user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
