package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorNombre extends Filtro{

    private String prefijo;

    

    public FiltroPorNombre(String prefijo) {
        this.prefijo = prefijo;
    }



    @Override
    public Boolean apply(Pais pais) {
        return pais.getNombre().startsWith(prefijo);
    }

}
