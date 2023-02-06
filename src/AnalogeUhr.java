import GLOOP.*;

import java.time.ZoneId;

public class AnalogeUhr {
    Zeiger sekundenZeiger, minutenZeiger, stundenZeiger;
    GLZylinder ziffernblatt;
    GLKugel mitte;

    public void build(int xP, int  yP, int zP){
        sekundenZeiger = new Zeiger(xP, yP, zP, 10, 0.5, 1, 0, 0);
        minutenZeiger = new Zeiger(xP, yP, zP, 10, 0.75, 0, 1, 0);
        stundenZeiger = new Zeiger(xP, yP, zP, 5, 1, 0, 0, 1);

        ziffernblatt = new GLZylinder(xP, yP, zP, 12, 1);
        ziffernblatt.setzeTextur("src/ziffernblatt.png");

        mitte = new GLKugel(xP, yP, zP + 0.5, 1);
        mitte.setzeFarbe(0, 0, 0);

    }
    public void run(String timeZone, ZoneId zoneId){

    }
}
