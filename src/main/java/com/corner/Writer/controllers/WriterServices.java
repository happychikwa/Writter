package com.corner.Writer.controllers;

import com.corner.Writer.models.Author;
import com.corner.Writer.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterServices {
    @Autowired
    AuthorRepository author_repo;
    public void signUpUser(Author author){
        author_repo.save(author);
    }
}
