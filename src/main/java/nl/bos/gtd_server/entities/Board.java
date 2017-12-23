package nl.bos.gtd_server.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@Table(name = "Boards")
public class Board {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Size(max = 16)
    String name;

    @ManyToOne
    @JoinColumn(name="member_id")
    @NotNull
    private Member member;

    @OneToMany(mappedBy = "board")
    private List<Column> columns;
}
