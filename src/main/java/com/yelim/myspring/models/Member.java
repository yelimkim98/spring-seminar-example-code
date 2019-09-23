package com.yelim.myspring.models;

public class Member {

    private String id;
    private String name;
    private String contacts;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContacts() {
        return contacts;
    }
}
