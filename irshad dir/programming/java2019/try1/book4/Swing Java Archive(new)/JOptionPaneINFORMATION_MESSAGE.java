import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneINFORMATION_MESSAGE {

  public static void main(String[] args) {
    final JPanel panel = new JPanel();

    JOptionPane.showMessageDialog(panel, "Download completed", "Question",
        JOptionPane.INFORMATION_MESSAGE);
  }
}
