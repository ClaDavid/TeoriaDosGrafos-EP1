package ep2;

import ep0.*;

import java.util.*;

public class Prim {

	public static void prim_f(GrafoPonderado G, Vertice s) {

		Vertice[] vertices = G.getVertices();
		int n = G.getTotalDeVertices();
		Vertice u;
		int custo = 0;

		for (int i = 0; i < n; i++) {
			u = vertices[i];
			u.chave = Constantes.INFINITO;
			u.pai = null;
		}

		s.chave = 0;
		FilaDePrioridade q = new FilaDePrioridade(vertices);

		while (!q.filaVazia()) {
			u = (Vertice) q.extraiMinimo();

			for (int i = 0; i < n; i++) {
				Iterator it = G.getListasDeAdjacencia()[i].iterator();

				while (it.hasNext()) {

					Arco a = (Arco) it.next();
					if (a.getOrigem().getIndice() == u.getIndice()) {
						Vertice v = a.getDestino();

						if (q.estaNaFila(v) && (a.getPeso() < v.chave)) {
							v.chave = a.getPeso();
							//System.out.println(v.chave);
							v.pai = u;
							//custo += v.chave;
						}
						//custo += v.chave;
					}
				}
			}			
		}
		//System.out.println(custo);
	}
}
