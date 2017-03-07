package dpg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	
		/*Arrays.asList("a1","a2","a3")
		       .stream()
		       .findFirst()
		       .ifPresent(System.out::println);
		       
		Stream.of("a1","a2","a3")
				.map(s->s.substring(1))
				.mapToInt(Integer::parseInt)
				.max()
				.ifPresent(System.out::println);
		
		Arrays.stream(new int[]{1,2,3})
		.map(m->2*m)
		.average()
		.ifPresent(System.out::println);
		
		Stream.of(1.0, 2.0, 3.0)
        .mapToInt(Double::intValue)
        .mapToObj(i -> "a" + i)
        .forEach(System.out::println);*/

		Set<String> set1=new HashSet<String>();
		set1.add("Ram");
		set1.add("Shyam");
		set1.add("Dpg");
		set1.add("Myam");
		
		//testSet(set1);
	


/*	private static void testSet(Set<String> set) {
		//System.out.println(set);
		for(String element:set){
			System.out.println(element);
		}
		*/
		Set<String> set2=new TreeSet<String>();
		set2.add("Ram");
		set2.add("Dpg");
		set2.add("siddhu");
		
		Set<String> intersection= new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		
		Set<String> difference =new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
	}
	
}
