package com.example.trackdaily.controller;

import com.example.trackdaily.model.Tracker;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TrackerController {

    @GetMapping("/api/trackers")
    public List<Tracker> getTrackers() {
        return List.of(
                new Tracker(1L, "Lesen", "Bildung", "BOOLEAN"),
                new Tracker(2L, "10.000 Schritte", "Fitness", "NUMBER"),
                new Tracker(3L, "Gym", "Fitness", "BOOLEAN"),
                new Tracker(4L, "Wasser trinken", "Gesundheit", "NUMBER")
        );
    }
}