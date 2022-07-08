// Steven Joseph
// COP3503 , Fall 2021
// UCFID: 4447224, NID: st135587

import java.io.*;
import java.util.*;

class TopoPaths
{
	public static boolean [][] matrix;
	public static int ans;

	public static void topoSort()
	{
		int [] incoming = new int[matrix.length];
		int cnt = 0;

		// Counting the number of incoming edges incident to each to vertex.
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				incoming[j] += (matrix[i][j] ? 1 : 0);
			}
		}

		Queue<Integer> q = new ArrayDeque<Integer>();

		// Any vertex with no incoming edges is ready to be visited,
		// so add it to the queue and mark it as visited.
		for (int i = 0; i < matrix.length; i++)
		{
			if (incoming[i] == 0)
			{
				q.add(i);
			}
		}

		// Pulling out a vertex from the queue and adding it to the topological sort.
		while (!q.isEmpty())
		{
			int node = q.remove();

			// Number of unique vertices.
			++cnt;

			// Decrementing the incoming edge counts of all of the vertices that can be reached
			// from the current vertex. If one hits 0, add it to the queue to be included in the
			// topological sort.
			for (int i = 0; i < matrix.length; i++)
			{
				if (matrix[node][i] && --incoming[i] == 0)
				{
					q.add(i);
				}
			}
		}

		// Checking the number of unique vertices and deciding if it is a valid sort.
		if (cnt == 1)
		{
			ans = 1;
		}
		else
		{
			ans = 0;
		}
	}

	public static int countTopoPaths(String filename)
	{	
		try
		{
			// Using the input file to initialize "matrix".
			Scanner in = new Scanner(new File(filename));
			int V = in.nextInt();

			matrix = new boolean[V][V];

			for (int i = 0; i < V; i++)
			{
				for (int j = 0; j < V; j++)
				{
					if (in.hasNextInt())
					{
						matrix[i][j] = (in.nextInt() == 1);
					}
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		topoSort();

		return ans;
	}

	// Returns a double representing the rating of difficulty I give for this assignment.
	public static double difficultyRating()
	{
		return 3.5;
	}

	// Returns a double indicating the number of hours spent working on this assignment.
	public static double hoursSpent()
	{
		return 9.5;
	}
}