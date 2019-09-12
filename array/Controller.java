import java.util.ArrayList;
import java.util.Arrays;


class Controller{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> str = new Arraylist<String>();

        list.addAll(Arrays.asList(1, 2, 3));
        list.add(1);
        list.add(9);
        

        for(Integer i : list){
            //i = i + 1;   
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(list.toArray()));

        list.add(2);
        list.add(1);
        list.add(9);

        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        
        list.remove(Integer.valueOf(9));
        
        while(list.contains(1))
            list.remove(Integer.valueOf(1));

        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();


    }
}

/*


*/