package filemanager;

import Controller.Manager;
import Model.Fichier;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sevrin
 */
public class MainWindows extends javax.swing.JFrame {
    private Manager manag;
    /**
     * Creates new form MainWindows
     */
    public MainWindows() {
        initComponents();//Init components and events
        init();
    }
    
    private void init(){

        this.setIconImage(Toolkit.getDefaultToolkit().getImage("img/ub.png"));
        this.manag = new Manager();
        this.tOutputeName.setText("");
        this.tOutputeDirectory.setText("");
    }
    
    private void updateDisplayList(){
        listeDisplayer.removeAll();
        DefaultListModel modele = new DefaultListModel();
        for(Fichier f : this.manag.getFilesToConcat()){
            modele.addElement(f.getNom());
            System.out.println(f.getNom());
        }
        listeDisplayer.setModel(modele);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b_Search = new javax.swing.JButton();
        p_Liste = new javax.swing.JPanel();
        p_scrollList = new javax.swing.JScrollPane();
        listeDisplayer = new javax.swing.JList<>();
        p_Remonter = new javax.swing.JButton();
        p_Descendre = new javax.swing.JButton();
        p_Supp = new javax.swing.JButton();
        p_Vider1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        p_controls = new javax.swing.JPanel();
        b_cryptage = new javax.swing.JButton();
        b_Fussionner = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tOutputeName = new javax.swing.JTextField();
        jFind = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tOutputeDirectory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b_decryptage = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);

