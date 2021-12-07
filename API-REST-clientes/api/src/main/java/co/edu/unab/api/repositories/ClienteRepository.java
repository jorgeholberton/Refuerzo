package co.edu.unab.api.repositories;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unab.api.models.ClienteModel;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteModel , String> 
{
    ArrayList<ClienteModel>findByNombre(String nombre);

    @Query(value="{'nombre':?0,'apellido':?1}",fields="{'nombre':1,'apellido':1}")
    ArrayList<ClienteModel>clientesPorNombreApellido(String nombre,String apellido);

  // ArrayList<ClienteModel>findByFirstNameAndLastName(String search);

    @Query(value="{'address.ciudad':?0,'address.departamento':?1}",fields="{'nombre':1,'apellido':1}")
    ArrayList<ClienteModel>clientesPorCiudad(String ciudad,String departamento);
    
   
   
    ArrayList<ClienteModel>findByPuntosGreaterThanEqual(Long puntos);//con palabras reservadas
   
    ArrayList<ClienteModel>findByPuntosLessThanEqual(Long puntos);

   /* @Query("{'puntos':{$lte:?0}}")
    ArrayList<ClienteModel>clientesMenorIgualPuntos(Long puntos);//con querys*/

    ArrayList<ClienteModel>findByFRegistroAfter(Date fecha);

}

