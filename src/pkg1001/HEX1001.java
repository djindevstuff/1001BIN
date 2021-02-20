package pkg1001;
import converter.*;

public class HEX1001 extends javax.swing.JFrame {

    String fromB,intoB,inputed;
    long outRes;
    public HEX1001() {
        initComponents();
        
    }
    Binary binary = new Binary();
    Decimal decimal = new Decimal();
    Octal octal = new Octal();
    Hexadecimal hexadecimal = new Hexadecimal();

    public void convertBinary(){
        inputed=binaryInOut.getText();
        if(inputed.equals("")){
                inputed="0";}
        if(isBin(inputed)==true){
            octalInOut.setForeground(new java.awt.Color(204, 204, 204));
            oc.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setForeground(new java.awt.Color(204, 204, 204));
            b.setForeground(new java.awt.Color(204, 204, 204));
            hexadecimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            hex.setForeground(new java.awt.Color(204, 204, 204));
            decimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            d.setForeground(new java.awt.Color(204, 204, 204));
            decimalInOut.setText(""+binary.toDecimal(Long.parseLong(inputed)));
            octalInOut.setText(""+binary.toOctal(inputed));
            hexadecimalInOut.setText(""+binary.toHexadecimal(inputed));
        }
        else{
            binaryInOut.setForeground(new java.awt.Color(255, 0, 0));
            b.setForeground(new java.awt.Color(255, 0, 0));
        }
        
    }
    
    public void convertDecimal(){
        inputed=decimalInOut.getText();
        if(inputed.equals("")){
                inputed="0";}
        if(isDec(inputed)==true){
            octalInOut.setForeground(new java.awt.Color(204, 204, 204));
            oc.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setForeground(new java.awt.Color(204, 204, 204));
            b.setForeground(new java.awt.Color(204, 204, 204));
            hexadecimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            hex.setForeground(new java.awt.Color(204, 204, 204));
            decimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            d.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setText(""+decimal.toBinary(Long.parseLong(inputed)));
            octalInOut.setText(""+decimal.toOctal(Long.parseLong(inputed)));
            hexadecimalInOut.setText(""+decimal.toHexadecimal(Long.parseLong(inputed)));
        }
        else{
            decimalInOut.setForeground(new java.awt.Color(255, 0, 0));
            d.setForeground(new java.awt.Color(255, 0, 0));
        }
    }
    
    public void convertOctal(){
        inputed=octalInOut.getText();
        if(inputed.equals("")){
                inputed="0";}
        if(isOct(inputed)==true){
            octalInOut.setForeground(new java.awt.Color(204, 204, 204));
            oc.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setForeground(new java.awt.Color(204, 204, 204));
            b.setForeground(new java.awt.Color(204, 204, 204));
            hexadecimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            hex.setForeground(new java.awt.Color(204, 204, 204));
            decimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            d.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setText(""+octal.toBinary((inputed)));
            decimalInOut.setText(""+octal.toDecimal((inputed)));
            hexadecimalInOut.setText(""+octal.toHexadecimal((inputed)));
        }
        else{
            octalInOut.setForeground(new java.awt.Color(255, 0, 0));
            oc.setForeground(new java.awt.Color(255, 0, 0));
        }
    }
    
