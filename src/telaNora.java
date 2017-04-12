/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class telaNora extends javax.swing.JFrame {


    public telaNora() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NAC1 = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        RESULT = new javax.swing.JLabel();
        Situ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NAC2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Media FIAP");
        setBackground(new java.awt.Color(51, 153, 255));
        setName("Media"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo fiap.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Insira suas Notas");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("NAC'S");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("AM");

        PS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("PS");

        btn.setText("Calcular");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        RESULT.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        RESULT.setForeground(new java.awt.Color(255, 0, 0));
        RESULT.setText("0");

        Situ.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setText("Para as NACS, digitar suas duas melhores notas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(NAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(NAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Situ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(76, 76, 76))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(RESULT)
                                                                .addGap(126, 126, 126))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(280, 280, 280)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel1)))
                                .addGap(75, 198, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(RESULT)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Situ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(NAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(NAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75))))
        );

        pack();
    }// </editor-fold>

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {
        // MS = (NAC x 0.2 + AM x 0.3 + PS x 0.5)
        float NNac1 = Float.parseFloat(NAC1.getText());
        float NNac2 = Float.parseFloat(NAC2.getText());
        float NNac=0;

        //atribuir a media das NAC's na varivel NNac
        NNac =  ((NNac1+NNac2)/2);
        float nAm = Float.parseFloat(AM.getText());
        float nPS = Float.parseFloat(PS.getText());

        float suaNota = (float) ((NNac*0.2)+(nAm*0.3)+(nPS*0.5)) ;
        RESULT.setText(Float.toString(suaNota));
        if(suaNota>=4 && suaNota<=5.9995    ){
            Situ.setText("Exame");
        }
        if(suaNota>=6){
            Situ.setText("Aprovado");
        }
        if(suaNota<=3.9){
            Situ.setText("Reprovado");
        }
    }

    private void PSActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaNora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaNora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaNora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaNora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaNora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField AM;
    private javax.swing.JTextField NAC1;
    private javax.swing.JTextField NAC2;
    private javax.swing.JTextField PS;
    private javax.swing.JLabel RESULT;
    private javax.swing.JLabel Situ;
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration

}

