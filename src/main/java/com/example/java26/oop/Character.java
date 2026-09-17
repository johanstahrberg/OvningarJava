package com.example.java26.oop;

public class Character {

    private int health;
    private int maxHealth;

    public Character(int health, int maxHealth) {
        this.health = health;
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void takeDamage(int amount) {
        health = health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }









}