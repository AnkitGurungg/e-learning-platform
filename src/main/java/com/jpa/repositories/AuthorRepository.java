package com.jpa.repositories;

import com.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {
    // Property, Condition and Refinement

    // Custom queries
    // Executing an update/delete query error, because the updateAuthor method is not transactional and to fix that make
    // the updateAuthor method transactional because the modification or the update need to be within same transaction
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthors(int age);

    // select * from author where first_name = 'ankit'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name = 'ankit' or 'Ankit'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where first_name like '%an%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // select * from author where first_name like 'an%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

    // select * from author where first_name like '%an'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    // select * from author where first_name in ('ankit', 'gurung', 'codes')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);

}
