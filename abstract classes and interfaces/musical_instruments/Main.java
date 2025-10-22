package lab_5.musical_instruments;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Violin(),
                new Drum(),
                new Instrument()
        };
        for (Instrument i : instruments) {
            i.play();
        }
    }
}
