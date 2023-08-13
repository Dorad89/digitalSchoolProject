package org.du.digitalschoolproject.students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentsController {

    private StudentsRepository studentsRepository;

    @Autowired
    public StudentsController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

/*    @GetMapping(path = "/students")
    public List<StudentEntity> findAll(){
        return studentsRepository.findAll();
    }*/

}
