package org.zerock.ex1.entity;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
@Table(name = "tbl_memo")
@Entity
public class Memo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
