package com.springboot.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.book.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books,Integer>
{

}
