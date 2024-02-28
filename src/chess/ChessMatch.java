package chess;

import boardgame.Board;
import boardgame.position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
  private Board board;
  
  public ChessMatch() {
	  board = new Board(8,8);
	  InitialSetup();
  }
  public ChessPiece[][] getPieces(){
	  ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
	  for (int i=0; i<board.getRows(); i++) {
		  for(int j=0; j<board.getColumns(); j++) {
			  mat[i][j] = (ChessPiece)board.piece(i,j);
		  }
	  }
	  return mat;
  }
  
  private void InitialSetup() {
	  board.placePiece(new Rook(board,Color.WHITE), new position(2,1));
	  board.placePiece(new King(board,Color.BLACK), new position(0,4));
	  board.placePiece(new King(board,Color.WHITE), new position(7,4));
  }
  
  
}