package com.example.Discuss.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "friends")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "follower",referencedColumnName = "userId")
    private User follower;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "following", referencedColumnName =  "userId")
    private User following;

    private Instant created;


}
