/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4.estruc;

/**
 *
 * @author Christian
 */
public class Ambulancia {

    public Ambulancia() {
    }

    public Ambulancia(int numero, int año, int velocidadMaxima, String hospital) {
        this.numero = numero;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
        this.hospital = hospital;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Ambulancia #"+ numero;
    }
    
    public int numero, año, velocidadMaxima;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public String hospital;
}
