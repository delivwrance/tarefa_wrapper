package Modulo9;
/**
 * ler do console um valor, coloque uma variavel primitiva, transforme ela em um wrapper e imprima no console
 * depois faça commit e push pro github no repositorio chamado tarefa_wrapper
 */

import java.util.Scanner;

public class ExercicioMod9 {
    public static void main(String[] args) {
        // criando um scanner para ler entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // solicitando um valor ao usuario
        System.out.print("Digite um valor: ");
        int valorPrimitivo = scanner.nextInt();

        // convertendo para um wrapper
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // imprimindo no console
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

        // fechar o scanner
        scanner.close();
    }
}