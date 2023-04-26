package problemaUno;

import java.util.ArrayList;
import java.util.List;

public class Solucion {
    public static void main(String[] args) {
      List<Integer> lista = new ArrayList<>(){{
          add(4);
          add(5);
          add(5);
          add(5);
          add(6);
          add(6);
          add(4);
          add(1);
          add(4);
          add(4);
          add(3);
          add(6);
          add(6);
          add(3);
          add(6);
          add(1);
          add(4);
          add(5);
          add(5);
          add(5);
      }};

        System.out.println(sockMerchant(20, lista));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < ar.size(); i++){
            for(int j = i+1; j < ar.size(); j++){
                if(ar.get(i) == ar.get(j)){
                    result.add(ar.get(j));
                    ar.remove(j);
                    break;
                }
            }
        }
        return result.size();
    }
}