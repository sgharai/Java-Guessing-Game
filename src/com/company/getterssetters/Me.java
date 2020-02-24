package com.company.getterssetters;

public class Me {
    private String name;
    private boolean likesCoffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean likesCoffee() {
        return likesCoffee;
    }

    public void setLikesCoffee(boolean likesCoffee) {
        this.likesCoffee = likesCoffee;
    }

    Me(String name, boolean likesCoffee){
        setName("Sofia");
        setLikesCoffee(true);
    }





}
