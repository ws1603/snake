import javax.swing.*;

public class Msnake {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(10,10,900,620);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new MPanel());

        frame.setVisible(true);
    }
}
