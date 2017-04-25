/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Vickey_Boy
 */
public class Calculator extends javax.swing.JFrame
{
    String op1;
    String op2;
    String op;
    double operand1;
    double operand2;
    double result;
    /**
     * Creates new form Calculator
     */
    public Calculator()
    {        
        initComponents();
        this.setTitle("My Calculator");
        jPanel1.setBackground(Color.YELLOW);
        this.setResizable(false);
        op1 = null;
        op2 = null;
        op = null;
        operand1 = 0;
        operand2 = 0;
        result = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnEight = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnRemainder = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        txtScreen = new javax.swing.JTextField();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEightActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSevenActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNineActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnRemainder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemainder.setText("%");
        btnRemainder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemainderActionPerformed(evt);
            }
        });

        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDivideActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEqualActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnZeroActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnThreeActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPointActionPerformed(evt);
            }
        });

        txtScreen.setEditable(false);
        txtScreen.setBackground(new java.awt.Color(255, 255, 255));
        txtScreen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtScreen.setText("0");
        txtScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTwoActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPlusActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSixActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFiveActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemainder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemainder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnZeroActionPerformed
    {//GEN-HEADEREND:event_btnZeroActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"0");
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEqualActionPerformed
    {//GEN-HEADEREND:event_btnEqualActionPerformed
        try
        {
            op2 = txtScreen.getText();
            operand1 = Double.parseDouble(op1);
            operand2 = Double.parseDouble(op2);

            switch(op)
            {
                case "+":
                {
                    result = operand1 + operand2;
                    break;
                }
                case "-":
                {
                    result = operand1 - operand2;
                    break;
                }
                case "*":
                {
                    result = operand1 * operand2;
                    break;
                }
                case "/":
                {
                    result = operand1 / operand2;
                    break;
                }
                case "%":
                {
                    result = operand1 % operand2;
                    break;
                }
                default:
            }
            txtScreen.setText(Double.toString(result));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "You Didnt enter the Operator", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPointActionPerformed
    {//GEN-HEADEREND:event_btnPointActionPerformed
        if(txtScreen.getText().contains("."))
        {
            
        }
        else
        {
            if(txtScreen.getText().equals("0"))
            {
                txtScreen.setText("0.");
            }
            else
            {
                txtScreen.setText(txtScreen.getText()+".");
            }
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnThreeActionPerformed
    {//GEN-HEADEREND:event_btnThreeActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("3");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"3");
        }        
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOneActionPerformed
    {//GEN-HEADEREND:event_btnOneActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("1");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"1");
        }
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTwoActionPerformed
    {//GEN-HEADEREND:event_btnTwoActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("2");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"2");
        }
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlusActionPerformed
    {//GEN-HEADEREND:event_btnPlusActionPerformed
        op1 = txtScreen.getText();
        txtScreen.setText("0");
        op = "+";
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSixActionPerformed
    {//GEN-HEADEREND:event_btnSixActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("6");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"6");
        }
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFourActionPerformed
    {//GEN-HEADEREND:event_btnFourActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("4");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"4");
        }
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFiveActionPerformed
    {//GEN-HEADEREND:event_btnFiveActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("5");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"5");
        }
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMinusActionPerformed
    {//GEN-HEADEREND:event_btnMinusActionPerformed
        op1 = txtScreen.getText();
        txtScreen.setText("0");
        op = "-";
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNineActionPerformed
    {//GEN-HEADEREND:event_btnNineActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("9");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"9");
        }
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSevenActionPerformed
    {//GEN-HEADEREND:event_btnSevenActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("7");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"7");
        }
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEightActionPerformed
    {//GEN-HEADEREND:event_btnEightActionPerformed
        if(txtScreen.getText().equals("0"))
        {
            txtScreen.setText("8");
        }
        else
        {
            txtScreen.setText(txtScreen.getText()+"8");
        }
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplyActionPerformed
    {//GEN-HEADEREND:event_btnMultiplyActionPerformed
        op1 = txtScreen.getText();
        txtScreen.setText("0");
        op = "*";
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnRemainderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemainderActionPerformed
    {//GEN-HEADEREND:event_btnRemainderActionPerformed
        op1 = txtScreen.getText();
        txtScreen.setText("0");
        op = "%";
    }//GEN-LAST:event_btnRemainderActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        txtScreen.setText("0");
        op1 = null;
        op2 = null;
        op = null;
        operand1 = 0;
        operand2 = 0;
        result = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDivideActionPerformed
    {//GEN-HEADEREND:event_btnDivideActionPerformed
        op1 = txtScreen.getText();
        txtScreen.setText("0");
        op = "/";
    }//GEN-LAST:event_btnDivideActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnRemainder;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtScreen;
    // End of variables declaration//GEN-END:variables
}