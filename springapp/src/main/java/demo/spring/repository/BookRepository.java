package demo.spring.repository;

import org.springframework.data.repository.CrudRepository;

import demo.spring.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {

}
