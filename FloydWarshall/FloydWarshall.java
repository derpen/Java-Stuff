import java.util.Scanner;

class FloydWarshall 
{ 
	final static int V = 4; 

	void floydWarshall(int graph[][]) 
	{ 
		int dist[][] = new int[V][V]; 
		int i, j, k; 

		for (i = 0; i < V; i++) 
			for (j = 0; j < V; j++) 
				dist[i][j] = graph[i][j]; 

		for (k = 0; k < V; k++) 
		{ 
			for (i = 0; i < V; i++) 
			{ 
				for (j = 0; j < V; j++) 
				{ 
					if (dist[i][k] + dist[k][j] < dist[i][j]) 
						dist[i][j] = dist[i][k] + dist[k][j]; 
				
				} 
			
			} 
		
		} 

		printSolution(dist); 
	
	} 

	void printSolution(int dist[][]) 
	{ 
		for (int i=0; i<V; ++i) 
		{ 
			for (int j=0; j<V; ++j) 
			{ 
				if (dist[i][j]==9999) 
					System.out.print("INF "); 
				else
					System.out.print(dist[i][j]+" "); 
			
			} 
			System.out.println(); 
		
		} 
	
	} 

	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		int[][] graph = new int[4][4];
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.println("Masukkan " + (i+1) + "," + (j+1));
				graph[i][j] = input.nextInt();
			}
		}
		FloydWarshall a = new FloydWarshall(); 

		a.floydWarshall(graph); 
	
	} 

} 


