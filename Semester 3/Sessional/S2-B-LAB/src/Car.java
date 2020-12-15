public interface Car {
    void setName(String name);

    String getName();

    void setRace_type(int type);

    int getRace_type();

    void setBreak_type(int type);

    int getBreak_type();

    void setSpeed(int speed);

    int getSpeed();

    int race();

    int breaks();

    Boolean finish(int speed, int time, int Tdistance);

}
