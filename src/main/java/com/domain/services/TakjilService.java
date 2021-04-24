package com.domain.services;

import javax.transaction.Transactional;

import com.domain.models.entities.Takjil;
import com.domain.models.repos.TakjilRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TakjilService {

    @Autowired
    private TakjilRepo takjilRepo;

    public Takjil save(Takjil takjil) {
        return takjilRepo.save(takjil);
    }

    public Iterable<Takjil> findAll() {
        return takjilRepo.findAll();
    }

    public void removeOne(Long id) {
        takjilRepo.deleteById(id);
    }

}