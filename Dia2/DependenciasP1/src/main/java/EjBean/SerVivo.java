package EjBean;

public interface SerVivo {
    //Un "Bean" en el contexto del framework Spring se define como un objeto administrado,
    // creado y controlado por el contenedor de Spring. Estos objetos son utilizados para
    // encapsular y proveer servicios, utilidades y funcionalidades a otros componentes
    // dentro de una aplicación. En Spring Boot se usa la anotación "@Bean" declarar un
    // método como un bean. Este método debe retornar un objeto que se desea registrar
    //  como un bean en el contenedor de Spring y este último se encargará entonces de
    //  gestionar el ciclo de vida y de inyectarlo en otros componentes según sea necesario.
    String caminar();
}
