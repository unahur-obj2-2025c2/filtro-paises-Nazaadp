package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAreaMayorA extends Filtro {

    private Integer tamanioASuperar;

    public FiltroAreaMayorA(Integer tamanioASuperar) {
        this.tamanioASuperar = tamanioASuperar;
    }

    @Override
    public Boolean apply(Pais pais) {
        return pais.getArea() > tamanioASuperar;
    }



}
