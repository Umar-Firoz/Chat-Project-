package com.demo.chatproject.repository;

import com.demo.chatproject.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Long ,Chat>{
}
