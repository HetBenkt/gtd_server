package nl.bos.gtd.server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
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
    private static List<Column> columns;
}
