import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class App2 {
	
	public static void main(String args[])
	{
		
		
//		converting  array to stream 
			
//		Integer[] narr = {23,45,67,12,45,78,90,34,21,67,56,78};
//		Stream<Integer> narrStream =  Arrays.stream(narr);
//		
//		
//		
//		List data = narrStream.filter((n)->n%2==0).collect(Collectors.toList());
		
//		  narrStream
//		  
//		  .limit(5)
//		  .skip(1)
//		  .forEach((n)->System.out.println(n));
		  
		  
//		narrStream
//		.sorted((a,b)->b-a)
//		.distinct()
//		.forEach((n)->System.out.println(n));
		 
		 
		
		 
		 
		 
	
		
		
		
		
//		converting a list to stream 
		
//		List<String> names = new ArrayList();
//		
//		names.add("Thor");
//		names.add("Ironman");
//		names.add("Captain America");
//		names.add("Superman");
//		names.add("Black Widow");
//		
//		Stream<String> namesStream =  names.stream();
//		
//		namesStream
//		.filter((name)->name.contains("o")) 
//		.peek((name)->System.out.println(name))
//		.filter((name)->name.contains("i"))
//		.forEach((name)->System.out.println(name));
		
		
//		creating a stream from direct values 
		
//		Stream<Integer> anyStream = Stream.of(23,45,67);
		
		
//		creating a stream from iteration 
		
//		Stream<Integer> itrStream = Stream.iterate(1, n->n+1).limit(100);
//		
//		itrStream.forEach((v)->System.out.println(v));
		
		
		
		
//		List list1 = Arrays.asList(23,45,67);
//		
//		List list2 = Arrays.asList(45,66,89);
//		
//		List list3 = Arrays.asList(22,45,21);
//		
//		List<List<Integer>> mainList = new ArrayList();
//		
//		mainList.add(list1);
//		mainList.add(list2);
//		mainList.add(list3);
//		
//		System.out.println(mainList);
//		
//		[[1,2,3],[2,3,4],[,5,7,8]]
//		
//		[1,2,3,2,3,4,5,7,8]
		
//		List newList = mainList.stream()
//		.flatMap((l)->l.stream().filter((n)->n%2==0))
//		.collect(Collectors.toList());
		
		
//		System.out.print(newList);
		
		
//		List cats = Arrays.asList("Lion","Tiger","Leopard");
//		List waterAnimals = Arrays.asList("Gold Fish","Shark","Whale");
//		List amphibian = Arrays.asList("Frog","Snake");
//		
//		List<List<String>> animals = new ArrayList();
//		animals.add(waterAnimals);
//		animals.add(cats);
//		animals.add(amphibian);
//		
//		System.out.println(animals);
//		
//		List<String> newList = animals.stream() 
//		.flatMap((l)->l.stream())
//		.collect(Collectors.toList());
//		
//		System.out.println(newList);
		
		
		
		
//		List<Integer> data = Arrays.asList(23,45,67,89,21);
//		
//		
//		 Integer a = data.stream()
//		.reduce((v1,v2)->v1>v2 ? v1 : v2)
//		.get();
//		
//		 
//		 System.out.println(a);
		
		
				
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
	}
	
	
}
