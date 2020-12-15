public interface Track {
    void setTrackLength(int Tdistance);

    int getTrackLength();

    Boolean isTurn(int speed, int time);

    Boolean isSpeedBreaker(int speed, int time);
}
