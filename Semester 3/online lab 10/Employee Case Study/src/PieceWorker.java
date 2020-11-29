import java.time.LocalDate;

public class PieceWorker extends Employee {
    private double wagePerPiece;
    private int pieces;

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    @Override
    public String toString() {
        return "PieceWorker" + super.toString() + "\nWage Per Piece = " + getWagePerPiece() + "\nPieces Produced = "
                + getPieces();
    }

    @Override
    public double earnings() {
        return getWagePerPiece() * getPieces();
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public PieceWorker(String lastName, String firstName, Integer ssn, LocalDate birthdate, double wagePerPiece,
            int pieces) {
        super(lastName, firstName, ssn, birthdate);
        setWagePerPiece(wagePerPiece);
        setPieces(pieces);
    }
}
