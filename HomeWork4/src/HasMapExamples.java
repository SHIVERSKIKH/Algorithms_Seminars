import java.util.HashMap;

public class HasMapExamples {
    public static void main (String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        //добавление ключей и их знаение
        hashMap.put("Artem", "Ivanov");
        hashMap.put("Masha", "Petrova");
        hashMap.put("Alla", "Ivanova");
        hashMap.put("Pasha", "Vitkin");
        hashMap.put("Paha", "+7892222222");
        System.out.println(hashMap);
        // для перебора будем использовать цикл for-each
        for (String frame: hashMap.keySet()) {
            System.out.println(frame);
        }

        //данный метод перебирает только ключи

        // для перебора значений HasMap будем использовать метод values()
        for(String frame : hashMap.values()) {
            System.out.println(frame);
        }

    }
}

// Класс HashMap предлагает множество методов для выполнения различных функций, например, методы put() и remove() используются для вставки и удаления записей HashMap.