package app.stonks.manufacturer.bisness.faktori;

import app.stonks.manufacturer.bisness.entities.IStonk;
import app.stonks.manufacturer.bisness.entities.Stonk2;

public class StonksFactory2 extends AbstractStonksFactory {
    @Override
    protected IStonk produceStonk() {
        return new Stonk2();
    }
}
