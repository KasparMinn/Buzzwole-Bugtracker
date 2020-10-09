package com.kaspar.bzzwole.controller;

import com.kaspar.bzzwole.model.Bug;
import com.kaspar.bzzwole.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

}
