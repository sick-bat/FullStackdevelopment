package com.ani.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8080/item
@RequestMapping(value = "/item")
@Controller
public class ItemController {
    
    // POST - http://localhost:8080/item/
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> create(@RequestBody Item item) {

        AppRes res = AppRes.builder()
                            .sts("success")
                            .msg("New Item created")
                            .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    // GET - http://localhost:8080/item/
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Item>> read() {
        List<Item> items = new ArrayList<>();
        return ResponseEntity.status(HttpStatus.OK).body(items);
    }

    // PUT - http://localhost:8080/item/
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> update(@RequestBody Item item) {

        AppRes res = AppRes.builder()
                            .sts("success")
                            .msg("Item Updated")
                            .build();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
    }

     // DELETE - http://localhost:8080/item/
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> delete(@PathVariable Long id) {

        AppRes res = AppRes.builder()
                            .sts("success")
                            .msg("Item Deleted")
                            .build();

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}