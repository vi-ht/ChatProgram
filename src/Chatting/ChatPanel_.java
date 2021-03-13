/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chatting;

/**
 *
 * @author Thanh Vi
 */
import java.awt.Image;
import java.net.Socket;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea; 
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.View;
public class ChatPanel_ extends javax.swing.JPanel /*implements Runnable*/{
       Socket socket;
      JList<String>display ;
      String sender;
      String receiver;
      Vector<Socket> listSocket;
      Vector<String> Name;
      DefaultListModel<String> model = new DefaultListModel<>();
      ArrayList<Integer> chat = new ArrayList<>();
      Thread t;
      int selectedRow=0;
     P2P p2p ;
     BufferedWriter os=null;
      BufferedReader bf=null;
      File file;
      String FileName="";
      public ChatPanel_(Socket s, String sender, String receiver,Vector v) {
            initComponents();
           this.socket=s;
            this.listSocket=v;
            this.sender=sender;
            this.receiver=receiver;
             p2p= new P2P(socket, this.sender,this.receiver, model, jList1, txtMessageV, listSocket,0,0,chat,pathfile1,FileName,name,size);
            try { 
                  bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                  os=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            } catch (Exception e) {
            }
      }

   public  JTextPane getTxtMessageV(){
          return this.txtMessageV;
     }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jTextField1 = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            jList1 = new javax.swing.JList<>();
            jScrollPane4 = new javax.swing.JScrollPane();
            Mess = new javax.swing.JTextArea();
            send = new javax.swing.JButton();
            jScrollPane3 = new javax.swing.JScrollPane();
            txtMessageV = new javax.swing.JTextPane();
            jLabel1 = new javax.swing.JLabel();
            btnChat = new javax.swing.JButton();
            jTabbedPane1 = new javax.swing.JTabbedPane();
            jPanel1 = new javax.swing.JPanel();
            haha = new javax.swing.JButton();
            angry = new javax.swing.JButton();
            cry = new javax.swing.JButton();
            love = new javax.swing.JButton();
            like = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            size = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            pathfile1 = new javax.swing.JTextField();
            choosefile = new javax.swing.JButton();
            jLabel4 = new javax.swing.JLabel();
            name = new javax.swing.JTextField();
            sendfile = new javax.swing.JButton();

            jTextField1.setText("jTextField1");

            setPreferredSize(new java.awt.Dimension(700, 439));

            jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jList1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jList1MouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(jList1);

            Mess.setColumns(20);
            Mess.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Mess.setRows(5);
            jScrollPane4.setViewportView(Mess);

