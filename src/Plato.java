import java.util.ArrayList;

public class Plato {
    private String nombre;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean isEsBebida() {
        return esBebida;
    }
    
    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }
    
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
