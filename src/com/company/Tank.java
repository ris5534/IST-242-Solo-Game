package com.company;

public class Tank extends Enemies {
    public Tank(String _enemyName, int _enemyHealth, int damage) {
        super(_enemyName, _enemyHealth, damage);

    public Enemies (String _enemyName, int _enemyHealth, int damage){
            this.name = _enemyName;
            this.health = _enemyHealth;
            this.damage = damage;
        }
    }
}
