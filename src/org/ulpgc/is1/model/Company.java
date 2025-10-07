package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;
    private String description;

    public Company(String name, String description, String telephone, String email) {
        super(telephone, email);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

