package questao1;

import comum.Arquivo;

public class Quest1 {
    public static void main(String[] args){
        Arquivo arqNomes = new Arquivo("Java Boys_ATV02_Recorrência/src/entrada/valores.txt");
        double valor = 0, maximo = 0;

        Object[] nome =arqNomes.lerTudo();
        for (Object valores : nome) {
            int index = valores.toString().indexOf(" ");
            int tamanho = valores.toString().length();
            valor = Double.parseDouble(valores.toString().substring(0, index));
            maximo = Double.parseDouble(valores.toString().substring(index, tamanho));

        }

        Quest1.printSequencia(valor, maximo);
    }

    public static void printSequencia(double valor, double max){
        Quest1.valorMax(valor, max, 0);
    }

    private static void valorMax(double valor, double max, int cinco){
        if(cinco != 0){
            if (valor*(5*cinco) < max) {
                System.out.print(valor*(5*cinco) + ", ");
                valorMax(valor, max, cinco+1);
                System.out.print(valor*(5*cinco) + ", ");
            }
        }else{
            if (valor < max) {
                System.out.print(valor + ", ");
                valorMax(valor, max, cinco+1);
                System.out.println(valor);
            }
        } 
    }
}
