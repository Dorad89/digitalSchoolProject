package org.du.digitalschoolproject.instructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorsController {

    private InstructorsRepository instructorsRepository;
    @Autowired
    public InstructorsController(InstructorsRepository instructorsRepository) {
        this.instructorsRepository = instructorsRepository;
    }
}
