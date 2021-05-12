package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private long cid;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "aid")
    private Answers answers;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private Instant created;
}

