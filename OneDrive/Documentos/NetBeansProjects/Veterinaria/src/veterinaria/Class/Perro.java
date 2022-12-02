
package veterinaria.Class;

public class Perro extends Animal{
    private int altura;
    private String raza;

public Perro(int altura, String raza, int chip, String nombre, String color, boolean castrado) {
    super(chip, nombre, color, castrado);
    this.altura = altura;
    this.raza = raza;
    }

public Perro() {
    super();
    this.altura = 0;
    this.raza = "";
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    

}
