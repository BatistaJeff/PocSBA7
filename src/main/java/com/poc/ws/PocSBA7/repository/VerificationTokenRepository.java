package com.poc.ws.PocSBA7.repository;

import com.poc.ws.PocSBA7.domain.User;
import com.poc.ws.PocSBA7.domain.VerificationToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VerificationTokenRepository extends MongoRepository<VerificationToken,String> {

    Optional<VerificationToken> findByToken(String token);

    Optional<VerificationToken> findByUser(User user);

}
