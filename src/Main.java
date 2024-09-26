import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("#### Digite sua lista de nomes e sexos, separados por espaço e vírgula ####");
        Scanner scanner = new Scanner(System.in);
        String nomes = scanner.nextLine();

        List<String> nomeSexoLista = Arrays.asList(nomes.split(","));

        nomeSexoLista.stream()
                .map(nomeSexo -> nomeSexo.trim().split(" "))
                .filter(partes -> partes[1].trim().equalsIgnoreCase("F"))
                .forEach(partes -> System.out.println(partes[0] + " é feminino"));
    }
}