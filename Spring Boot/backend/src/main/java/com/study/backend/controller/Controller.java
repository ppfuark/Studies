package com.study.backend.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    ArrayList<Integer> ans;

    public Controller() {
        ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
    }

    @PutMapping("/change/{id}")
    public void change(@PathVariable int id) {
        if (id >= 0 && id < ans.size()) {
            int random = (int)(Math.random() * 101);
            ans.set(id, random);
            System.out.println("Updated list: " + ans);
        } else {
            System.out.println("Invalid index: " + id);
        }
    }
}
