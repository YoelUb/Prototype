package com.Patrones.prototype;


public class Circulo extends Forma {
    private int radio;

    public Circulo() {}

    public Circulo(Circulo source) {
        super(source);
        this.radio = source.radio;
    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }

    // Métodos Getters y Setters
    public int getRadio() { return radio; }
    public void setRadio(int radio) { this.radio = radio; }
}
