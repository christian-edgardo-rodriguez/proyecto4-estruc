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
public class Paramedico {

    public Paramedico() {
    }

    public Paramedico(String nombre, int edad, int identidad, char ranking, Hospital hospital) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.ranking = ranking;
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public char getRanking() {
        return ranking;
    }

    public void setRanking(char ranking) {
        this.ranking = ranking;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public String nombre;
    public int edad, identidad;
    public char ranking;
    public Hospital hospital;
}
