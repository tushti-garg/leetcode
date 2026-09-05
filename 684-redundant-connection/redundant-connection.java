import java.util.*;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        
     
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
         
            if (hasPath(u, v, graph, n)) {
                return edge;
            }
           
            graph[u].add(v);
            graph[v].add(u);
        }
        return new int[0];
    }

    private boolean hasPath(int src, int target, ArrayList<Integer>[] graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.add(src);
        visited[src] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.remove();
            if (node == target) {
                return true;
            }
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
}
