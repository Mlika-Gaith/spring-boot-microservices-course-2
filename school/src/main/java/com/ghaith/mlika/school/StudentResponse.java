package com.ghaith.mlika.school;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class StudentResponse {
    private String firstname;
    private String lastname;
    private String email;
}
