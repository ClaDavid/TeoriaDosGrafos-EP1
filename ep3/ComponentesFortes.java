package ep3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import ep0.*;

public class ComponentesFortes {
	
	
//	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		Grafo G = new Grafo();
		G.leDoTeclado();
		Vertice[] vertices = G.getVertices();
		
		// for (int i = 0; i < G.getListasDeAdjacencia().length; i++) {
		// 	Iterator it = G.getListasDeAdjacencia()[i].iterator();

		// 	while (it.hasNext()) {
		// 		Arco a = (Arco) it.next();
		// 		//System.out.println(a.getOrigem().getIndice()+"-"+a.getOrigem().getNome()+"------>" +a.getDestino().getIndice()+"-"+ a.getDestino().getNome());
		// 	}}
		
		
		
		DFS.dfs_f(G,false);
// 		for(Vertice vertice: G.getVertices()){
// 			//System.out.print(vertice.getNome()+" "+vertice.d + " " + vertice.f + ": \t");
// //			//System.out.print(vertice.f + ": \t");
// 		}
		//Arrays.sort(G.getVertices(), new ComparatorVertice());
		
		Grafo transposto = G.getGrafoTransposto();
		//System.out.println("\n\n\n\n\n");
		//System.out.println("************************"+ transposto.getTotalDeArcos());
		// for (int i = 0; i < transposto.getListasDeAdjacencia().length; i++) {
		// 	Iterator it = transposto.getListasDeAdjacencia()[i].iterator();

		// 	while (it.hasNext()) {
		// 		Arco a = (Arco) it.next();
		// 		System.out.println(a.getOrigem().getIndice()+"-"+a.getOrigem().getNome()+"------>" +a.getDestino().getIndice()+"-"+ a.getDestino().getNome());
		// 	}}
		
		
//		for(Vertice vertice: transposto.getVertices()){
//			System.out.print(vertice.getNome()+" "+vertice.d + " " + vertice.f + ": \t");
//		}
		DFS.dfs_f(transposto,true);
		
		
//		for(Vertice vertice: transposto.getVertices()){
////			System.out.print(vertice.getNome() + "\t");
//			System.out.print(vertice.getNome()+" "+vertice.d + " " + vertice.f + ": \t");
//		}
//		for(Vertice vertice: transposto.getVertices()){
//			System.out.print(vertice.getNome()+" "+vertice.d + " " + vertice.f + ": \t");
//		}
	}
	
	
}
