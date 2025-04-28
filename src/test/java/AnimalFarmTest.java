import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFarmTest {
    public static void main(String[] args) {
        // 1. Создаем изменяемый список
        List<String> testAnimals = new ArrayList<>(Arrays.asList(
                "DOG Жучка",
                "CAT Мурка",
                "HORSE Буян",
                "COW Зорька",
                "DOG Шарик",
                "UNKNOWN Тест",  // Некорректный вид
                "HORSE",          // Нет имени
                "COW Бурёнка"
        ));

        // 2. Создаем экземпляр фермы
        AnimalFarm farm = new AnimalFarm(testAnimals);

        // 3. Тестируем countedAnimals()
        System.out.println("Тест countedAnimals()");
        System.out.println(farm.countedAnimals());
        System.out.println();

        // 4. Тестируем uniqueNames()
        System.out.println("Тест uniqueNames()");
        System.out.println(farm.uniqueNames());
        System.out.println();

        // 5. Тестируем методы добавления
        System.out.println("Тест методов добавления");
        farm.addFarmAnimal(Animal.CAT, "Барсик");
        farm.addFarmAnimal(Animal.DOG);
        farm.addFarmAnimal("Безымянный");
        System.out.println("После добавления животных:");
        System.out.println(farm);
    }
}