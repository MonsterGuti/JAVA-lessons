package SU2;

class Instrument {
    String name;

    void play() {
        System.out.println("Generic instrument sound.");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Strum!");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Plink plonk!");
    }
}

public class musicalInstruments {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Instrument(),
                new Guitar(),
                new Piano()
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
