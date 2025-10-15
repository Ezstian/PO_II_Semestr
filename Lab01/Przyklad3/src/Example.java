import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JButton sumaButton;
    private JButton roznicaButton;
    private JTextField PodajB;
    private JTextField PodajA;
    private JLabel Wynik;
    private JPanel JPanel1;

    public Example() {
        super("Moj pierwszy program :)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.JPanel1);
        setSize(300, 300);


        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(PodajA.getText())+Integer.parseInt(PodajB.getText());
                Wynik.setText(String.valueOf(suma));
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int roznica = Integer.parseInt(PodajA.getText())-Integer.parseInt(PodajB.getText());
                Wynik.setText(String.valueOf(roznica));
            }
        });
    }
}
