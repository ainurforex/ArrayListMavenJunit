package ru.ainurforex.arraylist;

public class Main {
    public static void main(String[] args) {

        System.out.println("StringArray isEmpty");
        StringList stringList = new StringList();
        System.out.println(stringList.isEmpty());

        System.out.println("  ");
        System.out.println("add 0-5");
        System.out.println(stringList.add("a0"));
        System.out.println(stringList.add("b1"));
        System.out.println(stringList.add("c2"));
        System.out.println(stringList.add("d3"));
        System.out.println(stringList.add("e4"));
        System.out.println(stringList.add("f5"));

        System.out.println(" ");
        System.out.println("StringArray isEmpty");
        System.out.println(stringList.isEmpty());

        System.out.println(" ");
        System.out.println("add index 0");
        System.out.println(stringList);
        stringList.add(0, "a01");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("add index 6");
        System.out.println(stringList);
        stringList.add(6, "g6");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("add index 5");
        System.out.println(stringList);
        stringList.add(5, "f51");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());

        System.out.println(" ");
        System.out.println("Conteins True b1");
        System.out.println(stringList.contains("b1"));
        System.out.println(stringList);
        System.out.println("Conteins False b2");
        System.out.println(stringList.contains("b2"));
        System.out.println(stringList);

        System.out.println(" ");
        System.out.println("Index of true e4");
        System.out.println(stringList.indexOf("e4"));
        System.out.println(stringList);
        System.out.println("Index of false j4");
        System.out.println(stringList);
        System.out.println(stringList.indexOf("j4"));
        System.out.println("LastIndex of true e4");
        System.out.println(stringList);
        System.out.println(stringList.lastIndexOf("e4"));
        System.out.println("LastIndex of false j4");
        System.out.println(stringList);
        System.out.println(stringList.lastIndexOf("j4"));

        System.out.println(" ");
        System.out.println("Get 4");
        System.out.println(stringList.get(4));
        System.out.println(stringList);

        System.out.println(" ");
        System.out.println("remove item a01");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove("a01");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("remove item f5");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove("f5");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("remove item f51");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove("f51");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());

        System.out.println(" ");
        System.out.println("remove index 0");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove(0);
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("remove index 3");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove(3);
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        System.out.println("remove index 3");
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());
        stringList.remove(3);
        System.out.println(stringList);
        System.out.println("Size " + stringList.size());

        System.out.println(" ");
        System.out.println("NewString[]");
        String[] newArrayList = stringList.toArray();
        for (int i = 0; i < newArrayList.length; i++) {
            System.out.print(newArrayList[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("StringList");
        System.out.println(stringList);
        System.out.println("Clear");
        stringList.clear();
        System.out.println(stringList);


    }
}