package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroOr extends FiltroCompuesto {

    public FiltroOr(IFIlter filtro, IFIlter nuevo) {
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroOr(List<IFIlter> filtrosLista) {
        filtros.addAll(filtros);
    }

    @Override
    public Boolean apply(Pais pais) {
        return filtros.stream().anyMatch(filtro -> filtro.apply(pais));
    }

    @Override
    public IFIlter and(IFIlter filtro) {
        return new FiltroOr(this, filtro);
    }

    
    
}
