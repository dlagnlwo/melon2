package com.melon.domain.ticket;

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
    @Column(length = 1)
    private String ticketId;
    private String ticketName;
    private int ticketPrice;
}