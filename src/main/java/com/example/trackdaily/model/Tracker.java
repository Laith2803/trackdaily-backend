package com.example.trackdaily.model;

public class Tracker {

    private Long id;
    private String name;
    private String category;
    private String targetType;

    public Tracker(Long id, String name, String category, String targetType) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.targetType = targetType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getTargetType() {
        return targetType;
    }
}