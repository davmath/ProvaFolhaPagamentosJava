package controllers;

import java.util.ArrayList;



import models.Folha;

public class FolhaController {

	private static ArrayList<Folha> folhas = new ArrayList<Folha>();

	public static boolean cadastrarFolha (Folha folha){
		folhas.add(folha);
		return true;
	}
	
}