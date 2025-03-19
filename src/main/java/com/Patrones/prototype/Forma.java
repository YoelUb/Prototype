package com.Patrones.prototype;


// Prototipo base
public abstract class Forma {
    protected int x;
    protected int y;
    protected String color;

    public Forma() {
    }

    // Constructor prototipo
    public Forma(Forma source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    // Métodos Getters y Setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public abstract Forma clonar();
}