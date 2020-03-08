package com.company;

public class App {


    public static void main(String[] args) {

        System.out.println("A vampire appeared in the morning ");
        VampireHunter vampireHunter = new VampireHunter(new StakeStrategy());
        vampireHunter.goToHunt();
        System.out.println("Another vampire appeared when the sun came up ");
        vampireHunter.changeStrategy(new SunlightStrategy());
        vampireHunter.goToHunt();
        System.out.println("The last vampire has appeared");
        vampireHunter.changeStrategy(new HolyWaterStrategy());
        vampireHunter.goToHunt();

    }
}
