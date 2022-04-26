package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//FlatMap - Utilizado quando voc� precisar achatar uma lista.
public class ProgramEFlatMap {
	
	public static void main(String[] args) {
		
		List<List<String>> empresa = new ArrayList<>();
		List<String> coordenadores = List.of("Pedro", "Jo�o", "Maria");
		List<String> desenvolvedores = List.of("Marcos", "Peter", "Bianca");
		List<String> estagiarios = List.of("Vanessa", "Thiago", "Bruno");
		
		empresa.add(coordenadores);
		empresa.add(desenvolvedores);
		empresa.add(estagiarios);
		
		for (List<String> colaborador: empresa) {
			for (String pessoa : colaborador) {
				System.out.println(pessoa);
			}
		}
		
		System.out.println("-----");
		
		empresa.stream()
				.flatMap(Collection::stream).forEach(System.out::println);
		
		
	}

}
