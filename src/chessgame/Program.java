package chessgame;

import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
