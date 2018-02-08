import java.util.*;

/**
 * Practice using a Set.
 * @author Katapon Sinpunywaong.
 */
public class SetPractice{
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		System.out.print("add");
		for(String args : values) 
		{
			System.out.print(" "+args);
			set.add(args);
		}
		System.out.println();
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		System.out.print("Set contain:");
		Iterator<String> tier = set.iterator();
		while(tier.hasNext()) 
		{
			System.out.print(" "+tier.next());
		}
		System.out.println();
		
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer() {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		System.out.println("---- HashSet version ----");
		Set<String> set = new HashSet<String>();
		addAll(set, "dog", "ant", "bird", "elephant", "cat", "zebra");
		
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
		print(set);
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		System.out.println("Clear element");
		set.clear();
		
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set, "bird", "ant", "cat", "dog", "elephant", "zebra");
		
		// 6. Print the elements in the set.  Is the order same as before?
		print(set);
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		addAll(set, new String("cat"), new String("dog"));
		
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate
		print(set);
		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
		System.out.println("---- TreeSet version ----");
		Set<String> set2 = new TreeSet<String>();
		addAll(set2, "dog", "ant", "bird", "elephant", "cat", "zebra");
		print(set2);
		System.out.println("Clear element");
		set2.clear();
		addAll(set2, "bird", "ant", "cat", "dog", "elephant", "zebra");
		print(set2);
		System.out.println("Add duplicate items to the set ");
		addAll(set2, new String("cat"), new String("dog"));
		print(set2);
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		
		// 10. Repeat again using TreeSet with a Comparator.
		System.out.println("|---> TreeSet Comparator <---|");
	
		Comparator<String> compare = new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				
				return arg0.compareTo(arg1);
			}
		};
		
		Set<String> tcset = new TreeSet<String>(compare);
		addAll(tcset, "dog", "ant", "bird", "elephant", "cat", "zebra");
		print(tcset);
		System.out.println("Clear element");
		set2.clear();
		addAll(tcset, "bird", "ant", "cat", "dog", "elephant", "zebra");
		print(tcset);
		System.out.println("Add duplicate items to the set ");
		addAll(tcset, new String("cat"), new String("dog"));
		print(tcset);
		
	}

	public static void main(String[] args) {
		setExplorer();
		
	}
}
