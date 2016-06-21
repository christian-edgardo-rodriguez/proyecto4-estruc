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
public class Paramedico implements Comparable<Paramedico> {

    public Paramedico() {
    }

    public Paramedico(String nombre, int edad, int identidad, Ranking ranking) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.ranking = ranking;
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

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public int compareTo(Paramedico otro) {	 
        return this.ranking.compareTo(otro.ranking);	 
    }

    public String nombre;
    public int edad, identidad; 
    public Ranking ranking;
}
