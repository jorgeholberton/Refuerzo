package co.edu.unab.api.controllers;

//import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api.models.ClienteModel;
import co.edu.unab.api.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/cliente")

public class ClienteController 
{
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return  clienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
        
        return clienteService.guardarCliente(cliente);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarClientePorId(@PathVariable("id") String id){
        boolean resultadoEliminar=this.clienteService.eliminarCliente(id);
        if (resultadoEliminar){
            return "Se eliminó el usuario con id: "+id;
        }else{
            return "No se pudo eliminar el usuario con el id: "+id;
        }
    }
    
    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id") String id){
        return this.clienteService.obtenerClientePorId(id);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ClienteModel>clientePorNombre(@PathVariable("nombre") String nombre){
        return clienteService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/nomb/{nombre}/{apellido}")
    public ArrayList<ClienteModel>clientesPorNombreApellido(@PathVariable("nombre") String nombre,@PathVariable("apellido") String apellido){
        return clienteService.obtenerPorNombreApellido(nombre,apellido);
    }




    @GetMapping(path = "/address/{ciudad}/{departamento}")
    public ArrayList<ClienteModel>clientePorAddress(@PathVariable("ciudad") String ciudad, @PathVariable("departamento") String departamento)
    {
        return clienteService.obtenerClientePorCiudadDepartamento(ciudad,departamento);
    }

    @GetMapping(path ="/puntos/{puntos}")
    public ArrayList<ClienteModel>clientePorMayorIgualPuntos(@PathVariable("puntos") Long puntos) 
    {
        return clienteService.obtenerClientesMayorIgualPuntos(puntos);
    }

    @GetMapping(path ="/pto/{puntos}")
    public ArrayList<ClienteModel>clientePorMenorIgualPuntos(@PathVariable("puntos") Long puntos) 
    {
        return clienteService.obtenerClientesMenorIgualPuntos(puntos);
    }

   /* @GetMapping(path ="/fecha/{fecha}")
    public ArrayList<ClienteModel>clientePorFecha(@PathVariable("fecha") String fecha(Date fecha) 
    {
        return clienteService.obtenerPorFechas(fecha);
    }*/



    

  
}