    public void convertHexadecimal(){
        inputed=hexadecimalInOut.getText();
        if(inputed.equals("")){
                inputed="0";}
        if(isHexadeci(inputed)==true){
            octalInOut.setForeground(new java.awt.Color(204, 204, 204));
            oc.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setForeground(new java.awt.Color(204, 204, 204));
            b.setForeground(new java.awt.Color(204, 204, 204));
            hexadecimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            hex.setForeground(new java.awt.Color(204, 204, 204));
            decimalInOut.setForeground(new java.awt.Color(204, 204, 204));
            d.setForeground(new java.awt.Color(204, 204, 204));
            binaryInOut.setText(""+hexadecimal.toBinary((inputed)));
            decimalInOut.setText(""+hexadecimal.toDecimal((inputed)));
            octalInOut.setText(""+hexadecimal.toOctal((inputed)));
        }
        else{
            hexadecimalInOut.setForeground(new java.awt.Color(255, 0, 0));
            hex.setForeground(new java.awt.Color(255, 0, 0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        binaryInOut = new javax.swing.JTextField();
        b = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        decimalInOut = new javax.swing.JTextField();
        oc = new javax.swing.JLabel();
        octalInOut = new javax.swing.JTextField();
        hex = new javax.swing.JLabel();
        hexadecimalInOut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number System Converter");
        setMinimumSize(new java.awt.Dimension(370, 420));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(43, 43, 43));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 395));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 395));

        binaryInOut.setBackground(new java.awt.Color(43, 43, 43));
        binaryInOut.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        binaryInOut.setForeground(new java.awt.Color(204, 204, 204));
        binaryInOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        binaryInOut.setText("Enter");
        binaryInOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                binaryInOutKeyReleased(evt);
            }
        });

        b.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b.setForeground(new java.awt.Color(204, 204, 204));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText("BINARY");

        d.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        d.setForeground(new java.awt.Color(204, 204, 204));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("DECIMAL");

        decimalInOut.setBackground(new java.awt.Color(43, 43, 43));
        decimalInOut.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        decimalInOut.setForeground(new java.awt.Color(204, 204, 204));
        decimalInOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        decimalInOut.setText("Enter");
        decimalInOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                decimalInOutKeyReleased(evt);
            }
        });

        oc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oc.setForeground(new java.awt.Color(204, 204, 204));
        oc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oc.setText("OCTAL");

        octalInOut.setBackground(new java.awt.Color(43, 43, 43));
        octalInOut.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        octalInOut.setForeground(new java.awt.Color(204, 204, 204));
        octalInOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        octalInOut.setText("Enter");
        octalInOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                octalInOutKeyReleased(evt);
            }
        });

        hex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hex.setForeground(new java.awt.Color(204, 204, 204));
        hex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hex.setText("HEXADECIMAL");

        hexadecimalInOut.setBackground(new java.awt.Color(43, 43, 43));
        hexadecimalInOut.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        hexadecimalInOut.setForeground(new java.awt.Color(204, 204, 204));
        hexadecimalInOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hexadecimalInOut.setText("Enter");
        hexadecimalInOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hexadecimalInOutKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(decimalInOut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(binaryInOut)
                            .addComponent(octalInOut)
                            .addComponent(hexadecimalInOut)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hex, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oc, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 245, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binaryInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decimalInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(octalInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(hex, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hexadecimalInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binaryInOutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_binaryInOutKeyReleased
        convertBinary();
    }//GEN-LAST:event_binaryInOutKeyReleased

    private void decimalInOutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decimalInOutKeyReleased
        convertDecimal();
    }//GEN-LAST:event_decimalInOutKeyReleased

    private void octalInOutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octalInOutKeyReleased
        convertOctal();
    }//GEN-LAST:event_octalInOutKeyReleased

    private void hexadecimalInOutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hexadecimalInOutKeyReleased
        convertHexadecimal();
    }//GEN-LAST:event_hexadecimalInOutKeyReleased

    public boolean isBin(String in){
        int flag=0;
        for(int i=0;i<in.length();i++){
                if(in.charAt(i)=='1' || in.charAt(i)=='0'){
                    flag=0;
                }
                else{
                    flag=1;
                    break;
                }
            }
        if(flag==1){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isDec(String in){
        try{
            long d= Long.parseLong(in);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

    public boolean isOct(String in){
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)=='8' || in.charAt(i)=='9'){
                return false;
            }
        }
        try{
            long o =Long.parseLong(in);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

    public boolean isHexadeci(String in){
        in=in.toUpperCase();
        for(int i=0;i<in.length();i++){
            if((in.charAt(i)>='0' && in.charAt(i)<='9') || (in.charAt(i)>='A' && in.charAt(i)<='F')){
                
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(HEX1001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HEX1001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HEX1001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HEX1001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HEX1001().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JTextField binaryInOut;
    private javax.swing.JLabel d;
    private javax.swing.JTextField decimalInOut;
    private javax.swing.JLabel hex;
    private javax.swing.JTextField hexadecimalInOut;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oc;
    private javax.swing.JTextField octalInOut;
    // End of variables declaration//GEN-END:variables
}
