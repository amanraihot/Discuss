package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "question")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "qid")
    private long qid;

    private String question;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private Instant created;
}
