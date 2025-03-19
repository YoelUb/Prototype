package com.Patrones.prototype;

public class Rectangulo extends Forma {
    private int ancho;
    private int alto;

    public Rectangulo() {}

    public Rectangulo(Rectangulo source) {
        super(source);
        this.ancho = source.ancho;
        this.alto = source.alto;
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this);
    }

    // Métodos Getters y Setters
    public int getAncho() { return ancho; }
    public void setAncho(int ancho) { this.ancho = ancho; }

    public int getAlto() { return alto; }
    public void setAlto(int alto) { this.alto = alto; }
}

