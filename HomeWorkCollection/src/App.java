import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) {
        CustomArrayImpl<String> list = new CustomArrayImpl<>();
        CustomArrayImpl<String> list1 = new CustomArrayImpl<>();
        int num = list.size();
        System.out.println(num);
        boolean empty = list.isEmpty();
        System.out.println(empty);
        boolean sec1 = list.add("test");
        System.out.println(sec1);
        boolean sec3 = list.add("test1");
        System.out.println(sec3);
        boolean sec4 = list.add("test2");
        System.out.println(sec4);
        boolean sec2 = list.addAll(list1);
        System.out.println(sec2);
        String str = list.get(0);
        System.out.println(str);
        String str1 = list.set(0,"test3");
        System.out.println(str1);
        list.remove(1);
        list.remove("test");
        boolean sec5 = list.contains("test");
        System.out.println(sec5);
        list.ensureCapacity(5);
        int cap = list.getCapacity();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.reverse();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(cap);
        CustomArrayImpl<Integer> list3 = new CustomArrayImpl<>();
        list3.add(3);
        list3.add(2);
        list3.add(8);
        list3.add(5);
        list3.add(1);
        list3.add(7);
        list3.add(4);
        list3.add(9);
        list3.add(9);
        list3.add(13);
        list3.add(2);

        list3.bubbleSort();
        for (int i = 0; i < list3.size(); i++){
            System.out.print(list3.get(i) + " ");
        }

    }
}
