import GLOOP.*;

import java.time.ZoneId;

public class AnalogeUhr {
    Zeiger sekundenZeiger, minutenZeiger, stundenZeiger;
    GLZylinder ziffernblatt;
    GLKugel mitte;
    GLTafel display;
    String timeZone;
    ZoneId zoneId;
    int minStemp;

    public void build(int xP, int  yP, int zP, String tZ){
        sekundenZeiger = new Zeiger(xP, yP, zP+ 0.25 , 10, 0.25, 1, 0, 0);
        minutenZeiger = new Zeiger(xP, yP, zP + 0.1, 10, 0.75, 0, 1, 0);
        stundenZeiger = new Zeiger(xP, yP, zP, 10, 1, 0, 0, 1);

        ziffernblatt = new GLZylinder(xP, yP, zP, 12, 1);
        ziffernblatt.setzeTextur("src/ziffernblatt.png");



        mitte = new GLKugel(xP, yP, zP + 0.5, 1);
        mitte.setzeFarbe(0, 0, 0);

        timeZone = tZ;
        zoneId = java.time.ZoneId.of(timeZone);

        display = new GLTafel(xP, yP - 15, zP, 10, 5);
        display.setzeText(timeZone, 3);

        sekundenZeiger.setZeiger(getSecond(zoneId) * (360/60));
        minutenZeiger.setZeiger(getMinute(zoneId) * ((360/60)));
        stundenZeiger.setZeiger(getHour(zoneId) * ((360/12)));

        minStemp = (getMinute(zoneId) - getMinute(zoneId)%12)/12;
        stundenZeiger.setZeiger(minStemp * (360/60));

    }
    public void run(){
        sekundenZeiger.drehe(360/60);
        if(getSecond(zoneId) == 0){
            minutenZeiger.drehe(360/60);
        }
        if(getMinute(zoneId)%12 == 0 && getSecond(zoneId) == 0){
            stundenZeiger.setZeiger((360/60));
        }

    }



    private int getHour(ZoneId zone) {
        return java.time.LocalTime.now(zone).getHour();
    }
    private int getMinute(ZoneId zone) {
        return java.time.LocalTime.now(zone).getMinute();
    }
    private int getSecond(ZoneId zone) {
        return java.time.LocalTime.now(zone).getSecond();
    }
}
