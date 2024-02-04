package demo.spring.repository;

import org.springframework.data.repository.CrudRepository;

import demo.spring.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
