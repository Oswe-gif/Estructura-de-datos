//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarPrincipioLista(new Libro("El retrato de Dorian Gray","Oscar Wilde", "2342" ));
        lista.insertarFinalLista(new Libro("El principito","Saint", "4535" ));
        lista.insertarPrincipioLista(new Libro("Grandes esperanzas","Charles Dickens", "3253" ));

        System.out.println(lista.obtenerLibro(0));
        System.out.println(lista.obtenerLibro(1));
        System.out.println(lista.obtenerLibro(2));
    }
}