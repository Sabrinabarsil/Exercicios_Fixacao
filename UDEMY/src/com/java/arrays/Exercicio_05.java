package com.java.arrays;

/*
 O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
 uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.
 Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que
 retorne como resultado apenas os números pares dessa array.
 */

public class Exercicio_05 {
	public static void main(String[] args) {
		
		int[]array = { 2,3,5,7,11,13,18,34};
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %2 == 0) {
				System.out.println(array[i]);
			}
		}

	}
}
