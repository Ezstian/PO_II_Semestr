import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {

    private JPanel JPanel;
    private JButton kelwinButton;
    private JTextField tempWC;
    private JLabel tempWK;

    public Zadanie1() {
        super("Zadanie 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setContentPane(this.JPanel);
        kelwinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float K = Float.parseFloat(tempWC.getText())+273.15f;
                tempWK.setText(String.valueOf(K)+" °K");

            }
        });
    }
}
