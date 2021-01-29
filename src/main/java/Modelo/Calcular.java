
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Piscis Xalock
 */
public class Calcular {
    private String fechaEntrada, fechaSalida, tipo;
    private double precio, numDias;
    private double iva = 0.21;

    public Calcular() {
    }

    public Calcular(String fechaEntrada, String fechaSalida, String tipo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipo = tipo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getTipo() {
        return tipo;
    }
    
    public double getDias(){
        //Probar Split directamente sin el pattern ni nada y volver a poner en double
        Date date = new Date();
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        
        
        fechaEntrada = df.format(date);
        fechaSalida = df.format(date);
        
        String[] aFechaIng = fechaEntrada.split("/");
        
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer yearInicio = Integer.parseInt(aFechaIng[2]);
        
        
        String[] aFecha = fechaSalida.split("/");
        
        Integer diaFinal = Integer.parseInt(aFecha[0]);
        Integer mesFinal = Integer.parseInt(aFecha[1]);
        Integer yearFinal = Integer.parseInt(aFecha[2]);
        
        
        
        
        return numDias = Integer.parseInt(fechaSalida) - Integer.parseInt(fechaEntrada);
    }
    
    public double getImporte(){
        
        if(this.tipo.equals("normal")){
            precio = 50;
            return ((precio * numDias) + iva);
            
        } else 
            
         if(this.tipo.equals("superior")){
            precio = 75;
            
            return ((precio * numDias) + iva);
        }
        
            return 0;
    }
    
}