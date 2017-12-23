package nl.bos.gtd_server.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@Table(name = "Columns")
public class Column {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Size(max = 16)
    String name;

    @Null
    @Size(max = 64)
    String description;

    @ManyToOne
    @JoinColumn(name="board_id")
    private Board board;

    @OneToMany(mappedBy = "column")
    private List<Card> cards;
}
