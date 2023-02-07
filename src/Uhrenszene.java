import GLOOP.*;
public class Uhrenszene {
    GLKamera cam1;
    GLLicht light;
    GLTastatur kb;

    AnalogeUhr clock1;
    public void run(){
        cam1 = new GLEntwicklerkamera(800, 800);
        cam1.setzePosition(0, 0, 50);
        light = new GLLicht();
        kb = new GLTastatur();
        clock1 = new AnalogeUhr();
        clock1.build(0, 0, 0, "Europe/Brussels");

        while(!kb.esc()){

            clock1.run();
            Sys.warte(1000);
        }
        Sys.beenden();

    }

}
