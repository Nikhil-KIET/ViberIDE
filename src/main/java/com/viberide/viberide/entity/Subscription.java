package com.viberide.viberide.entity;

import com.viberide.viberide.entity.enums.SubscriptionStatus;

import java.time.Instant;

public class Subscription {
    Long id;
    Users userId;
    Plan planId;
    String stripeSubscriptionId;
    SubscriptionStatus status;
    Instant subscriptionStart;
    Instant subscriptionEnd;
    Boolean cancelAtSubscriptionEnd;
    Instant createdAt;
    Instant updatedAt;

}
