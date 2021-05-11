package com.example.interview_task.controller;

import com.example.interview_task.dao.ActiveEmployeeRepo;
import com.example.interview_task.entity.ActiveEmployee;
import com.example.interview_task.service.ActiveEmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class ActiveEmployeeController {

    private ActiveEmployeeRepo activeEmployeeRepo;
    private ActiveEmployeeManager activeEmployeeManager;

    @Autowired
    public ActiveEmployeeController(ActiveEmployeeRepo activeEmployeeRepo, ActiveEmployeeManager activeEmployeeManager) {
        this.activeEmployeeRepo = activeEmployeeRepo;
        this.activeEmployeeManager = activeEmployeeManager;
    }

    @GetMapping("/activeAll")
    public List<ActiveEmployee> getActiveAll() {
        return activeEmployeeManager.findAll();
    }

    @PostMapping("/addActive")
    public ActiveEmployee addActiveEmployee(@RequestBody ActiveEmployee newEmployee) {
        return activeEmployeeManager.save(newEmployee);
    }

    @PutMapping("/{id}/newSalary/{salary}")
    public ResponseEntity<ActiveEmployee> modEmployeeSalary(@PathVariable ("id") Long id,
                                                            @PathVariable("salary") String newSalary) {

        Optional<ActiveEmployee> foundEmployee = activeEmployeeManager.findById(id);
        if(foundEmployee.isPresent()) {
            ActiveEmployee newActiveEmployee = foundEmployee.get();
            newActiveEmployee.setSalary(Double.parseDouble(newSalary));
            newActiveEmployee.setId(id);
            activeEmployeeManager.save(newActiveEmployee);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}/newDateOfEmployment/{dateOfEmployment}")
    public ResponseEntity<ActiveEmployee> modEmployeeDate(@PathVariable ("id") Long id,
                                                            @PathVariable("dateOfEmployment") String newDateOfEmployment) {

        Optional<ActiveEmployee> foundEmployee = activeEmployeeManager.findById(id);
        if(foundEmployee.isPresent()) {
            ActiveEmployee newActiveEmployee = foundEmployee.get();
            newActiveEmployee.setDateOfEmployment(LocalDate.parse(newDateOfEmployment));          /*setSalary(Double
            .parseDouble(newSalary));*/
            newActiveEmployee.setId(id);
            activeEmployeeManager.save(newActiveEmployee);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
