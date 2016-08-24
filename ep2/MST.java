package ep2;

import ep0.*;

import java.util.*;

public class MST {
	public static void main(String args[]) {
		GrafoPonderado G = new GrafoPonderado();
		G.leDoTeclado();
		Vertice[] vertices = G.getVertices();

		//for (int i = 0; i < vertices.length; i++) {
			Prim.prim_f(G, vertices[0]);
			//System.out.println("passei 0");
			int custo = 0;
			for(Vertice vertice: G.getVertices()){
//				if(vertice.pai == null){
//					System.out.println("sempai "+ vertice.getNome() + " " + vertice.chave); 
//				}else{
//				System.out.println(vertice.getNome() +" "+ vertice.pai.getNome() + " " + vertice.chave);
//				}
				custo+= vertice.chave;
			}
				
			System.out.println(custo);
			//calculaMST(G, vertices[i].getNome());
		//}

	}

	/*public static void calculaMST(GrafoPonderado G, String nomeVerticeInicial) {
		System.out.println("");
		for (Vertice vertice : G.getVertices()) {
			
		}
	}*/

}
