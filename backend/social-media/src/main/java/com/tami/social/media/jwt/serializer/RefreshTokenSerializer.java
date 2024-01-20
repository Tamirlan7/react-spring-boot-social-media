package com.tami.social.media.jwt.serializer;

import com.tami.social.media.jwt.model.RefreshToken;

public interface RefreshTokenSerializer {

    public String serialize(RefreshToken token);

}
