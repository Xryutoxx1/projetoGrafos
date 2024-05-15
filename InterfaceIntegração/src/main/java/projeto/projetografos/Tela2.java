package projeto.projetografos; 

/**
 * Classe que define a interface gráfica da segunda tela do programa.
 */
public class Tela2 extends javax.swing.JFrame {
    
    // Atributo para armazenar o valor transmitido na classe Tela1
    public String transmissor = "VALOR INICIAL DO STRING";
    
    /**
     * Método get que retorna o valor do transmissor.
     */
    public String getTransmissor() {
        return transmissor;
    }
    
    /**
     * Construtor da classe Tela2.
     * Inicializa os componentes da interface gráfica.
     */
    public Tela2() {
        initComponents(); // Inicialização dos componentes da interface gráfica
    }
    
    /**
     * Método sem retorno para realizar uma ação.
     * Define o texto da caixa de saída como o valor do transmissor.
     */
    public void realizarAcao() {
        caixaSaida.setText(transmissor); // Define o texto da caixa de saída como o valor do transmissor
    }
    
    // Métodos gerados automaticamente pelo editor gráfico para inicializar os componentes da interface
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        caixaEntrada2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        caixaSaida = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("** RESULTADO **");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 30, 200, 50);

        caixaEntrada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaEntrada2ActionPerformed(evt);
            }
        });
        getContentPane().add(caixaEntrada2);
        caixaEntrada2.setBounds(60, 500, 460, 40);

        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 500, 130, 40);

        caixaSaida.setColumns(20);
        caixaSaida.setRows(5);
        caixaSaida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caixaSaidaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(caixaSaida);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 100, 490, 350);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Digite o nome do novo arquivo:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 470, 240, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/projetografos/Imagem2/1643282225711.jpeg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel3.setMinimumSize(new java.awt.Dimension(1500, 1200));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, -50, 1500, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void caixaEntrada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaEntrada2ActionPerformed
        // TODO add your handling code here:
        
          

    }//GEN-LAST:event_caixaEntrada2ActionPerformed

    /*Quando botão converter da segunda tela é acionado, o método abaixo é acionado, fazendo que a variável
    transmissor receba o valor depositado na caixa de texto da segunda tela.
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    transmissor = this.caixaEntrada2.getText();
    realizarAcao();
    
    }//GEN-LAST:event_jButton1ActionPerformed


    /*
        caixaSaidaAncestorAdded é um método que serve para identificar quando a variavel liga a tela de saida
        é alterada.
    */
    private void caixaSaidaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caixaSaidaAncestorAdded
    realizarAcao(); 
    }//GEN-LAST:event_caixaSaidaAncestorAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Tela2().setVisible(true);
            
            
        
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField caixaEntrada2;
    private javax.swing.JTextArea caixaSaida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
    



}
