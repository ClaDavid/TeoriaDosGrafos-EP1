package ep3;

import java.util.Iterator;

import ep0.*;

public class DFS {
	static int tempo = 0;
	
	public static void dfs_f(Grafo G,boolean isPrint) {
		tempo = 0;
		Vertice[] vertices = G.getVertices(); // pega os vertices do grafo
		int n = G.getTotalDeVertices(); // pega o numero de vertices do grafo
		Vertice u;
		int aux = 0;
		
		for(int i = 0; i < n; i++){
			u = vertices[i];
			u.cor = Cores.BRANCO;
		}
		//int tempo = 0;
		
		for(int i = 0; i < n; i++){
			u = vertices[i];
			if(u.cor == Cores.BRANCO){
				visitaDFS(G, u);
				aux++;
			}
		}
		if(isPrint){
		System.out.println(aux + "\n");
		}
	}

	public static void visitaDFS(Grafo G, Vertice u) {
		
		tempo = tempo + 1;

		Vertice[] vertices = G.getVertices(); // pega os vertices do grafo
		int n = G.getTotalDeVertices(); // pega o numero de vertices do grafo

		// for (int i = 0; i < n; i++) {
		// u = vertices[i];
		// }
		u.d = tempo;
		u.cor = Cores.CINZA;

		for (int i = 0; i < n; i++) {
			Iterator it = G.getListasDeAdjacencia()[i].iterator();

			while (it.hasNext()) {
				Arco a = (Arco) it.next();

				if (a.getOrigem().getIndice() == u.getIndice()) {
					Vertice v = a.getDestino();
					
					if (v.cor == Cores.BRANCO){
						if(u.getNome().equals("z") && v.getNome().equals("w")){
							System.out.println(" nao deveria passar aqui");
						}
						visitaDFS(G, v);
					}
				}
			}
		}

		tempo = tempo + 1;
		u.f = tempo;
		u.cor = Cores.PRETO;

	}

}
