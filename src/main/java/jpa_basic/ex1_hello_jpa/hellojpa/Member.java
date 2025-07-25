package jpa_basic.ex1_hello_jpa.hellojpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

   @Column(name = "name") // 컬럼 매핑
   private String username;

   private Integer age;

   @Enumerated(EnumType.STRING) // enum 타입 매핑
   private RoleType roleType;

   @Temporal(TemporalType.TIMESTAMP) // 날짜 타입 매핑
   private Date createDate;

   @Temporal(TemporalType.TIMESTAMP)
   private Date lastModifiedDate;

   @Lob // BLOB, CLOB 매핑
   private String description;

   @Transient // 메모리에서만 쓸 때
   private int temp;

    public Member() {
    }

}

