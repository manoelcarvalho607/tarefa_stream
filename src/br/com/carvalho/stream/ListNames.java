package br.com.carvalho.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author manoel.carvalho
 *
 */
public class  ListNames {
	



	
	
	
	
	public  void  NomePessoas() {
		
		Scanner s = new Scanner(System.in);

	
		
		System.out.println("----- Lista de nomes  ------");
		System.out.println("");
		System.out.println("Digite abaixo nomes masculinos e femininos separados por virgula (,)");
		System.out.println("OBS: Identifique o sexo do nome: masculino = com a letra M -maiusculo (M-xxxxxx), feminino com a letra F - maiusculo (F-xxxxx)");
		System.out.println("exemplo: ( M-João,F-maria ...)");
		System.out.println("");
		
		String nameList = s.next();
		
		
		
		String[] nomes = nameList.split(",");
		
		
		
		List<String> strList = new ArrayList<String>(Arrays.asList(nomes));
		
		List<String> result = strList.stream()
				.filter(name -> name.startsWith("F"))
				.collect(Collectors.toList());

		result.forEach(element -> System.out.println("Nome feminino: " + element));
		
		
		
		
		
		
}

	

}
