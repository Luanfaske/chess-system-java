package boardgame;



public class Piece {
	
   protected boardgame.position position;
   private Board board;
   
   
public Piece(Board board) {
	this.board = board;
	position = null; // Padrao do Java o valor Nulo ja e aderido
}


protected Board getBoard() {
	return board;
}

   
   
   
}
