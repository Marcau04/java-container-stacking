import java.io.BufferedReader;
import java.io.FileReader;

public class OrdenacionContenedores {

    public static int [][] llenarTabla(int [] peso, int [] pesoMax,int pesoMaxPermitido){
        int[][] tabla = new int[peso.length][pesoMaxPermitido+1];
        for(int i = 0;i < tabla.length;i++){
            for(int j = 0;j < tabla[0].length;j++){
                if(i == 0){
                    if(j <= pesoMax[i]){
                        tabla[i][j] = 1;
                    }else{
                        tabla[i][j] = 0;
                    }
                }else{
                    if( (peso[i] + j) < tabla[0].length && j <= pesoMax[i]){
                        tabla[i][j] = Math.max(tabla[i-1][j],tabla[i-1][peso[i]+j]+1);
                    }else{
                        tabla[i][j] = tabla[i-1][j];
                    }
                }
            }
        }
        return tabla;
    }
    
    public static int [] obtenerContenedoresOrdenados(int[][] matrizContenedores,int[]peso) {
        int [] seleccionados = new int[matrizContenedores.length];
        for(int i = 0;i < matrizContenedores.length;i++){
            seleccionados[i] = 0;
        }
        int i = seleccionados.length-1;
        int j = 0;
        while (i > -1) {
            if ( ( (i > 0) && (matrizContenedores[i][j]  == matrizContenedores[i-1][j]) )  
                 || ( (i == 0) && (matrizContenedores[i][j] == 0)) ) {
                i --;
            }else{
                seleccionados[i] = 1;
                j = j + peso[i];
                i--;
            }
        }
        return seleccionados;
    }
    public static void main(String [] args){
        int numeroContenedores, pesoContenedor,pesoMaxContenedor=0;
        String [] provisional;
        int[] peso;
        int[] pesoMax;
        int i = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader("entrada.txt"));){
            String linea = lector.readLine();
            numeroContenedores = Integer.parseInt(linea);
            peso = new int[numeroContenedores];
            pesoMax = new int[numeroContenedores];
            while((linea = lector.readLine()) != null){
                provisional = linea.split(" ");
                pesoContenedor = Integer.parseInt(provisional[0]);
                pesoMaxContenedor = Integer.parseInt(provisional[1]);
                peso[i] = pesoContenedor;
                pesoMax[i] = pesoMaxContenedor;
                i++;
            }
            int[][] tablaLLena = llenarTabla(peso,pesoMax,5000);
            int[]solucion = obtenerContenedoresOrdenados(tablaLLena,peso);
            String resultado = "";
            int contador = 0;
            for(int j = 0;j < solucion.length;j++){
                if(solucion[j] == 1){
                   resultado += "Contenedor "+(j+1)+"\n";
                   contador++;
                }
            }
            System.out.print("Numero de contenedores: ");
            resultado = contador+"\n"+resultado;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
