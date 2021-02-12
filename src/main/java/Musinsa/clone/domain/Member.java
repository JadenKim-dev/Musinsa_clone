package Musinsa.clone.domain;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name="NAME_UNIQUE", columnNames = {"name"})})
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

}
