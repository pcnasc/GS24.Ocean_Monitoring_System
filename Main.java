import java.io.*;
import java.util.Scanner;

public class Main {
    private static final int MAX_BOIAS = 20;
    private static Boia[] boias = new Boia[MAX_BOIAS];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gerarVetorBoias("src/coordenadas.txt");
        lerMedidas(scanner);
        ordenarBoiasPorBolha();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Apresentação das Boias");
            System.out.println("2. Inserção de Boia");
            System.out.println("3. Atualização de Medidas");
            System.out.println("4. Pesquisa Medidas");
            System.out.println("0. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apresentarBoias();
                    break;
                case 2:
                    inserirBoia(scanner);
                    break;
                case 3:
                    atualizarMedidas(scanner);
                    break;
                case 4:
                    pesquisarMedidas(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void gerarVetorBoias(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = br.readLine()) != null && count < MAX_BOIAS) {
                Boia boia = new Boia(linha);
                boias[count++] = boia;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerMedidas(Scanner scanner) {
        for (int i = 0; i < count; i++) {
            System.out.println("Informe as medidas para a Boia " + boias[i].getCoordenadas() + ":");
            System.out.print("Salinidade: ");
            double salinidade = scanner.nextDouble();
            boias[i].setSalinidade(salinidade);
            System.out.print("Temperatura: ");
            double temperatura = scanner.nextDouble();
            boias[i].setTemperatura(temperatura);
        }
    }

    private static void ordenarBoiasPorBolha() {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < count - 1; i++) {
                if (boias[i].getHashCode() > boias[i + 1].getHashCode()) {
                    Boia temp = boias[i];
                    boias[i] = boias[i + 1];
                    boias[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    private static Boia buscarBoia(int hashCode) {
        int left = 0;
        int right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (boias[mid].getHashCode() == hashCode) {
                return boias[mid];
            }
            if (boias[mid].getHashCode() < hashCode) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    private static void apresentarBoias() {
        for (int i = 0; i < count; i++) {
            System.out.println(boias[i]);
        }
    }

    private static void inserirBoia(Scanner scanner) {
        if (count >= MAX_BOIAS) {
            System.out.println("Não é possível inserir mais boias.");
            return;
        }

        System.out.print("Informe as coordenadas da nova Boia: ");
        scanner.nextLine();
        String coordenadas = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (boias[i].getCoordenadas().equals(coordenadas)) {
                System.out.println("Boia já existente com essas coordenadas.");
                return;
            }
        }

        Boia novaBoia = new Boia(coordenadas);
        System.out.print("Salinidade: ");
        novaBoia.setSalinidade(scanner.nextDouble());
        System.out.print("Temperatura: ");
        novaBoia.setTemperatura(scanner.nextDouble());
        boias[count++] = novaBoia;
        ordenarBoiasPorBolha();
    }

    private static void atualizarMedidas(Scanner scanner) {
        lerMedidas(scanner);
    }

    private static void pesquisarMedidas(Scanner scanner) {
        System.out.print("Informe o hash code da Boia: ");
        int hashCode = scanner.nextInt();
        ordenarBoiasPorBolha();
        Boia boia = buscarBoia(hashCode);
        if (boia != null) {
            System.out.println(boia);
        } else {
            System.out.println("ERRO. Boia não encontrada.");
        }
    }
}