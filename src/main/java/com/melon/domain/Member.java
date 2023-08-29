package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 회원 테이블

@Entity
@Getter @Setter
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String memberId;
    private String password;
    private String nick;
    private String birth;
    private String tel;
    @Column(length = 1)
    private String role;
    @Column(length = 1)
    private char ticketId;

//    @OneToOne(mappedBy = "member")
//    private PlayListNow playListNow;
//
//    @OneToMany(mappedBy = "member")
//    private List<Comment> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "member")
//    private List<Qna> qnas = new ArrayList<>();
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ticketId")
//    private Ticket ticket;

}
