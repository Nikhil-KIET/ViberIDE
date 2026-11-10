package com.viberide.viberide.entity;

import com.viberide.viberide.entity.enums.PreviewStatus;

import java.time.Instant;

public class Preview {
    Long id;
    Project projectId;
    String namespace;
    String podName;
    String previewUrl;
    PreviewStatus status;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;


}
