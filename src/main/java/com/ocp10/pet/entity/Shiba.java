/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp10.pet.entity;

/**
 *
 * @author MB-study
 */
public class Shiba extends Dog{
private  int price;

    public Shiba(int price) {
        this.price = price;
    }
        
    @Override
    public int getPrice() {
        return  price;
    }
    
    
}
