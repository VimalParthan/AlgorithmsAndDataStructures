import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader("map", 7, 7);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(),fileReader.getStartPositionCol());
		mazeSolver.findWayOut();

	}

}
