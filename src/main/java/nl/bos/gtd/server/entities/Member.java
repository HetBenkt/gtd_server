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
@Table(name = "Members")
public class Member {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Size(max = 16)
    String firstName;

    @NotNull
    @Size(max = 16)
    String lastName;

    @NotNull
    @Size(max = 32)
    String email;

    @NotNull
    @Size(max = 16)
    String nickname;

    @NotNull
    @Size(max = 64)
    String password;

    @OneToMany(mappedBy = "member")
    private static List<Board> boards;
}
