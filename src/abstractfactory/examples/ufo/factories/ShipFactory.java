package abstractfactory.examples.ufo.factories;

import abstractfactory.examples.ufo.parts.ShipEngine;
import abstractfactory.examples.ufo.parts.ShipWeapon;

/**
 * Created by Fabio on 16/07/19.
 */
public abstract class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();

}
