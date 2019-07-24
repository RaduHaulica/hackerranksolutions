import java.util.*;
import java.util.stream.Collectors;


/**
 * basic graph node class
 */
class Vertex {
    public String label;
    Vertex(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object vp) {
        Vertex v = (Vertex)vp;
        return v.label.equals(this.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}

/**
 *  graph class
 *  basic for now, directed by default
 *  remove commented line in addEdge() function to make it undirected
 */
class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    Graph() {
        adjVertices = new HashMap();
    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
//        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> lV1 = adjVertices.get(v1);
        List<Vertex> lV2 = adjVertices.get(v2);
        if (lV1 != null)
            lV1.remove(v2);
        if (lV2 != null)
            lV2.remove(v1);
    }

    /**
     * retrieves adjacency list
     */
    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    /**
     * retrieves node set
     */
    Set<Vertex> getVertices() { return adjVertices.keySet();}

    /**
     * utility function that generates a graph for testing purposes
     */
    Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addVertex("Wildcard");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        graph.addEdge("Wildcard", "Mark");
        return graph;
    }
}

public class Main {

    /**
     * DFS
     */
    public static Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }

    /**
     * BFS
     */
    public static Set<String> breadthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }


    /**
     * checks a directed graph for cycles starting from vertex v
     * recursive utility function for isGraphCyclicDirected()
     */
    public static boolean checkForCyclesDirected(Graph g, Vertex v, ArrayList<Vertex> visited, ArrayList<Vertex> recursionStack) {
        System.out.println("Checking :" + v.label);
        if (recursionStack.contains(v)) {
            System.out.println("recursionStack contains :" + v.label);
            return true;
        }
        if (visited.contains(v)) return false;
        visited.add(v);
        recursionStack.add(v);
        for (Vertex vert : g.getAdjVertices(v.label)) {
            if (checkForCyclesDirected(g, vert, visited, recursionStack))
                return true;
        }
        recursionStack.remove(v);
        return false;
    }

    /**
     * checks an undirected graph for cycles starting from vertex v
     * recursive utility function for isGraphCyclicUndirected()
     */
    public static boolean checkForCyclesUndirected(Graph g, Vertex v, ArrayList<Vertex> visited, Vertex parent) {
        System.out.println("Checking for :" + v.label);
        visited.add(v);
        Vertex vert;
        Iterator<Vertex> iter = g.getAdjVertices(v.label).iterator();
        while (iter.hasNext()) {
            vert = iter.next();
            // recur for unvisited adjacent vertices
            if (!visited.contains(vert)) {
                if (checkForCyclesUndirected(g, vert, visited, v)) {
                    return true;
                }
//                if visited and not parent of current vertex => cycle detected
            } else if (!vert.equals(parent)) {
                System.out.println("Found :" + vert.label + " different from parent :" + parent.label);
                return true;
            }
        }
        return false;
    }

    /**
     * checks if there are any cycles in directed graph g
     */
    public static boolean isGraphCyclicDirected(Graph g) {
        ArrayList<Vertex> visited = new ArrayList<Vertex>();
        ArrayList<Vertex> recursionStack = new ArrayList<Vertex>();

        for (Vertex v : g.getVertices()) {
            if (checkForCyclesDirected(g, v, visited, recursionStack)) return true;
        }
        return false;
    }

    /**
     * checks if there are any cycles in undirected graph g
     */
    public static boolean isGraphCyclicUndirected(Graph g) {
        ArrayList<Vertex> visited = new ArrayList<>();

        for (Vertex v : g.getVertices()) {
            if (!visited.contains(v)) {
                if (checkForCyclesUndirected(g, v, visited, new Vertex(""))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * recursive utility function for topologicalSort()
     */
    public static void topologicalRecursive(Graph graph, Vertex v, ArrayList<Vertex> visited, Stack stack) {
        // mark visited
        visited.add(v);
        Vertex vert;

        // recur for adjacent vertices
        Iterator<Vertex> iter = graph.getAdjVertices(v.label).iterator();
        while (iter.hasNext()) {
            vert = iter.next();
            if (!visited.contains(vert)) {
                topologicalRecursive(graph, vert, visited, stack);
            }
        }

        // push current node to result stack
        stack.push(v);
    }

    /**
     * prints topological sort of graph g
     */
    public static void topologicalSort(Graph graph) {
        Stack<Vertex> stack = new Stack<Vertex>();
        ArrayList<Vertex> visited = new ArrayList<Vertex>();

        // get topological recursive data from all vertices
        for (Vertex v : graph.getVertices()) {
            if (!visited.contains(v)) {
                topologicalRecursive(graph, v, visited, stack);
            }
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop().label + " ");
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        // testing out the functions above
        Graph graph = new Graph();
        graph = graph.createGraph();

        Set<String> dfs = depthFirstTraversal(graph, "Bob");
        System.out.println(dfs);

        Set<String> bfs = breadthFirstTraversal(graph, "Bob");
        System.out.println(bfs);
        
        System.out.println(isGraphCyclicUndirected(graph));

        topologicalSort(graph);
    }
}
