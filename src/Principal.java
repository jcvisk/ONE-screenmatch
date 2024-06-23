import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempos;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Encanto");
        pelicula.setFechaDeLanzamiento(2021);
        pelicula.setDuracionEnMinutos(120);
        pelicula.evalua(10);
        pelicula.evalua(10);
        pelicula.muestraFichaTecnica();

        System.out.println(" ================================= ");

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Matrix");
        pelicula2.setFechaDeLanzamiento(2021);
        pelicula2.setDuracionEnMinutos(120);
        pelicula2.evalua(10);
        pelicula2.evalua(10);
        pelicula2.muestraFichaTecnica();

        System.out.println(" ================================= ");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodisoPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setTotalVisualizaciones(50);
        episodio.setSerie(casaDragon);

        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos();
        calculadora.incluye(pelicula);
        calculadora.incluye(pelicula2);
        calculadora.incluye(casaDragon);
        System.out.println("calculadora.getTiempoTotal() = " + calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(pelicula);
        filtroRecomendacion.filtro(episodio);

    }
}
