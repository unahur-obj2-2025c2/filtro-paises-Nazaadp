package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public interface IFIlter {

    Boolean apply(Pais pais);

    IFIlter and (IFIlter filtro);

    IFIlter or (IFIlter filtro);
}
