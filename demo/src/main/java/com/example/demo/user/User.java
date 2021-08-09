package com.example.demo.user;

public class User {
    private Long id;
    private String name;
    private String skill;
    private Integer practice_time;
    private String rank;

    public User(Long id, String name, String skill, Integer practice_time, String rank){
        this.id = id;
        this.name = name;
        this.skill = skill;
        this.practice_time = practice_time;
        this.rank = rank;
    }
    public User(String name, String skill, Integer practice_time, String rank){
        this.name = name;
        this.skill = skill;
        this.practice_time = practice_time;
        this.rank = rank;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getPractice_time() {
        return this.practice_time;
    }

    public void setPractice_time(Integer practice_time) {
        this.practice_time = practice_time;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "User{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", skill='" + getSkill() + "'" +
            ", practice_time='" + getPractice_time() + "'" +
            ", rank='" + getRank() + "'" +
            "}";
    }
    
    
    
}
