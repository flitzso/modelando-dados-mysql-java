package com.database.Repository;

import com.database.Entity.MyFavoriteForums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyFavoriteForumsRepository extends JpaRepository<MyFavoriteForums, Long> {
    // You can add custom query methods if needed
}