package ex.tecnm.itoaxaca.examen.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "alumno")
public class ICAModel implements Serializable{
    @Id
    @Column
    private String numControl;
    private char genero;
    private double medidaCintura;
    private double medidaAltura;
    

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaAltura() {
        return medidaAltura;
    }

    public void setMedidaAltura(double medidaAltura) {
        this.medidaAltura = medidaAltura;
    }

    
    
    
}
