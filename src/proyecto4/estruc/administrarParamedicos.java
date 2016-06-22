/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4.estruc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class administrarParamedicos {
    public administrarParamedicos(String path) {
        archivo=new File(path);
    }

    public ArrayList<Hospital> getListaHospitales() {
        return listaHospitales;
    }

    public void setListaHospitales(ArrayList<Hospital> listaHospitales) {
        this.listaHospitales = listaHospitales;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaHospitales=" + listaHospitales;
    }
    
    
    public void escribirArchivo(){
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw= new FileWriter(archivo,false);
            bw= new BufferedWriter(fw);
            for(Hospital hospital:listaHospitales){
                bw.write(hospital.getNombre()+":");              
                for(int i=0; i<listaHospitales.get(i).getParamedicos().size(); i++){
                    bw.write(hospital.getParamedicos().peek().getNombre()+";");
                    bw.write(hospital.getParamedicos().peek().getEdad()+";");
                    bw.write(hospital.getParamedicos().peek().getIdentidad()+";");
                    bw.write(hospital.getParamedicos().peek().getRanking()+";");
                }
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void cargarArchivo(){
        Scanner input=null;
        listaParamedicos=new ArrayList();
        try {
            input=new Scanner(archivo);
            input.useDelimiter(";");
            while(input.hasNext()){
                /*listaParamedicos.add(new Paramedico(input.next(),input.nextInt()
                        ,input.nextInt(),input.next()));*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            input.close();
        }
    }
    
    public ArrayList<Paramedico> getListaParamedicos() {
        return listaParamedicos;
    }

    public void setListaParamedicos(ArrayList<Paramedico> listaParamedicos) {
        this.listaParamedicos = listaParamedicos;
    }
    
    private ArrayList<Hospital>listaHospitales=new ArrayList();    
    private ArrayList<Paramedico>listaParamedicos=new ArrayList();
    private File archivo=null;
}
