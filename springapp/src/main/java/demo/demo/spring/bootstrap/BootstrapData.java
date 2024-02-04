package demo.demo.spring.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.spring.domain.Author;
import demo.spring.domain.Book;
import demo.spring.repository.AuthorRepository;
import demo.spring.repository.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("12332");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Jhonson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development");
        noEJB.setIsbn("428995");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        bookRepository.save(rodSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count" + authorRepository.count());
        System.out.println("Book Count:" + bookRepository.count());
    }

}
