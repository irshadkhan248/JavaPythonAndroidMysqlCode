package p12;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneWARNING_MESSAGE {

  public static void main(String[] args) {
    final JPanel panel = new JPanel();

    JOptionPane.showMessageDialog(panel, "A deprecated call", "Warning",
        JOptionPane.WARNING_MESSAGE);
  }
}