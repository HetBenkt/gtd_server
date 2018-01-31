package nl.bos.gtd.server;

import nl.bos.gtd.server.entities.Card;
import nl.bos.gtd.server.entities.Member;
import nl.bos.gtd.server.repositories.ICardRepository;
import nl.bos.gtd.server.repositories.IColumnRepository;
import nl.bos.gtd.server.entities.Board;
import nl.bos.gtd.server.entities.Column;
import nl.bos.gtd.server.repositories.IBoardRepository;
import nl.bos.gtd.server.repositories.IMemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class GtdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtdServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(IMemberRepository memberRepo, IBoardRepository boardRepo, IColumnRepository columnRepo, ICardRepository cardRepo) {
        return args -> {
            //Members
            Member member1 = new Member(1L, "John", "Doe", "john.doe@gmail.com", "John2018", "admin");
            memberRepo.save(member1);
            Member member2 = new Member(2L, "Bryan", "Libby", "bryan.libby@gmail.com", "BryanLi", "admin");
            memberRepo.save(member2);

            //Boards
            Board board1 = new Board(1L, "Weekly planning", member1);
            boardRepo.save(board1);
            Board board2 = new Board(2L, "D2 Authority", member1);
            boardRepo.save(board2);

            //Columns
            Column column1 = new Column(1L, "Daily", "", board1);
            columnRepo.save(column1);
            Column column2 = new Column(2L, "Weekly", "", board1);
            columnRepo.save(column2);
            Column column3 = new Column(3L, "Monthly", "", board1);
            columnRepo.save(column3);
            Column column4 = new Column(4L, "ToDo", "", board2);
            columnRepo.save(column4);
            Column column5 = new Column(5L, "In progress", "", board2);
            columnRepo.save(column5);
            Column column6 = new Column(6L, "Done", "", board2);
            columnRepo.save(column6);

            //Cards
            Card card1 = new Card(1L, "30 day fit", "", new ArrayList<>(), "", 0L, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), column1);
            cardRepo.save(card1);
            Card card2 = new Card(2L, "Blind typing", "", new ArrayList<>(), "", 0L, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), column1);
            cardRepo.save(card2);
            Card card3 = new Card(3L, "Trumpet playing", "", new ArrayList<>(), "", 0L, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), column1);
            cardRepo.save(card3);
        };
    }
}
