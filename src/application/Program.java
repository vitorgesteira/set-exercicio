package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//conjunto de cursos
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		//preenche os conjuntos com os alunos em seus respectivos cursos
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
		for(int i=0; i<students; i++) {
			a.add(sc.nextInt());			
		}
		System.out.print("How many students for course B? ");
		students = sc.nextInt();
		for(int i=0; i<students; i++) {
			b.add(sc.nextInt());			
		}
		System.out.print("How many students for course C? ");
		students = sc.nextInt();
		for(int i=0; i<students; i++) {
			c.add(sc.nextInt());			
		}
		
		//um novo conjunto para unir os alunos dos cursos do professor comparando se tem repetição de alunos
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);		
		
		//imprimi quantidade de alunos o professor tem 
		System.out.println("Total students: " + total.size());		
		
		sc.close();
	}

}
