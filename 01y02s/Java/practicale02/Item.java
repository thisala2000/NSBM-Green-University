package com.mycompany.practical_02;

public class Item {
	// question1
    private int location;
    private String description;
	
	// question2
    // question3
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
	
	// question4
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}