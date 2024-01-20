package com.tami.social.media.jwt.deserializer;


import com.tami.social.media.jwt.model.AccessToken;

public interface AccessTokenDeserializer {
    public AccessToken deserialize(String strFormatToken);
}
