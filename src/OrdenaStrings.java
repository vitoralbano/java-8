import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("long life learning");
        palavras.add("cursos online");
        palavras.add("recursos java 8");

        palavras.sort(new ComparadorPorTamanho());
        System.out.println(palavras);

        System.out.println("----------");

        palavras.forEach(System.out::println);
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}