package com.mirada.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@Data
@Table(name = "users")
@Entity
public class User extends BaseEntity{

    private String givenName;
    private String surname;
    private String address;
    private String address2;
    private String town;
    private String county;
    private String country;
    private String postalCode;
    private String email;
    private String phoneNumber;
}
