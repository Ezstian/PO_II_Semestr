import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame {

    private JPanel JPanel;
    private JButton stworzTrojkatButton;
    private JTextField wysokosc;
    private JTextField podstawa;

    public Zadanie2() {
        super("Zadanie 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        this.setContentPane(this.JPanel);

        stworzTrojkatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    int h = Integer.parseInt(wysokosc.getText());
                    int p = Integer.parseInt(podstawa.getText());

                    StringBuilder trojkat = new StringBuilder();
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= h - i; j++) {
                            trojkat.append(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            trojkat.append("*");
                        }
                        trojkat.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, trojkat.toString());
            }
        });
    }
}
