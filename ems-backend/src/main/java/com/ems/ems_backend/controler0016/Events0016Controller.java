package com.ems.ems_backend.controler0016;

import com.ems.ems_backend.dto0016.EventsDto0016;
import com.ems.ems_backend.service0016.Events0016Service;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/events0016")

public class Events0016Controller {
    private Events0016Service events0016Service;

    // Build Add Events REST API
    @PostMapping
    public ResponseEntity<EventsDto0016> createEvents0016(@RequestBody EventsDto0016 eventsDto0016) {
        EventsDto0016 savedEvents0016 = events0016Service.createEvents0016(eventsDto0016);
        return new ResponseEntity<>(savedEvents0016, HttpStatus.CREATED);
    }
}
