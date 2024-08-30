import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) {
        CustomArrayImpl<String> list = new CustomArrayImpl<>();
        ArrayList<String> list2 = new ArrayList<>();
        CustomArrayImpl<String> list1 = new CustomArrayImpl<>();
        int num = list.size();
        boolean empty = list.isEmpty();
        boolean sec1 = list.add("test");
        boolean sec3 = list.add("test1");
        boolean sec4 = list.add("test2");
        boolean sec2 = list.addAll(list1);
        String str = list.get(0);
        String str1 = list.set(0,"test3");
        list.remove(1);
        list.remove("test");
        boolean sec5 = list.contains("test");
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
        list3.add(1);
        list3.bubbleSort();
        for (int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
        }

    }
}
