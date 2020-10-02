package se.lecixon.dao.sequencers;

public class AccountSequencer {
    private static int sequencer;

    public static int nextId(){
        return ++sequencer;
    }

    public static int getSequencer() {
        return sequencer;
    }

    public static void setSequencer(int sequencer) {
        AccountSequencer.sequencer = sequencer;
    }
}
