package de.hsos.prog3.team5.ab1.orchester;

import java.util.Objects;

public class MusikerIn extends Mitglied {
    private Instrument instrument;

    public MusikerIn(String name, Instrument instrument){
        super(name);
        this.instrument = instrument;
    }

    public  Instrument getInstrument(){
        return this.instrument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusikerIn)) return false;
        MusikerIn musikerIn = (MusikerIn) o;
        return getInstrument() == musikerIn.getInstrument();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstrument());
    }
}
