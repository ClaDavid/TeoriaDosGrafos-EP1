package ep4;

import ep0.*;

import java.util.*;

public class MatrizDeDistancias {

	public static void main(String args[]) {
		GrafoPonderado G = new GrafoPonderado();
		// leitura do grafo via teclado
		G.leDoTeclado();
		Vertice[] verts = G.getVertices();

		for (int i = 0; i < verts.length; i++) {
			BFS.bfs_f(G, verts[i]);
			calculaMatrizDistancias(G, verts[i].getNome());
		}
		System.out.println("");
	}

	public static void calculaMatrizDistancias(GrafoPonderado G, String nomeVerticeInicial) {
		System.out.println("");
		for (Vertice vertice : G.getVertices()) {
			if (vertice.d == 999999) {
				System.out.print(". ");
			} else {
				System.out.print(vertice.d + " ");
			}
		}
	}
}

