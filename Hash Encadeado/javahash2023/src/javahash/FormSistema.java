package javahash;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {
    HashMap<String, Pessoa> meuHash = new HashMap<>();
    LinkedList<Pessoa> minhaLista = new LinkedList<>();    
    ArrayList<String> arrayBusca = new ArrayList<>(); // carregar dados de busca
    
    public FormSistema() {
        initComponents();
        mostra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPessoa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnBuscarhm = new javax.swing.JButton();
        btnAddhm = new javax.swing.JButton();
        btnCarrega = new javax.swing.JButton();
        btnCarregarDadosBusca = new javax.swing.JButton();
        btnBuscarDados = new javax.swing.JButton();
        btnSalvarArquivo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listHashTable = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblPessoa.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblPessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblPessoa.setText("Pessoa:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/cryptography (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(lblPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        txtCpf.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnBuscarhm.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBuscarhm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/task.png"))); // NOI18N
        btnBuscarhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarhmActionPerformed(evt);
            }
        });

        btnAddhm.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAddhm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/clipboard.png"))); // NOI18N
        btnAddhm.setText("Adicionar Map");
        btnAddhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddhmActionPerformed(evt);
            }
        });

        btnCarrega.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCarrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/clipboard.png"))); // NOI18N
        btnCarrega.setText("Carrega Arquivo");
        btnCarrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaActionPerformed(evt);
            }
        });

        btnCarregarDadosBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCarregarDadosBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/clipboard.png"))); // NOI18N
        btnCarregarDadosBusca.setText("Carregar Dados");
        btnCarregarDadosBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarDadosBuscaActionPerformed(evt);
            }
        });

        btnBuscarDados.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBuscarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javahash/clipboard.png"))); // NOI18N
        btnBuscarDados.setText("Comparar Buscas");
        btnBuscarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDadosActionPerformed(evt);
            }
        });

        btnSalvarArquivo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnSalvarArquivo.setText("Salvar");
        btnSalvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAddhm, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarhm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBuscarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarregarDadosBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSalvarArquivo))
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarhm)
                    .addComponent(btnAddhm))
                .addGap(11, 11, 11)
                .addComponent(btnSalvarArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarregarDadosBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarDados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        listHashTable.setEditable(false);
        listHashTable.setColumns(20);
        listHashTable.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listHashTable.setRows(5);
        listHashTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hash Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane1.setViewportView(listHashTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    void carregaDados(){
        String csvFile = "dados.csv";
        String line = "";
        String[] pessoa = null;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                 pessoa = line.split(";");
                 Pessoa p = new Pessoa();
                 p.setNome(pessoa[0]);
                 p.setCpf(pessoa[1]);
                meuHash.put(p.getCpf(), p);
                minhaLista.add(p);
                System.out.println(p);
            }// fim percurso no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    void carregaDadosBusca(){
        String csvFile = "dadosBusca.csv";
        String line = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                arrayBusca.add(line);
            }// fim percurso no arquivo
            for(String cpf : arrayBusca){
                System.out.println(cpf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void btnCarregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaActionPerformed
        // TODO add your handling code here:
        carregaDados();
        mostra();
    }//GEN-LAST:event_btnCarregaActionPerformed


    private void btnAddhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddhmActionPerformed
        Pessoa p = new Pessoa();
        
        p.setNome(txtNome.getText());
        p.setCpf(txtCpf.getText());
        
        meuHash.put(p.getCpf(), p);
        
        mostra();
    }//GEN-LAST:event_btnAddhmActionPerformed

    void mostra(){
        //mostrar o meu Hash no List
        listHashTable.setText("");
        if(!meuHash.isEmpty()){
            for (Map.Entry<String, Pessoa> dado : meuHash.entrySet()) { //para cada entrada <chave, valor> dentro da tabela hash
            listHashTable.append(dado.getValue()+"\n"); //append adiona e mantém o que existe antes
            }
        }else{
            listHashTable.setText("Tabela Vazia ! ");
        }
        txtNome.setText("");
        txtCpf.setText("");
    }
    
    private void btnBuscarhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarhmActionPerformed
        
        Pessoa p;
        if(meuHash.isEmpty()){
            JOptionPane.showMessageDialog(null, "Tabela Vazia!");
        }else{
            p = meuHash.get(txtCpf.getText());
            if(p == null)
                lblPessoa.setText("Pessoa: Não Existe");
            else{
                lblPessoa.setText("Pessoa: " + p.getNome());
            }
        }
    }//GEN-LAST:event_btnBuscarhmActionPerformed

    private void btnCarregarDadosBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarDadosBuscaActionPerformed
        // TODO add your handling code here:
        carregaDadosBusca();
        mostra();
    }//GEN-LAST:event_btnCarregarDadosBuscaActionPerformed

    private void btnBuscarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDadosActionPerformed
        // TODO add your handling code here:
        if(meuHash.isEmpty())
            JOptionPane.showMessageDialog(null, "Tabela Vazia!");
        
        if(arrayBusca.isEmpty())
            JOptionPane.showMessageDialog(null, "Vetor Vazio!");
           
        Pessoa p = new Pessoa();
        
        int totalCpfA = 0;
        int totalCpfL = 0;
        
        long tempoInicial = System.currentTimeMillis();
        for(String cpf : arrayBusca){
            if(meuHash.containsKey(cpf))
                totalCpfA++;             
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Total de CPF Existentes: "+ totalCpfA);
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000.00);
        
        tempoInicial = System.currentTimeMillis();
        for(String cpf : arrayBusca){
            for(Pessoa pessoa : minhaLista){
                if(pessoa.getCpf().equals(cpf))
                    totalCpfL++;            
            }    
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Total de CPF Existentes: "+ totalCpfL);
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000.00);

    }//GEN-LAST:event_btnBuscarDadosActionPerformed

    private void btnSalvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarArquivoActionPerformed
        // TODO add your handling code here:
        String csvFile = "dadosComparados.csv";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));
            for(String cpf : arrayBusca){
            if(meuHash.containsKey(cpf)){
                bw.write(cpf+" | Existe");
            }else{
                bw.write(cpf+" | Não Existe");
            }
            
            bw.newLine();           
        }
        } catch (IOException ex) {
            Logger.getLogger(FormSistema.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnSalvarArquivoActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddhm;
    private javax.swing.JButton btnBuscarDados;
    private javax.swing.JButton btnBuscarhm;
    private javax.swing.JButton btnCarrega;
    private javax.swing.JButton btnCarregarDadosBusca;
    private javax.swing.JButton btnSalvarArquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JTextArea listHashTable;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
