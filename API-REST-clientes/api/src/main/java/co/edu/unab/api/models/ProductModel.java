package co.edu.unab.api.models;

public class ProductModel {
    private String nombre;
    private int cantidad;
    private int price;

    
    public ProductModel() {
    }


    public ProductModel(String nombre, int cantidad, int price) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.price = price;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    

}
