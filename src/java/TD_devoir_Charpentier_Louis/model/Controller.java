package TD_devoir_Charpentier_Louis.model;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by Louis on 20/11/2015.
 */
public class Controller extends JFrame{
    private JPanel pan = new JPanel();
    private JButton boutonEURDepart = new JButton("EUR");
    private JButton boutonUSDepart = new JButton("US");
    private JButton boutonGPDDepart = new JButton("GBP");


    public Controller(){
        this.setTitle("Convetisseur");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Ajout du bouton à notre content pane
        pan.add(boutonEURDepart);
        this.setContentPane(pan);
        this.setVisible(true);
        pan.add(boutonGPDDepart);
        this.setContentPane(pan);
        this.setVisible(true);
        pan.add(boutonUSDepart);
        this.setContentPane(pan);
        this.setVisible(true);

    }
}
