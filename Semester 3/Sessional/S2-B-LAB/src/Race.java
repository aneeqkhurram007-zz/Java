import java.util.*;

public class Race implements Car, Track {
    String name;
    int race_type;
    int break_type;
    int speed;
    int trackLength = 12;
    Random random = new Random();

    @Override
    public String getName() {
        return name;
    }

    @Override

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public int getRace_type() {
        return race_type;
    }

    @Override

    public void setRace_type(int race_type) {
        if (race_type == 1) {
            setSpeed(getSpeed() + 10);
        } else {
            setSpeed(getSpeed() + 5);
        }

    }

    @Override

    public int getBreak_type() {
        return break_type;
    }

    @Override

    public void setBreak_type(int break_type) {
        if (break_type == 1) {
            setSpeed(getSpeed() - 50);
        } else {
            setSpeed(getSpeed() - 30);
        }
    }

    @Override

    public int getSpeed() {
        return speed;
    }

    @Override

    public void setSpeed(int speed) {
        if (speed <= 150) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    @Override

    public int getTrackLength() {
        return trackLength;
    }

    @Override

    public void setTrackLength(int trackLength) {
        if (trackLength <= 10) {
            this.trackLength = trackLength;
        }
    }

    @Override
    public Boolean isTurn(int speed, int time) {
        if (speed >= 40 && speed <= 60) {
            return true;
        } else if (speed >= 80 && speed <= 100) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean isSpeedBreaker(int speed, int time) {
        if (speed >= 20 && speed <= 30) {
            return true;
        } else if (speed >= 40 && speed <= 50) {
            return true;
        } else if (speed >= 60 && speed <= 70) {
            return true;
        } else if (speed >= 80 && speed <= 90) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int race() {
        int total_distance = 0;
        for (int i = 0; i < 10; i++) {
            setSpeed(random.nextInt(150) + 1);
            System.out.println("Speed = " + getSpeed());
            System.out.println("Speed Breaker = " + isSpeedBreaker(getSpeed(), i));
            System.out.println("Track turn = " + isTurn(getSpeed(), i));
            setRace_type(random.nextInt(2));
            System.out.println("Acceleration increased = " + getRace_type());
            total_distance += (getSpeed() * i) / 60;
        }
        return total_distance;
    }

    @Override
    public int breaks() {
        System.out.println("Race has been terminated");
        System.exit(0);
        return 0;

    }

    @Override
    public Boolean finish(int speed, int time, int Tdistance) {
        if (speed == 150 && Tdistance == 12) {
            return true;

        } else {
            return false;
        }
    }

    public Race(String name, int speed) {
        setName(name);
        setSpeed(speed);
    }
}
