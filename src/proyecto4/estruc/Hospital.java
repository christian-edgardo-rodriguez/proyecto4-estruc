/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4.estruc;

import java.util.List;

/**
 *
 * @author Christian
 */
public class Hospital {

    public Hospital(String nombre, String direccion, int capParamedicos, int capAmbulancias, char ranking) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capParamedicos = capParamedicos;
        this.capAmbulancias = capAmbulancias;
        this.ranking = ranking;
    }

    public Hospital() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapParamedicos() {
        return capParamedicos;
    }

    public void setCapParamedicos(int capParamedicos) {
        this.capParamedicos = capParamedicos;
    }

    public int getCapAmbulancias() {
        return capAmbulancias;
    }

    public void setCapAmbulancias(int capAmbulancias) {
        this.capAmbulancias = capAmbulancias;
    }

    public char getRanking() {
        return ranking;
    }

    public void setRanking(char ranking) {
        this.ranking = ranking;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    public String nombre, direccion;
    public int capParamedicos, capAmbulancias;
    public char ranking;
    public List<Paramedico> paramedicos;
}
