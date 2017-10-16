import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	private int[][] map;
	private String fileName;
	private int numOfRows;
	private int numOfColumns;
	private int startPositionCol;
	private int startPositionRow;

	public FileReader(String filename, int numOfRows, int numOfColumns) {
		this.fileName = filename;
		this.numOfColumns = numOfColumns;
		this.numOfRows = numOfRows;
		this.map = new int[numOfRows][numOfColumns];
	}

	public void parseFile() throws FileNotFoundException {


			Scanner scanner = new Scanner(new File(this.fileName));

			for (int i = 0; i < this.numOfRows; i++) {
			
				for (int j = 0; j <this.numOfColumns; j++) {
				
					map[i][j] = scanner.nextInt();

					if (map[i][j]==2) {
						startPositionCol = j;
						startPositionRow = i;
					}
				}
		
			}
			scanner.close();
		
	}

	public int[][] getMap() {
		return map;
	}

	public String getFileName() {
		return fileName;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public int getNumOfColumns() {
		return numOfColumns;
	}

	public int getStartPositionCol() {
		return startPositionCol;
	}

	public int getStartPositionRow() {
		return startPositionRow;
	}


	
	
}
