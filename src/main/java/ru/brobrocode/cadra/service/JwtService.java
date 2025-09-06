package ru.brobrocode.cadra.service;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Slf4j
@Service
public class JwtService {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.access-token.expiration:900000}") // 15 минут
	private Long accessTokenExpiration;

	@Value("${jwt.refresh-token.expiration:604800000}") // 7 дней
	private Long refreshTokenExpiration;

	private Key getSigningKey() {
		return Keys.hmacShaKeyFor(secret.getBytes());
	}

	public String generateAccessToken(String userId, Map<String, Object> additionalClaims) {
		Map<String, Object> claims = new HashMap<>(additionalClaims);

		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userId)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + accessTokenExpiration))
				.signWith(getSigningKey(), SignatureAlgorithm.HS256)
				.compact();
	}

	public String generateRefreshToken(String userId) {
		return Jwts.builder()
				.setSubject(userId)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + refreshTokenExpiration))
				.claim("type", "refresh")
				.signWith(getSigningKey(), SignatureAlgorithm.HS256)
				.compact();
	}

	public Claims extractClaims(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(getSigningKey())
				.build()
				.parseClaimsJws(token)
				.getBody();
	}

	public boolean validateToken(String token) {
		try {
			Claims claims = extractClaims(token);
			return !claims.getExpiration().before(new Date());
		} catch (JwtException | IllegalArgumentException e) {
			log.error("Invalid JWT token", e);
			return false;
		}
	}

	public String extractUserId(String token) {
		return extractClaims(token).getSubject();
	}

	public boolean isRefreshToken(String token) {
		try {
			Claims claims = extractClaims(token);
			return "refresh".equals(claims.get("type"));
		} catch (Exception e) {
			return false;
		}
	}
}