package ExerciciosWHILE;

import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
public class Exercicios3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        int cod = sc.nextInt();

        while (cod != 4) {
            if(cod == 1) {
                alcool += 1;
            }
            else if (cod == 2) {
                gasolina += 1;
            }
            else if(cod == 3) {
                disel += 1;
            }
            cod = sc.nextInt();
        }

        System.out.println("Thank you very much");
        System.out.println("Gasolina " + gasolina);
        System.out.println("alcool = " + alcool);
        System.out.println("disel = " + disel);

        sc.close();
    }
}
