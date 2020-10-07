package com.kaspar.bzzwole.controller;

import com.kaspar.bzzwole.model.Bug;
import com.kaspar.bzzwole.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
