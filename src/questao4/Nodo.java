import java.util.List;

public class Nodo {
    public List<Integer> deletarNo(List<Integer> lista, int k, int cont){
        if(cont+1 == k){
            lista.remove(lista.get(cont));
            return lista;
        }else{
            return deletarNo(lista, k, cont+1);
        }
    }
}
