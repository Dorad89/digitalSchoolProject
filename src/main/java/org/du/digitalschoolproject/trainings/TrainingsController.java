package org.du.digitalschoolproject.trainings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public TrainingEntity save(@RequestBody TrainingEntity trainingEntity){
        return trainingsService.save(trainingEntity);
    }

    @PutMapping(path = "/trainings/{id}")
    public TrainingEntity update(@RequestBody TrainingEntity trainingEntity,@PathVariable Long id){

        trainingEntity.setId(id);
        return trainingsService.update(trainingEntity);
    }

    @DeleteMapping(path = "/trainings/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){

        trainingsService.deleteById(id);
    }
}
