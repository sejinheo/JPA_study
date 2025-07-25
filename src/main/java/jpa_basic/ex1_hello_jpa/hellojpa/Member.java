package jpa_basic.ex1_hello_jpa.hellojpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "name") // 컬럼 매핑
   private String username;

    public Member() {
    }

}

