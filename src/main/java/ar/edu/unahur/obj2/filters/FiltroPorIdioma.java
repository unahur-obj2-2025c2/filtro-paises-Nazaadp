package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorIdioma extends Filtro {

    private String idioma;

    

    public FiltroPorIdioma(String idioma) {
        this.idioma = idioma;
    }



    @Override
    public Boolean apply(Pais pais){
        return pais.getIdiomas().contains(idioma);
    }
    
}
