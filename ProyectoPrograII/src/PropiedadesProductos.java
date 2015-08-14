
import java.text.SimpleDateFormat;
import java.util.Date;

public class PropiedadesProductos {

    protected int ID;
    protected String NombreArticulo;
    protected int Existencia;
    protected double Precio;
    protected String UnidadMedida;
    protected Date FechaExpiracion;
    protected EnumProyecto estado;
    protected int Aceptados;

    public PropiedadesProductos(int ID, String NombreArticulo, int Existencia, double Precio, String UnidadMedida, Date FechaExpiracion) {
        this.ID = ID;
        this.NombreArticulo = NombreArticulo;
        this.Existencia = Existencia;
        this.Precio = Precio;
        this.UnidadMedida = UnidadMedida;
        this.FechaExpiracion = FechaExpiracion;
    }

    protected void setEstado(EnumProyecto estado) {
        this.estado = estado;
    }

    public void Aceptado(){
        if (ID==ID && NombreArticulo.equals(NombreArticulo)){
            
    this.setEstado(EnumProyecto.ACEPTADO);
    ++Aceptados;
        }
    }
    
    public void Rechazados(){
    if (ID==ID && !NombreArticulo.equals(NombreArticulo) ){
    this.setEstado(EnumProyecto.RECHAZADO);
    }
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }
    }

    public String getNombreArticulo() {
        return NombreArticulo;
    }

    public void setNombreArticulo(String NombreArticulo) {
        this.NombreArticulo = NombreArticulo;

    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        if (Existencia>=0){
        this.Existencia = Existencia;
        }
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        if(Precio>50 && Precio<1000000){
        this.Precio = Precio;
        }
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public Date getFechaExpiracion() {
        return FechaExpiracion;
    }

    public void setFechaExpiracion(Date FechaExpiracion) {
        this.FechaExpiracion = FechaExpiracion;
    }
    public static String Fecha(){
    Date fecha = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/YYYY" );
        return DateFormat.format(fecha);
    }
}
