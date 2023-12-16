package CodingTankADA;

// Ao inserir o valor do emprestimo, por estar utilizando computador com linguagem em PT-BR é necessario inserir com vírgula. 
// Por exemplo, 30000,00 / 20000,00
// O mesmo vale para porcentagem / 1,5 

import java.util.Scanner;

public class Coding1 {
    public static void main(String[] args) {
        double totalSaldoDevedor = 0;
        int totalDeMeses = 0;
        double amortizacao = 0;
        double jurosMensal = 0;
        double saldoDevedorAtual = 0;
        double jurosAoMes = 0;
        double parcelaMensal = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do empréstimo:");
        totalSaldoDevedor = scanner.nextDouble();
        System.out.println("Insira a quantidade de parcelas:");
        totalDeMeses = scanner.nextInt();
        System.out.println("Insira a taxa de juros:");
        jurosAoMes = scanner.nextDouble();

        amortizacao = totalSaldoDevedor / totalDeMeses;
        saldoDevedorAtual = totalSaldoDevedor;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.1f%% ao mês\n",
                amortizacao, totalSaldoDevedor, jurosAoMes);

        double totalPagoJuros = 0;
        double totalPagoPrestacoes = 0;
        double totalAmortizado = 0;

        for (int i = 1; i <= totalDeMeses; i++) {
            jurosMensal = saldoDevedorAtual * (jurosAoMes / 100);
            parcelaMensal = jurosMensal + amortizacao;
            saldoDevedorAtual -= amortizacao;

            totalPagoJuros += jurosMensal;
            totalPagoPrestacoes += parcelaMensal;
            totalAmortizado += amortizacao;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n",
                    i, jurosMensal, parcelaMensal, saldoDevedorAtual);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n",
                totalPagoPrestacoes, totalPagoJuros, totalAmortizado);
    }
}
