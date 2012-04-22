/*
 * VicisCycle 2012
 * Released under GNU GPL License v2
 */
/**TO-DOs
 * 1. add background to main window
 * 2. set internal window's size and layout
 * 3. add international support 
 */
package viciscycle.gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author roland
 */
public class VicisCycleGUI extends javax.swing.JFrame 
{

	private JDesktopPane mainDesktopPane;
    /**
     * Creates new form VicisCycleGUI
     */
    public VicisCycleGUI() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		mainDesktopPane = new JDesktopPane();
		
		add(mainDesktopPane);
		//initComponents();
		try 
		{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
			{
                if ("Nimbus".equals(info.getName())) 
				{
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
		{
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
		{
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
		{
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
		{
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		GameTitleFrame gameFrame = new GameTitleFrame();
		mainDesktopPane.add(gameFrame,BorderLayout.CENTER);
		gameFrame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	class GameTitleFrame extends JInternalFrame
	{
		public GameTitleFrame()
		{
			super("VicisCycle - Title",false,false,false,true);
			setBounds(0, 0, 320, 300);
			setLocation((800-320)/2,(600-300)/2);
			JPanel gp = new JPanel();
			gp.setSize(320,300);
			JButton b = new JButton("Start Server");
			gp.add(b);
			b = new JButton("Join Game");
			gp.add(b);
			b = new JButton("Credits");
			gp.add(b);
			b = new JButton("Exit");
			gp.add(b);
			add(gp, BorderLayout.CENTER);
			pack();
		}
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VicisCycleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VicisCycleGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
