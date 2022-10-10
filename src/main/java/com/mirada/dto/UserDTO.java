package com.mirada.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotBlank
    @Size(max = 30, min = 2)
    private String givenName;

    @NotBlank
    @Size(max = 30, min = 2)
    private String surname;

    @NotBlank
    private String address;
    private String address2;
    @NotBlank
    private String town;
    private String county;
    @NotBlank
    private String country;
    @NotBlank
    private String postalCode;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Pattern(regexp = "^\\d{10}$")
    private String phoneNumber;
}
