package nl.bos.gtd.server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
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

    @Size(max = 64)
    String description;

    @ManyToOne
    @JoinColumn(name="board_id")
    private Board board;

    @OneToMany(mappedBy = "column")
    private static List<Card> cards;
}
