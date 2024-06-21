package com.example.tech.service.CommentService;

import com.example.tech.repository.CommentRepo.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private ICommentRepo iCommentRepo;
}
