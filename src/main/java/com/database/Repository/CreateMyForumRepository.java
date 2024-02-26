package com.database.Repository;

import com.database.Entity.CreateMyForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateMyForumRepository extends JpaRepository<CreateMyForum, Integer> {
    // You can add custom query methods if needed
}