package com.company;



public class HolyWaterStrategy implements VampireHunterStrategy {


    @Override
    public void execute() {
        System.out.println("You used holy water,ordinary but effective!");
    }
}