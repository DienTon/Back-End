package com.example.tech.repository.CommentRepo;

import com.example.tech.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICommentRepo extends JpaRepository<Comment, Long> {
}
