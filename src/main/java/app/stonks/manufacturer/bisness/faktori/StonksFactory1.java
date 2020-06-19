package app.stonks.manufacturer.bisness.faktori;

import app.stonks.manufacturer.bisness.entities.IStonk;
import app.stonks.manufacturer.bisness.entities.Stonk1;

public class StonksFactory1 extends AbstractStonksFactory {
    @Override
    protected IStonk produceStonk() {
        return new Stonk1();
    }
}
