package br.com.carvalho.stream;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Stream;



public class ListPeople {
	
	private Integer sexo;
	
	private String[] nome;
	
	ListPeople(String[] nome ){
		this.nome = nome;
	}
	
	ListPeople() {
		
	}
	
	
	
	
	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	
    public void generoSexo() {
    	
    			
    		
    			 try (Scanner s = new Scanner(System.in)) {
					ListPeople listaDeGenero = new ListPeople();

					System.out.println("----- Lista de nomes separada por Gênero ------");
					System.out.println("");
					System.out.println("Escolha o tipo de gênero?");
					System.out.println("masculino (digite= 1) - feminino (digite= 2)");
					System.out.println("");
					
					Integer sexo = s.nextInt();
					if(sexo.equals(1)) {
						listaDeGenero.generoLista(sexo);
						
					}else if(sexo.equals(2)) {
						listaDeGenero.generoLista(sexo);
						
					}else{
						System.err.println("Opção inválida, digite - 1 para masculino ou 2 - para feminino");
					}
    			 } catch(  InputMismatchException InputMismatchException) {
					System.err.println("Opção inválida, digite - 1 para masculino ou 2 - para feminino");
    			 	}
    					
				
		
	}



	public void generoLista(Integer sexo){

		 ListPeople listPeople = new ListPeople();
		
		
		try (Scanner s = new Scanner(System.in)) {
			String nomeResposta;
			
			if(sexo == 1) {
				System.out.println("Escreva os nomes masculinos abaixo separados por virgula (,):");
				nomeResposta = s.next();
				
				
				
				String[] nomes = nomeResposta.split(",");
				
				Arrays.sort(nomes);
				
				listPeople.setNome(nomes);
			
				System.out.println("");
				System.out.println("*** lista com nomes masculinos ***");
				System.out.println("");
			
				
				
				List<String> listaDeNomes = Arrays.asList(nomes);
				
				listaDeNomes.stream()
							
								.forEach(l -> System.out.println("nomes Masculinos: " + l));
				
				
				
				System.out.println("");
		
				
			
				
			}else if(sexo == 2) {
				System.out.println("Escreva os nomes femininos abaixo separados por virgula (,):");
				 nomeResposta = s.next();
				
				String[] nomes = nomeResposta.split(",");
				 listPeople.setNome(nomes);
				
				Arrays.sort(nomes);
				
			
				System.out.println("");
				System.out.println("*** lista com nomes femininos ***");
				System.out.println("");
				List<String> listaDeNomes = Arrays.asList(nomes);
				
				listaDeNomes.stream()
								.forEach(l -> System.out.println("nomes femininos: " + l));
				
				
				
				
			//	System.out.println("nomesfemininos: " + Arrays.toString(listPeople.getNome()));
					
				
			}else {
				System.err.println("!!! Opção invalida tente novamente !!!");
			}
		}
		
	}
	
	
	
	
	
	

	
}
