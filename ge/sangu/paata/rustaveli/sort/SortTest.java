package ge.sangu.paata.rustaveli.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 201 on 11/3/2016.
 */
public class SortTest {

    public static void main(String[] args) {
        List<Ship> ships = new ArrayList<Ship>(Arrays.asList(
                new Ship("SANGU", 100, ShipType.TRAVEL),
                new Ship("TSU",   50,  ShipType.TRAVEL),
                new Ship("STU",   60,  ShipType.TRAVEL),
                new Ship("SDASU", 30,  ShipType.MILITARY),
                new Ship("SEU",   99,  ShipType.TRANSPORT)));
        ShipComparator shipComparator = new ShipComparator();
        Collections.sort(ships, shipComparator);
        System.out.println(ships);
    }
}
