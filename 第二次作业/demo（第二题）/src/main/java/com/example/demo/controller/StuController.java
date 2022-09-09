package com.example.demo.controller;

import com.example.demo.entity.Stu;
import com.example.demo.repo.StuRepo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/stu")
public class StuController {

    @Resource
    private StuRepo stuRepo;

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stu> findAll(){
        return stuRepo.findAll();
    }

    @GetMapping(value = "/{name}",produces = MediaType.APPLICATION_XML_VALUE)
    public Stu findByName(@PathVariable String name){
        return stuRepo.findByName(name);
    }
}
