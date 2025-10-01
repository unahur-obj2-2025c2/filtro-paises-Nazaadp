package ar.edu.unahur.obj2.filters;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;


public class FiltroTest {

    List<Pais> paises;

    @BeforeEach
    void setUp() {
        IPaisService paisService = new PaisService();
        paises = paisService.getPaises();
    }

    @Test
	void FiltroAreaMayorA() {
		IFIlter areaMayorAUnMillon = new FiltroAreaMayorA(1000000);
        List<Pais> paisesGrandes = paises.stream().filter(p -> areaMayorAUnMillon.apply(p)).collect(Collectors.toList());
        paisesGrandes.stream().forEach(p -> System.out.println( p.toString() ));
    }

    @Test
    void FiltroPorIdioma() {
        IFIlter hablanEspanol = new FiltroPorIdioma("Spanish");
        List<Pais> paisesHablanEspaniol = paises.stream().filter(p -> hablanEspanol.apply(p)).collect(Collectors.toList());
        paisesHablanEspaniol.stream().forEach(p -> System.out.println( p.toString() ));
    }

    @Test
    void FiltroPorIdiomaYPorArea() {
        IFIlter enEspanolYAmplio = new FiltroPorIdioma("Spanish").and(new FiltroAreaMayorA(1000000));
        List<Pais> paisesHablanEspaniolYGrande = paises.stream().filter(p -> enEspanolYAmplio.apply(p)).collect(Collectors.toList());
        paisesHablanEspaniolYGrande.stream().forEach(p -> System.out.println( p.toString() ));
    }

    @Test
    void FiltroExtenso() {
        IFIlter filtros = new FiltroPorIdioma("English").and(new FiltroAreaMayorA(100000)).or(new FiltroPorIslas());
        List<Pais> paisesFiltrados = paises.stream().filter(p -> filtros.apply(p)).collect(Collectors.toList());
        paisesFiltrados.stream().forEach(p -> System.out.println( p.toString() ));
    }
}