        b_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_Search.setText("Chercher des fichiers ou un repertoire");
        b_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(b_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_scrollList.setViewportView(listeDisplayer);

        p_Remonter.setText("Remonter");
        p_Remonter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_RemonterActionPerformed(evt);
            }
        });

        p_Descendre.setText("Descendre");
        p_Descendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_DescendreActionPerformed(evt);
            }
        });

        p_Supp.setText("Enlever");
        p_Supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_SuppActionPerformed(evt);
            }
        });

        p_Vider1.setText("Vider");
        p_Vider1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_Vider1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Liste des Fichiers");

        javax.swing.GroupLayout p_ListeLayout = new javax.swing.GroupLayout(p_Liste);
        p_Liste.setLayout(p_ListeLayout);
        p_ListeLayout.setHorizontalGroup(
            p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_ListeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_ListeLayout.createSequentialGroup()
                        .addComponent(p_scrollList)
                        .addContainerGap())
                    .addGroup(p_ListeLayout.createSequentialGroup()
                        .addGroup(p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_ListeLayout.createSequentialGroup()
                                .addComponent(p_Remonter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_Descendre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_Vider1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_Supp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p_ListeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        p_ListeLayout.setVerticalGroup(
            p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_ListeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p_Vider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_ListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p_Remonter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p_Descendre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p_Supp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_scrollList)
                .addContainerGap())
        );

        b_cryptage.setText("Crypter");
        b_cryptage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cryptageActionPerformed(evt);
            }
        });

        b_Fussionner.setText("Fusionner");
        b_Fussionner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_FussionnerActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(210, 210, 210));

        jFind.setText("Chercher");
        jFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom du fichier");

        jLabel4.setText("Repetroie");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sortie de la Fussion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tOutputeName)
                    .addComponent(tOutputeDirectory, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jFind, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tOutputeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tOutputeDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        b_decryptage.setText("Decrypter");
        b_decryptage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_decryptageActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoESIREM.png"))); // NOI18N

        javax.swing.GroupLayout p_controlsLayout = new javax.swing.GroupLayout(p_controls);
        p_controls.setLayout(p_controlsLayout);
        p_controlsLayout.setHorizontalGroup(
            p_controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_controlsLayout.createSequentialGroup()
                        .addComponent(b_Fussionner, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cryptage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_decryptage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_controlsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_controlsLayout.setVerticalGroup(
            p_controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cryptage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_Fussionner, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_decryptage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_Liste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_controls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_controls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_Liste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SearchActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] files = jfc.getSelectedFiles();
            Arrays.asList(files).forEach(x -> {
                if (x.isDirectory()) {
                    System.out.println(x.getAbsolutePath());
                    //TODO : Display all file of directory
                    File[] filesList = x.listFiles();
                    for(int i =0;i<filesList.length;i++){
                        this.manag.addFile(filesList[i]);
                    }
                    updateDisplayList();
                }
            });
            Arrays.asList(files).forEach(x -> {
                if (x.isFile()) {
                    System.out.println(x.getAbsolutePath());
                    this.manag.addFile(x);
                    updateDisplayList();
                }
            });
        }
    }//GEN-LAST:event_b_SearchActionPerformed

    private void b_cryptageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cryptageActionPerformed
        int[] indexSelectedFiles = this.listeDisplayer.getSelectedIndices();
        
        for(int i=0; i<indexSelectedFiles.length;i++){
            String fname = this.listeDisplayer.getModel().getElementAt(indexSelectedFiles[i]);
            Fichier f = this.manag.getFilesToConcat().get(this.manag.findIndex(fname));

            try {
                this.manag.Crypter(f);
            } catch (IOException ex) {
                Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
            
        }
    }//GEN-LAST:event_b_cryptageActionPerformed
    /**
     * Evenement qui lance la fusion des fichiers soi selectionner, soi tout les fichiers
     * Prend aussi en compte le nom du nouveau fichier ainsi que sa sortie, si rien choisi, en choisi une par default
     * @param evt evenement du clic
     */
    private void b_FussionnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_FussionnerActionPerformed
        String out = this.tOutputeName.getText();
        String outpath = this.tOutputeDirectory.getText();
        if(outpath.equals("")){
            outpath="OUTPUTE";
        }
        if(out.equals("")){
            out="fileoutpute.txt";
        }
        System.out.println("chemin de sortie : "+outpath+"/"+out);
        File f = new File(outpath);
        if(f.exists()==false)
        {   
            Path p = Paths.get(outpath);
            try {
                Files.createDirectory(p);
            } catch (IOException ex) {
                Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            this.manag.setOutpute(outpath+"/"+out);

        try {
            /////==============================On distingue bien les fichiers afficher et les fichiers a fusionner
            int[] indexSelectedFiles = this.listeDisplayer.getSelectedIndices();
            ArrayList<Fichier> listFilesToTreat = new ArrayList<>();
            
            //Si on a selectionner des fichiers
            if(indexSelectedFiles.length!=0){
                for(int i=0; i<indexSelectedFiles.length;i++){
                    String fname = this.listeDisplayer.getModel().getElementAt(indexSelectedFiles[i]);
                    listFilesToTreat.add(this.manag.getFilesToConcat().get(this.manag.findIndex(fname)));
                } 
            }else{
                ArrayList<String> fname = new ArrayList<>();
                //On cast la JList en ArrayList
                for(int i=0; i<this.listeDisplayer.getModel().getSize();i++){
                    fname.add( this.listeDisplayer.getModel().getElementAt(i));
                }
                
                //On ajoute les fichiers contenus dans la JList
                for(String str : fname){
                    listFilesToTreat.add(this.manag.getFilesToConcat().get(this.manag.findIndex(str)));
                } 
                
            }
            
            this.manag.addFileToTreat(listFilesToTreat);
         
            this.manag.StartConcatene();
        } catch (IOException ex) {
            Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tOutputeName.setText("");
        this.tOutputeDirectory.setText("");
    }//GEN-LAST:event_b_FussionnerActionPerformed
    
    /**
     * Permet de changer l'ordre de la list à fusionner
     * Remonte l'element selectionner
     * @param evt 
     */
    private void p_RemonterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_RemonterActionPerformed
        
        int index = this.listeDisplayer.getSelectedIndex();
        if(index != -1){
            String fname = this.listeDisplayer.getModel().getElementAt(this.listeDisplayer.getSelectedIndex());
            this.manag.order_push_forward(this.manag.getFilesToConcat().get(this.manag.findIndex(fname)) );
            this.updateDisplayList();
        }
        
    }//GEN-LAST:event_p_RemonterActionPerformed

    private void p_DescendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_DescendreActionPerformed
        int index = this.listeDisplayer.getSelectedIndex();
        //Si aucun element est selection alors on ne fais rien
        if(index != -1){
            String fname = this.listeDisplayer.getModel().getElementAt(this.listeDisplayer.getSelectedIndex());      
            this.manag.order_push_backwards(this.manag.getFilesToConcat().get(this.manag.findIndex(fname)) );
            this.updateDisplayList();
        }
    }//GEN-LAST:event_p_DescendreActionPerformed

    private void p_SuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_SuppActionPerformed
        int index = this.listeDisplayer.getSelectedIndex();
        //Si aucun element est selection alors on ne fais rien
        if(index != -1){
            String fname = this.listeDisplayer.getModel().getElementAt(this.listeDisplayer.getSelectedIndex()); 
            this.manag.remove(this.manag.getFilesToConcat().get(this.manag.findIndex(fname)));
            this.updateDisplayList();
        }
    }//GEN-LAST:event_p_SuppActionPerformed
    
    private void b_decryptageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_decryptageActionPerformed
        int[] indexSelectedFiles = this.listeDisplayer.getSelectedIndices();
        for(int i=0; i<indexSelectedFiles.length;i++){
            String fname = this.listeDisplayer.getModel().getElementAt(indexSelectedFiles[i]);
            Fichier f = this.manag.getFilesToConcat().get(this.manag.findIndex(fname));
            
            try {
                this.manag.Decrypter(f);
            } catch (IOException ex) {
                Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_b_decryptageActionPerformed

    private void jFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            this.tOutputeDirectory.setText(file.getAbsolutePath());
            
        }
    }//GEN-LAST:event_jFindActionPerformed

    private void p_Vider1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_Vider1ActionPerformed
        this.manag.clear();
        this.updateDisplayList();
    }//GEN-LAST:event_p_Vider1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Fussionner;
    private javax.swing.JButton b_Search;
    private javax.swing.JButton b_cryptage;
    private javax.swing.JButton b_decryptage;
    private javax.swing.JButton jFind;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JList<String> listeDisplayer;
    private javax.swing.JButton p_Descendre;
    private javax.swing.JPanel p_Liste;
    private javax.swing.JButton p_Remonter;
    private javax.swing.JButton p_Supp;
    private javax.swing.JButton p_Vider1;
    private javax.swing.JPanel p_controls;
    private javax.swing.JScrollPane p_scrollList;
    private javax.swing.JTextField tOutputeDirectory;
    private javax.swing.JTextField tOutputeName;
    // End of variables declaration//GEN-END:variables
}
