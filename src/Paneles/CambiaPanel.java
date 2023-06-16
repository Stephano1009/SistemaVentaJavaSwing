package paneles;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * author Stephano Sanchez
 */
public class CambiaPanel {
    
    private JPanel panelContenedor; 
    private CardLayout cardLayout;  
    
    public CambiaPanel(JPanel panelContenedor) {
        this.panelContenedor = panelContenedor;
        cardLayout = new CardLayout();
        this.panelContenedor.setLayout(cardLayout);
    }
    
    public void cambiarPanel(JPanel panel) {
        panelContenedor.removeAll();
        panelContenedor.add(panel);
        panelContenedor.repaint();
        panelContenedor.revalidate();
    }
}
