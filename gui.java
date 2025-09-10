import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("ENTER YOUR NAME");
        JOptionPane.showMessageDialog(null,"Hello "+name);
    }
    
}
