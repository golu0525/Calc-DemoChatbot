import java.awt.Color;


@SuppressWarnings("serial")
public class Chatbot extends javax.swing.JFrame {

    
    public Chatbot() {
        initComponents();
    }

   
    
                              
    private void initComponents() {
    	
        t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        t.setBackground(Color.cyan);
        a.setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        a.setColumns(20);
        a.setRows(5);
        jScrollPane1.setViewportView(a);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(t))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
    }                                          

    private void tActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
        String utxt=t.getText();
					a.append("You: "+utxt+"\n");
					t.setText("");
					//int spell=(int) (Math.random()*3+1);
					//if(spell==1){
						if(utxt.contains("hii") || utxt.contains("hello") || utxt.contains("hey") || utxt.contains("wassup")){
						{
							botsay("hello!!");
						}
						}
						/*else{
						int decider=(int) (Math.random()*2+1);
						if(decider==2){
							botsay("Please rephrase it!!");
						}
						/*if(decider==3){
							botsay("???");
						}*/
						
					
					//}
					/*if(spell==2)
					{*/
					if(utxt.contains("Good Morning") || utxt.contains("good morning") || utxt.contains("morning") || utxt.contains("How was your day")){
						
							botsay("Good Day Sir!!!" +
						
								"How about you?");
					}
						
						
					
					
					/*else{
						int decider=(int) (Math.random()*3+1);
						if(decider==2){
							botsay("Please rephrase it!!");
						}
						if(decider==3){
							botsay("???");
						}
						
					}*/
					
					if(utxt.contains("How are you?") || utxt.contains("how r u?") || utxt.contains("how are you?") ){
						{
							botsay("I am fine!!" +
						
								"How are you?");
					}
						
					}
					
				/*	else{
						int decider=(int) (Math.random()*3+1);
						if(decider==2){
							botsay("Please rephrase it!!");
						}
						if(decider==3){
							botsay("???");
						}
						
					}*/
					if(utxt.contains("Abhishek Pandey") || utxt.contains("abhishek pandey") || utxt.contains("golu") || utxt.contains("Golu") || utxt.contains("pandey"))
						{
							botsay("Bot is activated" + " " + "Now you can access this BOT.");
					}
					
						if(utxt.contains("I want to know about Cricket.") || utxt.contains("Cricket") || utxt.contains("cricket") ){
							{
								botsay("ohh so you are a big fan of Sachin");
						}
							}
					
					}
					/*if(utxt.contains("hii") || utxt.contains("hello") || utxt.contains("hey") || utxt.contains("wassup")){
						botsay("hello!!");
					}
					else{
						int decider=(int) (Math.random()*3+1);
						if(decider==2){
							botsay("Please rephrase it!!");
						}
						if(decider==3){
							botsay("???");
						}
						if(decider==0){
							botsay("unable to proceed!!!");
						}
					}
					if(utxt.contains("hii") || utxt.contains("hello") || utxt.contains("hey") || utxt.contains("wassup")){
						botsay("hello!!");
					}
					else{
						int decider=(int) (Math.random()*3+1);
						if(decider==2){
							botsay("Please rephrase it!!");
						}
						if(decider==3){
							botsay("???");
						}
						if(decider==0){
							botsay("unable to proceed!!!");
						}
					}*/
					
                           

    public void botsay(String s){
			a.append("Bot: "+s+"\n");
		}
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chatbot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea a;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t;
    // End of variables declaration                   
}