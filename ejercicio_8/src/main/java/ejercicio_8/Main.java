package ejercicio_8;

import java.util.ArrayList;

/**
 *
 * @author Cata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("MI PRIMERA COLECCIÓN");
        MiColeccion mc1 = new MiColeccion();
        
        mc1.insertarAlFinal(1);
        mc1.insertarAlFinal(2);
        mc1.insertarAlFinal(3);
        mc1.insertarAlFinal(4);
        mc1.mostrarElementos();
        
        mc1.insertarAlPrincipio(0);
        mc1.mostrarElementos();
        
        mc1.eliminarElemento(0);
        mc1.mostrarElementos();
        
        System.out.println("el valor de la posicion 3 es: " 
                +mc1.getValor(3));
        
        mc1.insertarValorEn(3, 3);
        mc1.mostrarElementos();
        
        System.out.println("la sumatoria es:" +mc1.sumatoria());
        
        System.out.println("la lista tiene esta cantidad de elementos: " 
                +mc1.cuentaElementos());
        mc1.insertarValorEn(3, 0);
        mc1.mostrarElementos();
        System.out.println("la lista tiene: "+mc1.sumaCeros()
                +" ceros");
        System.out.println("la sumatoria de los pares es: "
                +mc1.sumaPar());
        
        
        mc1.setValor(3,10);
        mc1.mostrarElementos();
        System.out.println("ultimos 3");
        mc1.ultimosElementos(3);
        System.out.println("los ultimos 3 son: "
                + mc1.getUltimos(3));
        
        mc1.mostrarElementos();
        mc1.invertirColeccion();
        System.out.println("Palindromo? " +mc1.esPalindromo());

        ArrayList lista = new ArrayList();
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(6);
        lista.add(5);
        
        mc1.reemplazarTodo(lista);
        mc1.mostrarElementos();
        
        System.out.println("Palindromo? " +mc1.esPalindromo());
        System.out.println("esta el 15? " +mc1.estaElNumero(15));
        System.out.println("esta el 0? " +mc1.estaElNumero(5));

        
    }
    
}
