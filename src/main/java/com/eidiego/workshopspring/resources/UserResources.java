package com.eidiego.workshopspring.resources;

import com.eidiego.workshopspring.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User diego = new User("1", "Diego Rodrigues", "diego@gmail.com");
        User douglas = new User("1", "Douglas Rodrigues", "douglas@gmail.com");
        List<User> list = new ArrayList<User>();
        list.addAll(Arrays.asList(diego, douglas));

        return ResponseEntity.ok().body(list);
    };
}
