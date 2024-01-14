package com.study.blog.entity.account;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "user")
@Builder
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotNull
    @NotEmpty
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotEmpty
    @NotNull
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty
    @NotNull
    @Column(name = "phoneNumber", unique = true)
    private String phoneNumber;

    @NotNull
    @NotEmpty
    @Column(name = "passwordHash", nullable = false)
    private String passwordHash;

    @Temporal(TemporalType.DATE)
    private Date registerAt;

    @Temporal(TemporalType.DATE)
    private Date lastLogin;
}
