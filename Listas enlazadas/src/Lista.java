public class Lista {

    private  Nodo cabeza =null;
    private int longitud=0;
    private class Nodo {
        public Libro libro = null;
        public Nodo siguiente;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    public void insertarPrincipioLista(Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinalLista(Libro libro){
        Nodo nodo = new Nodo(libro);
        if(cabeza==null){
            cabeza=nodo;
        }
        else{
            Nodo puntero = cabeza;
            while (puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente =nodo;
        }
        longitud++;

    }

    public void insertarDespuesLista(int n, Libro libro){
        Nodo nodo = new Nodo(libro);
        if(cabeza==null){
            cabeza=nodo;
        }
        else{
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;//conectar por la derecha
            puntero.siguiente =nodo;//conectar por la izquierda

        }
        longitud++;
    }

    public Libro obtenerLibro(int n){
        if (cabeza==null){
            return null;
        }
        else{
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            if(contador != n){
                return null;
            }
            else {
                return puntero.libro;
            }
        }

    }
    public int getLongitud(){
        return longitud;
    }
    public void eliminarPrincipioLista(){
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }

    }
    public void eliminarUltimoElemento(){
        if (cabeza != null){
            if (cabeza.siguiente == null){
                cabeza = null;
            }
            else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null){
                    puntero = puntero.siguiente;
                }
                puntero.siguiente=null;
                longitud--;
            }

        }
    }
    public void eliminarElemento(int n){
        if (cabeza !=null){
            if (n==0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
            }
            else if (n < longitud){
                Nodo puntero = cabeza;
                int contador =0;
                while (contador < (n-1)){
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }

        }
    }

}
