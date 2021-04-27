package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long aid;

    @Column(name = "answer")
    private  String answer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "qid")
    private  Question question;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private Instant created;
}
