package com.melon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private String ticketId;
}
