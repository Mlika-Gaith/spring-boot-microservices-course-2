package com.ghaith.mlika.school;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    private List<StudentResponse> students;
}
