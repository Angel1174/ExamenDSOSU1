/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.tecnm.itoaxaca.examen.utils;

import org.springframework.stereotype.Component;

/**
 *
 * @author angel
 */
@Component
public class CalculoIca {
    private double ica;
    private String nivel;

    public double getIca() {
        return ica;
    }

    public void setIca(double ica) {
        this.ica = ica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void calcularICA(double medidaCintura, double medidaAltura, char genero){
        ica=medidaCintura/medidaAltura;
        ObtenerNivel(genero);
        
    }
    public void ObtenerNivel(char genero){
          
        switch (genero) {
            case 'H':
                if (ica < 0.34) {
                    nivel = "Delgadez Severa";
                }
                else if (ica >= 0.35 && ica <= 0.42) {
                    nivel = "Delgadez Leve";
                }
                else if (ica >= 0.43 && ica <= 0.52) {
                    nivel = "Peso Normal";
                }
                else if (ica >= 0.53 && ica <= 0.57) {
                    nivel = "SobrePeso";
                }
                else if (ica >= 0.58 && ica <= 0.62) {
                    nivel = "SobrePeso Elevado";
                }
                else {
                    nivel = "Odesidad morbida";
                }
                break;
            case 'M':
                if (ica <= 0.34) {
                    nivel = "Delgadez Severa";
                }
                else if (ica >= 0.35 && ica <= 0.41) {
                    nivel = "Delgadez Leve";
                }
                else if (ica >= 0.42 && ica <= 0.48) {
                    nivel = "Peso Normal";
                }
                else if (ica >= 0.49 && ica <= 0.53) {
                    nivel = "SobrePeso";
                }
                else if (ica >= 0.54 && ica <= 0.57) {
                    nivel = "SobrePeso Elevado";
                }
                else  {
                    nivel = "Odesidad morbida";
                }
                break;
        }
       
    }
   }

