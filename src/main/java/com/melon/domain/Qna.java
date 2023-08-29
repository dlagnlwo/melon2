package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

// QNA 테이블
@Entity
@Getter @Setter
@Table(name="qna")
public class Qna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnaNo;
    private String qnaTitle;
    private String qnaContent;
    private String replyContent;
    @Column(length = 1)
    private String replyYn;
    private String qnaDate;
    private String memberId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "memberId")
//    private Member member;
}
