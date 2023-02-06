import GLOOP.*;
public class Uhrenszene {
    GLKamera cam1;
    GLLicht light;
    GLTastatur kb;

    AnalogeUhr clock1;
    public void run(){
        cam1 = new GLEntwicklerkamera(800, 800);
        light = new GLLicht();
        kb = new GLTastatur();
        clock1 = new AnalogeUhr();
        clock1.build(0, 0, 0);

        while(!kb.esc()){


            Sys.warte();
        }
        Sys.beenden();

    }

}
