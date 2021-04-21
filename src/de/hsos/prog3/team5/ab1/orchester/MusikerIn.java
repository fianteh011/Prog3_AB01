package de.hsos.prog3.team5.ab1.orchester;

public class MusikerIn extends Mitglied {
    private Instrument instrument;

    public MusikerIn(String name, Instrument instrument){
        super(name);
        this.instrument = instrument;
    }

    public  Instrument getInstrument(){
        return this.instrument;
    }
}
