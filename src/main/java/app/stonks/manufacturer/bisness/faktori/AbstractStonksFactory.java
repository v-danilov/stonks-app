package app.stonks.manufacturer.bisness.faktori;

import app.stonks.manufacturer.bisness.entities.IStonk;
import java.util.Random;

public abstract class AbstractStonksFactory {

    protected AbstractStonksFactory() {
    }

    public static AbstractStonksFactory getRandomStonksFactory() {
        Random random = new Random();
        final int factoryNumber = random.nextInt(3) + 1;
        switch (factoryNumber) {
            case 1:
                return new StonksFactory1();
            case 2:
                return new StonksFactory2();
            case 3:
                return new StonksFactory3();
            default:
                throw new IllegalStateException();
        }
    }

    protected abstract IStonk produceStonk();
}
