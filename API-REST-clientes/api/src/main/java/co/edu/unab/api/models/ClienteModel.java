package co.edu.unab.api.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fRegistro;
    private Long puntos;
    private AddressModel address;
    private List<ProductModel> productos;

    public ClienteModel() {
    }

   

    public ClienteModel(String id, String nombre, String apellido, String telefono, LocalDate fRegistro, Long puntos,
            AddressModel address, List<ProductModel> productos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fRegistro = fRegistro;
        this.puntos = puntos;
        this.address = address;
        this.productos = productos;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(LocalDate fRegistro) {
        this.fRegistro = fRegistro;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public List<ProductModel> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductModel> productos) {
        this.productos = productos;
    }



    public Long getPuntos() {
        return puntos;
    }



    public void setPuntos(Long puntos) {
        this.puntos = puntos;
    }
    
    
     
   
    
    
}

