import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("ENTER YOUR NAME");
        //JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOptionPane.showMessageDialog(null,"You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        //JOptionPane.showMessageDialog(null,"You are "+height+"cm tall");
        
        JOptionPane.showMessageDialog(null,"Hello "+name+" You are "+age+" years old and "+height+" cm tall.");


    }
    
}
