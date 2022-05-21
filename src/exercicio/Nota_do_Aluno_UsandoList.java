package exercicio;

import java.util.*;

public class Nota_do_Aluno_UsandoList {
    public static void main(String[] args) {//CRIE UMA LISTA E ADCIONE 7 NOTAS:
        Double valor;
        Scanner teclado = new Scanner(System.in);

        // CRIAÇÃO DA LISTA
        List<Double> notas = new ArrayList<>();

        for(int i = 1; i <= 7; i++) {
            System.out.print("ADICIONE A "+ i+"° NOTA: ");
            valor = teclado.nextDouble();
            // ADICIONAR O VALOR NA LISTA;
            notas.add(valor);
        }

        // IMPRIMIR A LISTA
        System.out.println("ELEMENTO DA LISTA: "+notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //EXIBE POSIÇÃO DO ELEMENTO DA LISTA
        System.out.println("EXIBA A POSIÇÃO DA NOTA 6.0 => "+notas.indexOf(6d));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //ADICIONAR UM ELEMENTO NA LISTA NA POSIÇÃO Y
         notas.add(4,7d);
         notas.add(5,34d);
         System.out.println(notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // SUBSTITUIR VALOR NA LISTA:
        notas.set(5,100d);
        System.out.println(notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // VERIFICAR SE O ELEMENTO ESTA NA LISTA
        System.out.println("A NOTA 5.0 ESTA NA LISTA: "+ notas.contains(5d));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // EXIBIR A NOTA ADICIONADA NA POSIÇÃO 3
        System.out.println("EXIBA A TERCEIRA NOTA ADICIONADA "+ notas.get(2));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // MENOR NOTA:
        System.out.println("MENOR NOTA DA LISTA É : "+ Collections.min(notas));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //  MAIOR NOTA:
        System.out.println("A MAIOR NOTA DA LISTA É: " + Collections.max(notas));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // SOMA DOS VALORES // NÃO METÓDO EM LIST PRA SOMA:
        Iterator<Double> iterator = notas.iterator();// variavel
        double soma = 0;// variavel
        while (iterator.hasNext()){
            double proximo = iterator.next();
            soma = soma + proximo;
        }
        System.out.println("A SOMA DE TODOS VALORES DA LISTA É: " + soma);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // MÉDIA DA NOTAS
        System.out.println("A NÉDIA DAS NOTAS É "+ soma/ notas.size());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // REMOVA A NOTA DA POSIÇÃO 0;
        notas.remove(0);
        System.out.println(notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // REMOVER A NOTA 100
        notas.remove(100d);
        System.out.println(notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // REMOVER AS NOTAS MENORES QUE 7;
        Iterator<Double>  iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double y = iterator1.next();
            if (y < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       // APAGAR TODA LISTA
        notas.clear();
        System.out.println("apagou");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // CONFIRIR SE A LISTA ESTA VAZIA
        System.out.println(notas.isEmpty());



    }

}
