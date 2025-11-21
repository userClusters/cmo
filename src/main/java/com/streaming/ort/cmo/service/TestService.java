package com.streaming.ort.cmo.service;

import com.streaming.ort.cmo.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repo;
}
