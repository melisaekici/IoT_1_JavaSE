package collections;

import java.util.*;

public class ListData {

    //ArrayList
    public static void arrayListData(){
        // Primitive yazılamaz
        List<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println("Eleman sayısı: " + list.size());
        System.out.println("İlk Eleman: " + list.get(0));
        System.out.println("Son Eleman: " + list.get(4));
        System.out.println("Son Elaman: " + list.get(list.size()-1)); // dinamik olarak son elemanı çağırma
        System.out.println("hashCode: " + list.hashCode());
        System.out.println("Boş mu? " + list.isEmpty());
        //System.out.println("Silinen İçerik: " + list.remove(0));
        //System.out.println("Eleman sayısı: " + list.size());
        //list.clear();
        //System.out.println("Eleman sayısı: " + list.size());

        // Arama
        if(list.indexOf(6) > 0){
            System.out.println("6 vardır ve indis numarası: " + list.indexOf(6));
            System.out.println("Sağdan indis numarası: " + list.lastIndexOf(6));
        }else{
            System.out.println("6 yoktur");
        }

        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + list.contains(6));
        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + list.equals(list));
        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + list.toString());
        System.out.println("Stringe çevrilmiş hali: " + list.toString().substring(0,3));
        // İstenilen indisi getirme
        System.out.println("İstenilen indis: " + list.subList(0,3)); // 0 - DATA - 3-1 = 2yi getirir
        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + list.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + list.toArray().length);

    }

    // LinkedListData
    public static void linkedListData(){
        // List<Integer> list = new LinkedList<Integer>();
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(6);
        // 5 1 7 3 6 2 9 6

        System.out.println("Eleman sayısı: " + linkedList.size());
        System.out.println("İlk Eleman: " + linkedList.get(0));
        System.out.println("Son Eleman: " + linkedList.get(4));
        System.out.println("Son Elaman: " + linkedList.get(linkedList.size()-1)); // dinamik olarak son elemanı çağırma
        System.out.println("hashCode: " + linkedList.hashCode());
        System.out.println("Boş mu? " + linkedList.isEmpty());
        //System.out.println("Silinen İçerik: " + list.remove(0));
        //System.out.println("Eleman sayısı: " + list.size());
        //list.clear();
        //System.out.println("Eleman sayısı: " + list.size());

        // Arama
        if(linkedList.indexOf(6) > 0){
            System.out.println("6 vardır ve indis numarası: " + linkedList.indexOf(6));
            System.out.println("Sağdan indis numarası: " + linkedList.lastIndexOf(6));
        }else{
            System.out.println("6 yoktur");
        }

        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + linkedList.contains(6));
        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + linkedList.equals(linkedList));
        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + linkedList.toString());
        System.out.println("Stringe çevrilmiş hali: " + linkedList.toString().substring(0,3));
        // İstenilen indisi getirme
        System.out.println("İstenilen indis: " + linkedList.subList(0,3)); // 0 - DATA - 3-1 = 2yi getirir
        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + linkedList.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + linkedList.toArray().length);

    }

    public static void vectorListData(){
        // Defaultta 10 elemana sahiptir ancak eleman sayısı 9 olursa
        // kendisi otomatik olarak eleman sayısı 20 yapar.
        Vector<Integer> vectorList = new Vector<>();
        vectorList.add(5);
        vectorList.add(1);
        vectorList.add(7);
        vectorList.add(3);
        vectorList.add(6);
        vectorList.add(2);
        vectorList.add(9);
        vectorList.add(6);
        // 5 1 7 3 6 2 9 6

        System.out.println("Eleman sayısı: " + vectorList.size());
        System.out.println("İlk Eleman: " + vectorList.get(0));
        System.out.println("Son Eleman: " + vectorList.get(4));
        System.out.println("Son Elaman: " + vectorList.get(vectorList.size()-1)); // dinamik olarak son elemanı çağırma
        System.out.println("hashCode: " + vectorList.hashCode());
        System.out.println("Boş mu? " + vectorList.isEmpty());
        //System.out.println("Silinen İçerik: " + list.remove(0));
        //System.out.println("Eleman sayısı: " + list.size());
        //list.clear();
        //System.out.println("Eleman sayısı: " + list.size());

        // Arama
        if(vectorList.indexOf(6) > 0){
            System.out.println("6 vardır ve indis numarası: " + vectorList.indexOf(6));
            System.out.println("Sağdan indis numarası: " + vectorList.lastIndexOf(6));
        }else{
            System.out.println("6 yoktur");
        }

        // 6 içeriyor mu?
        System.out.println("6 içeriyor mu?: " + vectorList.contains(6));
        // İki liste birbirine eşit mi?
        System.out.println("Bu iki liste birbirine eşit mi? " + vectorList.equals(vectorList));
        // Stringe çevir
        System.out.println("Stringe çevrilmiş hali: " + vectorList.toString());
        System.out.println("Stringe çevrilmiş hali: " + vectorList.toString().substring(0,3));
        // İstenilen indisi getirme
        System.out.println("İstenilen indis: " + vectorList.subList(0,3)); // 0 - DATA - 3-1 = 2yi getirir
        // Listeyi diziye çevirme
        System.out.println("Diziye çevrilmiş hali: " + vectorList.toArray());
        System.out.println("Diziye çevrilmiş hali ve eleman sayısı: " + vectorList.toArray().length);


    }


    // RandomList
    public static List<Integer> loopMethod(){

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // 8 tane random sayı üretip list'e ekle
        // 0 1 2 3 4 5 6
        for (int i = 0; i < 7; i++) {
            int randomData = random.nextInt(9)+1;
            list.add(randomData);
        }

        System.out.println("******* Iterative Loop ********");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

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
//        System.out.println("********** Array List **********");
//        arrayListData();
//        System.out.println("********** Linked List **********");
//        linkedListData();
//        System.out.println("********** Vector List **********");
//        vectorListData();

        System.out.println("********** Loop Method **********");
        //System.out.println(loopMethod().size());
        loopMethod();


    }
}