            send.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            send.setText("Send");
            send.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sendActionPerformed(evt);
                  }
            });

            txtMessageV.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
            jScrollPane3.setViewportView(txtMessageV);

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel1.setText("Manager:");

            btnChat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            btnChat.setText("Chat");
            btnChat.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnChatActionPerformed(evt);
                  }
            });

            jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
            jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

            haha.setIcon(new javax.swing.ImageIcon("C:\\Java\\WSPRJ_67\\haha3.png")); // NOI18N
            haha.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        hahaActionPerformed(evt);
                  }
            });

            angry.setIcon(new javax.swing.ImageIcon("C:\\Java\\WSPRJ_67\\angry2.png")); // NOI18N
            angry.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        angryActionPerformed(evt);
                  }
            });

            cry.setIcon(new javax.swing.ImageIcon("C:\\Java\\WSPRJ_67\\cry3.png")); // NOI18N
            cry.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cryActionPerformed(evt);
                  }
            });

            love.setIcon(new javax.swing.ImageIcon("C:\\Java\\WSPRJ_67\\heartt.png")); // NOI18N
            love.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        loveActionPerformed(evt);
                  }
            });

            like.setIcon(new javax.swing.ImageIcon("C:\\Java\\WSPRJ_67\\like1.png")); // NOI18N
            like.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        likeActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(haha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(love, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(like, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(like, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(angry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(haha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(cry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(love, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Emoji:", jPanel1);

            size.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            size.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sizeActionPerformed(evt);
                  }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setText("Path file:");

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel3.setText("File name:");

            pathfile1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

            choosefile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            choosefile.setText("...");
            choosefile.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        choosefileActionPerformed(evt);
                  }
            });

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setText("Size:");

            name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            name.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nameActionPerformed(evt);
                  }
            });

            sendfile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            sendfile.setText("Send File");
            sendfile.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sendfileActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel2)
                              .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(pathfile1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choosefile))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sendfile, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(pathfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(choosefile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel3)
                              .addComponent(jLabel4)
                              .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sendfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );

            jTabbedPane1.addTab("Send file", jPanel2);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                          .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel1)
                                          .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
      }// </editor-fold>//GEN-END:initComponents

      private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

            if(Mess.getText().trim().length()==0) return;
            try {
                  os.write(Mess.getText());
                  os.newLine();
                  os.flush();
                  Document doc = txtMessageV.getDocument();
                                                      try {
                                                            doc.insertString(doc.getLength(),("\n" + sender + ":" + Mess.getText()), null);
                                                      } catch (BadLocationException ex) {
                                                            ex.printStackTrace();
                                                      }
                  Mess.setText("");
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e);
            }
      }//GEN-LAST:event_sendActionPerformed

      private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

      }//GEN-LAST:event_jList1MouseClicked

      private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
             
            selectedRow  = jList1.getSelectedIndex();
           if(selectedRow==100){
           }else{
                        int mypos=0;
                        System.out.println("model"+model.size());
                        for (int j = 0; j < model.size();j++) {
                              if(model.get(j).contains("Me")){
                                    mypos=j;
                                    break;
                              }
                        }
                        if(selectedRow==mypos){
                              JOptionPane.showMessageDialog(this, "You can not chat with yourself!");
                        }else{
                              int r;
                              r = JOptionPane.showConfirmDialog(this, "Do you want to connect with '"+ model.get(selectedRow).substring(2).toString()+ "'' ?", "Connect?", JOptionPane.YES_NO_OPTION);
                             if(r==JOptionPane.YES_OPTION){
                                   p2p.setVisible(true);
                                   p2p.info(model.get(selectedRow).substring(2),mypos,selectedRow );
                                   p2p.display("Connecting. . . ");
                                  String a = ""+selectedRow+mypos+sender;
                                    connect(a);
                        }
            }
            
           }
           
      }//GEN-LAST:event_btnChatActionPerformed

       public void Sendtoserver (String mess){
            
            try {
                  os.write("="+mess);
                  os.newLine();
                  os.flush(); 
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e);
            }}
       
      private void hahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hahaActionPerformed
            // TODO add your handling code here:
            String NameIcon="haha3.png";
            Image img=this.getToolkit().getImage(NameIcon);
                  setVisible(true);
                   Document doc = txtMessageV.getDocument();
                  try {
                     doc.insertString(doc.getLength(), "\n"+sender+":", null);
                 } catch (BadLocationException ex) {
                       ex.printStackTrace();
                 }
                  txtMessageV.setCaretPosition(txtMessageV.getDocument().getLength());
                  txtMessageV.insertIcon(new ImageIcon(img));
                  Sendtoserver(NameIcon);
      }//GEN-LAST:event_hahaActionPerformed

      private void angryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angryActionPerformed

            String NameIcon="angry2.png";
            Image img=this.getToolkit().getImage(NameIcon);
                  setVisible(true);
                   Document doc = txtMessageV.getDocument();
                  try {
                      doc.insertString(doc.getLength(), "\n"+sender+":", null);
                 } catch (BadLocationException ex) {
                       ex.printStackTrace();
                 }
                  txtMessageV.setCaretPosition(txtMessageV.getDocument().getLength());
                  txtMessageV.insertIcon(new ImageIcon(img));
                  Sendtoserver(NameIcon);
      }//GEN-LAST:event_angryActionPerformed

      private void cryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cryActionPerformed

            String NameIcon="cry3.png";
            Image img=this.getToolkit().getImage(NameIcon);
                  setVisible(true);
                   Document doc = txtMessageV.getDocument();
                  try {
                      doc.insertString(doc.getLength(), "\n"+sender+":", null);
                 } catch (BadLocationException ex) {
                       ex.printStackTrace();
                 }
                  txtMessageV.setCaretPosition(txtMessageV.getDocument().getLength());
                  txtMessageV.insertIcon(new ImageIcon(img));
                  Sendtoserver(NameIcon);
      }//GEN-LAST:event_cryActionPerformed

      private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosefileActionPerformed
            // TODO add your handling code here:
            JFileChooser fc = new JFileChooser();
            fc.showDialog(this, "Select file");
            file = fc.getSelectedFile();
            System.out.println(file.getName());
            FileName=file.getName();
            p2p.file(FileName);
            if(file!=null){
                  if(!file.getName().isEmpty()){
                        choosefile.setEnabled(true);
                        String path ="";
                        path= file.getPath();
                        pathfile1.setText(path);
                        name.setText(file.getName());
                        size.setText(Math.ceil(file.length()) / 100+"MB");
                        }
                  }
      }//GEN-LAST:event_choosefileActionPerformed

      private void sendfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendfileActionPerformed

            try {
                                                      System.out.println("");
                                                os.write("[,-"+Math.ceil(file.length()) / 100+"MB");
                                                os.newLine();
                                                os.flush(); 
                                                os.write("[,"+FileName);
                                                os.newLine();
                                                os.flush(); 
                                                 Document doc = txtMessageV.getDocument();
                                         try {
                                             doc.insertString(doc.getLength(), "\n"+sender+" send File:"+FileName+"!", null);
                                        } catch (BadLocationException ex) {
                                              ex.printStackTrace();
                                        }
                                          } catch (Exception e) {
                                                JOptionPane.showMessageDialog(this, e);
                                          }
      }//GEN-LAST:event_sendfileActionPerformed

      private void loveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loveActionPerformed

            String NameIcon="heartt.png";
            Image img=this.getToolkit().getImage(NameIcon);
                  setVisible(true);
                   Document doc = txtMessageV.getDocument();
                  try {
                     doc.insertString(doc.getLength(), "\n"+sender+":", null);
                 } catch (BadLocationException ex) {
                       ex.printStackTrace();
                 }
                  txtMessageV.setCaretPosition(txtMessageV.getDocument().getLength());
                  txtMessageV.insertIcon(new ImageIcon(img));
                  Sendtoserver(NameIcon);
      }//GEN-LAST:event_loveActionPerformed

      private void likeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeActionPerformed

            String NameIcon="like1.png";
            Image img=this.getToolkit().getImage(NameIcon);
                  setVisible(true);
                   Document doc = txtMessageV.getDocument();
                  try {
                     doc.insertString(doc.getLength(), "\n"+sender+":", null);
                 } catch (BadLocationException ex) {
                       ex.printStackTrace();
                 }
                  txtMessageV.setCaretPosition(txtMessageV.getDocument().getLength());
                  txtMessageV.insertIcon(new ImageIcon(img));
                  Sendtoserver(NameIcon);
      }//GEN-LAST:event_likeActionPerformed

      private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_sizeActionPerformed

      private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_nameActionPerformed


  

       public void connect(String stt){
            String a = "!"+stt;
            try {
                  os.write(a);
                  os.newLine();
                  os.flush();
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e);
            }
       }
  
             public void response(String res){
            String a = "!-"+res;
            try {
                  os.write(a);
              os.newLine();
                  os.flush();
                  Document doc = txtMessageV.getDocument();
                                                      try {
                                                            doc.insertString(doc.getLength(),("\n" + sender + ":" + a ), null);
                                                      } catch (BadLocationException ex) {
                                                            ex.printStackTrace();
                                                      }
                  Mess.setText("");
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e);
            }
       }
      



      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextArea Mess;
      private javax.swing.JButton angry;
      private javax.swing.JButton btnChat;
      private javax.swing.JButton choosefile;
      private javax.swing.JButton cry;
      private javax.swing.JButton haha;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JList<String> jList1;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JScrollPane jScrollPane4;
      private javax.swing.JTabbedPane jTabbedPane1;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JButton like;
      private javax.swing.JButton love;
      private javax.swing.JTextField name;
      private javax.swing.JTextField pathfile1;
      private javax.swing.JButton send;
      private javax.swing.JButton sendfile;
      private javax.swing.JTextField size;
      private javax.swing.JTextPane txtMessageV;
      // End of variables declaration//GEN-END:variables

            
}
