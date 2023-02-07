import GLOOP.*;
public class Zeiger {
    GLZylinder zeiger;
    GLVektor vCentrePos;
    Zeiger(double xP, double yP, double zP, double length, double radius, double r, double g, double b){
        zeiger = new GLZylinder(xP, yP, zP + 0.5, radius, length);
        zeiger.drehe(90, 0, 0);
        zeiger.verschiebe(0, length/2, 0);
        zeiger.skaliere(1, 0.1, 1);
        zeiger.setzeFarbe(r, g, b);
        vCentrePos = new GLVektor(xP, yP, zP);
    }
    public void setZeiger(double rW){
        zeiger.drehe(0, 0, -rW, vCentrePos);
    }
    public void drehe(double rW){
        zeiger.drehe(0, 0, -rW, vCentrePos);
    }
}
