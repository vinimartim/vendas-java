/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerClientes;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasClientes;
import controller.ControllerVendasProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelVendasProdutos;
import util.Datas;

/**
 *
 * @author vinic
 */
public class ViewVenda extends javax.swing.JFrame {
    // CLIENTE
    ControllerClientes controllerClientes = new ControllerClientes();
    ModelClientes modelClientes = new ModelClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
    
    // PRODUTO
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    
    // VENDAS-CLIENTES
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ControllerVendasClientes controllerVendasClientes = new ControllerVendasClientes();
    
    // VENDAS-PRODUTOS   
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    
    // VENDAS
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
    
    Datas datas = new Datas();
    
    public ViewVenda() {
        initComponents();
        listarClientes();
        listarProdutos();
        setLocationRelativeTo(null);
        carregarVendas();
        inicializarCodigosCliente();
        inicilizarCodigoProduto();
        
        jtfDesconto.setText("0");
        jtfValorTotal.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbCliente = new componentes.UJComboBox();
        jtfCodCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCodVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbProduto = new componentes.UJComboBox();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfCadAdicionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendasProdutos = new javax.swing.JTable();
        jbCadCancelar = new javax.swing.JLabel();
        jbCadSalvar = new javax.swing.JLabel();
        jbCadNovo = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JTextField();
        jtfDesconto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jbConsPesquisar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jbConsAlterar = new javax.swing.JLabel();
        jbConsExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Código do cliente");

        jcbCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtfCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodClienteFocusLost(evt);
            }
        });

        jLabel2.setText("Cliente");

        jLabel3.setText("Código da venda");

        jLabel4.setText("Código do produto");

        jtfCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodProdutoFocusLost(evt);
            }
        });

        jLabel5.setText("Produto");

        jcbProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setText("Quantidade");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Carrinho");

        jtfCadAdicionar.setText("Adicionar");
        jtfCadAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfCadAdicionarMouseClicked(evt);
            }
        });

        jtVendasProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Prod", "Nome produto", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtVendasProdutos);

        jbCadCancelar.setText("Cancelar");

        jbCadSalvar.setText("Salvar");
        jbCadSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCadSalvarMouseClicked(evt);
            }
        });

        jbCadNovo.setText("Novo");
        jbCadNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCadNovoMouseClicked(evt);
            }
        });

        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });

        jLabel12.setText("Desconto");

        jLabel13.setText("Valor total");

        jLabel8.setText("R$");

        jLabel9.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfCodProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jcbProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfCodCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfCodVenda)
                                .addComponent(jtfQuantidade))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfCadAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCadNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCadSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCadCancelar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfCadAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadCancelar)
                    .addComponent(jbCadSalvar)
                    .addComponent(jbCadNovo))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel14.setText("Pesquisa");

        jbConsPesquisar.setText("Pesquisar");

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtVendas);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Vendas");

        jbConsAlterar.setText("Alterar");

        jbConsExcluir.setText("Excluir");
        jbConsExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbConsExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbConsPesquisar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConsExcluir)
                .addGap(18, 18, 18)
                .addComponent(jbConsAlterar)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsAlterar)
                    .addComponent(jbConsExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodClienteFocusLost
        // TODO add your handling code here:
        modelClientes = controllerClientes.getClienteController(Integer.parseInt(jtfCodCliente.getText()));
        jcbCliente.setSelectedItem(modelClientes.getClienteNome());
    }//GEN-LAST:event_jtfCodClienteFocusLost

    private void jcbClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbClientePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(jcbCliente.isPopupVisible()) {
            inicializarCodigosCliente();
        }
    }//GEN-LAST:event_jcbClientePopupMenuWillBecomeInvisible

    private void jcbProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbProdutoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(jcbProduto.isPopupVisible()) {
            inicilizarCodigoProduto();
        }
    }//GEN-LAST:event_jcbProdutoPopupMenuWillBecomeInvisible

    private void jtfCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodProdutoFocusLost
        // TODO add your handling code here:
        modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(jtfCodProduto.getText()));
        jcbProduto.setSelectedItem(modelProdutos.getProdNome());
    }//GEN-LAST:event_jtfCodProdutoFocusLost

    private void jbConsExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsExcluirMouseClicked
        // TODO add your handling code here:
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha,0);
        
        listaModelProdutos = new ArrayList<>();
        listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
            modelProdutos = new ModelProdutos();
            modelProdutos.setProdId(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdId());
            
            // Adiciona ao estoque a quantidade do produto que voltou do cancelamento da venda
            modelProdutos.setProdEstoque(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdEstoque()
            + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQtd());
            
            listaModelProdutos.add(modelProdutos);
        }
        
        if(controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if(controllerVendas.excluirVendasController(codigoVenda)) {
                JOptionPane.showMessageDialog(this, "Venda excluída com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir a vendas", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
              JOptionPane.showMessageDialog(this, "Não foi possível excluir a vendas", "Erro", JOptionPane.ERROR_MESSAGE);      
        }
    }//GEN-LAST:event_jbConsExcluirMouseClicked

    private void jtfCadAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCadAdicionarMouseClicked
        // TODO add your handling code here:
        if(jtfQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(jtfCodProduto.getText()));
            
            // Adicionar linha na tabela
            DefaultTableModel modelo = (DefaultTableModel) jtVendasProdutos.getModel();
            int cont = 0;
            double quantidade = 0.0;
            quantidade = Double.parseDouble(jtfQuantidade.getText());
            for (int i = 0; i < cont; i++) {
                modelo.setNumRows(0);
            }
            
            // Adicionar nas colunas
            modelo.addRow(new Object[] {
                modelProdutos.getProdId(),
                modelProdutos.getProdNome(),
                jtfQuantidade.getText(),
                modelProdutos.getProdPreco(),
                quantidade * modelProdutos.getProdPreco()
            });
            somarValorTotal();
        }
    }//GEN-LAST:event_jtfCadAdicionarMouseClicked

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        somarValorTotal();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jbCadNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadNovoMouseClicked
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_jbCadNovoMouseClicked

    private void jbCadSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadSalvarMouseClicked
        // TODO add your handling code here:
        int codigoVenda = 0;
        int codigoProduto = 0;
        listaModelVendasProdutos = new ArrayList<>();
        
        modelVendas.setCliente(Integer.parseInt(jtfCodCliente.getText()));
        // Transforma o padrão da data para o padrão americano 
        try {
            modelVendas.setVendaData(datas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {}
        
        modelVendas.setVendaValorLiquido(Double.parseDouble(jtfValorTotal.getText()));
        modelVendas.setVendaValorBruto(Double.parseDouble(jtfValorTotal.getText()) + calcularDesconto());
        modelVendas.setVendaDesconto(calcularDesconto());
        
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        
        // Adiciona o produto na tabela "Vendas adicionadas"
        if(codigoVenda > 0) {
            int cont = jtVendasProdutos.getRowCount();
        
            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) jtVendasProdutos.getValueAt(i,0);
                modelProdutos = new ModelProdutos();

                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVenda(codigoVenda);
                modelVendasProdutos.setVenProValor((double) jtVendasProdutos.getValueAt(i,3));
                modelVendasProdutos.setVenProQtd(Integer.parseInt(jtVendasProdutos.getValueAt(i,2).toString()));

                // Refatorar estoque
                modelProdutos.setProdId(codigoProduto);
                modelProdutos.setProdEstoque(
                        controllerProdutos.getProdutoController(codigoProduto).getProdEstoque()
                                - Integer.parseInt(jtVendasProdutos.getValueAt(i,2).toString()));

                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }

            // Salva os produtos a partir de uma lista
            if(modelProdutos.getProdEstoque() <= 0) {
                JOptionPane.showMessageDialog(this, "Não há estoque suficiente", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                if(controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                    // Alterar o estoque de produtos
                    controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
                    JOptionPane.showMessageDialog(this, "Venda registrada!", "Pronto", JOptionPane.WARNING_MESSAGE);
                    carregarVendas();
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível registrar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível salvar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_jbCadSalvarMouseClicked

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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }
    
    /**
     * Lista todos os clientes no combobox
     */
    private void listarClientes(){
        listaModelClientes = controllerClientes.getListaClientesController();
        jcbCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++) {
            jcbCliente.addItem(listaModelClientes.get(i).getClienteNome());
        }
    }
    
    /**
     * Lista todos os produtos no combobox
     */
    private void listarProdutos(){
        listaModelProdutos = controllerProdutos.getListaProdutosController();
        jcbProduto.removeAllItems();
        for (int i = 0; i < listaModelProdutos.size(); i++) {
            jcbProduto.addItem(listaModelProdutos.get(i).getProdNome());
        }
    }
    
    private void carregarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        listaModelVendasClientes = controllerVendasClientes.getListaVendasClienteController();
        int cont = listaModelVendasClientes.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendasClientes.get(i).getModelVendas().getVendaId(),
                listaModelVendasClientes.get(i).getModelClientes().getClienteNome(),
                listaModelVendasClientes.get(i).getModelVendas().getVendaData()
            });
        }
    }
    
    /**
     * Soma os valores totais de cada produto e mostra o valor total da venda
     */
    private void somarValorTotal() {
        double valor;
        double soma = 0;
        
        // Contador recebe a quantidade de linhas
        int contador = jtVendasProdutos.getRowCount();
        
        for (int i = 0; i < contador; i++) {
            valor = (double) jtVendasProdutos.getValueAt(i,4);
            soma = soma + valor;
        }
        System.out.println(soma);
        jtfValorTotal.setText(String.valueOf(soma));
        aplicarDesconto();
    }
    
    /**
     * Faz o calculo do valor total com o desconto
     */
    private void aplicarDesconto() {
        jtfValorTotal.setText(
                String.valueOf(Double.parseDouble(jtfValorTotal.getText()) - calcularDesconto()));
    }
    
    private double calcularDesconto() {
        double desconto = 0;
        return desconto = (Double.parseDouble(jtfDesconto.getText()) / 100) * Double.parseDouble(jtfValorTotal.getText());
    }
    
    private void inicializarCodigosCliente() {
        modelClientes = controllerClientes.getClienteController(jcbCliente.getSelectedItem().toString());
        jtfCodCliente.setText(String.valueOf(modelClientes.getClienteId()));
    }
    
    private void inicilizarCodigoProduto() {
        modelProdutos = controllerProdutos.getProdutoController(jcbProduto.getSelectedItem().toString());
        jtfCodProduto.setText(String.valueOf(modelProdutos.getProdId()));
    }
    
    /**
     * Limpa os campos
     */
    private void limparCampos() {
        jtfQuantidade.setText("");
        jtfQuantidade.setText("0");
        jtfValorTotal.setText("0");
        
        DefaultTableModel modelo = (DefaultTableModel) jtVendasProdutos.getModel();
        modelo.setNumRows(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jbCadCancelar;
    private javax.swing.JLabel jbCadNovo;
    private javax.swing.JLabel jbCadSalvar;
    private javax.swing.JLabel jbConsAlterar;
    private javax.swing.JLabel jbConsExcluir;
    private javax.swing.JLabel jbConsPesquisar;
    private componentes.UJComboBox jcbCliente;
    private componentes.UJComboBox jcbProduto;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTable jtVendasProdutos;
    private javax.swing.JLabel jtfCadAdicionar;
    private javax.swing.JTextField jtfCodCliente;
    private javax.swing.JTextField jtfCodProduto;
    private javax.swing.JTextField jtfCodVenda;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
