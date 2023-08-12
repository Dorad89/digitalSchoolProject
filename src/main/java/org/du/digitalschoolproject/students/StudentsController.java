package org.du.digitalschoolproject.students;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
    @GetMapping(path = "/students")
    public String getStudent(){
        return "Dorad";
    }

}
