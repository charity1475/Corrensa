package com.steinny.corrensa.repository;

import com.steinny.corrensa.model.RefreshToken;
import com.steinny.corrensa.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

}
