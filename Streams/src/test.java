import java.util.stream.Stream;


public class test {
	public static void main(String... args){

		Stream<String> names = Stream.of("Johnny","John","Anna","John","Sue");

		names.map(String::toUpperCase);
		names.forEach(System.out::println);




	}
}
