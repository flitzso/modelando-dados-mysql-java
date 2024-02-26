package com.database.Repository;

import com.database.Entity.MyForums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyForumsRepository extends JpaRepository<MyForums, Long> {
    // You can add custom query methods if needed
}