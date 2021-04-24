package com.domain.controllers;

import com.domain.models.entities.Takjil;
import com.domain.services.TakjilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/takjil")
public class TakjilController {

    @Autowired
    private TakjilService takjilService;

    @PostMapping
    public Takjil create(@RequestBody Takjil takjil) {
        return takjilService.save(takjil);
    }

    @GetMapping
    public Iterable<Takjil> findAll() {
        return takjilService.findAll();
    }

    @PutMapping
    public Takjil update(@RequestBody Takjil takjil) {
        return takjilService.save(takjil);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        takjilService.removeOne(id);
    }
}