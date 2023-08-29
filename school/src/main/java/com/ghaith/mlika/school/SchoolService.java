package com.ghaith.mlika.school;


import com.ghaith.mlika.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void saveSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> getSchools(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolWithStudents(Integer schoolId) {

        School school = schoolRepository.findById(schoolId).orElse(
                School.builder().name("NOT_FOUND").email("NOT_FOUND").build()
        );

        List<StudentResponse> students = studentClient.findAllStudentsBySchoolId(schoolId);

        return FullSchoolResponse.builder().name(school.getName()).email(school.getEmail()).students(students).build();

    }
}
