package ar.edu.unahur.obj2.Viajero;

import java.util.List;

import ar.edu.unahur.obj2.filters.FiltroPoblacionMenorA;
import ar.edu.unahur.obj2.filters.FiltroPorNombre;
import ar.edu.unahur.obj2.filters.IFIlter;
import ar.edu.unahur.obj2.model.Pais;

public class Culturales extends Viajero {

    public Culturales(List<String> idiomas, Pais nacionalidad) {
        super(idiomas, nacionalidad);
    }

    @Override
    public List<Pais> evaluarCondiciones(List<Pais> paises) {
        IFIlter filtros = new FiltroPoblacionMenorA(nacionalidad.getPoblacion());
    }
    
}
