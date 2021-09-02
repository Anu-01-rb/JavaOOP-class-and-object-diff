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
        this.name = name;
    }    
    
    private String error(){
        if (height == 0)        return "[CatRobot : ERROR | 404 ] int<height> Not Found.";
        if (color == null)      return "[CatRobot : ERROR | 404 ] String<color> Not Found.";
        if (name == null)       return "[CatRobot : ERROR | 404 ] String<name> Not Found.";
        if (gender == null)     return "[CatRobot : ERROR | 404 ] String<gender> Not Found.";
        return "1";
    }
    
    @Override
    public String toString(){
        if (error() != "1") return error();
        return "";
    }
    
}
