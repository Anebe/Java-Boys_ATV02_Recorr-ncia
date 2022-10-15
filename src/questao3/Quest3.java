package questao3;

import java.util.Arrays;

public class Quest3 {
    public static void main(String[] args) {
        Quest3.printSeqCresc(2, 3);
    }
    
    public static void printSeqCresc(int h, int b){
        int[] aux = new int[h];
        Arrays.fill(aux, 1);
        printSeqCresc(h, b, aux, aux.length-1);
    }

    private static void printSeqCresc(int h,int b, int[] valores, int index){
        if(isSort(valores)){
            printArrayInt(valores);
        }
        if(!isFull(b, valores)){
            if(valores[index] < b ){
                valores[index]++;

                printSeqCresc(h,b,valores,index);
            }else{
                addArray(b,valores,index-1);
                valores[index] = 1;
                printSeqCresc(h,b,valores,index);
            }
        } 
    }
    private static void addArray(int b, int[] valores, int index){
        if(index >= 0){
            if(valores[index] < b){
                valores[index]++;
            }else{
                valores[index] = 1;
                addArray(b, valores, index-1);
            }
            
        }
    }


    private static boolean isSort(int[] valores){
        /*for (int i = 0; i < valores.length-1; i++) {
            if(valores[i] >= valores[i+1]){
                return false;
            }
        }
        return true;*/
        return isSort(valores, 0);
    }
    private static boolean isSort(int[] valores, int index){
        if(index < valores.length-1){
            if(valores[index] >= valores[index+1]){
                return false;
            }else{
                return isSort(valores, index+1);
            }
        }
        return true;
    }

    private static void printArrayInt(int[] valores){
        /*for (int i : valores) {
            System.out.print(i + ", ");
        }
        System.out.println();*/
        printArrayInt(valores, 0);
    }
    private static void printArrayInt(int[] valores, int index){
        if(index < valores.length){
            if(index == valores.length-1){
                System.out.println(valores[index] + ".");
            }else{
                System.out.print(valores[index] + ", ");
            }
            printArrayInt(valores, index+1);
        }
    }

    private static boolean isFull(int b, int[] valores){
        /*for (int i = 0; i < valores.length; i++) {
            if(valores[i] != b){
                return false;
            }
        }
        return true;*/
        return isFull(b, valores, 0);
    }
    private static boolean isFull(int b, int[] valores, int index){
        if(index < valores.length){
            if(valores[index] != b){
                return false;
            }else{
                isFull(b, valores, index+1);
            }
        }
        return true;
    }

}
