package collections;

import java.util.*;

// H LT
// HashSet: Tekrarsız; elemanları eklediğimiz sırada getirmeyebilir
// LinkedHashSet: Tekrarsız; elemanları eklediğimiz sırada getirir
// TreeSet: Tekrarsız ve elemanları küçükten büyüğe doğru sıralar

public class SetData {


    public static void hashSetData(){
        List<Integer> hashSetData = new ArrayList<Integer>();
        // List<Integer> hashSetData = new ArrayList<>();
        hashSetData.add(5);
        hashSetData.add(4);
        hashSetData.add(1);
        hashSetData.add(7);
        hashSetData.add(3);
        hashSetData.add(6);
        hashSetData.add(2);
        hashSetData.add(9);
        hashSetData.add(6);

        System.out.println("Eleman sayısı: " + hashSetData.size());
        System.out.println("hashCode: " + hashSetData.hashCode());
        System.out.println("Boş mu? " + hashSetData.isEmpty());
        //System.out.println("Silinen İçerik: " + hashSetData.remove(0));
        //System.out.println("Eleman sayısı: " + hashSetData.size());
        //hashSetData.clear();
        //System.out.println("Eleman sayısı: " + hashSetData.size());

        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + hashSetData.contains(6));

        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + hashSetData.equals(hashSetData));

        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + hashSetData.toString());
        System.out.println("Stringe çevrilmiş hali: " + hashSetData.toString().substring(0,3));


        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + hashSetData.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + hashSetData.toArray().length);


        // En çok kullanılan
        System.out.println("******* hashSetData For Each Names Loop *******");
        for (Integer temp: hashSetData){
            System.out.print(temp + " ");
        }
        System.out.println("\n");
    }


    public static void linkedHashSetData(){
        // List<Integer> list = new LinkedList<Integer>();
        Set<Integer> linkedHashSetData = new LinkedHashSet<>();
        linkedHashSetData.add(5);
        linkedHashSetData.add(1);
        linkedHashSetData.add(7);
        linkedHashSetData.add(3);
        linkedHashSetData.add(6);
        linkedHashSetData.add(2);
        linkedHashSetData.add(9);
        linkedHashSetData.add(6);
        // 5 1 7 3 6 2 9 6

        System.out.println("Eleman sayısı: " + linkedHashSetData.size());
        System.out.println("hashCode: " + linkedHashSetData.hashCode());
        System.out.println("Boş mu? " + linkedHashSetData.isEmpty());
        //System.out.println("Silinen İçerik: " + list.remove(0));
        //System.out.println("Eleman sayısı: " + list.size());
        //list.clear();
        //System.out.println("Eleman sayısı: " + list.size());


        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + linkedHashSetData.contains(6));

        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + linkedHashSetData.equals(linkedHashSetData));

        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + linkedHashSetData.toString());
        System.out.println("Stringe çevrilmiş hali: " + linkedHashSetData.toString().substring(0,3));

        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + linkedHashSetData.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + linkedHashSetData.toArray().length);

        // En çok kullanılan
        System.out.println("******* hashSetData For Each Names Loop *******");
        for (Integer temp: linkedHashSetData){
            System.out.print(temp + " ");
        }
        System.out.println("\n");
    }

    public static void treeSetData(){
        // Defaultta 10 elemana sahiptir ancak eleman sayısı 9 olursa
        // kendisi otomatik olarak eleman sayısı 20 yapar.
        Set<Integer> treeSetData = new TreeSet<>();
        treeSetData.add(5);
        treeSetData.add(1);
        treeSetData.add(7);
        treeSetData.add(3);
        treeSetData.add(6);
        treeSetData.add(2);
        treeSetData.add(9);
        treeSetData.add(6);
        // 5 1 7 3 6 2 9 6

        System.out.println("Eleman sayısı: " + treeSetData.size());
        System.out.println("hashCode: " + treeSetData.hashCode());
        System.out.println("Boş mu? " + treeSetData.isEmpty());
        //System.out.println("Silinen İçerik: " + list.remove(0));
        //System.out.println("Eleman sayısı: " + list.size());
        //list.clear();
        //System.out.println("Eleman sayısı: " + list.size());


        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + treeSetData.contains(6));

        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + treeSetData.equals(treeSetData));

        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + treeSetData.toString());
        System.out.println("Stringe çevrilmiş hali: " + treeSetData.toString().substring(0,3));

        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + treeSetData.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + treeSetData.toArray().length);

        // En çok kullanılan
        System.out.println("******* hashSetData For Each Names Loop *******");
        for (Integer temp: treeSetData){
            System.out.print(temp + " ");
        }
        System.out.println("\n");

    }


    // RandomList
    public static Set<Integer> loopMethod(){

        Set<Integer> list = new LinkedHashSet<>();
        Random random = new Random();

        // 8 tane random sayı üretip list'e ekle
        // 0 1 2 3 4 5 6
        for (int i = 0; i < 7; i++) {
            int randomData = random.nextInt(9)+1;
            list.add(randomData);
        }

//        System.out.println("******* Iterative Loop ********");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        // En çok kullanılan
        System.out.println("\n\n******* ForEach Names Loop ********");
        for(Integer temp: list){
            System.out.print(temp + " ");
        }

        System.out.println("\n\n******* Iterator Names Loop ********");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n\n******* Stream ForEach Loop ********");
        list.stream().forEach((temp) -> {
            System.out.print(temp + " ");
        });

        System.out.println("\n\n******* Short Stream ForEach Loop ********");
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });

        System.out.println("\n\n******* Short Stream ForEach Loop (Method References) ********");
        list.forEach(System.out::print);

        return list;
    }


    public static void main(String[] args) {
        System.out.println("\n\n********** HashSet **********");
        hashSetData();
        System.out.println("\n\n********** linkedHashSetData **********");
        linkedHashSetData();
        System.out.println("\n\n********** treeSetData **********");
        treeSetData();

        System.out.println("********** Loop Method **********");
        //System.out.println(loopMethod().size());
        loopMethod();


    }
}
