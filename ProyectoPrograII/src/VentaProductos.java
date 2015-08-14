
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioC
 */
public class VentaProductos extends PropiedadesProductos {

    public VentaProductos(int ID, String NombreArticulo, int Existencia, double Precio, String UnidadMedida, Date FechaExpiracion) {
        super(ID, NombreArticulo, Existencia, Precio, UnidadMedida, FechaExpiracion);
    }
    
}
