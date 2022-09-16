
package prueba.Plataforma;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
public class Usuarios {
    
    private int ID;
    private String NombreUsuario;
    private String Email;
    private String Contraseña;
    private String NombreCompleto;
    private int Rut;
    private char DigitoVerificador;
    private Date FechaNacimiento;
    private int Telefono;
    
    public Usuarios() {
        this.ID=0;
        this.NombreCompleto="";
        this.Rut=0;
        this.DigitoVerificador=0;
        this.FechaNacimiento=new Date();
        this.Telefono=0;
        this.NombreUsuario= "";
        this.Email="";
        this.Contraseña="";
        }

    public Usuarios(int ID, String NombreUsuario, String Email, String Contraseña, String NombreCompleto, int Rut, char DigitoVerificador, Date FechaNacimiento, int Telefono) {
        this.ID = ID;
        this.NombreUsuario = NombreUsuario;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.DigitoVerificador = DigitoVerificador;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if (NombreUsuario.length()>=4);
            this.NombreUsuario = NombreUsuario;
    }

    public String getEmail() {
        
        
        return Email;
    }

    public void setEmail(String Email) {
        
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public char getDigitoVerificador() {
        return DigitoVerificador;
    }

    public void setDigitoVerificador(char DigitoVerificador) {
        this.DigitoVerificador = DigitoVerificador;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        if(Telefono>9999999)
            this.Telefono = Telefono;
    }
    Scanner sc = new Scanner(System.in);

 


  
}

    