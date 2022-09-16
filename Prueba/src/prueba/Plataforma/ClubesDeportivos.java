
package prueba.Plataforma;
import java.util.Date;
import java.util.Scanner;
public class ClubesDeportivos {
    
    private String Codigo;
    private String Nombre;
    private String NombreFundador;
    private Date AñoFundacion;
    private String PaisOrigen;
    private String Lema;
    private int ValorSuscripcion;
    private String Colores;
    
    
    public ClubesDeportivos(){
        this.Codigo="";
        this.Nombre="";
        this.NombreFundador="";
        this.AñoFundacion=new Date();
        this.PaisOrigen="";
        this.Lema="";
        this.ValorSuscripcion=0;
        this.Colores="";
        
      }

    public ClubesDeportivos(String Codigo, String Nombre, String NombreFundador, Date AñoFundacion, String PaisOrigen, String Lema, int ValorSuscripcion, String Colores) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.NombreFundador = NombreFundador;
        this.AñoFundacion = AñoFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.ValorSuscripcion = ValorSuscripcion;
        this.Colores = Colores;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        
        
        
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(Date AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        if(ValorSuscripcion>=0)
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
    Scanner sc = new Scanner(System.in);
    
}

    