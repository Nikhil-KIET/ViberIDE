package com.viberide.viberide.entity;

import com.viberide.viberide.entity.enums.ChatRoles;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    Project projectId;
    Users userId;
    ChatRoles roles;
    String content;
    String toolCalls;
    Integer tokensUsed;
    Instant createdAt;

}
