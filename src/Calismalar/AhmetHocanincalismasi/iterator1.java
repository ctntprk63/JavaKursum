package Calismalar.AhmetHocanincalismasi;


    import java.util.ArrayList;
import java.util.Iterator;

    public class iterator1 {
        public static void main(String[] args) {

            ArrayList<Integer> arrayList1 = new ArrayList<>(){
                {
                    for (int i=0; i<10; i++)
                        add((int)(Math.random()*10));
                }
            };

            System.out.println("println ile");
            System.out.println(arrayList1);
            System.out.println("------------");


            Iterator<Integer> iter = arrayList1.iterator();

            System.out.println("iterator ile");
            iter.next();
            iter.next();

            while (iter.hasNext()){
                System.out.print(iter.next() + " ");
            }
            //  iter.next(); iteration bittigi icin hata verir


            System.out.println();
            System.out.println("ArrayList.forEach()  ile");
            arrayList1.forEach(System.out::print);

            System.out.println();
            System.out.println("for loop ile");
            for (int n : arrayList1)
                System.out.print(n);
        }
    }


