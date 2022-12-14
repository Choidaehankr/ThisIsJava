package thread.basic;

import java.awt.Toolkit;

public class BeepPrintExample1 {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("떙!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}
