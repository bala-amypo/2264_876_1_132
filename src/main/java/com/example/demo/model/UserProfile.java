package com.example.demo.model;





public class UserProfile{
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Boolean active;
    private Timestamp createAt;
    private Timestamp updateAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getBio(){
        return bio;
    }
    public void setEmail(String bio){
        this.bio=bio;
    }
    public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public Timestamp getCreateat(){
        return createat;
    }
    public void setCreateat(Timestamp createat){
        this.createat=createat;
    }
    public Timestamp getUpdateat(){
        return updateat;
    }
    public void setCreateat(Timestamp createat){
        this.createat=createat;
}