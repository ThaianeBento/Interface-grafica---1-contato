/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Thaiane
 *
 */
import java.util.ArrayList;
import modelo.Pessoa;

public class CadastroPessoa extends javax.swing.JFrame {

    public CadastroPessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        Código = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Endereço = new javax.swing.JLabel();
        Salário = new javax.swing.JLabel();
        PessoasCadastradas = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        spPessoasCadastradas = new javax.swing.JScrollPane();
        taPessoasCadastradas = new javax.swing.JTextArea();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        tfEndereco = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        btMostrar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoas");

        Código.setText("Código");

        Nome.setText("Nome");

        Sexo.setText("Sexo");

        Endereço.setText("Endereço");

        Salário.setText("Salário");

        PessoasCadastradas.setText("Pessoas cadastradas");

        taPessoasCadastradas.setEditable(false);
        taPessoasCadastradas.setColumns(20);
        taPessoasCadastradas.setRows(5);
        spPessoasCadastradas.setViewportView(taPessoasCadastradas);

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        btMostrar.setText("Mostrar");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spPessoasCadastradas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Endereço)
                            .addComponent(Salário))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEndereco)
                            .addComponent(tfSalario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sexo)
                                .addGap(36, 36, 36)
                                .addComponent(rbFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMasculino))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Código)
                                    .addComponent(Nome))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PessoasCadastradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMostrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Código)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereço)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salário)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PessoasCadastradas)
                    .addComponent(btMostrar)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spPessoasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
      
        taPessoasCadastradas.setText("");
        CadastroPessoa.pessoas.forEach(p->{
            String people = taPessoasCadastradas.getText();
            if(people.length() > 0){
                String newText = people + "\n" + p.toString();
                taPessoasCadastradas.setText(newText);
            }else{
                taPessoasCadastradas.setText(p.toString());
            }
       });
    }//GEN-LAST:event_btMostrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.tfCodigo.setText("");
        this.tfEndereco.setText("");
        this.tfNome.setText("");
        this.tfSalario.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        int cod = Integer.parseInt(this.tfCodigo.getText());
        String nome = this.tfNome.getText();
        char sexo = rbFeminino.isSelected()? 'F' : 'M';
        String endereco = this.tfEndereco.getText();
        double salario = Double.parseDouble(this.tfSalario.getText());
        
        Pessoa pes = new Pessoa(cod, nome, sexo, endereco,salario);
        CadastroPessoa.pessoas.add(pes);
        btLimpar.doClick();
    }//GEN-LAST:event_btSalvarActionPerformed

    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
             public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    private static ArrayList<Pessoa> pessoas = new ArrayList();
    //static para salvar em memória
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Código;
    private javax.swing.JLabel Endereço;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel PessoasCadastradas;
    private javax.swing.JLabel Salário;
    private javax.swing.JLabel Sexo;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMostrar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JScrollPane spPessoasCadastradas;
    private javax.swing.JTextArea taPessoasCadastradas;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}


