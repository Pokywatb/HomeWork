package mapHomeWork;

import java.util.*;

public class MapTask {
    private static List<String> getPeopleByCity(HashMap<String, String> map, String city) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(city)) {
                logins.add(entry.getKey());
            }
        }
        return logins;
    }
    private static HashMap<String, Integer> getWords(List<String> words){
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < words.size() ; i++){
            int sum = 0;
            for (int j = 0; j < words.size() ; j++) {
                if(words.get(j).equals(words.get(i))){

                    sum++;

                }
                wordMap.put(words.get(i), sum);

            }
        }
        return wordMap;
    }

    private static HashMap<String, Customer> ageSorter(HashMap<String, Customer> map, int from, int to){
        HashMap<String, Customer> customer = new HashMap<>();
        for (Customer customer1 : map.values()) {
            if (customer1.getAge() >= from && customer1.getAge() < to){
                customer.put(customer1.getUuid(), customer1);
            }
        }

        return customer;
    }

    private static HashMap<String, Integer> wordFrequency(String string, String[] text1){
        HashMap<String, Integer> frequency = new HashMap<>();
        int i = 0;
        for(String c: text1){

            if(string.equals(c)){
                i++;

            }
            frequency.put(string, i);

        }

        return frequency;
    }

    private static void Group(String[] text1){

    }


    public static void main(String[] args) {
        // TODO:: написать статический метод, который приннимает на вход
        //  мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(getPeopleByCity(firstTaskMap, city));


        // TODO:: дан список слов (words). Написать метод, который будет возвращать количество одинаковых слов с списке
        //  в виде Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");


        System.out.println(getWords(words));


        // TODO:: дана мапа (customerMap).
        //  Написать метод, который принимает на вход агрументы int from и int to и возвращает новую мапу,
        //  в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));
        System.out.println(ageSorter(customerMap, 20, 60));


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. Вывести частоту встречаемости букв анг алфавита в данном тексте. Вывести в процентах для каждой буквы

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like"; // !!! в тексте содержатся только буквы и пробельные символы !!!
        String[] text1 = text.split("\\s");
        System.out.println(Arrays.toString(text1));

        System.out.println(wordFrequency("web", text1));


    }

}
