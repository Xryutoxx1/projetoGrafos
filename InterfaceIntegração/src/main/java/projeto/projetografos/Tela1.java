package projeto.grafos;

import projeto.projetografos.LerArquivo;

/**
 * Classe que define a interface gráfica da primeira tela do programa.
 */
public class Tela1 extends javax.swing.JFrame {

    // Referência para a segunda tela, criando um objeto para sua respectiva classe.
    public Tela2 tela2;

    /**
     * Construtor da classe Tela1.
     * Inicializa os componentes da interface gráfica e o objeto da segunda tela.
     */
    public Tela1() {
        initComponents(); // Inicialização dos componentes da interface gráfica
        this.tela2 = new Tela2(); // instanciação do objeto da segunda tela
    }
    
 

    // Método gerado automaticamente pelo editor gráfico para inicializar os componentes da interface
    /*
    A anotação usada quando há certeza de que uma operação com uma coleção 
    genérica é segura, mas o compilador não pode verificar isso devido à falta de informações sobre os tipos 
    de dados em tempo de compilação. Essa anotação indica que se compreende os riscos envolvidos 
    e que a operação é segura.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
      
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caixaEntrada1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
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
        jLabel1.setText("** CONVERSOR PARA GRAFO DE ARESTA **");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 500, 50);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite o nome do arquivo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 250, 250, 19);

        caixaEntrada1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                caixaEntrada1ComponentAdded(evt);
            }
        });
        caixaEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaEntrada1ActionPerformed(evt);
            }
        });
        getContentPane().add(caixaEntrada1);
        caixaEntrada1.setBounds(40, 280, 470, 40);

        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 280, 130, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/projetografos/Imagem2/1643282225711.jpeg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel3.setMinimumSize(new java.awt.Dimension(1280, 1000));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -10, 1310, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaEntrada1ActionPerformed
      
        
    }//GEN-LAST:event_caixaEntrada1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      /*
        Quando o botão converter é apertado, o método que chama a segunda tela é acionado,
        e o valor digitado na caixa de texto vinculado a variável "caixaEntrada1" é armazenado
        na variável do objeto tela2, justamente para que seja possível os dados serem transmitidos
        para a segundo tela.

        No entanto, antes disso, esse valor é passado como parâmetro para o objeto que está sendo
        instanciado da classe LerArquivo, a fim de que a conversão para grafo de aresta aconteça.
        Esse valor convertido é então retornado pelo método getConteúdoArquivo e armazenado de volta
        na variável transmissor.
        
      */
      this.tela2.setVisible(true); 
      this.tela2.transmissor = this.caixaEntrada1.getText();

      LerArquivo lerArquivo = new LerArquivo(this.tela2.transmissor);
      this.tela2.transmissor = lerArquivo.getConteudoArquivo();

        
    


    }//GEN-LAST:event_jButton1ActionPerformed

    private void caixaEntrada1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_caixaEntrada1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaEntrada1ComponentAdded

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField caixaEntrada1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
