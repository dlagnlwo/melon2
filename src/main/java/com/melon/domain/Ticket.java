package com.melon.domain;

// 이용권 테이블

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 1)
    private String ticketId;
    private String ticketName;
//
//    @OneToMany(mappedBy = "ticket")
//    private List<Member> members = new ArrayList<>();

}
