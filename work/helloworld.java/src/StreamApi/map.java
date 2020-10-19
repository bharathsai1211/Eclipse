package StreamApi;

import java.util.stream.Stream;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String>stream= Stream.of("avichal","sahitya","shivam","tushar","naresh");
	      /*
	       Function<String,Integer>function=e->e.length();
	       Stream<Integer>numberStream= stream.map(function);
	        Consumer<Integer>consumer=System.out::println;
	       numberStream.forEach(consumer);
	       */
	        //in one line
	       // stream.map(e->e.length()).forEach(System.out::println);
	       // stream.map(e->e.length()).forEach(x->System.out.println(x));
			stream.forEach(x->System.out.println(x));
			stream.map(e->e.length()).skip(2).forEach(System.out::println);
	}

}
