package cursojava;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String texto = "manoel, curso Java, 80, 70, 90, 89";

        String[] valores = texto.split(",");
        System.out.println("nome = "+valores[0]);
        System.out.println("curso = "+valores[1]);
        System.out.println("nota 1  = "+valores[2]);
        System.out.println("nota 2= "+valores[3]);
        System.out.println("nota 3 = "+valores[4]);
        System.out.println("nota 4 = "+valores[5]);

        //convertendo array em lista
        List<String> list = Arrays.asList(valores);
        for(String valor : list){
            System.out.println(valor);
        }
        System.out.println("----------------------------------------------------");
        //convertendo uma lista para array
        String[] conversao = list.toArray(new String[6]);
        for(int pos = 0; pos < conversao.length; pos ++){
            System.out.println(conversao[pos]);
        }
    }
}
