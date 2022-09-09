package com.example.demo.repo;

import com.example.demo.entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepo extends JpaRepository<Stu,String> {
    Stu findByName(String name);
}
