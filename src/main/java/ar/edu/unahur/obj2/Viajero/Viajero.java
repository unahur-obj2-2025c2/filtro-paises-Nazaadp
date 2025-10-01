package ar.edu.unahur.obj2.Viajero;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public abstract class Viajero {

    protected List<String> idiomas;
    protected Pais nacionalidad;
    protected List<Pais> paisesAVisitar;

    public Viajero(List<String> idiomas, Pais nacionalidad) {
        this.idiomas = idiomas;
        this.nacionalidad = nacionalidad;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public abstract List<Pais> evaluarCondiciones(List<Pais> paises);

}
