package tb.soft;

import java.util.*;

public class PersonCollections {
	public static List<Person> al = new ArrayList<Person>();
	public static List<Person> ll = new LinkedList<>();
	public static Set<Person> ts = new TreeSet<>();
	public static Set<Person> hs = new HashSet<>();
	public static Map<Integer, Person> tm = new TreeMap<>();
	public static Map<Integer, Person> hm = new HashMap<>();
	public static PersonComparator x = new PersonComparator();

	public static class PersonComparator implements Comparator<Person> {

		@Override
		public int compare(Person p1, Person p2) {
			return Integer.compare(p1.getBirthYear(), p2.getBirthYear());
		}
	}

	public static void addToCollections(Person person) {
		al.add(person);
		ll.add(person);
		ts.add(person);
		hs.add(person);
		tm.put(Integer.valueOf(person.hashCode()),person);
		hm.put(Integer.valueOf(person.hashCode()),person);
	}

	public static void addTwoElementsToCollections(Person person){
		for (int i = 0; i < 2; i++){
			al.add(person);
			ll.add(person);
			ts.add(person);
			hs.add(person);
			tm.put(Integer.valueOf(person.hashCode()),person);
			hm.put(Integer.valueOf(person.hashCode()),person);
		}
	}

	public static void displayAllCollections() {
		System.out.println("\n al \n");
		for (Person person : al) {
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
		System.out.println("\n ll \n");
		for (Person person : ll) {
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
		System.out.println("\n ts \n");
		for(Person person:ts){
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
		System.out.println("\n hs \n");
		for(Person person:hs){
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
		System.out.println("\n tm \n");
		for(Person person:tm.values()){
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
		System.out.println("\n hm \n");
		for(Person person:hm.values()){
			System.out.println(String.format("%10s, %10s, %4d, %10s",person.getFirstName(), person.getLastName(), person.getBirthYear(), person.getJob()));
		}
	}

	public static void ageComparator(){
		Collections.sort(al, x);
		Collections.sort(ll, x);
	}
}
