package designpattern;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }
}


//Bulworks 5k 60k
//CA technologies 11k 2.1
//Netweb Software 18k 25k 33k 4L
//Amdocs 50k 70; 78k 6-10L
//Credit Suisse 100k 150k 18-33L
//Morgan Stanley 245; 42L- 47L