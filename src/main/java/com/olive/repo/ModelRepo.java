package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Model;

public interface ModelRepo extends JpaRepository<Model, Integer>{

}
