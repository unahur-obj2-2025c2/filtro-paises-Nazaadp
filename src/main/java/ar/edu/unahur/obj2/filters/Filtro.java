package ar.edu.unahur.obj2.filters;

public abstract class Filtro implements IFIlter {

    @Override
    public IFIlter and(IFIlter filtro) {
        return new FiltroAnd(this, filtro);
    }

    @Override
    public IFIlter or(IFIlter filtro) {
        return new FiltroAnd(this, filtro);
    }

}
