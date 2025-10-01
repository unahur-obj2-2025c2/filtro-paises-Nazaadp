package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

    public FiltroAnd(IFIlter filtro, IFIlter nuevo) {
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroAnd(List<IFIlter> filtrosLista) {
        filtros.addAll(filtros);
    }

    @Override
    public Boolean apply(Pais pais) {
        return filtros.stream().allMatch(filtro -> filtro.apply(pais));
    }

    @Override
    public IFIlter or(IFIlter filtro) {
        return new FiltroAnd(this, filtro);
    }

    
    
}
