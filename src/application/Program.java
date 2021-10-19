package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch chessmath = new ChessMatch();
		UI.printBoard(chessmath.getPieces());

	}

}
