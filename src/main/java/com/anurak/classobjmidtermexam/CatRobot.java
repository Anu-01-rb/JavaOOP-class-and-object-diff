/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.classobjmidtermexam;

/**
 *
 * @author anurak
 */
public class CatRobot {
    
    private int height;
    private String color;
    private String name;
    private String gender;
    
    CatRobot(){}
    
    CatRobot(String name){
        setName(name);
    }    

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private boolean error(){
        if (height == 0)        throw new NullPointerException("[CatRobot : ERROR | 404 ] int<height> Not Found.");
        if (color == null)      throw new NullPointerException("[CatRobot : ERROR | 404 ] String<color> Not Found.");
        if (name == null)       throw new NullPointerException("[CatRobot : ERROR | 404 ] String<name> Not Found.");
        if (gender == null)     throw new NullPointerException("[CatRobot : ERROR | 404 ] String<gender> Not Found.");
        return false;
    }
    
    @Override
    public String toString(){
        if (error());
        return "";
    }
    
}
