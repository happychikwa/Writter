package com.corner.Writer.repositories;

import com.corner.Writer.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Short> {
}
