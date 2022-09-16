
package prueba;
import prueba.Plataforma.Usuarios;
import prueba.Plataforma.ClubesDeportivos;
import prueba.Plataforma.SuscripcionClubUsuario;
import prueba.Plataforma.Usuarios;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        
        Usuarios Usuario1= new Usuarios();
        int correlativoU=0;
        
        Usuario1.setNombreCompleto("Daniel Martinez");
        Usuario1.setRut(20975750);
        Usuario1.setDigitoVerificador('8');
        Usuario1.setEmail("danie.martinezf@gmail.com");
        Usuario1.setNombreUsuario("Danie.martinezf");
        Usuario1.setTelefono(9100372);
        Usuario1.setContraseña("Dan16perro");
        
        
        Usuarios Usuario2 = new Usuarios();
        
        Usuario2.setNombreCompleto("Edward Elric");
        Usuario2.setRut(22999745);
        Usuario2.setDigitoVerificador('1');
        Usuario2.setEmail("EdwardElric@gmail.com");
        Usuario2.setNombreUsuario("Edward-kun");
        Usuario2.setTelefono(9999967);
        Usuario2.setContraseña("124edawrd");
        
        
        Usuarios Usuario3 = new Usuarios();
        System.out.println("Ingresando Usuario....");
        Usuario3.setNombreCompleto("Shinozuke");
        Usuario3.setRut(21345647);
        Usuario3.setDigitoVerificador('9');
        Usuario3.setEmail("shinsgan@gmail.com");
        Usuario3.setNombreUsuario("Shin-Chan");
        Usuario3.setTelefono(9578967);
        Usuario3.setContraseña("SIno1313");
        
        
        System.out.println("Generando Usuario");
        System.out.println("====================");
        System.out.println("ID:"+(++correlativoU));
        System.out.println("Nombre \nUsuario:"+Usuario1.getNombreUsuario());
        System.out.println("Email:"+Usuario1.getEmail());
        System.out.println("Contraseña:"+Usuario1.getContraseña());
        
        
        
        System.out.println("====================");
        System.out.println("ID:"+(++correlativoU));
        System.out.println("Nombre \nUsuario:"+Usuario2.getNombreUsuario());
        System.out.println("Email:"+Usuario2.getEmail());
        System.out.println("Contraseña:"+Usuario2.getContraseña());
        
        
        
        System.out.println("====================");
        System.out.println("ID:"+(++correlativoU));
        System.out.println("Nombre \nUsuario:"+Usuario3.getNombreUsuario());
        System.out.println("Email:"+Usuario3.getEmail());
        System.out.println("Contraseña:"+Usuario3.getContraseña());
        
        
        ClubesDeportivos Cd1 = new ClubesDeportivos();
        
        Cd1.setCodigo("ARH11");
        Cd1.setNombre("Arsenal de coquimbo");
        Cd1.setNombreFundador("Don Arsenal");
        Cd1.setPaisOrigen("Chile");
        Cd1.setLema("Cañones a los Puertos");
        Cd1.setValorSuscripcion(10050);
        Cd1.setColores("Amarillo,Rojo");
        
        ClubesDeportivos Cd2 = new ClubesDeportivos();
        
        Cd2.setCodigo("MCH12");
        Cd2.setNombre("Manquehue City");
        Cd2.setNombreFundador("DR.simi");
        Cd2.setPaisOrigen("Chile");
        Cd2.setLema("Vivir y Fuerza");
        Cd2.setValorSuscripcion(15100);
        Cd2.setColores("Celeste, Blanco");
        
        ClubesDeportivos Cd3 = new ClubesDeportivos();
        
        Cd3.setCodigo("LCH13");
        Cd3.setNombre("Los Cóndores Unidos");
        Cd3.setNombreFundador("Falcon");
        Cd3.setPaisOrigen("Chile");
        Cd3.setLema("Desde lo alto al sol");
        Cd3.setValorSuscripcion(13200);
        Cd3.setColores("Amarillo, Naranjo");
        System.out.println("Ingresando Club....");
        System.out.println("Generando Reporte de Clubes....");
        System.out.println("====================");
        System.out.println("Codigo:"+Cd1.getCodigo());
        System.out.println("Nombre:"+Cd1.getNombre());
        System.out.println("Lema:"+Cd1.getLema());
        System.out.println("Valor Suscripcion:"+"$"+Cd1.getValorSuscripcion());
        System.out.println("Colores:"+Cd1.getColores());
        
         
        System.out.println("====================");
        System.out.println("Codigo:"+Cd2.getCodigo());
        System.out.println("Nombre:"+Cd2.getNombre());
        System.out.println("Lema:"+Cd2.getLema());
        System.out.println("Valor Suscripcion:"+"$"+Cd2.getValorSuscripcion());
        System.out.println("Colores:"+Cd2.getColores());
        
        System.out.println("====================");
        System.out.println("Codigo:"+Cd3.getCodigo());
        System.out.println("Nombre:"+Cd3.getNombre());
        System.out.println("Lema:"+Cd3.getLema());
        System.out.println("Valor Suscripcion:"+"$"+Cd3.getValorSuscripcion());
        System.out.println("Colores:"+Cd3.getColores());
        
        
        
        SuscripcionClubUsuario Scu1= new SuscripcionClubUsuario();
        int CorrelativoS=1000;
        CorrelativoS=CorrelativoS+10;
        
        Scu1.setNumero(CorrelativoS);
        Scu1.setUsuario(Usuario1);
        Scu1.setAbonoTotal(25150);
        Scu1.setEquipos("ARH11 $10.050;MCH12 $15.100");
        
        
        SuscripcionClubUsuario Scu2= new SuscripcionClubUsuario();
        
        CorrelativoS=CorrelativoS+10;
        Scu2.setNumero(CorrelativoS);
        Scu2.setUsuario(Usuario2);
        Scu2.setAbonoTotal(13200);
        Scu2.setEquipos("LCH13 $13.200");
        
        SuscripcionClubUsuario Scu3= new SuscripcionClubUsuario();
        
        System.out.println("Ingresando Suscripcion...");
        CorrelativoS=CorrelativoS+10;
        Scu3.setNumero(CorrelativoS);
        Scu3.setUsuario(Usuario3);
        Scu3.setAbonoTotal(18300);
        Scu3.setEquipos("LCH13 $13.200; MCH12$15.100");
        
        
        System.out.println("Generando Reportes De SUSCRPCIONES.....");
        System.out.println("=====================");
        System.out.println("Numero:"+Scu1.getNumero());
        System.out.println("Usuario:"+Scu1.getUsuario());
        System.out.println("Abono Total:"+Scu1.getAbonoTotal());
        System.out.println("Equipos:"+Scu1.getEquipos());
        //se que habia un modo en donde este error se solucionaba pero mi mente no hace click ;C
        
        
        System.out.println("=====================");
        System.out.println("Numero:"+Scu2.getNumero());
        System.out.println("Usuario:"+Scu2.getUsuario());
        System.out.println("Abono Total:"+Scu2.getAbonoTotal());
        System.out.println("Equipos:"+Scu2.getEquipos());
   
        
        System.out.println("=====================");
        System.out.println("Numero:"+Scu3.getNumero());
        System.out.println("Usuario:"+Scu3.getUsuario());
        System.out.println("Abono Total:"+Scu3.getAbonoTotal());
        System.out.println("Equipos:"+Scu3.getEquipos());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
    }
    
}
