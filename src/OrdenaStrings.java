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

        palavras.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(palavras);

        System.out.println("----------");

        palavras.forEach(System.out::println);
    }
}