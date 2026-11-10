package com.viberide.viberide.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    Users userId;
    Project projectId;
    String action;
    Long tokensUsed;
    Long durationMs;
    Instant createdAt;
}
