package com.tami.social.media.jwt.deserializer;


import com.tami.social.media.jwt.model.RefreshToken;

public interface RefreshTokenDeserializer {

    public RefreshToken deserialize(String strFormatToken);

}
