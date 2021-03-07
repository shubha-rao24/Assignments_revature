package Queue_1;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1_crud {

	
		public static void main(String[] args) {

			Queue qi = new LinkedList();
			qi.add("heyy");
			qi.add(1222);
			qi.add(12.3333);
			qi.add('s');
			qi.add(true);
			qi.add(null);
			qi.add(null);
			qi.add("heyy");
			qi.add("hello");

			System.out.println(qi);

			/*Queue<Integer> qi2 = new LinkedList<>();
			qi2.add(990);
			qi2.add(990);
			qi2.add(900);
			qi2.add(null);
			qi2.add(200);
			qi2.add(290);
			qi2.add(null);
			qi2.add(290);
			qi2.add(null);
			System.out.println("qi2 : " + qi2);
			qi2.add(1, 800); //insert in specific position
			System.out.println("qi2 : " + qi2);

			qi2.set(1, 1000); //updation
			System.out.println("li2 : " + qi2);
			
			System.out.println("li2.size() : "+qi2.size());
			System.out.println("li2.get(7) : "+qi2.get(7));
			System.out.println("Accessing all elements using for loop");
			for (int i = 0; i < qi2.size(); i++) {

				System.out.println(qi2.get(i));
			}
			System.out.println("Accessing all elements using for each loop");
			for(Integer i:li2) {
				System.out.println(i);
			}
			
			li2.remove(0); //removes element from 0th index
			System.out.println("li2 : "+li2);
			Integer i=290;
			li2.remove(i);
			System.out.println("li2 : "+li2);
			
			while(li2.remove(i)) {}
			System.out.println("li2 : "+li2);
			
			System.out.println(li2.contains(null));
			System.out.println(li2.contains(200));
			System.out.println(li2.contains(100));
			
			//Collection Vs Collections
			//Collection is a root INTERFACE for all collections except Map
			//Collectons is a helper CLASS which has some static methods like binarSearch, shuffle, sort, reverse.
			
			Collections.shuffle(li2);
			System.out.println("li2 : "+li2);
			Collections.reverse(li2);
			System.out.println("li2 : "+li2);
			Collections.replaceAll(li2, null, -1);
			System.out.println("li2 after replaceAll : "+li2);
			Collections.sort(li2); //ascending order and before doing sort the list should be free from null values because null is uncomparable
			System.out.println("li2 after sort: "+li2);
			Collections.sort(li2,Collections.reverseOrder()); //descending
			System.out.println("li2 after sort reverseorder : "+li2);
			
			
			Collections.sort(li2);
			System.out.println(Collections.binarySearch(li2, 100));
			System.out.println(Collections.binarySearch(li2, 900));
			
			
			List<Integer> li3=new ArrayList<>(li2);
			System.out.println("li3 : "+li3);
			li3.addAll(li2);
			System.out.println("li3 : "+li3);
			
			li3.add(700);
			li3.add(55);
			li3.add(2900);
			li3.add(5500);
			
			
			li2.add(33);
			li2.add(44);
			
			System.out.println("li3 : "+li3);
			System.out.println("li2 : "+li2);
			
			//li3.retainAll(li2); //common between li3 and li2 will be found and result will be stored in li3
			li3.removeAll(li2); //finds the contents of li3 which are not in li2 and results will be stored in li3
			//System.out.println("li3 after retainAll(): "+li3);
			
			System.out.println("li3 after removeAll() : "+li3);*/
	}

}
