package me.yoon.hello.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Person {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true, updatable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @CreatedDate
    private LocalDateTime createdAt;
}
