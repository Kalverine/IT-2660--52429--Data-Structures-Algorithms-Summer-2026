class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String [] vertices = {"Liberal Arts", "Student Services", "Health Careers & Sciences",
      "Health Technologies Center", "Recreation Center", "Technology Learning Center",
      "Business & Technology", "Theater"};
    
    // 2-Define Edges
    int [][] edges = {
      {0,1}, {1,0}, {0,7}, {7,0}, {1,2} {2,1}, {1,5}, {5,1}, {1,6}. {6,1}, {1,7}, {7,1}
      {2,3}, {3,2}, {2,4}, {4,2}, {4,5}, {5,4}, {5,6}, {6,5}, {6,7}, {7,6}
    
    // 3. Create the graph (name "graph") using the vertices and edges
        UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);
      
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
      UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);
    
    // 5. Retrieve and print the search order of the DFS traversal
      System.out.println("DFS Order: " + dfs.getSearchOrder());
      
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
      System.out.println("\nParent-Child Relationships:");
      for (int i = o; i < vertices.length; i++) {
        System.out.println(vertices[i] + " -> Parent: " + (dfs.getParent(i) != -1 ? vertices[dfs.getParent(i)] : "None"));
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
        System.out.println("\nPaths from Business & Technology:");
        System.out.print("To Health Tech Center: "); dfs.printPath(3); System.out.println();
       System.out.print("To Student Services: "); dfs.printPath(1); System.out.println();
        System.out.print("To Recreation Center: "); dfs.printPath(4); System.out.println("\n");
     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
        System.out.println("Entire DFS Tree:");
        dfs.printTree();
    
  }
}
