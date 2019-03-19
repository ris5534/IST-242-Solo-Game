package com.company;

public class Enemies {
    private String name;
    private int health; // Get enemyHealth to call back to Health class
    private int damage;

    public Enemies (String _enemyName, int _enemyHealth, int damage) {
        this.name = _enemyName;
        this.health = _enemyHealth;
        this.damage = damage;
    }
}
