package nl.bos.gtd_server.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Cards")
public class Card {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Size(max = 16)
    String name;

    @Null
    @Size(max = 64)
    String description;

    @Null
    ArrayList<String> labels;

    @Null
    @Size(max =8)
    String color;

    @Null
    Long timeSpent;

    @Null
    ArrayList<Date> dueDates;

    @Null
    ArrayList<String> tasks;

    @Null
    ArrayList<String> comments;

    @ManyToOne
    @JoinColumn(name="column_id")
    private Column column;
}
