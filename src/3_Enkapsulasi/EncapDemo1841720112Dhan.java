/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Wildhan Juniar
 */
public class EncapDemo1841720112Dhan {
    private String name;     
    private int age; 
     
    public String getName(){ 
        return name; 
    } 
    public void setName(String newName){         
        name = newName; 
    } 
    public int getAge(){ 
        return age; 
    } 
    public void setage(int newAge){ 
        if (newAge >= 18 && newAge <=30) 
        { 
            age = newAge; 
        }else{
            System.out.println("Nilai yang anda masukan salah");
        }
    } 
}