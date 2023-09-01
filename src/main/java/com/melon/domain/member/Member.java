package com.melon.domain.member;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.melon.domain.ticket.Ticket;

import lombok.Getter;
import lombok.Setter;

// 회원 테이블

@Entity
@Getter @Setter
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId; // 하이버네이트 사용 시에만 int를 사용하고 실제 DB에선 varchar로 사용하는 방법 찾아야함
    private String password;
    private String name;
    private String birthday;
    private String tel;
    private String email;
    private String nick;
    @Column(length = 1)
    private String role;
    private LocalDateTime ticketDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ticketId")
    private Ticket ticket;
}
