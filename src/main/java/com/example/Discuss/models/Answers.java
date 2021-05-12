package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "answers")
public class Answers {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long aid;

    @Column(name = "answer")
    private  String answer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "qid")
    private  Question question;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "answers")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Comments> comments;

    private Instant created;


}
