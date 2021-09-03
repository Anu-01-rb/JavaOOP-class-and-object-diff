/**
 * Midterm Exam : Class and Object Explanation
 * 
 * Object-Oriented Programming
 * 
 */

package com.anurak.classobjmidtermexam;

import java.util.LinkedList;

/**
 *
 * @author Anurak Yutthanawa 63160015 B.Sc.Computer Science
 * Faculty of Informatics, BUU.
 * 
 */
public class CatRobot {
    
/**
 * 
 * cat robot class
 * 
 */
    
    private int height;
    private String color;
    private String name;
    private String gender;
    private LinkedList<String> gadget = new LinkedList<String>();
    
    CatRobot(){
        initialGadget();
    }
    
    CatRobot(String name){
        initialGadget();
        setName(name);
    }    

    public void setHeight(int height) throws InterruptedException {
        if (height <= 0) throw new InterruptedException("[CatRobot : ERROR | INPUT ] int<height> must be greater than 0");
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
    
    public void addGadget(String gad){
        this.gadget.add(gad);
    }
    
    public void showGadget(){ //Show all gadget does object have
        for(int i = 1 ; i <= this.gadget.size() ; i++){
            System.out.printf("%d. %s\n",i , this.gadget.get(i-1));
        }
    }
    
    public void getGadget(int index){
        System.out.printf("Here you're!! This is %s\n", this.gadget.get(index-1));
    }
    
    private boolean error(){
        if (height == 0)        throw new NullPointerException("[CatRobot : ERROR | DATA ] int<height> Not Found.");
        if (color == null)      throw new NullPointerException("[CatRobot : ERROR | DATA ] String<color> Not Found.");
        if (name == null)       throw new NullPointerException("[CatRobot : ERROR | DATA ] String<name> Not Found.");
        if (gender == null)     throw new NullPointerException("[CatRobot : ERROR | DATA ] String<gender> Not Found.");
        return false;
    }
    
    private void initialGadget(){
        this.gadget.add("Anywhere Door");
        this.gadget.add("Take-copter");
        this.gadget.add("Time Machine");
        this.gadget.add("Big Light and Small Light");
        this.gadget.add("Time Furoshiki");
        this.gadget.add("Translation Jelly");
        this.gadget.add("Obtaining Bag");
        this.gadget.add("What-If Phone Booth");
    }
    
    @Override
    public String toString(){
        if (error());
        return "";
    }
    
}
