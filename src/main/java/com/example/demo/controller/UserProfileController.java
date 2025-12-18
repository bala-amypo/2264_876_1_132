package com.example.demo.controller;


@RestControllers


public class UserProfileController{


    public class UserProfile(){


        @PostMapping("/users")
        public UserProfile createData(@RequestBody UserProfile usp){
            return ser.createData(usp);
        }
    }

}