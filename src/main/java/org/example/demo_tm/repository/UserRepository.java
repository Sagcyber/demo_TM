package org.example.demo_tm.repository;

import org.example.demo_tm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
