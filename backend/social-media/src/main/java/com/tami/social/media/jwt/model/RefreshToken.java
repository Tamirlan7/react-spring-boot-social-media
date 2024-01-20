package com.tami.social.media.jwt.model;

import lombok.Builder;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Builder
public record RefreshToken (
        UUID id,
        Instant expiresAt,
        Instant issuedAt,
        Long userId,
        List<String> authorities
) {

}
