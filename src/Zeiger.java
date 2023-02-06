import GLOOP.*;
public class Zeiger {
    GLZylinder zeiger;
    Zeiger(int xP, int yP, int zP, double length, double radius, double r, double g, double b){
        zeiger = new GLZylinder(xP, yP, zP + 0.5, radius, length);
        zeiger.drehe(90, 0, 0);
        zeiger.verschiebe(0, length/2, 0);
        zeiger.skaliere(1, 0.1, 1);
        zeiger.setzeFarbe(r, g, b);

    }
}
