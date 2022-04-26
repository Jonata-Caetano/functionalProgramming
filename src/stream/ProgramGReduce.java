package stream;

import java.util.List;

//Reduce - É uma operação terminal onde você obtera um resultado único a partir de uma sequencia de elementos.
public class ProgramGReduce {
	
	public static void main(String[] args) {
		
		List<Integer> integers = List.of(1,2,3,4,5,6);
	
	//Utilizando a soma com Reduce	
	integers.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(0, (x,y) -> x+y));
		
	System.out.println("----");
	
	integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(0, Integer::sum));
	
	System.out.println("----");
	
	//Utilizando a multiplicação com Reduce
	integers.stream().reduce((x,y) -> x*y).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(1, (x,y) -> x*y));
	
	System.out.println("----");
	
	//Utilizando o max com Reduce
	System.out.println(integers.stream().reduce(Integer::max));
	
	}

}
