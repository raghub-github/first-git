package com.company;

class myEmployee {
    private int id;  // private Access modifier
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}
