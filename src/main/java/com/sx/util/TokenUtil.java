package com.sx.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class TokenUtil {
//    @Value("secret")
    private static String secret="tokenkey";
    //生成token
    public static String makeToken(Map<String,Object> claims){
        //过期时间
        Date date=new Date(System.currentTimeMillis()+1000*60*60*2400);
        return Jwts.builder()
                //先设置setClaims
                .setClaims(claims)
                .setExpiration(date)
                .signWith(SignatureAlgorithm.HS256,secret)
                .compact();
    }

    //解析token
    public static Claims parseToken(String token){
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }


}
