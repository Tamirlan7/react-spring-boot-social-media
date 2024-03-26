package com.tami.social.media.jwt.serializer;


import com.tami.social.media.jwt.model.AccessToken;

public interface AccessTokenSerializer {
    public String serialize(AccessToken token);
}
