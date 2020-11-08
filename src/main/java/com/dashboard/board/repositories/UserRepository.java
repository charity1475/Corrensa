package com.dashboard.board.repositories;

import com.dashboard.board.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    void delete(Long id);
}
