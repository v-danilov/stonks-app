package app.stonks.manufacturer.bisness.faktori;

import app.stonks.manufacturer.bisness.entities.IStonk;
import app.stonks.manufacturer.bisness.entities.Stonk3;

public class StonksFactory3 extends AbstractStonksFactory {
    @Override
    protected IStonk produceStonk() {
        return new Stonk3();
    }
}
