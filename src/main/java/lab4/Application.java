package lab4;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.github.javafaker.Faker;
import lab4.entities.BookEntity;
import lab4.repositories.BookEntityRepository;
import lab4.repositories.DiscMagEntityRepository;
import lab4.repositories.MagazineEntityRepository;
import lab4.repositories.TicketEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final Faker faker = new Faker();


    private final BookEntityRepository bookRepository;
    private final MagazineEntityRepository magazineRepository;
    private final DiscMagEntityRepository discMagRepository;
    private final TicketEntityRepository ticketRepository;

    public Application(
            BookEntityRepository bookRepository,
            MagazineEntityRepository magazineRepository,
            DiscMagEntityRepository discMagRepository,
            TicketEntityRepository ticketRepository){
    this.bookRepository = bookRepository;
    this.magazineRepository = magazineRepository;
    this.discMagRepository = discMagRepository;
    this.ticketRepository = ticketRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    bookRepoCrudDemo();

    }
    private void bookRepoCrudDemo(){
        System.out.println("==============BEGGING BOOK REPO CRUD DEMONSTRATION==============");

        System.out.println("CREATE BOOK DEMO");
        BookEntity book = new BookEntity();
        faker.book().title();
        faker.number().numberBetween(1, 100);
        faker.number().numberBetween(1, 100);
        faker.book().author();

        BookEntity savedBook = bookRepository.save(book);
        System.out.println(savedBook);

        System.out.println("READ BOOK DEMO");
        List<BookEntity> allBooks = bookRepository.findAll();
        System.out.println(allBooks);



    }
















}