package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

@Component
public class FakeSpitterRepository implements SpitterRepository{

    public Spitter save(Spitter spitter) {
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
    }
}
