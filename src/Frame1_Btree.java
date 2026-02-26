
public class Frame1_Btree extends javax.swing.JFrame {

    private Btree tree;

    public Frame1_Btree() {
        initComponents();

        tree = new Btree();

        // jframe setup
        this.setLocationRelativeTo(null);
        this.setTitle("Cars Binary Tree");
        this.setDefaultCloseOperation(Frame1_Btree.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Functions
        carMake();
        jComboMake.setSelectedIndex(0);
        carModel();
        jComboModel.setSelectedIndex(0);
        carYear();
        jComboYear.setSelectedIndex(0);
        carColor();
        jComboColor.setSelectedIndex(0);

        // ai originally suggested to use one as set selected index, but I decided to do all,
        // this can prevent you from entering a null answer into the tree
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboMake = new javax.swing.JComboBox<>();
        jComboModel = new javax.swing.JComboBox<>();
        jComboYear = new javax.swing.JComboBox<>();
        jComboColor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBttnAdd = new javax.swing.JButton();
        jTxtField = new javax.swing.JTextField();
        jBttnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea = new javax.swing.JTextArea();
        jBttnDelete = new javax.swing.JButton();
        jBttnLow = new javax.swing.JButton();
        jBttnHigh = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboMake.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMakeItemStateChanged(evt);
            }
        });
        jComboMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMakeActionPerformed(evt);
            }
        });
        jComboMake.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboMakePropertyChange(evt);
            }
        });

        jComboModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Make:");

        jLabel2.setText("Model:");

        jLabel3.setText("Year:");

        jLabel4.setText("Color:");

        jBttnAdd.setText("Add");
        jBttnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnAddActionPerformed(evt);
            }
        });

        jBttnFind.setText("Find Key");
        jBttnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnFindActionPerformed(evt);
            }
        });

        jTxtArea.setColumns(20);
        jTxtArea.setRows(5);
        jScrollPane1.setViewportView(jTxtArea);

        jBttnDelete.setText("Delete");
        jBttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnDeleteActionPerformed(evt);
            }
        });

        jBttnLow.setText("Lowest Key");
        jBttnLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnLowActionPerformed(evt);
            }
        });

        jBttnHigh.setText("Highest Key");
        jBttnHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnHighActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboYear, 0, 89, Short.MAX_VALUE)
                                    .addComponent(jComboMake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jComboModel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBttnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBttnAdd)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBttnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBttnHigh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBttnLow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBttnHigh))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBttnFind)
                                    .addComponent(jBttnLow)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBttnAdd)
                            .addComponent(jBttnDelete))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMakeActionPerformed

        carModel();
    }//GEN-LAST:event_jComboMakeActionPerformed

    private void jComboMakePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboMakePropertyChange
    }//GEN-LAST:event_jComboMakePropertyChange

    private void jComboMakeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMakeItemStateChanged
    }//GEN-LAST:event_jComboMakeItemStateChanged

    private void jBttnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnAddActionPerformed

        // ai suggested to turn these into string by putting string in front
        //                |
        //                V
        String make = (String) jComboMake.getSelectedItem();
        String model = (String) jComboModel.getSelectedItem();
        String year = (String) jComboYear.getSelectedItem();
        String color = (String) jComboColor.getSelectedItem();

        // make unique hash key
        int key = (make + model + year + color).hashCode();

        // TODO - Check if hashcode is duplicate then make it a positive or negative or even add one
        tree.insert(key, make, model, year, color);
        System.out.println(key);
    }//GEN-LAST:event_jBttnAddActionPerformed

    private void jBttnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnFindActionPerformed

        // take the string from user input and turn it into an integer
        try {

            int key = Integer.parseInt(jTxtField.getText());
            Btree.Node result = tree.find(key);

            // instead of having print to console, ai helped me put it into the text area
            // by suggesting how it should be done with btree.node result = tree.find
            if (result == null) {

                jTxtArea.setText("*** Key Not Found or Tree is Empty ***");
            } else {
                jTxtArea.setText(
                        "Key Found!\n\n"
                        + "Key: " + result.key + "\n"
                        + "Make: " + result.make + "\n"
                        + "Model: " + result.model + "\n"
                        + "Year: " + result.year + "\n"
                        + "Color: " + result.color + "\n\n"
                        + "Levels: " + Btree.c
                );
            }
            Btree.c = 0;

        } catch (Exception e) {

            jTxtArea.setText("*ERROR* \n Please input only numbers");
            Btree.c = 0;
        }


    }//GEN-LAST:event_jBttnFindActionPerformed

    private void jBttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnDeleteActionPerformed

           // button action to delete a data point and print into txt area
        String make = (String) jComboMake.getSelectedItem();
        String model = (String) jComboModel.getSelectedItem();
        String year = (String) jComboYear.getSelectedItem();
        String color = (String) jComboColor.getSelectedItem();

        // make unique hash key
        int key = (make + model + year + color).hashCode();

        Btree.Node result = tree.delete(key);

        // printing to txt area
        if (result == null) {
            jTxtArea.setText("*** Key not found or tree is empty");
        } else {
            jTxtArea.setText("Successfully found and deleted: \n"
                    + result.year + " "
                    + result.color + " "
                    + result.make + " "
                    + result.model + "\n"
                    + "Levels: " + Btree.c);
        }
        Btree.c = 0;

    }//GEN-LAST:event_jBttnDeleteActionPerformed

    private void jBttnHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnHighActionPerformed

        // finding the maximum key in tree
        Btree.Node result = tree.highestKey();

        // print to txt area
        jTxtArea.setText("Highest Key: \n"
                + result.year + " "
                + result.color + " "
                + result.make + " "
                + result.model + "\n"
                + "Levels: " + Btree.c);
        // set levels counter to 0
        Btree.c = 0;
    }//GEN-LAST:event_jBttnHighActionPerformed

    private void jBttnLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnLowActionPerformed

        // find and print lowest key
        Btree.Node result = tree.lowestKey();

        jTxtArea.setText("Lowest Key: \n"
                + result.year + " "
                + result.color + " "
                + result.make + " "
                + result.model + "\n"
                + "Levels: " + Btree.c);
        Btree.c = 0;

    }//GEN-LAST:event_jBttnLowActionPerformed

    // function to add options to combo boxes
    private void carMake() {
        jComboMake.removeAllItems();

        jComboMake.addItem("Toyota");
        jComboMake.addItem("Honda");
        jComboMake.addItem("Subaru");
        jComboMake.addItem("Ford");

    }

    // function that shows which model for make 
    // based on which one is selected
    private void carModel() {

        String item = jComboMake.getSelectedItem() + "";
        jComboModel.removeAllItems();

        // was having errors with item.equals, 
        // ai suggested to use setSelectedIndex to 0 as soon as the program starts
        if (item.equals("Toyota")) {
            jComboModel.addItem("Camry");
            jComboModel.addItem("Corolla");
            jComboModel.addItem("Rav4");
            jComboModel.addItem("Tacoma");
        } else if (item.equals("Honda")) {
            jComboModel.addItem("Civic");
            jComboModel.addItem("Accord");
            jComboModel.addItem("CRV");
            jComboModel.addItem("Ridgeline");
        } else if (item.equals("Subaru")) {
            jComboModel.addItem("Impreza");
            jComboModel.addItem("Crosstrek");
            jComboModel.addItem("Outback");
            jComboModel.addItem("Baja");
        } else if (item.equals("Ford")) {
            jComboModel.addItem("Taurus");
            jComboModel.addItem("Escape");
            jComboModel.addItem("Expedition");
            jComboModel.addItem("F150");
        }

    }

    // car years 
    // can update to be custom to each car, if more efficient method is used
    private void carYear() {

        jComboYear.removeAllItems();

        jComboYear.addItem("2015");
        jComboYear.addItem("2016");
        jComboYear.addItem("2017");
        jComboYear.addItem("2018");
    }

    private void carColor() {

        jComboColor.removeAllItems();

        jComboColor.addItem("Red");
        jComboColor.addItem("Blue");
        jComboColor.addItem("Silver");
        jComboColor.addItem("Black");

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1_Btree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnAdd;
    private javax.swing.JButton jBttnDelete;
    private javax.swing.JButton jBttnFind;
    private javax.swing.JButton jBttnHigh;
    private javax.swing.JButton jBttnLow;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboMake;
    private javax.swing.JComboBox<String> jComboModel;
    private javax.swing.JComboBox<String> jComboYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTxtArea;
    private javax.swing.JTextField jTxtField;
    // End of variables declaration//GEN-END:variables
}
