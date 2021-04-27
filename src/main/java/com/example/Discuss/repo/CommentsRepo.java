package com.example.Discuss.repo;

import com.example.Discuss.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments,Long> {
}
