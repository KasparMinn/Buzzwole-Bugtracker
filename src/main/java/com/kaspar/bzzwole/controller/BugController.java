package com.kaspar.bzzwole.controller;

import com.kaspar.bzzwole.exception.ResourceNotFoundException;
import com.kaspar.bzzwole.model.Bug;
import com.kaspar.bzzwole.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class BugController {

    @Autowired
    private BugRepository bugRepository;

    // Get all bugs!
    @GetMapping("/bugs")
    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    // Create Bug rest API!
    @PostMapping("/bugs")
    public Bug createBug(@RequestBody Bug bug) { return bugRepository.save(bug); }

    // Get BUG by rest API!
    @GetMapping("/bugs/{id}")
    public ResponseEntity<Bug> getBugById(@PathVariable Long id) {
        Bug bug = bugRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sorry, the bug: " + id + " does not exist!"));
        return ResponseEntity.ok(bug);
    }

}
