package com.melon.domain;

// 이용권 테이블

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 1)
    private String ticketId;
    private String ticketName;
}
