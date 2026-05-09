import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GadgetShop extends JFrame implements ActionListener {
    private ArrayList<Gadget> gadgets = new ArrayList<>();
    
    // GUI components details (Simplified for Repository)
    public GadgetShop() {
        setTitle("Gadget Shop - MD ANTOR KHAN");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JButton btnAddMobile = new JButton("Add Mobile");
        JButton btnAddMP3 = new JButton("Add MP3");
        JButton btnDisplayAll = new JButton("Display All");
        
        btnAddMobile.addActionListener(this);
        btnAddMP3.addActionListener(this);
        btnDisplayAll.addActionListener(this);
        
        add(btnAddMobile);
        add(btnAddMP3);
        add(btnDisplayAll);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Logic for handling button clicks
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GadgetShop().setVisible(true));
    }
}
