import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack<Vertex> stack;
	
	public TopologicalOrdering(){
		this.stack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList){
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}
	
	private void dfs(Vertex vertex){
		vertex.setVisited(true);
		
		for(Vertex v:vertex.getNeighbourList()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		stack.push(vertex);
	}

	public Stack<Vertex> getStack(){
		return this.stack;
	}
	
	public void showTopologicalOrdering(){
		Stack<Vertex> tempStack = stack;
		while(!tempStack.isEmpty()){
			System.out.println(tempStack.pop()+"->");
		}
	}
	
}
