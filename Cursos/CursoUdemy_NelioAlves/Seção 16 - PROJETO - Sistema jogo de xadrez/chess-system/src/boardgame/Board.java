package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];//Instanciação da matriz de peças
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//Sobrecarga do método acima
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getCollumn()] = piece;//Pega a matriz, na posição passada, e atribui a peça informada no método
		piece.position = position;//Essa chamda só ocorre por que na classe Piece o "position" foi declarado como protected. Podendo ser acessado apenas classes do pacote em que está
	}
}
