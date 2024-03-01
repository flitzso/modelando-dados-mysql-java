package com.database.Repository;

import com.database.Entity.NewForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewForumRepository extends JpaRepository<NewForum, Integer> {
    List<NewForum> findByNameForum(String nameForum);
    // Outros métodos personalizados, se necessário
}