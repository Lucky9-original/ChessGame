package chessgame;

import boardgame.BoardException;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();
        
        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println("");
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(tec);

                System.out.println("");
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(tec);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException e){
                System.out.println(e.getMessage());
                tec.nextLine();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                tec.nextLine();
            }
            
        }
        
    }
    
}
