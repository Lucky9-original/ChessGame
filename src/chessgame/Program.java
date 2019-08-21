package chessgame;

import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();
        
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println("");
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(tec);
            
            System.out.println("");
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(tec);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
        
    }
    
}
