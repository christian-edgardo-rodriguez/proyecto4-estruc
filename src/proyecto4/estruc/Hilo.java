/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4.estruc;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Hilo implements Runnable {
    public Hospital hospital;
    public double tiempo;
    public Paramedico doctor1;
    public Paramedico doctor2;
    public Paramedico doctor3;
    public Ambulancia ambulancia;
    
    public Hilo() {
    }

    public Hilo(Hospital hospital, double tiempo, Paramedico doctor1, Paramedico doctor2, Paramedico doctor3, Ambulancia ambulancia) {
        this.tiempo = tiempo;
        this.doctor1 = doctor1;
        this.doctor2 = doctor2;
        this.doctor3 = doctor3;
        this.ambulancia = ambulancia;
        this.hospital = hospital;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "La ambulancia:\n " + ambulancia.getNumero()
                + "va en camino! \nParamedicos: \n" + doctor1.toString() + "\n " + doctor2.toString() 
                + "\n " + doctor3.toString()
                + "\n del Hospital: \n" + hospital.getNombre());
        try {
            Thread.sleep((long) tiempo * 10000);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Finalizado");
        hospital.getAmbulancias().add(ambulancia);
        hospital.getParamedicos().add(doctor1);
        hospital.getParamedicos().add(doctor2);
        hospital.getParamedicos().add(doctor3);

    }
}
