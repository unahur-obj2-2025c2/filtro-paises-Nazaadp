package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPoblacionMenorA extends Filtro {

    private Integer poblacionMax;

    

    public FiltroPoblacionMenorA(Integer poblacionMax) {
        this.poblacionMax = poblacionMax;
    }



    @Override
    public Boolean apply(Pais pais) {
        return pais.getPoblacion() < poblacionMax;
    }

}
