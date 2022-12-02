
package veterinaria.Class;

public class Gato extends Animal{
    private String colorOjos;
    private boolean poseeManchas;

public Gato(String colorOjos, boolean poseeManchas, int chip, String nombre, String color, boolean castrado) {
    super(chip, nombre, color, castrado);
    this.colorOjos = colorOjos;
    this.poseeManchas = poseeManchas;
    }
public Gato(){
    super();
    this.colorOjos = "";
    this.poseeManchas = false;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public boolean isPoseeManchas() {
        return poseeManchas;
    }

    public void setPoseeManchas(boolean poseeManchas) {
        this.poseeManchas = poseeManchas;
    }

}
