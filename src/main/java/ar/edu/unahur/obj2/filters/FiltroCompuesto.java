package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroCompuesto implements IFIlter {

    protected List<IFIlter> filtros = new ArrayList<>();

    public void agregarFiltro(IFIlter filtro) {
        filtros.add(filtro);
    }

    @Override
    public IFIlter and(IFIlter filtro) {
        filtros.add(filtro);
        return this;
    }

    @Override
    public IFIlter or(IFIlter filtro) {
        filtros.add(filtro);
        return this;
    }

    
    
}
