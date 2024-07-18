
package parcial2.tercer.bloque;

public class Parcial2TercerBloque {

    public static void main(String[] args) {
        int matriz [][] = {{5,7, 9}, {4, 2, 1}, {1, 1, 1}};
         int copMatriz [][] = new int[3][3];
        
         int F = 2;
         int C = 2;
         
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               copMatriz[F][C] = matriz[i][j];
               C --;
            }
            F --;
            C =2;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(copMatriz[i][j] + "|");
            }    
            System.out.println("");
        }
    }
    
}
