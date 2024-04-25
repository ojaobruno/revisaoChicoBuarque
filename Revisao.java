import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção (1 a 4):");
            System.out.println("1. Operações matemáticas");
            System.out.println("2. Calculo INSS");
            System.out.println("3. Cálculo IRPF");
            System.out.println("4. Conversor de Idade");
            System.out.print("Opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido, tente novamente.");
                continue;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    opcao1(scanner);
                    break;
                case 2:
                    opcao2(scanner);
                    break;
                case 3:
                    opcao3(scanner);
                    break;
                case 4:
                    opcao4(scanner);
                    break;
            }
        }
    }

    public static void opcao1(Scanner scanner) {
        System.out.println("Opção 1 selecionada.");
        System.out.println("Digite dois números:");

        double num1, num2;
        System.out.print("Número 1: ");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Número 2: ");
        num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Resultados:");
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Divisão: " + (num1 / num2));
        } else {
            System.out.println("Divisão por zero não é definida.");
        }
    }

    public static void opcao2(Scanner scanner) {
        System.out.println("Opção 2 selecionada.");
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = Double.parseDouble(scanner.nextLine());

        double descontoINSS;

        if (salarioFixo <= 1412.00) {
            descontoINSS = salarioFixo * 0.075; // 7,5%
        } else if (salarioFixo <= 2666.68) {
            descontoINSS = salarioFixo * 0.09; // 9%
        } else if (salarioFixo <= 4000.03) {
            descontoINSS = salarioFixo * 0.12; // 12%
        } else {
            descontoINSS = salarioFixo * 0.14; // 14%
        }

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Desconto do INSS: R$" + descontoINSS);
    }

    public static void opcao3(Scanner scanner) {
        System.out.println("Opção 2 selecionada.");
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = Double.parseDouble(scanner.nextLine());

        double descontoIRPF;

        if (salarioFixo <= 2259.20) {
            descontoIRPF = 0; // Isento
        } else if (salarioFixo <= 2826.65) {
            descontoIRPF = salarioFixo * 0.075; // 7.5%
        } else if (salarioFixo <= 3751.05) {
            descontoIRPF = salarioFixo * 0.15; // 15%
        } else if (salarioFixo <= 4664.68) {
            descontoIRPF = salarioFixo * 0.2255; // 22.55%
        } else {
            descontoIRPF = salarioFixo * 0.275; // 27.5%
        }

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Desconto do IRPF: R$" + descontoIRPF);
    }

    public static void opcao4(Scanner scanner) {
        System.out.println("Opção 4 selecionada.");
        System.out.println("Digite a idade do aluno em dias:");
        int idadeDias = Integer.parseInt(scanner.nextLine());

        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        System.out.println("A idade do aluno é:");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
    }
}
