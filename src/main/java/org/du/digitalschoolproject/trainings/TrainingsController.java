package org.du.digitalschoolproject.trainings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainingsController {

    private TrainingsService trainingsService;
    @Autowired
    public TrainingsController(TrainingsService trainingsService) {
        this.trainingsService = trainingsService;
    }

    @GetMapping(path="/trainings")
    public List<TrainingEntity> findAll(){
        return trainingsService.findAll();
    }
    @GetMapping(path = "/trainings", params = "title")
    public TrainingEntity findByTitle(@RequestParam String title){
        return trainingsService.findByTitle(title);
    }
    @PostMapping(path = "/trainings")
    public TrainingEntity save(@RequestBody TrainingEntity trainingEntity){
        return trainingsService.save(trainingEntity);
    }
}
