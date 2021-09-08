package Chess.Pieces;

public class Bishop extends Chess.ChessGame {
    int forwardMovement;
    int sideMovement;


    public void setForwardMovement(int forwardMovement) {
        this.forwardMovement = forwardMovement+sideMovement;
    }

    public int getForwardMovement() {
        return forwardMovement;
    }
}

