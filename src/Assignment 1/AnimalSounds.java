abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    @Override
    void cats() {
        System.out.println("Cats Meow");
    }

    @Override
    void dogs() {
        throw new UnsupportedOperationException("Cats do NOT bark!");
    }
}

class Dogs extends Animals {
    @Override
    void cats() {
        throw new UnsupportedOperationException("Dogs do NOT meow!");
    }

    @Override
    void dogs() {
        System.out.println("Dogs Bark");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animals obj = new Cats();
        obj.cats();
        obj = new Dogs();
        obj.dogs();
    }
}
