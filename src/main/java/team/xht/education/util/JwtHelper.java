package team.xht.education.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtHelper {
    private static final long tokenExpiration = 10 * 60 * 1000;
    private static final String tokenSignKey = "lointain";

    public static String createToken(Long userId, String userName) {
        return Jwts.builder()
                .setSubject("YYGH-USER")
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
                .claim("userId", userId)
                .claim("userName", userName)
                .signWith(SignatureAlgorithm.ES256, tokenSignKey)
                .compact();
    }

    public static boolean parseToken(String token) {
        Jwts.parser();
        return true;
    }
}
