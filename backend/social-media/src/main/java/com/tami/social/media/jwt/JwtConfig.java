package com.tami.social.media.jwt;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.DirectDecrypter;
import com.nimbusds.jose.crypto.DirectEncrypter;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.tami.social.media.jwt.deserializer.AccessTokenDeserializer;
import com.tami.social.media.jwt.deserializer.DefaultAccessTokenDeserializer;
import com.tami.social.media.jwt.deserializer.DefaultRefreshTokenDeserializer;
import com.tami.social.media.jwt.deserializer.RefreshTokenDeserializer;
import com.tami.social.media.jwt.serializer.AccessTokenSerializer;
import com.tami.social.media.jwt.serializer.DefaultAccessTokenSerializer;
import com.tami.social.media.jwt.serializer.DefaultRefreshTokenSerializer;
import com.tami.social.media.jwt.serializer.RefreshTokenSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;

@Configuration
public class JwtConfig {
    @Bean
    public AccessTokenSerializer accessTokenSerializer(@Value("${jwt.access-token-key}") String secretKey) throws ParseException, KeyLengthException {
        return new DefaultAccessTokenSerializer(
            new MACSigner(
                OctetSequenceKey.parse(secretKey)
            )
        );
    }

    @Bean
    public RefreshTokenSerializer refreshTokenSerializer(@Value("${jwt.refresh-token-key}") String secretKey) throws ParseException, KeyLengthException {
        return new DefaultRefreshTokenSerializer(
            new DirectEncrypter(
                OctetSequenceKey.parse(secretKey)
            )
        );
    }

    @Bean
    public AccessTokenDeserializer accessTokenDeserializer(@Value("${jwt.access-token-key}") String secretKey) throws ParseException, JOSEException {
        return new DefaultAccessTokenDeserializer(
            new MACVerifier(
                OctetSequenceKey.parse(secretKey)
            )
        );
    }

    @Bean
    public RefreshTokenDeserializer refreshTokenDeserializer(@Value("${jwt.refresh-token-key}") String secretKey) throws ParseException, KeyLengthException {
        return new DefaultRefreshTokenDeserializer(
            new DirectDecrypter(
                OctetSequenceKey.parse(secretKey)
            )
        );
    }
}
