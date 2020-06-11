package ejercicio_8;

import java.util.ArrayList;

/**
 *
 * @author Cata
 */
public class MiColeccion {
    ArrayList<Integer> Coleccion = new ArrayList<Integer>();
    
    //Constructor
    public MiColeccion() {
    }
 
    //Insertar elementos (al inicio, al final).
    public void insertarAlFinal(int valor){
        Coleccion.add(valor);
    }
    
    public void insertarAlPrincipio(int valor){
        Coleccion.add(0, valor);
    }
    
    //Mostrar el contenido del arreglo. 
    public void mostrarElementos(){
        System.out.println(Coleccion);
    }
    
    //Eliminar elementos.
    public void eliminarElemento(int posicion){
        Coleccion.remove(posicion);
    }
    
    //Obtener el valor de una posición determinada. 
    public int getValor(int posicion){
        int valor=Coleccion.get(posicion);
        //System.out.println(valor);
        return valor;
    }
    
    //Asignar valor a una posición determinada. CATA
    public void insertarValorEn(int posicion,int valor){
        Coleccion.add(posicion, valor);
    }
    
    //Calcular la sumatoria de los valores de todos los elementos. JOSE
    public int sumatoria() {
        int sumatoria=0;
        for(int i=0; i<Coleccion.size(); i++) {
            sumatoria = sumatoria + Coleccion.get(i);
        }
        return sumatoria;
    }
		
    //Calcular el promedio de los valores de todos los elementos. FABIAN
    public double promedio(){
        double promedio=0;
        for(int i=0; i<Coleccion.size(); i++) {
            promedio = promedio + Coleccion.get(i);
        }
        promedio = promedio/ Coleccion.size();
  
        return promedio;            
    }
    
    //Obtener el número de elementos. GONZALO
    public int cuentaElementos(){
        return Coleccion.size();
    }
    
    //Contar el número de valores igual a cero (0). JAVIER
    public int sumaCeros(){
        int ceros=0;
        for( int i = 0; i < Coleccion.size();i++){
            if(Coleccion.get(i)==0){
                ceros++;
            }
        }
        return ceros;
    }
    
    //Calcular la suma de los pares. JOSE
    public int sumaPar() {
        int sumatoriaPar = 0;
        for(int i=0; i < Coleccion.size(); i++) {
            if((Coleccion.get(i)%2)==0) {
                sumatoriaPar += Coleccion.get(i);
            }
        }
        return sumatoriaPar;
    }
    
    //Calcular cantidad de numeros pares
    public int cantidadPar() {
        int sumatoriaPar = 0;
        for(int i=0; i < Coleccion.size(); i++) {
            if((Coleccion.get(i)%2)==0) {
                sumatoriaPar++;
            }
        }
        return sumatoriaPar;
    }
    
    //Contar el número de repeticiones dado un número. FABIAN
    public int cuentaRepeticiones(int valor){
        int cantidad=0;
        for(int i=0; i < Coleccion.size(); i++) {
            if(Coleccion.get(i) == valor) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    //Modificar el valor de una posición por otro valor suministrado. GONZALO
    public void setValor(int posicion, int nuevoValor){
        Coleccion.set(posicion, nuevoValor);
    }
    
    //Cambiar todo el contenido. JAVIER
    public void reemplazarTodo(ArrayList a){
        Coleccion.clear();
        Coleccion.addAll(a);
    }
    
    //Invertir el arreglo. JOSE
    public void invertirColeccion() {
        int cantidad = Coleccion.size();
        int valores[] = new int[cantidad];
        int i=0;

        for(i=0; i<Coleccion.size(); i++) {
            valores[i]=Coleccion.get(i);
        }

        for(i=0; i<Coleccion.size(); i++) {
            cantidad--;
            Coleccion.set(i,valores[cantidad]);
        }
        System.out.println(Coleccion);
    }
    
    public ArrayList invertir(){
        ArrayList pivote = new ArrayList();
        for(int i = Coleccion.size()-1 ; i>=0; i--){
            pivote.add(Coleccion.get(i));
        }
        return pivote;
    }
    
    //Obtener el mayor valor. FABIAN
    public int getMayor(){
        int mayor=Coleccion.get(0);
        for( int i =0; i< Coleccion.size(); i++){
            if(Coleccion.get(i)> mayor){
                mayor=Coleccion.get(i);
            }
        }
        return mayor;
    }
    
    //Obtener el menor valor. GONZALO
    public int getMenor(){
        int menor=Coleccion.get(0);
        for( int i =0; i< Coleccion.size(); i++){
            if(Coleccion.get(i)< menor){
                menor=Coleccion.get(i);
            }
        }
        return menor;
    }
    
    //Obtener los primeros n elementos del arreglo. JAVIER 
    public ArrayList getPrimeros(int cantidad) {
        ArrayList lista1 = new ArrayList();
        if (cantidad < Coleccion.size()){
            for (int i=0; i<cantidad; i++){
                lista1.add(Coleccion.get(i));
            }    
        } else {
            System.out.println("La cantidad supera el tamaños de la lista");
        }
        return lista1;
    }
    
    //Obtener los últimos n elementos del arreglo.
    public void ultimosElementos(int valor) {
        int tam = Coleccion.size() - valor;

        for(int i=tam; i<Coleccion.size();i++) {
           System.out.println(Coleccion.get(i));
        }

    }
    
    public ArrayList getUltimos(int cantidad){
        ArrayList lista = new ArrayList();
        if( cantidad < Coleccion.size()){
            for( int i = 0 ; i <cantidad; i++){
                lista.add(Coleccion.get(Coleccion.size()-cantidad+i));
            }
        } else {
            System.out.println("La cantidad supera el tamaño de la lista");
        }
        return lista;
    }
    
    
    //Indicar si es palíndromo. 
    public boolean esPalindromo(){
        boolean estado=true;
        for(int i =0; i<(Coleccion.size()/2); i++){
            if(Coleccion.get(i) != Coleccion.get(Coleccion.size()-i-1)){
                estado=false;
            }
        }
        return estado;
    }
    

    //Indicar si un número se encuentra dentro del arreglo. 
    public boolean estaElNumero(int numero){
        boolean estado = false;
        for(int i=0; i <Coleccion.size();i++){
            if (Coleccion.get(i)== numero){
                estado=true;
            }
        }
        return estado;
    }
}
