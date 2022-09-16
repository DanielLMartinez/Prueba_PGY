
package prueba.Plataforma;
import java.util.Date;
import prueba.Plataforma.Usuarios;
import prueba.Plataforma.ClubesDeportivos;
public class SuscripcionClubUsuario extends Usuarios {
    private Date FchaInicio;
    private int Numero;
    private Usuarios Usuario;
    private int AbonoTotal;
    private String Equipos;
    
    public SuscripcionClubUsuario(){
        this.Numero=0;
        this.FchaInicio=new Date();
        this.Usuario=new Usuarios();
        this.AbonoTotal=0;
        this.Equipos="";
    }

    public SuscripcionClubUsuario(Date FchaInicio, int Numero, Usuarios Usuario, int AbonoTotal, String Equipos) {
        this.FchaInicio = FchaInicio;
        this.Numero = Numero;
        this.Usuario = Usuario;
        this.AbonoTotal = AbonoTotal;
        this.Equipos = Equipos;
    }

    public Date getFchaInicio() {
        return FchaInicio;
    }

    public void setFchaInicio(Date FchaInicio) {
        this.FchaInicio = FchaInicio;
    }

    public int getNumero() {
        
        return Numero;
    }

    public void setNumero(int Numero) {
        if(Numero>=0)
        this.Numero = Numero;
    }

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios Usuario) {
        this.Usuario = Usuario;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        if(AbonoTotal>=0)
            this.AbonoTotal = AbonoTotal;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }

    
    
}

    