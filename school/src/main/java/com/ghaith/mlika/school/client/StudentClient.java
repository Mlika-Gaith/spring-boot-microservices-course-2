package com.ghaith.mlika.school.client;

import com.ghaith.mlika.school.StudentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service", url="${application.config.student-url}")
public interface StudentClient {
    @GetMapping("/school/{school-id}")
    List<StudentResponse> findAllStudentsBySchoolId(@PathVariable("school-id") Integer schoolId);
}
