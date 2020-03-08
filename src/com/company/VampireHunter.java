package com.company;

public class VampireHunter {


        private VampireHunterStrategy strategy;

        public VampireHunter(VampireHunterStrategy strategy) {
            this.strategy = strategy;
        }

        public void changeStrategy(VampireHunterStrategy strategy) {
            this.strategy = strategy;
        }

        public void goToHunt() {
            strategy.execute();
        }
    }

