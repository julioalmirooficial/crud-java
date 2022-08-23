package Modelo;

public class Trabajador {
    private float sueldo ;
    private boolean seguro;
    public Trabajador(){}

    public Trabajador(float sueldo, boolean seguro) {
        this.sueldo = sueldo;
        this.seguro = seguro;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    
}
