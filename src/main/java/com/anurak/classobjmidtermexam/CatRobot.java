/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */
package com.anurak.classobjmidtermexam;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */
public class CatRobot {
    
/**
 * cat robot class
 */
    
    private int height;
    private String color;
    private String name;
    private String gender;
    
    
    CatRobot(){}
    
    CatRobot(String name){
        setName(name);
    }    

    public void setHeight(int height) throws InterruptedException {
        if (gender.intern() != "M" || gender.intern() != "F") throw new InterruptedException("[CatRobot : ERROR | INPUT ] int<height> must be greater than 0");
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color.intern();
    }

    public void setName(String name) {
        this.name = name.intern();
    }

    public void setGender(String gender) throws InterruptedException {
        if (gender.intern() != "M" || gender.intern() != "F") throw new InterruptedException("[CatRobot : ERROR | INPUT ] String<gender> must input only[M/F]");
        this.gender = gender;
    }
    
    public void speak(){
        if (error());
        System.out.printf("Hello, My name is %s, I am cat robot from 22nd centuries.\n", this.name);
    }
    
    public void walk(){
        if (error());
        System.out.printf("%s is walking.\n", this.name);
    }
    
    public void eat(){
        if (error());
        System.out.printf("Yummy! Dorayaki so delicious.\n");
    }
    
    private boolean error(){
        if (height == 0)        throw new NullPointerException("[CatRobot : ERROR | DATA ] int<height> Not Found.");
        if (color == null)      throw new NullPointerException("[CatRobot : ERROR | DATA ] String<color> Not Found.");
        if (name == null)       throw new NullPointerException("[CatRobot : ERROR | DATA ] String<name> Not Found.");
        if (gender == null)     throw new NullPointerException("[CatRobot : ERROR | DATA ] String<gender> Not Found.");
        return false;
    }
    
    @Override
    public String toString(){
        if (error());
        return "";
    }
    
}
