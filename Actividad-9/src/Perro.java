
public class Perro {

    private String nombre, raza, comida;
    private int edad;
    private double peso, cantidadComida;

    public void setNombre(String nombre ){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza (String raza ){
        this.raza=raza;
    }

    public String getRaza () {
        return raza;
    }

    public void setEdad (int edad ){
        this.edad=edad;
    }

    public int getEdad () {
        return edad;
    }

    public void setPeso (double peso ){
        this.peso=peso;
    }

    public double getPeso () {
        return peso;
    }

    public void setComida (String comida) {
        this.comida = comida;
    }

    public String getComida () {
        return comida;
    }

    public void setCantidadComida (double cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public double getCantidadComida () {
        return cantidadComida;
    }

    public void comer(String comida, double cantidadComida) {
        System.out.println("está comiendo " + cantidadComida + " gramos de " + comida);
    }

    public String ladrar () {
        return "Guau Guau";
    }

}
