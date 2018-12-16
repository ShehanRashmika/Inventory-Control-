/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.Application;
import Classes.BarCodes;
import Classes.EXTCLASS;
import Pojos.Grn;
import Pojos.GrnHasItems;
import Pojos.MyCompanyDetails;
import Pojos.Product;
import Pojos.ProductBrand;
import Pojos.ProductType;
import Pojos.Stock;
import Pojos.Supplier;
import Pojos.Unit;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import net.connectcode.EAN13;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Transaction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Sheha
 */
public class StockManagement extends javax.swing.JPanel {

    Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);

    private String imgpath;
    private String barCodePath;

    private boolean productIsUpdatable;

    private int selectedbrandId;
    private int selectedtypeId;
    private int selectedunitId;

    private Product product;

    public StockManagement() {
        initComponents();
        changeLangu();
        productAdd_alltBL.getTableHeader().setDefaultRenderer(new Sup_VenManagement.HeaderColor());

        othersAdd_tblBrand.getTableHeader().setDefaultRenderer(new Sup_VenManagement.HeaderColor());
        othersAdd_tblUnit.getTableHeader().setDefaultRenderer(new Sup_VenManagement.HeaderColor());
        othersAdd_tblType.getTableHeader().setDefaultRenderer(new Sup_VenManagement.HeaderColor());

        stockAdd_grnTbl.getTableHeader().setDefaultRenderer(new Sup_VenManagement.HeaderColor());

        jTabbedPane1.setIconAt(0, new ImageIcon(getClass().getResource("/Img/Product_25px_2.png")));
        jTabbedPane1.setIconAt(1, new ImageIcon(getClass().getResource("/Img/Shopping Cart_25px.png")));

        jTabbedPane2.setIconAt(0, new ImageIcon(getClass().getResource("/Img/ProductAdd_48px.png")));
        jTabbedPane2.setIconAt(1, new ImageIcon(getClass().getResource("/Img/Plus_25px.png")));

        jTabbedPane3.setIconAt(0, new ImageIcon(getClass().getResource("/Img/Add Shopping Cart_25px.png")));
        jTabbedPane3.setIconAt(1, new ImageIcon(getClass().getResource("/Img/List_25px.png")));

        stockAdd_expDate.setSelectableDateRange(new Date(), null);

        loadProductTbl(c);
        loadCombos();
        loadBrandsTbl();
        loadTypeTbl();
        loadUnitTbl();

        //pane 2
        stockAdd_addDate.setText(new SimpleDateFormat("yyy-MM-dd").format(new Date()));

        loadProductsCombo();
        loadSupplierCombo();

        AutoCompleteDecorator.decorate(productAdd_brand);
        AutoCompleteDecorator.decorate(productAdd_unit);
        AutoCompleteDecorator.decorate(productAdd_type);

        AutoCompleteDecorator.decorate(stockAdd_product);
        AutoCompleteDecorator.decorate(stockAdd_supplier);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel_1_1_3 = new javax.swing.JLabel();
        jLabel_1_1_2 = new javax.swing.JLabel();
        productAdd_name = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        productAdd_img = new javax.swing.JLabel();
        jLabel_1_1_1 = new javax.swing.JLabel();
        productAdd_btnImg = new javax.swing.JLabel();
        productAdd_barCode = new javax.swing.JTextField();
        productAdd_brand = new javax.swing.JComboBox<>();
        jLabel_1_1_4 = new javax.swing.JLabel();
        productAdd_type = new javax.swing.JComboBox<>();
        jLabel_1_1_5 = new javax.swing.JLabel();
        productAdd_unit = new javax.swing.JComboBox<>();
        jLabel_1_1_6 = new javax.swing.JLabel();
        productAdd_btnSave = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        productAdd_btnClear = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productAdd_btnAddUnit = new javax.swing.JLabel();
        productAdd_btnGenrateBarcode = new javax.swing.JLabel();
        productAdd_btnAddBrand = new javax.swing.JLabel();
        productAdd_btnAddTYpe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        productAdd_alltBL = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        productAdd_barcodeImg = new javax.swing.JLabel();
        productAdd_searchBy = new javax.swing.JTextField();
        jLabel_1_1_7 = new javax.swing.JLabel();
        productAdd_btnPrint = new javax.swing.JLabel();
        emp_btnAddEmpType16 = new javax.swing.JLabel();
        productAdd_btnChangeActive = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        productAdd_findAll = new javax.swing.JRadioButton();
        productAdd_findActive = new javax.swing.JRadioButton();
        productAdd_findDeactive = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        othersAdd_tblUnit = new javax.swing.JTable();
        othersAdd_unit = new javax.swing.JTextField();
        othersAdd_btnUnitAdd = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        othersAdd_tblType = new javax.swing.JTable();
        othersAdd_btnTypeAdd = new javax.swing.JLabel();
        othersAdd_type = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        othersAdd_tblBrand = new javax.swing.JTable();
        othersAdd_btnBrandAdd = new javax.swing.JLabel();
        othersAdd_brand = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel_2_1_6 = new javax.swing.JLabel();
        jLabel_2_1_2 = new javax.swing.JLabel();
        stockAdd_uPrice = new javax.swing.JTextField();
        stockAdd_product = new javax.swing.JComboBox<>();
        jLabel_2_1_4 = new javax.swing.JLabel();
        stockAdd_qty = new javax.swing.JTextField();
        stockAdd_expDate = new com.toedter.calendar.JDateChooser();
        jLabel_2_1_5 = new javax.swing.JLabel();
        stockAdd_addDate = new javax.swing.JTextField();
        jLabel_2_1_3 = new javax.swing.JLabel();
        jLabel_2_1_9 = new javax.swing.JLabel();
        stockAdd_uBPrice = new javax.swing.JTextField();
        jLabel_2_1_8 = new javax.swing.JLabel();
        stockAdd_tax = new javax.swing.JTextField();
        jLabel_2_1_7 = new javax.swing.JLabel();
        stockAdd_dis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stockAdd_unitShow = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_2_1_10 = new javax.swing.JLabel();
        stockAdd_uSPrice = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel_2_1_11 = new javax.swing.JLabel();
        stockAdd_subTot = new javax.swing.JTextField();
        jLabel_2_1_12 = new javax.swing.JLabel();
        stockAdd_tot = new javax.swing.JTextField();
        stockAdd_btnAddStock = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stockAdd_productBarcode = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        stockAdd_grnTbl = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        stockAdd_grnSubTot = new javax.swing.JTextField();
        jLabel_2_1_15 = new javax.swing.JLabel();
        stockAdd_grnTot = new javax.swing.JTextField();
        jLabel_2_1_16 = new javax.swing.JLabel();
        stockAdd_btnSave = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_2_1_1 = new javax.swing.JLabel();
        stockAdd_supplier = new javax.swing.JComboBox<>();
        stockAdd_supplierQr = new javax.swing.JTextField();
        stockAdd_supCompanyShow = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_2_1_18 = new javax.swing.JLabel();
        stockAdd_grnPaymentMethod = new javax.swing.JComboBox<>();
        stockAdd_grnPayment = new javax.swing.JTextField();
        jLabel_2_1_17 = new javax.swing.JLabel();
        jLabel_2_1_19 = new javax.swing.JLabel();
        stockAdd_grnBalance = new javax.swing.JTextField();
        stockAdd_grnDis = new javax.swing.JTextField();
        jLabel_2_1_13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stockAdd_grnTax = new javax.swing.JTextField();
        jLabel_2_1_14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        sup_findTbl5 = new javax.swing.JTable();
        com_basic_br9 = new javax.swing.JTextField();
        emp_btnAddEmpType12 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        sup_findTbl10 = new javax.swing.JTable();
        emp_btnAddEmpType13 = new javax.swing.JLabel();
        com_basic_br10 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        sup_findTbl11 = new javax.swing.JTable();
        emp_btnAddEmpType14 = new javax.swing.JLabel();
        com_basic_br11 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        com_basic_br12 = new javax.swing.JTextField();
        emp_btnAddEmpType15 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(79, 51, 81));
        jTabbedPane1.setForeground(new java.awt.Color(79, 51, 81));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Nirmala UI", 1, 17)); // NOI18N

        jTabbedPane2.setBackground(new java.awt.Color(79, 51, 81));
        jTabbedPane2.setForeground(new java.awt.Color(79, 51, 81));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFocusable(false);
        jTabbedPane2.setFont(new java.awt.Font("Nirmala UI", 1, 17)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(68, 50, 72));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(79, 51, 81));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_1_1_3.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_3.setText("Product Name");
        jPanel14.add(jLabel_1_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        jLabel_1_1_2.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_2.setText("Bar Code ID");
        jPanel14.add(jLabel_1_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        productAdd_name.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.add(productAdd_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 390, 30));

        jPanel8.setBackground(new java.awt.Color(79, 51, 81));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(productAdd_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        jPanel14.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 200));

        jLabel_1_1_1.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_1.setText("Product Image");
        jPanel14.add(jLabel_1_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        productAdd_btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_upload.png"))); // NOI18N
        productAdd_btnImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnImgMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 50));

        productAdd_barCode.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_barCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAdd_barCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productAdd_barCodeKeyTyped(evt);
            }
        });
        jPanel14.add(productAdd_barCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 30));

        productAdd_brand.setEditable(true);
        productAdd_brand.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_brand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAdd_brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productAdd_brandKeyReleased(evt);
            }
        });
        jPanel14.add(productAdd_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 330, -1));

        jLabel_1_1_4.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_4.setText("Brand");
        jPanel14.add(jLabel_1_1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 30));

        productAdd_type.setEditable(true);
        productAdd_type.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_type.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAdd_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productAdd_typeKeyReleased(evt);
            }
        });
        jPanel14.add(productAdd_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 330, -1));

        jLabel_1_1_5.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_5.setText("Type");
        jPanel14.add(jLabel_1_1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, 30));

        productAdd_unit.setEditable(true);
        productAdd_unit.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_unit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAdd_unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productAdd_unitKeyReleased(evt);
            }
        });
        jPanel14.add(productAdd_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 330, -1));

        jLabel_1_1_6.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_6.setText("Measurements Unit");
        jPanel14.add(jLabel_1_1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, 30));

        productAdd_btnSave.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        productAdd_btnSave.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productAdd_btnSave.setText("SAVE");
        productAdd_btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnSaveMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 180, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_any.png"))); // NOI18N
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        productAdd_btnClear.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        productAdd_btnClear.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_btnClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productAdd_btnClear.setText("CLEAR");
        productAdd_btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnClearMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 180, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_any.png"))); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, 50));

        productAdd_btnAddUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        productAdd_btnAddUnit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnAddUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnAddUnitMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnAddUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 60, 60));

        productAdd_btnGenrateBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_barcode.png"))); // NOI18N
        productAdd_btnGenrateBarcode.setToolTipText("Generate custom bar code");
        productAdd_btnGenrateBarcode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnGenrateBarcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnGenrateBarcodeMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnGenrateBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 301, 60, 50));

        productAdd_btnAddBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        productAdd_btnAddBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnAddBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnAddBrandMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productAdd_btnAddBrandMouseEntered(evt);
            }
        });
        jPanel14.add(productAdd_btnAddBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 60, 60));

        productAdd_btnAddTYpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        productAdd_btnAddTYpe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnAddTYpe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnAddTYpeMouseClicked(evt);
            }
        });
        jPanel14.add(productAdd_btnAddTYpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back_browse.png"))); // NOI18N
        jLabel2.setToolTipText("Search in google");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 301, 50, 50));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 490, 730));

        jPanel17.setBackground(new java.awt.Color(79, 51, 81));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "All Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productAdd_alltBL.setBackground(new java.awt.Color(79, 51, 81));
        productAdd_alltBL.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_alltBL.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_alltBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Brand", "Type", "Unit", "Status"
            }
        ));
        productAdd_alltBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_alltBLMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(productAdd_alltBL);

        jPanel17.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 930, 430));

        jPanel18.setBackground(new java.awt.Color(79, 51, 81));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(productAdd_barcodeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 120));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 410, 120));

        productAdd_searchBy.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        productAdd_searchBy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAdd_searchBy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productAdd_searchByKeyReleased(evt);
            }
        });
        jPanel17.add(productAdd_searchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 360, -1));

        jLabel_1_1_7.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_1_1_7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1_1_7.setText("Search by bar code or name");
        jPanel17.add(jLabel_1_1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 40));

        productAdd_btnPrint.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        productAdd_btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_btnPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productAdd_btnPrint.setText("PRINT");
        productAdd_btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnPrintMouseClicked(evt);
            }
        });
        jPanel17.add(productAdd_btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 158, 180, 40));

        emp_btnAddEmpType16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_any.png"))); // NOI18N
        emp_btnAddEmpType16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_btnAddEmpType16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_btnAddEmpType16MouseClicked(evt);
            }
        });
        jPanel17.add(emp_btnAddEmpType16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 210, 60));

        productAdd_btnChangeActive.setFont(new java.awt.Font("Nirmala UI", 1, 17)); // NOI18N
        productAdd_btnChangeActive.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_btnChangeActive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productAdd_btnChangeActive.setText("SET ACTIVE ");
        productAdd_btnChangeActive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productAdd_btnChangeActive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_btnChangeActiveMouseClicked(evt);
            }
        });
        jPanel17.add(productAdd_btnChangeActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 250, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_anyLong.png"))); // NOI18N
        jPanel17.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 260, 50));

        productAdd_findAll.setBackground(new java.awt.Color(79, 51, 81));
        buttonGroup1.add(productAdd_findAll);
        productAdd_findAll.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        productAdd_findAll.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_findAll.setSelected(true);
        productAdd_findAll.setText("ALL");
        productAdd_findAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_findAllMouseClicked(evt);
            }
        });
        productAdd_findAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAdd_findAllActionPerformed(evt);
            }
        });
        jPanel17.add(productAdd_findAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        productAdd_findActive.setBackground(new java.awt.Color(79, 51, 81));
        buttonGroup1.add(productAdd_findActive);
        productAdd_findActive.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        productAdd_findActive.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_findActive.setText("ACTIVE");
        productAdd_findActive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_findActiveMouseClicked(evt);
            }
        });
        productAdd_findActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAdd_findActiveActionPerformed(evt);
            }
        });
        jPanel17.add(productAdd_findActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        productAdd_findDeactive.setBackground(new java.awt.Color(79, 51, 81));
        buttonGroup1.add(productAdd_findDeactive);
        productAdd_findDeactive.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        productAdd_findDeactive.setForeground(new java.awt.Color(255, 255, 255));
        productAdd_findDeactive.setText("DEACTIVE");
        productAdd_findDeactive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAdd_findDeactiveMouseClicked(evt);
            }
        });
        productAdd_findDeactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAdd_findDeactiveActionPerformed(evt);
            }
        });
        jPanel17.add(productAdd_findDeactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jPanel11.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 970, 730));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add Product", jPanel5);

        jPanel16.setBackground(new java.awt.Color(68, 50, 72));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(79, 51, 81));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD UNIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        othersAdd_tblUnit.setBackground(new java.awt.Color(79, 51, 81));
        othersAdd_tblUnit.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_tblUnit.setForeground(new java.awt.Color(255, 255, 255));
        othersAdd_tblUnit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        othersAdd_tblUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_tblUnitMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(othersAdd_tblUnit);

        jPanel15.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        othersAdd_unit.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_unit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(othersAdd_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        othersAdd_btnUnitAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        othersAdd_btnUnitAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        othersAdd_btnUnitAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_btnUnitAddMouseClicked(evt);
            }
        });
        jPanel15.add(othersAdd_btnUnitAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        jPanel16.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 470, 350));

        jPanel19.setBackground(new java.awt.Color(79, 51, 81));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD TYPE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        othersAdd_tblType.setBackground(new java.awt.Color(79, 51, 81));
        othersAdd_tblType.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_tblType.setForeground(new java.awt.Color(255, 255, 255));
        othersAdd_tblType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        othersAdd_tblType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_tblTypeMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(othersAdd_tblType);

        jPanel19.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        othersAdd_btnTypeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        othersAdd_btnTypeAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        othersAdd_btnTypeAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_btnTypeAddMouseClicked(evt);
            }
        });
        jPanel19.add(othersAdd_btnTypeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        othersAdd_type.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_type.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.add(othersAdd_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        jPanel16.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 470, 350));

        jPanel20.setBackground(new java.awt.Color(79, 51, 81));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD BRAND", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        othersAdd_tblBrand.setBackground(new java.awt.Color(79, 51, 81));
        othersAdd_tblBrand.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_tblBrand.setForeground(new java.awt.Color(255, 255, 255));
        othersAdd_tblBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        othersAdd_tblBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_tblBrandMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(othersAdd_tblBrand);

        jPanel20.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        othersAdd_btnBrandAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        othersAdd_btnBrandAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        othersAdd_btnBrandAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersAdd_btnBrandAddMouseClicked(evt);
            }
        });
        jPanel20.add(othersAdd_btnBrandAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        othersAdd_brand.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        othersAdd_brand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.add(othersAdd_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 470, 350));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add Others", jPanel6);

        jTabbedPane1.addTab("Product", jTabbedPane2);

        jTabbedPane3.setBackground(new java.awt.Color(79, 51, 81));
        jTabbedPane3.setForeground(new java.awt.Color(79, 51, 81));
        jTabbedPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane3.setFocusable(false);
        jTabbedPane3.setFont(new java.awt.Font("Nirmala UI", 1, 17)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(68, 50, 72));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(79, 51, 81));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Purchase ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_2_1_6.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_6.setText("Unit Price");
        jPanel22.add(jLabel_2_1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        jLabel_2_1_2.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_2.setText("Product");
        jPanel22.add(jLabel_2_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        stockAdd_uPrice.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_uPrice.setText("0");
        stockAdd_uPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_uPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_uPriceActionPerformed(evt);
            }
        });
        stockAdd_uPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_uPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_uPriceKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_uPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 140, 30));

        stockAdd_product.setEditable(true);
        stockAdd_product.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_product.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_productActionPerformed(evt);
            }
        });
        stockAdd_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_productKeyReleased(evt);
            }
        });
        jPanel22.add(stockAdd_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 570, 30));

        jLabel_2_1_4.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_4.setText("Expire Date");
        jPanel22.add(jLabel_2_1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, 30));

        stockAdd_qty.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_qty.setText("0");
        stockAdd_qty.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_qtyActionPerformed(evt);
            }
        });
        stockAdd_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_qtyKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        stockAdd_expDate.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel22.add(stockAdd_expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 150, 30));

        jLabel_2_1_5.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_5.setText("Quantity");
        jPanel22.add(jLabel_2_1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        stockAdd_addDate.setEditable(false);
        stockAdd_addDate.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_addDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_addDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_addDateActionPerformed(evt);
            }
        });
        stockAdd_addDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_addDateKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_addDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 30));

        jLabel_2_1_3.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_3.setText("Add Date");
        jPanel22.add(jLabel_2_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, 30));

        jLabel_2_1_9.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_9.setText("Unit Buying Price");
        jPanel22.add(jLabel_2_1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, 30));

        stockAdd_uBPrice.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_uBPrice.setText("0");
        stockAdd_uBPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_uBPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_uBPriceActionPerformed(evt);
            }
        });
        stockAdd_uBPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_uBPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_uBPriceKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_uBPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 140, 30));

        jLabel_2_1_8.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_8.setText("Tax");
        jPanel22.add(jLabel_2_1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 30));

        stockAdd_tax.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_tax.setText("0");
        stockAdd_tax.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_taxActionPerformed(evt);
            }
        });
        stockAdd_tax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_taxKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 120, 30));

        jLabel_2_1_7.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_7.setText("Discount ");
        jPanel22.add(jLabel_2_1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, 30));

        stockAdd_dis.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_dis.setText("0");
        stockAdd_dis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_disActionPerformed(evt);
            }
        });
        stockAdd_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_disKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("%");
        jPanel22.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        stockAdd_unitShow.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        stockAdd_unitShow.setForeground(new java.awt.Color(255, 255, 255));
        stockAdd_unitShow.setText("Unit");
        jPanel22.add(stockAdd_unitShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");
        jPanel22.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel_2_1_10.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_10.setText("Unit Selling Price");
        jPanel22.add(jLabel_2_1_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, -1, 30));

        stockAdd_uSPrice.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_uSPrice.setText("0");
        stockAdd_uSPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_uSPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_uSPriceKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_uSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 140, 30));

        jPanel2.setBackground(new java.awt.Color(79, 51, 81));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_2_1_11.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_11.setText("Sub Total");
        jPanel2.add(jLabel_2_1_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        stockAdd_subTot.setEditable(false);
        stockAdd_subTot.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_subTot.setText("0");
        stockAdd_subTot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_subTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_subTotKeyTyped(evt);
            }
        });
        jPanel2.add(stockAdd_subTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));

        jLabel_2_1_12.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_12.setText("Total");
        jPanel2.add(jLabel_2_1_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        stockAdd_tot.setEditable(false);
        stockAdd_tot.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_tot.setText("0");
        stockAdd_tot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_tot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_totKeyTyped(evt);
            }
        });
        jPanel2.add(stockAdd_tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 170, 30));

        stockAdd_btnAddStock.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        stockAdd_btnAddStock.setForeground(new java.awt.Color(255, 255, 255));
        stockAdd_btnAddStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockAdd_btnAddStock.setText("ADD");
        stockAdd_btnAddStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockAdd_btnAddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockAdd_btnAddStockMouseClicked(evt);
            }
        });
        jPanel2.add(stockAdd_btnAddStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_any.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jPanel22.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 430, 155));

        stockAdd_productBarcode.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_productBarcode.setBorder(null);
        stockAdd_productBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_productBarcodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_productBarcodeKeyTyped(evt);
            }
        });
        jPanel22.add(stockAdd_productBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 340, 30));

        jPanel12.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1490, 190));

        jPanel23.setBackground(new java.awt.Color(79, 51, 81));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Good Receive Notice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockAdd_grnTbl.setBackground(new java.awt.Color(79, 51, 81));
        stockAdd_grnTbl.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnTbl.setForeground(new java.awt.Color(255, 255, 255));
        stockAdd_grnTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Product", "Name", "Exp Date", "Qty", "Unit Price", "Dis", "Tax", "U.B Price", "U.S Price", "Sub Tot", "Total"
            }
        ));
        stockAdd_grnTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockAdd_grnTblMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(stockAdd_grnTbl);

        jPanel23.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1450, 360));

        jPanel4.setBackground(new java.awt.Color(79, 51, 81));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockAdd_grnSubTot.setEditable(false);
        stockAdd_grnSubTot.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnSubTot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnSubTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnSubTotActionPerformed(evt);
            }
        });
        stockAdd_grnSubTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnSubTotKeyTyped(evt);
            }
        });
        jPanel4.add(stockAdd_grnSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 155, 30));

        jLabel_2_1_15.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_15.setText("Sub Total");
        jPanel4.add(jLabel_2_1_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        stockAdd_grnTot.setEditable(false);
        stockAdd_grnTot.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnTot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnTotActionPerformed(evt);
            }
        });
        stockAdd_grnTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnTotKeyTyped(evt);
            }
        });
        jPanel4.add(stockAdd_grnTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 155, 30));

        jLabel_2_1_16.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_16.setText("Total");
        jPanel4.add(jLabel_2_1_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, 30));

        stockAdd_btnSave.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        stockAdd_btnSave.setForeground(new java.awt.Color(255, 255, 255));
        stockAdd_btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockAdd_btnSave.setText("SAVE");
        stockAdd_btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockAdd_btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockAdd_btnSaveMouseClicked(evt);
            }
        });
        jPanel4.add(stockAdd_btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 42, 180, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_any.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 42, -1, -1));

        jLabel_2_1_1.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_1.setText("Supplier");
        jPanel4.add(jLabel_2_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        stockAdd_supplier.setEditable(true);
        stockAdd_supplier.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_supplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_supplierActionPerformed(evt);
            }
        });
        stockAdd_supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_supplierKeyReleased(evt);
            }
        });
        jPanel4.add(stockAdd_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 300, 30));

        stockAdd_supplierQr.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_supplierQr.setBorder(null);
        stockAdd_supplierQr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_supplierQrKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_supplierQrKeyTyped(evt);
            }
        });
        jPanel4.add(stockAdd_supplierQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 30));

        stockAdd_supCompanyShow.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        stockAdd_supCompanyShow.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(stockAdd_supCompanyShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 270, 30));

        jPanel3.setBackground(new java.awt.Color(79, 51, 81));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_2_1_18.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_18.setText("Payment Method");
        jPanel3.add(jLabel_2_1_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        stockAdd_grnPaymentMethod.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        stockAdd_grnPaymentMethod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnPaymentMethod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockAdd_grnPaymentMethodKeyReleased(evt);
            }
        });
        jPanel3.add(stockAdd_grnPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        stockAdd_grnPayment.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnPayment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnPaymentActionPerformed(evt);
            }
        });
        stockAdd_grnPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnPaymentKeyTyped(evt);
            }
        });
        jPanel3.add(stockAdd_grnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 30));

        jLabel_2_1_17.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_17.setText("Payment");
        jPanel3.add(jLabel_2_1_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 20, -1, 30));

        jLabel_2_1_19.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_19.setText("Balance");
        jPanel3.add(jLabel_2_1_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));

        stockAdd_grnBalance.setEditable(false);
        stockAdd_grnBalance.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnBalance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnBalanceActionPerformed(evt);
            }
        });
        stockAdd_grnBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnBalanceKeyTyped(evt);
            }
        });
        jPanel3.add(stockAdd_grnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 170, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 15, 530, 100));

        stockAdd_grnDis.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnDis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnDisActionPerformed(evt);
            }
        });
        stockAdd_grnDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnDisKeyTyped(evt);
            }
        });
        jPanel4.add(stockAdd_grnDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, 30));

        jLabel_2_1_13.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_13.setText("Discount ");
        jPanel4.add(jLabel_2_1_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("%");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        stockAdd_grnTax.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        stockAdd_grnTax.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockAdd_grnTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAdd_grnTaxActionPerformed(evt);
            }
        });
        stockAdd_grnTax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockAdd_grnTaxKeyTyped(evt);
            }
        });
        jPanel4.add(stockAdd_grnTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, 30));

        jLabel_2_1_14.setFont(new java.awt.Font("Nirmala UI", 0, 17)); // NOI18N
        jLabel_2_1_14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_2_1_14.setText("Tax");
        jPanel4.add(jLabel_2_1_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("%");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jPanel23.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1450, 130));

        jPanel12.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1490, 550));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Add Stock", jPanel7);

        jPanel25.setBackground(new java.awt.Color(68, 50, 72));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(79, 51, 81));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD UNIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_findTbl5.setBackground(new java.awt.Color(79, 51, 81));
        sup_findTbl5.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        sup_findTbl5.setForeground(new java.awt.Color(255, 255, 255));
        sup_findTbl5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        sup_findTbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_findTbl5MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(sup_findTbl5);

        jPanel26.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        com_basic_br9.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        com_basic_br9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.add(com_basic_br9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        emp_btnAddEmpType12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        emp_btnAddEmpType12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_btnAddEmpType12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_btnAddEmpType12MouseClicked(evt);
            }
        });
        jPanel26.add(emp_btnAddEmpType12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 470, 350));

        jPanel27.setBackground(new java.awt.Color(79, 51, 81));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD TYPE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_findTbl10.setBackground(new java.awt.Color(79, 51, 81));
        sup_findTbl10.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        sup_findTbl10.setForeground(new java.awt.Color(255, 255, 255));
        sup_findTbl10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        sup_findTbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_findTbl10MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(sup_findTbl10);

        jPanel27.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        emp_btnAddEmpType13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        emp_btnAddEmpType13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_btnAddEmpType13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_btnAddEmpType13MouseClicked(evt);
            }
        });
        jPanel27.add(emp_btnAddEmpType13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        com_basic_br10.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        com_basic_br10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(com_basic_br10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        jPanel25.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 470, 350));

        jPanel28.setBackground(new java.awt.Color(79, 51, 81));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD BRAND", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_findTbl11.setBackground(new java.awt.Color(79, 51, 81));
        sup_findTbl11.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        sup_findTbl11.setForeground(new java.awt.Color(255, 255, 255));
        sup_findTbl11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        sup_findTbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_findTbl11MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(sup_findTbl11);

        jPanel28.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 220));

        emp_btnAddEmpType14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        emp_btnAddEmpType14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_btnAddEmpType14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_btnAddEmpType14MouseClicked(evt);
            }
        });
        jPanel28.add(emp_btnAddEmpType14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        com_basic_br11.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        com_basic_br11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.add(com_basic_br11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        jPanel25.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 470, 350));

        jPanel29.setBackground(new java.awt.Color(79, 51, 81));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADD UNIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iskoola Pota", 1, 19), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        com_basic_br12.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        com_basic_br12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel29.add(com_basic_br12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, -1));

        emp_btnAddEmpType15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_add.png"))); // NOI18N
        emp_btnAddEmpType15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emp_btnAddEmpType15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_btnAddEmpType15MouseClicked(evt);
            }
        });
        jPanel29.add(emp_btnAddEmpType15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 50));

        jPanel25.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 760, 370));
        jPanel25.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, -1, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("All Stock", jPanel10);

        jTabbedPane1.addTab("Stock", jTabbedPane3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1520, 850));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panelBack_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productAdd_btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnClearMouseClicked
        clearProductFields();
    }//GEN-LAST:event_productAdd_btnClearMouseClicked

    private void productAdd_btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnSaveMouseClicked

        try {

            ArrayList<String> err = checkAddProductFields();

            if (err.isEmpty()) {
                //no errors

                if (!productIsUpdatable) {
                    //add new

                    product = new Product();
                    product.setIdproduct(productAdd_barCode.getText());

                }

                product.setImg(imgpath);

                product.setName(productAdd_name.getText());

                Unit unit = (Unit) EXTCLASS.getHibSession().load(Unit.class, Integer.parseInt(productAdd_unit.getSelectedItem().toString().split(" - ")[1]));
                ProductBrand brand = (ProductBrand) EXTCLASS.getHibSession().load(ProductBrand.class, Integer.parseInt(productAdd_brand.getSelectedItem().toString().split(" - ")[1]));
                ProductType type = (ProductType) EXTCLASS.getHibSession().load(ProductType.class, Integer.parseInt(productAdd_type.getSelectedItem().toString().split(" - ")[1]));

                product.setUnit(unit);
                product.setProductBrand(brand);
                product.setProductType(type);

                product.setStatus("active");

                if (!productIsUpdatable) {
                    //add new
                    Criteria c1 = EXTCLASS.getHibSession().createCriteria(Product.class);
                    c1.add(Restrictions.eq("idproduct", productAdd_barCode.getText()));

                    if (c1.list().isEmpty()) {

                        EXTCLASS.getHibSession().save(product);

                        //genrate bar code and save
                        EAN13 code = new EAN13();
                        String barcode = code.encode(productAdd_barCode.getText(), 1);
                        System.out.println(barcode);

                        JLabel bar_code = new JLabel();
                        bar_code.setSize(200, 90);
                        bar_code.setAutoscrolls(true);
                        bar_code.setText(barcode);
                        bar_code.setFont(new Font("CCodeUPCEAN_HRBS3_Trial", Font.PLAIN, 30));

                        File f = null;
                        try {
                            EXTCLASS.createFileinC();
                            f = new File("C:\\TGPOS\\Product_BarCodes");
                            f.mkdir();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        try {

                            File f1 = new File(f, product.getIdproduct() + ".png");

                            BufferedImage img = new BufferedImage(bar_code.getWidth(), bar_code.getHeight(), BufferedImage.TYPE_INT_ARGB);
                            Graphics2D g2d = img.createGraphics();

                            g2d.setBackground(Color.WHITE);
                            g2d.clearRect(0, 0, 200, 90);
                            bar_code.printAll(g2d);

                            ImageIO.write(img, "png", f1);

                            g2d.dispose();

                            barCodePath = f1.getAbsolutePath();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        product.setQr(barCodePath);

                        EXTCLASS.getHibSession().save(product);

                        EXTCLASS.showMessage("Record added!", "දත්ත එක් කළා !", "SUCCESS", Application.SINSUCCESS, 1);

                    } else {

                        EXTCLASS.showMessage("Record already added!", "දත්ත දැනටමත් එකතු කර ඇත!", "ERROR", Application.SINERROR, 0);
                    }
                } else {
                    //update
                    if (product != null) {

                        EXTCLASS.getHibSession().update(product);

                        EXTCLASS.showMessage("Record updated!", "දත්ත යාවත්කාලීන කරන ලදි !", "SUCCESS", Application.SINSUCCESS, 1);

                    }

                }

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadProductTbl(c);
                loadProductsCombo();
                clearProductFields();

            } else {
                String erros = "";
                int i = 0;
                for (String e : err) {
                    erros += e;
                    i++;
                    erros += (err.size() != i) ? "," : ".";

                }
                EXTCLASS.showMessage("Fill following fields " + erros, "කරුණාකර පහත දැක්වෙන විස්තර පුරවන්න " + erros, "ERROR", Application.SINERROR, 0);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_productAdd_btnSaveMouseClicked

    private void othersAdd_tblUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_tblUnitMouseClicked

        try {

            selectedunitId = (int) othersAdd_tblUnit.getValueAt(othersAdd_tblUnit.getSelectedRow(), 0);

            othersAdd_unit.setText((String) othersAdd_tblUnit.getValueAt(othersAdd_tblUnit.getSelectedRow(), 1));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_othersAdd_tblUnitMouseClicked

    private void productAdd_unitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productAdd_unitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_productAdd_unitKeyReleased

    private void productAdd_typeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productAdd_typeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_productAdd_typeKeyReleased

    private void productAdd_brandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productAdd_brandKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_productAdd_brandKeyReleased

    private void productAdd_barCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productAdd_barCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_productAdd_barCodeKeyTyped

    private void productAdd_btnImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnImgMouseClicked
        try {
            JFileChooser jf = new JFileChooser();
            int x = jf.showOpenDialog(this);
            if (x == jf.APPROVE_OPTION) {
                File f = jf.getSelectedFile();
                String path = f.getAbsolutePath();
                imgpath = path.replace("\\", "/");
                f = new File(imgpath);
                Image img = ImageIO.read(f);
                img = img.getScaledInstance(productAdd_img.getWidth(), productAdd_img.getHeight(), Image.SCALE_SMOOTH);
                productAdd_img.setIcon(new ImageIcon(img));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productAdd_btnImgMouseClicked

    private void productAdd_alltBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_alltBLMouseClicked

        try {

            clearProductFields();
            productIsUpdatable = true;
            String id = productAdd_alltBL.getValueAt(productAdd_alltBL.getSelectedRow(), 0).toString();

            product = (Product) EXTCLASS.getHibSession().load(Product.class, id);

            productAdd_barCode.setText(product.getIdproduct());
            productAdd_name.setText(product.getName());

            productAdd_brand.setSelectedItem(product.getProductBrand().getBrand() + " - " + product.getProductBrand().getIdproductBrand());
            productAdd_type.setSelectedItem(product.getProductType().getType() + " - " + product.getProductType().getIdproductType());
            productAdd_unit.setSelectedItem(product.getUnit().getUnit() + " - " + product.getUnit().getIdunit());

            try {
                if (product.getImg() != null && product.getImg() != "") {

                    imgpath = product.getImg();
                    Image img = ImageIO.read(new File(product.getImg()));
                    img = img.getScaledInstance(productAdd_img.getWidth(), productAdd_img.getHeight(), Image.SCALE_SMOOTH);
                    productAdd_img.setIcon(new ImageIcon(img));
                }
                if (product.getQr() != null && product.getQr() != "") {

                    barCodePath = product.getQr();
                    Image img = ImageIO.read(new File(product.getQr()));
                    img = img.getScaledInstance(productAdd_barcodeImg.getWidth(), productAdd_barcodeImg.getHeight(), Image.SCALE_SMOOTH);
                    productAdd_barcodeImg.setIcon(new ImageIcon(img));
                }

            } catch (IIOException e) {
                e.printStackTrace();
                EXTCLASS.showMessage("File not found!", "ගොනුව හමු නොවිණි!", "ERROR", Application.SINERROR, 0);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productAdd_alltBLMouseClicked

    private void productAdd_btnAddUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnAddUnitMouseClicked
        try {

            String newUnit = null;

            JLabel l = new JLabel();
            l.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
            if (Application.getLangu().equals("SIN")) {
                l.setText("නව ඒකකයක් ඇතුල් කරන්න");
                newUnit = JOptionPane.showInputDialog(null, l, "ඒකකයක් එකතු කරන්න", JOptionPane.INFORMATION_MESSAGE);
            } else {

                l.setText("Enter new measurements unit");
                newUnit = JOptionPane.showInputDialog(null, l, "ADD UNIT", JOptionPane.INFORMATION_MESSAGE);
            }

            if (!newUnit.isEmpty() && newUnit != null) {

                Unit e = new Unit();
                e.setUnit(newUnit);

                EXTCLASS.getHibSession().save(e);

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadUnitTbl();
                loadCombos();

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productAdd_btnAddUnitMouseClicked

    private void productAdd_btnGenrateBarcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnGenrateBarcodeMouseClicked
        try {
            String id = EXTCLASS.getSaltString(12);
            Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);
            c.add(Restrictions.eq("idproduct", id));
            if (c.list().isEmpty()) {
                //new one

                productAdd_barCode.setText(id + "");

            } else {

                System.out.println("alredy have this id");
                productAdd_barCode.setText("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_productAdd_btnGenrateBarcodeMouseClicked

    private void productAdd_btnAddBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnAddBrandMouseClicked

        try {

            String newBrand = null;

            JLabel l = new JLabel();
            l.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
            if (Application.getLangu().equals("SIN")) {
                l.setText("නව වෙළඳ නාමයක් ඇතුල් කරන්න");
                newBrand = JOptionPane.showInputDialog(null, l, "වෙළඳ නාමයක් එකතු කරන්න", JOptionPane.INFORMATION_MESSAGE);
            } else {

                l.setText("Enter new brand");
                newBrand = JOptionPane.showInputDialog(null, l, "ADD BRAND", JOptionPane.INFORMATION_MESSAGE);
            }

            if (!newBrand.isEmpty() && newBrand != null) {

//                Query query = EXTCLASS.getHibSession().createQuery("from ProductBrand order by idproduct_brand DESC");
//                query.setMaxResults(1);
//                ProductBrand lastP = (ProductBrand) query.uniqueResult();
                ProductBrand e = new ProductBrand();

//                e.setIdproductBrand(lastP.getIdproductBrand() + 1);
                e.setBrand(newBrand);

                EXTCLASS.getHibSession().save(e);

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadBrandsTbl();
                loadCombos();

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productAdd_btnAddBrandMouseClicked

    private void productAdd_btnAddTYpeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnAddTYpeMouseClicked

        try {

            String newType = null;

            JLabel l = new JLabel();
            l.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
            if (Application.getLangu().equals("SIN")) {
                l.setText("නව වර්ගයක් ඇතුල් කරන්න");
                newType = JOptionPane.showInputDialog(null, l, "වර්ගයක් එකතු කරන්න", JOptionPane.INFORMATION_MESSAGE);
            } else {

                l.setText("Enter new type");
                newType = JOptionPane.showInputDialog(null, l, "ADD TYPE", JOptionPane.INFORMATION_MESSAGE);
            }

            if (!newType.isEmpty() && newType != null) {

//                Query query = EXTCLASS.getHibSession().createQuery("from ProductType order by idproduct_type DESC");
//                query.setMaxResults(1);
//                ProductType lastP = (ProductType) query.uniqueResult();
                ProductType e = new ProductType();
//                e.setIdproductType(lastP.getIdproductType() + 1);
                e.setType(newType);

                EXTCLASS.getHibSession().save(e);

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadTypeTbl();
                loadCombos();

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_productAdd_btnAddTYpeMouseClicked

    private void othersAdd_tblTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_tblTypeMouseClicked

        try {

            selectedtypeId = (int) othersAdd_tblType.getValueAt(othersAdd_tblType.getSelectedRow(), 0);
            othersAdd_type.setText((String) othersAdd_tblType.getValueAt(othersAdd_tblType.getSelectedRow(), 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_othersAdd_tblTypeMouseClicked

    private void othersAdd_tblBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_tblBrandMouseClicked

        try {

            selectedbrandId = (int) othersAdd_tblBrand.getValueAt(othersAdd_tblBrand.getSelectedRow(), 0);
            othersAdd_brand.setText((String) othersAdd_tblBrand.getValueAt(othersAdd_tblBrand.getSelectedRow(), 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_othersAdd_tblBrandMouseClicked

    private void othersAdd_btnUnitAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_btnUnitAddMouseClicked
        if (!othersAdd_unit.getText().isEmpty()) {

            boolean check = isAlreadyHave("unit", othersAdd_unit.getText());
            if (!check) {

                if (selectedunitId != 0) {
                    //update
                    Unit unit = (Unit) EXTCLASS.getHibSession().load(Unit.class, selectedunitId);
                    unit.setUnit(othersAdd_unit.getText());

                    EXTCLASS.getHibSession().update(unit);

                } else {
                    //save

                    Unit u = new Unit();
                    u.setUnit(othersAdd_unit.getText());

                    EXTCLASS.getHibSession().save(u);

                }

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadUnitTbl();
                loadCombos();
            }
        }
        selectedunitId = 0;
        othersAdd_unit.setText(null);


    }//GEN-LAST:event_othersAdd_btnUnitAddMouseClicked

    private void othersAdd_btnTypeAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_btnTypeAddMouseClicked

        if (!othersAdd_type.getText().isEmpty()) {

            boolean check = isAlreadyHave("type", othersAdd_type.getText());
            if (!check) {

                if (selectedtypeId != 0) {
                    //update
                    ProductType type = (ProductType) EXTCLASS.getHibSession().load(ProductType.class, selectedtypeId);
                    type.setType(othersAdd_type.getText());

                    EXTCLASS.getHibSession().update(type);

                } else {
                    //save

                    ProductType u = new ProductType();
                    u.setType(othersAdd_type.getText());

                    EXTCLASS.getHibSession().save(u);

                }

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadTypeTbl();
                loadCombos();
            }
        }
        selectedtypeId = 0;
        othersAdd_type.setText(null);

    }//GEN-LAST:event_othersAdd_btnTypeAddMouseClicked

    private void othersAdd_btnBrandAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersAdd_btnBrandAddMouseClicked
        if (!othersAdd_brand.getText().isEmpty()) {

            boolean check = isAlreadyHave("brand", othersAdd_brand.getText());
            if (!check) {

                if (selectedbrandId != 0) {
                    //update
                    ProductBrand brand = (ProductBrand) EXTCLASS.getHibSession().load(ProductBrand.class, selectedbrandId);
                    brand.setBrand(othersAdd_brand.getText());

                    EXTCLASS.getHibSession().update(brand);

                } else {
                    //save

                    ProductBrand u = new ProductBrand();
                    u.setBrand(othersAdd_brand.getText());

                    EXTCLASS.getHibSession().save(u);

                }

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                loadBrandsTbl();
                loadCombos();
            }
        }
        selectedbrandId = 0;
        othersAdd_brand.setText(null);
    }//GEN-LAST:event_othersAdd_btnBrandAddMouseClicked

    private void emp_btnAddEmpType15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_btnAddEmpType15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_btnAddEmpType15MouseClicked

    private void emp_btnAddEmpType14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_btnAddEmpType14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_btnAddEmpType14MouseClicked

    private void sup_findTbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_findTbl11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_findTbl11MouseClicked

    private void emp_btnAddEmpType13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_btnAddEmpType13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_btnAddEmpType13MouseClicked

    private void sup_findTbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_findTbl10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_findTbl10MouseClicked

    private void emp_btnAddEmpType12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_btnAddEmpType12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_btnAddEmpType12MouseClicked

    private void sup_findTbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_findTbl5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_findTbl5MouseClicked

    private void emp_btnAddEmpType16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_btnAddEmpType16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_btnAddEmpType16MouseClicked

    private void productAdd_btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnPrintMouseClicked

        try {

            if (product != null) {

                String count = null;

                JLabel l = new JLabel();
                l.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
                if (Application.getLangu().equals("SIN")) {
                    l.setText("අවශ්‍ය ගණන ඇතුලත් කරන(2 min,16 max per page)");
                    count = JOptionPane.showInputDialog(null, l, "ගණන ඇතුලත් කරන්න", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    l.setText("Enter count of bar codes(2 min,16 max per page)");
                    count = JOptionPane.showInputDialog(null, l, "ENTER COUNT", JOptionPane.INFORMATION_MESSAGE);
                }

                if (!count.isEmpty() && count != null) {

                    boolean isInt = false;
                    int c = 1;
                    try {

                        c = Integer.parseInt(count);
                        isInt = true;
                    } catch (NullPointerException n) {

                    } catch (NumberFormatException e) {
                        isInt = false;
                        e.printStackTrace();
                    }

                    if (isInt) {

                        DefaultTableModel model = new DefaultTableModel() {
                            String[] x = {"qr"};

                            @Override
                            public int getColumnCount() {
                                return x.length;
                            }

                            @Override
                            public String getColumnName(int index) {
                                return x[index];
                            }
                        };

                        JasperReport report = JasperCompileManager.compileReport(getClass().getResource("/Reports/barodeReport.jrxml").getFile());
//getClass().getResource("/Reports/barodeReport.jrxml").getFile()
//"F:\\myreport\\barodeReport.jrxml"
                        JTable tb = new JTable(model);

                        String path = product.getQr();

                        for (int i = 0; i < c / 2; i++) {
                            Vector v = new Vector();
                            v.add(path);
                            model.addRow(v);

                        }

                        JRTableModelDataSource jt = new JRTableModelDataSource(tb.getModel());
                        JasperPrint jasperPrint = JasperFillManager.fillReport(report, null, jt);
                        JasperViewer.viewReport(jasperPrint, false);
                    } else {
                        EXTCLASS.showMessage("Enter numbers only!", "අංක පමණක් ඇතුළත් කරන්න", "ERROR", Application.SINERROR, 0);

                    }
                }
            } else {

                EXTCLASS.showMessage("Please select the row from list!", "කරුණාකර ලැයිස්තුවෙන් පේළියක් තෝරන්න"
                        + "", "WARNING", Application.SINWARN, 2);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_productAdd_btnPrintMouseClicked

    private void productAdd_searchByKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productAdd_searchByKeyReleased

        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);

            SimpleExpression name = Restrictions.like("name", productAdd_searchBy.getText(), MatchMode.ANYWHERE);
            SimpleExpression id = Restrictions.like("idproduct", productAdd_searchBy.getText(), MatchMode.ANYWHERE);

            if (productAdd_findActive.isSelected()) {
                SimpleExpression st = Restrictions.eq("status", "active");
                c.add(st);
            } else if (productAdd_findDeactive.isSelected()) {
                SimpleExpression st = Restrictions.eq("status", "deactive");
                c.add(st);

            }
            LogicalExpression expression = Restrictions.or(id, name);
            c.add(expression);

            loadProductTbl(c);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_productAdd_searchByKeyReleased

    private void productAdd_btnChangeActiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnChangeActiveMouseClicked
        try {

            if (product != null) {

                if (product.getStatus().equals("active")) {

                    product.setStatus("deactive");

                } else if (product.getStatus().equals("deactive")) {

                    product.setStatus("active");

                }
                EXTCLASS.getHibSession().update(product);

                loadProductTbl(c);
                productAdd_findAll.setSelected(true);

                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                t.commit();

                clearProductFields();
                loadProductsCombo();

            } else {

                EXTCLASS.showMessage("Please select the row from list!", "කරුණාකර ලැයිස්තුවෙන් පේළියක් තෝරන්න"
                        + "", "WARNING", Application.SINWARN, 2);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productAdd_btnChangeActiveMouseClicked

    private void productAdd_findAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_findAllMouseClicked


    }//GEN-LAST:event_productAdd_findAllMouseClicked

    private void productAdd_findAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAdd_findAllActionPerformed
        System.out.println("all");
        loadProductTbl(c);
    }//GEN-LAST:event_productAdd_findAllActionPerformed

    private void productAdd_findActiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_findActiveMouseClicked

    }//GEN-LAST:event_productAdd_findActiveMouseClicked

    private void productAdd_findActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAdd_findActiveActionPerformed
        System.out.println("active");
        changeProductstate("active", "product");
    }//GEN-LAST:event_productAdd_findActiveActionPerformed

    private void productAdd_findDeactiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_findDeactiveMouseClicked

    }//GEN-LAST:event_productAdd_findDeactiveMouseClicked

    private void productAdd_findDeactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAdd_findDeactiveActionPerformed
        System.out.println("deactive");
        changeProductstate("deactive", "product");
    }//GEN-LAST:event_productAdd_findDeactiveActionPerformed

    private void productAdd_btnAddBrandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAdd_btnAddBrandMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_productAdd_btnAddBrandMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        Desktop d = Desktop.getDesktop();
        try {
            if (!productAdd_barCode.getText().isEmpty()) {

                d.browse(new URI("https://www.google.lk/search?q=" + productAdd_barCode.getText()));//http://google.com
            }

        } catch (IOException | URISyntaxException e2) {

            EXTCLASS.showMessage("Wrong web address!", "වැරදි වෙබ් ලිපිනයක් ", "ERROR", Application.SINERROR, 0);

            e2.printStackTrace();

        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void stockAdd_grnTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockAdd_grnTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnTblMouseClicked

    private void stockAdd_btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockAdd_btnSaveMouseClicked
        try {

            if (!stockAdd_supplierQr.getText().isEmpty() && !stockAdd_supplier.getSelectedItem().equals("Select Supplier")) {
                if (!stockAdd_grnTot.getText().isEmpty() && !stockAdd_grnPayment.getText().isEmpty()) {

                    double subTot = Double.parseDouble(stockAdd_grnSubTot.getText());
                    double dis = (subTot * Double.parseDouble(stockAdd_grnDis.getText()) / 100);
                    double tax = (subTot * Double.parseDouble(stockAdd_grnTax.getText()) / 100);
                    double tot = (subTot + tax) - dis;
                    double payment = Double.parseDouble(stockAdd_grnPayment.getText());
                    double bal = payment - tot;

                    Supplier s = (Supplier) EXTCLASS.getHibSession().load(Supplier.class, Integer.parseInt(stockAdd_supplierQr.getText().trim()));

                    String st = "";

                    JLabel msg = new JLabel();
                    String header = "";

                    if (Application.getLangu().equals("SIN")) {
                        header = Application.SININFO;
                        msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                        msg.setText(" ඔබට විශ්වාසයිද " + "?");
                    } else {
                        header = "INFO";
                        msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                        msg.setText(" Are you sure " + "?");
                    }

                    if (JOptionPane.showConfirmDialog(this, msg, header, JOptionPane.WARNING_MESSAGE) == 0) {

                        boolean isPayableBalOk = false;

                        if (bal < 0) {
                            //pending inv

                            JLabel msg2 = new JLabel();
                            String header2 = "";

                            if (Application.getLangu().equals("SIN")) {
                                header2 = Application.SININFO;
                                msg2.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                msg2.setText(" මෙම ඉන්වොයිසයේ  RS " + def.format(bal) + " තවමත් ගෙවා නොමැත!ඔබට විශ්වාසද ? ");
                            } else {
                                header2 = "INFO";
                                msg2.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                msg2.setText("This invoice still have Rs " + def.format(bal) + " payable! Are you sure want to process?");

                            }

                            if (JOptionPane.showConfirmDialog(this, msg2, header2, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                //save as pending
                                st = "pending";
                                isPayableBalOk = true;
                            } else {
                                isPayableBalOk = false;
                            }

                        } else {
                            st = "done";
                            isPayableBalOk = true;

                        }
                        if (isPayableBalOk) {

                            Grn grn = new Grn();
                            grn.setSupplier(s);
                            grn.setDate(new SimpleDateFormat("yyy-MM-dd").parse(stockAdd_addDate.getText()));
                            grn.setTime(new Date());
                            grn.setPaymentMethod(stockAdd_grnPaymentMethod.getSelectedItem().toString());
                            grn.setTotal(Double.parseDouble(def.format(tot)));
                            grn.setDiscount(Double.parseDouble(stockAdd_grnDis.getText()));
                            grn.setTax(Double.parseDouble(stockAdd_grnTax.getText()));
                            grn.setOther(Double.parseDouble(def.format(subTot)));
                            grn.setPayment(Double.parseDouble(def.format(payment)));
                            grn.setBalance(Double.parseDouble(def.format(bal)));
                            grn.setStatus(st);

                            EXTCLASS.getHibSession().save(grn);

                            DefaultTableModel dtm = (DefaultTableModel) stockAdd_grnTbl.getModel();

                            for (int i = 0; i < dtm.getRowCount(); i++) {

                                GrnHasItems items = new GrnHasItems();
                                items.setGrn(grn);

                                Stock stock = (Stock) EXTCLASS.getHibSession().load(Stock.class, Integer.parseInt(dtm.getValueAt(i, 0).toString()));

                                items.setStock(stock);
                                items.setQty(Double.parseDouble(dtm.getValueAt(i, 4).toString()));
                                items.setUnitPrice(Double.parseDouble(dtm.getValueAt(i, 5).toString()));
                                items.setDiscount(Double.parseDouble(dtm.getValueAt(i, 6).toString()));
                                items.setTax(Double.parseDouble(dtm.getValueAt(i, 7).toString()));
                                items.setUnitBuyingPrice(Double.parseDouble(dtm.getValueAt(i, 8).toString()));
                                items.setSubTot(Double.parseDouble(dtm.getValueAt(i, 10).toString()));
                                items.setTotal(Double.parseDouble(dtm.getValueAt(i, 11).toString()));
                                items.setStatus("active");

                                EXTCLASS.getHibSession().save(items);

                            }

                            System.out.println("grn /grn items added");

                            EXTCLASS.showMessage("Successfully added!", "එක් කිරීම සාර්ථකයි ", "SUCCESS", Application.SINSUCCESS, 1);

                            Transaction t = EXTCLASS.getHibSession().beginTransaction();
                            t.commit();

                            //genrate report
                            JasperReport report = JasperCompileManager.compileReport(getClass().getResource("/Reports/grn_inventory.jrxml").getFile());
                            Map<String, Object> m = new HashMap<>();

                            MyCompanyDetails company = Application.getCompany();
                            if (!company.getName().isEmpty()) {

                                m.put("company_name", company.getName());
                            }
                            String address = "";
                            if (!company.getNo().isEmpty()) {
                                address += company.getNo() + ", ";

                            }
                            if (!company.getStreet().isEmpty()) {
                                address += company.getStreet() + ", ";

                            }
                            if (!company.getCity().isEmpty()) {
                                address += company.getCity() + ", ";

                            }
                            if (!company.getCountry().isEmpty()) {
                                address += company.getCountry() + ".";

                            }
                            if (!address.isEmpty()) {
                                m.put("company_address", address);
                            }

                            if (!company.getEmail().isEmpty()) {

                                m.put("company_email", company.getEmail());
                            }
                            if (!company.getWebsite().isEmpty()) {
                                m.put("company_website", company.getWebsite());
                            }
                            if (!company.getMobile1().toString().isEmpty()) {
                                m.put("company_tp", company.getMobile1());
                            }
                            if (!company.getImg2().isEmpty() && company.getImg2() != null) {

                                m.put("company_logo", company.getImg2());
                            }

                            m.put("grn_id", grn.getIdgrn());
                            m.put("grn_date", new SimpleDateFormat("yyy-MM-dd").format(grn.getDate()));
                            m.put("sup_name", grn.getSupplier().getName());
                            m.put("sup_company", grn.getSupplier().getSupAndVendorCompanyDetails().getName());

                            m.put("grn_sub_tot", "Rs "+def.format(grn.getOther()));
                            m.put("grn_dis", grn.getDiscount());
                            m.put("grn_tax", grn.getTax());
                            m.put("grn_tot", "Rs "+def.format(grn.getTotal()));
                            m.put("grn_payment", "Rs "+def.format(grn.getPayment()));
                            m.put("grn_bal", "Rs "+def.format(grn.getBalance()));
                            m.put("grn_status", grn.getStatus());

                            JRTableModelDataSource tb = new JRTableModelDataSource(dtm);

                            JasperPrint jasperPrint = JasperFillManager.fillReport(report, m, tb);

                            //save print
                            File f = null;
                            try {
                                EXTCLASS.createFileinC();
                                f = new File("C:\\TGPOS\\GRN");
                                f.mkdir();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            final String extension = "jpg";
                            final String path = "\\" + grn.getIdgrn() + "_" + new SimpleDateFormat("yyy-MM-dd").format(grn.getDate()) + "." + extension;
                            final float zoom = 10f;
                            try (OutputStream out = new FileOutputStream(f.getAbsolutePath() + path)) {
                                BufferedImage image = (BufferedImage) JasperPrintManager.printPageToImage(jasperPrint, 0, zoom);
                                ImageIO.write(image, extension, out);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            JLabel msg3 = new JLabel();
                            String header3 = "";

                            if (Application.getLangu().equals("SIN")) {
                                header3 = Application.SININFO;
                                msg3.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                msg3.setText("භාණ්ඩ ලබා ගැනීම් පත්‍රය මුද්රණය කිරීමට අවශ්යද? ");
                            } else {
                                header3 = "INFO";
                                msg3.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                msg3.setText("Do you want to print GRN?");

                            }

                            if (JOptionPane.showConfirmDialog(this, msg3, header3, JOptionPane.INFORMATION_MESSAGE) == 0) {
                                //print GRN
                                JasperViewer.viewReport(jasperPrint, false);
                            }

                        }

                    }
                } else {
                    System.out.println("fill the details first");
                    EXTCLASS.showMessage("Please fill the details!", "කරුණාකර  විස්තර ඇතුලත් කරන්න ", "WARNING", Application.SINWARN, 2);

                }
            } else {
                //select supplier
                System.out.println("select supplier first");

                EXTCLASS.showMessage("Select supplier first!", "පළමුව සැපයුම්කරුව තෝරන්න "
                        + "", "ERROR", Application.SINERROR, 0);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_btnSaveMouseClicked

    private void stockAdd_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_productKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_productKeyReleased

    private void stockAdd_uPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_uPriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_uPriceKeyTyped

    private void stockAdd_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_qtyKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }

    }//GEN-LAST:event_stockAdd_qtyKeyTyped

    private void stockAdd_uSPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_uSPriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_uSPriceKeyTyped

    private void stockAdd_supplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_supplierKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_supplierKeyReleased

    private void stockAdd_addDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_addDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_addDateKeyTyped

    private void stockAdd_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_productActionPerformed
        try {

            if (!stockAdd_product.getSelectedItem().toString().equals("Select Product")) {

                Product p = (Product) EXTCLASS.getHibSession().load(Product.class, stockAdd_product.getSelectedItem().toString().split(" - ")[1]);

                if (p != null) {

                    stockAdd_productBarcode.setText("  " + p.getIdproduct());
                    stockAdd_unitShow.setText(p.getUnit().getUnit());
                } else {

                    stockAdd_productBarcode.setText(null);
                }

            } else {

                stockAdd_productBarcode.setText(null);
            }

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ObjectNotFoundException | NullPointerException n) {
            stockAdd_productBarcode.setText(null);
            stockAdd_product.setSelectedIndex(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_productActionPerformed

    private void stockAdd_addDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_addDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_addDateActionPerformed

    private void stockAdd_subTotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_subTotKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_subTotKeyTyped

    private void stockAdd_uBPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_uBPriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_uBPriceKeyTyped

    private void stockAdd_taxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_taxKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_taxKeyTyped

    private void stockAdd_disKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_disKeyTyped
//        System.out.println(evt.getKeyChar()+" "+evt.getKeyCode());
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_disKeyTyped

    private void stockAdd_totKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_totKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_totKeyTyped

    private void stockAdd_uPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_uPriceActionPerformed
        stockAdd_dis.grabFocus();
    }//GEN-LAST:event_stockAdd_uPriceActionPerformed

    double subTotal_final = 0;
    double total_final = 0;
    double uBPrice_final = 0;
    private void stockAdd_btnAddStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockAdd_btnAddStockMouseClicked
        try {

            String p = stockAdd_product.getSelectedItem().toString();
            System.out.println(p);
            if (!p.equals("Select Product") && !p.isEmpty()) {
                boolean isSplitOk = false;

                String p_id = "";
                String p_name = "";
                try {

                    p_name = p.split(" - ")[0];
                    p_id = p.split(" - ")[1];
                    System.out.println(p_name + " " + p_id);
                    isSplitOk = true;

                } catch (ArrayIndexOutOfBoundsException e) {
                    isSplitOk = false;
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (isSplitOk) {
                    Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);
                    c.add(Restrictions.eq("idproduct", p_id));
                    c.add(Restrictions.eq("name", p_name));
                    c.add(Restrictions.eq("status", "active"));
                    if (!c.list().isEmpty()) {
                        System.out.println("shall we go");

                        if (!stockAdd_qty.getText().isEmpty() && !stockAdd_uPrice.getText().isEmpty() && !stockAdd_uBPrice.getText().isEmpty() && !stockAdd_uSPrice.getText().isEmpty()) {

                            if (Double.parseDouble(stockAdd_qty.getText()) > 0 && Double.parseDouble(stockAdd_uPrice.getText()) > 0 && Double.parseDouble(stockAdd_uBPrice.getText()) > 0 && Double.parseDouble(stockAdd_uSPrice.getText()) > 0 && Double.parseDouble(stockAdd_subTot.getText()) > 0 && Double.parseDouble(stockAdd_tot.getText()) > 0) {
                                System.out.println("all filed");

                                double dis = 0;
                                double tax = 0;

                                if (!stockAdd_dis.getText().isEmpty()) {

                                    dis = Double.parseDouble(stockAdd_dis.getText());
                                }
                                if (!stockAdd_tax.getText().isEmpty()) {

                                    tax = Double.parseDouble(stockAdd_tax.getText());
                                }

                                double subTot = (Double.parseDouble(stockAdd_qty.getText()) * Double.parseDouble(stockAdd_uPrice.getText()));
                                double disAll = (subTot * dis / 100);
                                double taxAll = (subTot * tax / 100);
                                double tot = (subTot + taxAll) - disAll;
                                double uBPrice = (tot / Double.parseDouble(stockAdd_qty.getText()));

                                System.out.println("qty " + stockAdd_qty.getText());
                                System.out.println("up " + stockAdd_uPrice.getText());
                                System.out.println("sub " + subTot);
                                System.out.println("tot " + tot);

                                String exp_date = "";
                                if (stockAdd_expDate.getDate() != null) {

                                    Date d = stockAdd_expDate.getDate();
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    exp_date = sdf.format(d);
                                    System.out.println(exp_date);
                                }

                                Product product_ = (Product) c.uniqueResult();

                                //check same product or not
                                Criteria c2 = EXTCLASS.getHibSession().createCriteria(Stock.class);
                                c2.add(Restrictions.eq("product", product_));
                                if (!exp_date.equals("")) {

                                    c2.add(Restrictions.eq("expDate", new SimpleDateFormat("yyy-MM-dd").parse(exp_date)));
                                }
                                c2.add(Restrictions.eq("addDate", new SimpleDateFormat("yyy-MM-dd").parse(stockAdd_addDate.getText())));
                                c2.add(Restrictions.eq("unitPrice", Double.parseDouble(stockAdd_uPrice.getText())));
                                c2.add(Restrictions.eq("discount", dis));
                                c2.add(Restrictions.eq("tax", tax));

                                Stock stock = null;

                                boolean isNoProductFound = false;

                                if (!c2.list().isEmpty()) {
                                    //same product found
                                    System.out.println("same product");

                                    JLabel msg = new JLabel();
                                    String header = "";

                                    if (Application.getLangu().equals("SIN")) {
                                        header = Application.SININFO;
                                        msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                        msg.setText(" එකම නිෂ්පාදනයක් හමුවුනා! ඔබට යාවත්කාලීන කිරීමට අවශ්‍යද ?");
                                    } else {
                                        header = "INFO";
                                        msg.setFont(new Font("Iskoola Pota", Font.PLAIN, 18));
                                        msg.setText("Same product found! You want to update?");
                                    }

                                    if (JOptionPane.showConfirmDialog(this, msg, header, JOptionPane.WARNING_MESSAGE) == 0) {
                                        stock = (Stock) c2.uniqueResult();

                                        stock.setAvailableQty(stock.getAvailableQty() + Double.parseDouble(stockAdd_qty.getText()));
                                        stock.setDiscount(stock.getDiscount() + dis);
                                        stock.setTax(stock.getTax() + tax);

                                        subTotal_final += subTot;
                                        total_final += tot;

                                        isNoProductFound = false;
                                    } else {
                                        isNoProductFound = true;
                                    }
                                } else {
                                    //no product found
                                    System.out.println("new product");
                                    isNoProductFound = true;
                                }
                                if (isNoProductFound) {
                                    //new one

                                    stock = new Stock();

                                    stock.setProduct(product_);
                                    stock.setAvailableQty(Double.parseDouble(stockAdd_qty.getText()));
                                    stock.setDiscount(dis);
                                    stock.setTax(tax);
                                    stock.setAddDate(new SimpleDateFormat("yyy-MM-dd").parse(stockAdd_addDate.getText()));
                                    if (!exp_date.equals("")) {

                                        stock.setExpDate(new SimpleDateFormat("yyy-MM-dd").parse(exp_date));
                                    }
                                    stock.setUnitPrice(Double.parseDouble(stockAdd_uPrice.getText()));

                                    subTotal_final = subTot;
                                    total_final = tot;
                                    uBPrice_final = uBPrice;
                                }

                                stock.setUnitSellingPrice(Double.parseDouble(stockAdd_uSPrice.getText()));
                                stock.setStatus("active");

                                DefaultTableModel dtm = (DefaultTableModel) stockAdd_grnTbl.getModel();
                                if (!isNoProductFound) {

                                    EXTCLASS.getHibSession().update(stock);
                                    uBPrice_final = total_final / stock.getAvailableQty();

                                    for (int i = 0; i < stockAdd_grnTbl.getRowCount(); i++) {

                                        int sid = Integer.parseInt(stockAdd_grnTbl.getValueAt(i, 0).toString());
                                        if (sid == stock.getIdstock()) {

                                            System.out.println("going to update " + sid + " row");

                                            stockAdd_grnTbl.setValueAt(stock.getAvailableQty(), i, 4);
                                            stockAdd_grnTbl.setValueAt(uBPrice_final + "", i, 8);
                                            stockAdd_grnTbl.setValueAt(subTotal_final + "", i, 10);
                                            stockAdd_grnTbl.setValueAt(total_final + "", i, 11);

                                            break;
                                        }
                                    }
                                } else {

                                    EXTCLASS.getHibSession().save(stock);

                                    Vector v = new Vector();

                                    v.add(stock.getIdstock());
                                    v.add(stock.getProduct().getIdproduct());
                                    v.add(stock.getProduct().getName());
                                    if (stock.getExpDate() != null) {

                                        v.add(new SimpleDateFormat("yyy-MM-dd").format(stock.getExpDate()));
                                    } else {
                                        v.add("");
                                    }
                                    v.add(stock.getAvailableQty());
                                    v.add(stock.getUnitPrice().toString());
                                    v.add(stock.getDiscount().toString());
                                    v.add(stock.getTax().toString());
                                    v.add(uBPrice_final + "");
                                    v.add(stock.getUnitSellingPrice().toString());
                                    v.add(subTotal_final + "");
                                    v.add(total_final + "");

                                    dtm.addRow(v);
                                }

                                double subTotAll = 0;

                                for (int i = 0; i < dtm.getRowCount(); i++) {

                                    subTotAll += Double.parseDouble(stockAdd_grnTbl.getValueAt(i, 11).toString());

                                }

                                stockAdd_grnSubTot.setText(def.format(subTotAll));

                                System.out.println("********sub*********" + subTotal_final);
                                System.out.println("********tot*********" + total_final);

                                Transaction t = EXTCLASS.getHibSession().beginTransaction();
                                t.commit();

                            } else {
                                System.out.println("fill the details");
                                EXTCLASS.showMessage("Please fill the details!", "කරුණාකර  විස්තර ඇතුලත් කරන්න ", "WARNING", Application.SINWARN, 2);
                            }
                        } else {
                            System.out.println("fill the details first");
                            EXTCLASS.showMessage("Please fill the details!", "කරුණාකර  විස්තර ඇතුලත් කරන්න ", "WARNING", Application.SINWARN, 2);
                        }

                    } else {
                        //wrong product entered
                        System.out.println("wrong product");
                        EXTCLASS.showMessage("Wrong product", "නිෂ්පාදනය වැරදියි ", "ERROR", Application.SINERROR, 0);
                    }
                } else {
                    System.out.println("split wrong");
                    EXTCLASS.showMessage("Wrong product", "නිෂ්පාදනය වැරදියි ", "ERROR", Application.SINERROR, 0);
                }

            } else {
                //select product
                System.out.println("select product");
                EXTCLASS.showMessage("Please select the product!", "කරුණාකර  නිෂ්පාදනයක් තෝරන්න "
                        + "", "WARNING", Application.SINWARN, 2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_btnAddStockMouseClicked

    private void stockAdd_grnDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnDisKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_grnDisKeyTyped

    private void stockAdd_grnTaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnTaxKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_grnTaxKeyTyped

    private void stockAdd_grnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnPaymentActionPerformed
        try {

            double tot = Double.parseDouble(stockAdd_grnTot.getText());
            double payment = Double.parseDouble(stockAdd_grnPayment.getText());

            double bal = payment - tot;

            stockAdd_grnBalance.setText(def.format(bal));

            if (payment >= tot) {
                // balance +

                stockAdd_grnBalance.setForeground(Color.green);

            } else {

                stockAdd_grnBalance.setForeground(Color.red);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_grnPaymentActionPerformed

    private void stockAdd_grnPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnPaymentKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();

        }
    }//GEN-LAST:event_stockAdd_grnPaymentKeyTyped

    private void stockAdd_grnTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnTotActionPerformed

    private void stockAdd_grnTotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnTotKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnTotKeyTyped

    private void stockAdd_grnSubTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnSubTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnSubTotActionPerformed

    private void stockAdd_grnSubTotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnSubTotKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnSubTotKeyTyped

    private void stockAdd_grnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnBalanceActionPerformed

    private void stockAdd_grnBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnBalanceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnBalanceKeyTyped

    private void stockAdd_grnPaymentMethodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_grnPaymentMethodKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_grnPaymentMethodKeyReleased

    private void stockAdd_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_supplierActionPerformed
        try {
            if (!stockAdd_supplier.getSelectedItem().toString().equals("Select Supplier")) {

                int supId = Integer.parseInt(stockAdd_supplier.getSelectedItem().toString().split(" - ")[1]);

                Supplier sup = (Supplier) EXTCLASS.getHibSession().load(Supplier.class, supId);
                if (sup != null) {

                    stockAdd_supCompanyShow.setText(sup.getSupAndVendorCompanyDetails().getName());
                    stockAdd_supplierQr.setText("  " + sup.getIdsupplier());

                } else {

                    stockAdd_supCompanyShow.setText(null);
                    stockAdd_supplierQr.setText(null);
                }
            } else {

                stockAdd_supCompanyShow.setText(null);
                stockAdd_supplierQr.setText(null);
            }

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ObjectNotFoundException | NullPointerException n) {
            stockAdd_supCompanyShow.setText(null);
            stockAdd_supplierQr.setText(null);
            stockAdd_supplier.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_supplierActionPerformed

    private void stockAdd_productBarcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_productBarcodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_productBarcodeKeyTyped

    private void stockAdd_productBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_productBarcodeKeyReleased
        try {

            if (!stockAdd_productBarcode.getText().isEmpty()) {

                Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);
                c.add(Restrictions.eq("idproduct", stockAdd_productBarcode.getText().trim()));
                c.add(Restrictions.eq("status", "active"));

                if (!c.list().isEmpty()) {

                    Product p = (Product) c.uniqueResult();

                    stockAdd_product.setSelectedItem(p.getName() + " - " + p.getIdproduct());
                    stockAdd_unitShow.setText(p.getUnit().getUnit());
                } else {
                    stockAdd_product.setSelectedIndex(0);
                }
            }

        } catch (NumberFormatException e) {
            stockAdd_product.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_stockAdd_productBarcodeKeyReleased

    private void stockAdd_supplierQrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_supplierQrKeyReleased
        try {

            if (!stockAdd_supplierQr.getText().isEmpty()) {

                Criteria c = EXTCLASS.getHibSession().createCriteria(Supplier.class);
                c.add(Restrictions.eq("idsupplier", Integer.parseInt(stockAdd_supplierQr.getText().trim())));
                c.add(Restrictions.eq("status", "active"));

                if (!c.list().isEmpty()) {

                    Supplier p = (Supplier) c.uniqueResult();

                    stockAdd_supplier.setSelectedItem(p.getName() + " - " + p.getIdsupplier());

                } else {
                    stockAdd_supplier.setSelectedIndex(0);
                }
            }

        } catch (NumberFormatException e) {
            stockAdd_supplier.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_stockAdd_supplierQrKeyReleased

    private void stockAdd_supplierQrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_supplierQrKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_stockAdd_supplierQrKeyTyped

    private void stockAdd_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_qtyActionPerformed

        stockAdd_uPrice.grabFocus();
    }//GEN-LAST:event_stockAdd_qtyActionPerformed

    private void stockAdd_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_qtyKeyReleased

    }//GEN-LAST:event_stockAdd_qtyKeyReleased

    private void stockAdd_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_taxActionPerformed
        try {

            boolean isDouble = setCalculationValues();
            System.out.println(isDouble);
            if (isDouble) {

                subTot = (qty * uPrice);
                disAll = (subTot * dis / 100);
                taxAll = (subTot * tax / 100);
                tot = (subTot + taxAll) - disAll;
                uBPrice = (tot / qty);

                stockAdd_subTot.setText(def.format(subTot));
                stockAdd_uBPrice.setText(def.format(uBPrice));
                stockAdd_tot.setText(def.format(tot));

                System.out.println("----------------------");
                System.out.println("subTot is - " + subTot);
                System.out.println("Dis is - " + disAll);
                System.out.println("Tax is - " + taxAll);
                System.out.println("Tot is - " + tot);
                System.out.println("Unit b price - " + uBPrice);
                System.out.println("----------------------");

                stockAdd_uSPrice.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_taxActionPerformed

    private void stockAdd_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_disActionPerformed
        stockAdd_tax.grabFocus();
    }//GEN-LAST:event_stockAdd_disActionPerformed

    private void stockAdd_uBPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_uBPriceKeyReleased

        try {
            boolean isDouble = setCalculationValues();
            if (isDouble) {

                subTot = (qty * uPrice);
                taxAll = (subTot * tax / 100);

                dis = (subTot - (uBPrice * qty)) * 100 / subTot + tax;
                disAll = (subTot * dis / 100);
                tot = (subTot + taxAll) - disAll;

                stockAdd_dis.setText(def.format(dis));
                stockAdd_subTot.setText(def.format(subTot));
                stockAdd_tot.setText(def.format(tot));

                System.out.println("----------------------");
                System.out.println("subTot is - " + subTot);
                System.out.println("Dis is - " + disAll);
                System.out.println("Tax is - " + taxAll);
                System.out.println("Tot is - " + tot);
                System.out.println("Unit b price - " + uBPrice);
                System.out.println("dis - " + dis);
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_stockAdd_uBPriceKeyReleased

    private void stockAdd_uPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockAdd_uPriceKeyReleased
        stockAdd_uSPrice.setText(stockAdd_uPrice.getText());
    }//GEN-LAST:event_stockAdd_uPriceKeyReleased

    private void stockAdd_uBPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_uBPriceActionPerformed
        stockAdd_uSPrice.grabFocus();
    }//GEN-LAST:event_stockAdd_uBPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(jDateChooser1.getDate());

        Date d = jDateChooser1.getDate();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(d));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void stockAdd_grnDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnDisActionPerformed

        stockAdd_grnTax.grabFocus();

    }//GEN-LAST:event_stockAdd_grnDisActionPerformed

    private void stockAdd_grnTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAdd_grnTaxActionPerformed
        try {

            double subTot = Double.parseDouble(stockAdd_grnSubTot.getText());
            double dis = (subTot * Double.parseDouble(stockAdd_grnDis.getText()) / 100);
            double tax = (subTot * Double.parseDouble(stockAdd_grnTax.getText()) / 100);

            double tot = (subTot + tax) - dis;

            stockAdd_grnTot.setText(def.format(tot));

            System.out.println("grn dis =" + dis);
            System.out.println("grn tax =" + tax);
            System.out.println("grn subtot =" + subTot);
            System.out.println("grn tot =" + tot);

            stockAdd_grnPayment.grabFocus();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_stockAdd_grnTaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField com_basic_br10;
    private javax.swing.JTextField com_basic_br11;
    private javax.swing.JTextField com_basic_br12;
    private javax.swing.JTextField com_basic_br9;
    private javax.swing.JLabel emp_btnAddEmpType12;
    private javax.swing.JLabel emp_btnAddEmpType13;
    private javax.swing.JLabel emp_btnAddEmpType14;
    private javax.swing.JLabel emp_btnAddEmpType15;
    private javax.swing.JLabel emp_btnAddEmpType16;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_1_1_1;
    private static javax.swing.JLabel jLabel_1_1_2;
    private static javax.swing.JLabel jLabel_1_1_3;
    private static javax.swing.JLabel jLabel_1_1_4;
    private static javax.swing.JLabel jLabel_1_1_5;
    private static javax.swing.JLabel jLabel_1_1_6;
    private static javax.swing.JLabel jLabel_1_1_7;
    private static javax.swing.JLabel jLabel_2_1_1;
    private static javax.swing.JLabel jLabel_2_1_10;
    private static javax.swing.JLabel jLabel_2_1_11;
    private static javax.swing.JLabel jLabel_2_1_12;
    private static javax.swing.JLabel jLabel_2_1_13;
    private static javax.swing.JLabel jLabel_2_1_14;
    private static javax.swing.JLabel jLabel_2_1_15;
    private static javax.swing.JLabel jLabel_2_1_16;
    private static javax.swing.JLabel jLabel_2_1_17;
    private static javax.swing.JLabel jLabel_2_1_18;
    private static javax.swing.JLabel jLabel_2_1_19;
    private static javax.swing.JLabel jLabel_2_1_2;
    private static javax.swing.JLabel jLabel_2_1_3;
    private static javax.swing.JLabel jLabel_2_1_4;
    private static javax.swing.JLabel jLabel_2_1_5;
    private static javax.swing.JLabel jLabel_2_1_6;
    private static javax.swing.JLabel jLabel_2_1_7;
    private static javax.swing.JLabel jLabel_2_1_8;
    private static javax.swing.JLabel jLabel_2_1_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private static javax.swing.JPanel jPanel14;
    private static javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private static javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private static javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel20;
    private static javax.swing.JPanel jPanel22;
    private static javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private static javax.swing.JPanel jPanel26;
    private static javax.swing.JPanel jPanel27;
    private static javax.swing.JPanel jPanel28;
    private static javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTabbedPane jTabbedPane2;
    private static javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField othersAdd_brand;
    private javax.swing.JLabel othersAdd_btnBrandAdd;
    private javax.swing.JLabel othersAdd_btnTypeAdd;
    private javax.swing.JLabel othersAdd_btnUnitAdd;
    private javax.swing.JTable othersAdd_tblBrand;
    private javax.swing.JTable othersAdd_tblType;
    private javax.swing.JTable othersAdd_tblUnit;
    private javax.swing.JTextField othersAdd_type;
    private javax.swing.JTextField othersAdd_unit;
    private javax.swing.JTable productAdd_alltBL;
    private javax.swing.JTextField productAdd_barCode;
    private javax.swing.JLabel productAdd_barcodeImg;
    private javax.swing.JComboBox<String> productAdd_brand;
    private javax.swing.JLabel productAdd_btnAddBrand;
    private javax.swing.JLabel productAdd_btnAddTYpe;
    private javax.swing.JLabel productAdd_btnAddUnit;
    private static javax.swing.JLabel productAdd_btnChangeActive;
    private static javax.swing.JLabel productAdd_btnClear;
    private javax.swing.JLabel productAdd_btnGenrateBarcode;
    private javax.swing.JLabel productAdd_btnImg;
    private static javax.swing.JLabel productAdd_btnPrint;
    private static javax.swing.JLabel productAdd_btnSave;
    private static javax.swing.JRadioButton productAdd_findActive;
    private static javax.swing.JRadioButton productAdd_findAll;
    private static javax.swing.JRadioButton productAdd_findDeactive;
    private javax.swing.JLabel productAdd_img;
    private javax.swing.JTextField productAdd_name;
    private javax.swing.JTextField productAdd_searchBy;
    private javax.swing.JComboBox<String> productAdd_type;
    private javax.swing.JComboBox<String> productAdd_unit;
    private javax.swing.JTextField stockAdd_addDate;
    private static javax.swing.JLabel stockAdd_btnAddStock;
    private static javax.swing.JLabel stockAdd_btnSave;
    private javax.swing.JTextField stockAdd_dis;
    private com.toedter.calendar.JDateChooser stockAdd_expDate;
    private javax.swing.JTextField stockAdd_grnBalance;
    private javax.swing.JTextField stockAdd_grnDis;
    private javax.swing.JTextField stockAdd_grnPayment;
    private javax.swing.JComboBox<String> stockAdd_grnPaymentMethod;
    private javax.swing.JTextField stockAdd_grnSubTot;
    private javax.swing.JTextField stockAdd_grnTax;
    private javax.swing.JTable stockAdd_grnTbl;
    private javax.swing.JTextField stockAdd_grnTot;
    private javax.swing.JComboBox<String> stockAdd_product;
    private javax.swing.JTextField stockAdd_productBarcode;
    private javax.swing.JTextField stockAdd_qty;
    private javax.swing.JTextField stockAdd_subTot;
    private javax.swing.JLabel stockAdd_supCompanyShow;
    private javax.swing.JComboBox<String> stockAdd_supplier;
    private javax.swing.JTextField stockAdd_supplierQr;
    private javax.swing.JTextField stockAdd_tax;
    private javax.swing.JTextField stockAdd_tot;
    private javax.swing.JTextField stockAdd_uBPrice;
    private javax.swing.JTextField stockAdd_uPrice;
    private javax.swing.JTextField stockAdd_uSPrice;
    private javax.swing.JLabel stockAdd_unitShow;
    private javax.swing.JTable sup_findTbl10;
    private javax.swing.JTable sup_findTbl11;
    private javax.swing.JTable sup_findTbl5;
    // End of variables declaration//GEN-END:variables

    public static void changeLangu() {

        if (Application.getLangu().equals("SIN")) {

            jTabbedPane1.setTitleAt(0, "නිෂ්පාදන");
            jTabbedPane1.setTitleAt(1, "තොග");

            jTabbedPane2.setTitleAt(0, "නිෂ්පාදනයක් එකතු කරන්න");
            jTabbedPane2.setTitleAt(1, "වෙනත් ");

            //pane 1_1
            jLabel_1_1_1.setText("පින්තූරය");
            jLabel_1_1_2.setText("තීරු කේත අංකය");
            jLabel_1_1_3.setText("නිෂ්පාදන නාමය");
            jLabel_1_1_4.setText("වෙළඳ නාමය");
            jLabel_1_1_5.setText("නිෂ්පාදන ගණය");
            jLabel_1_1_6.setText("මිනුම් ඒකකය");
            jLabel_1_1_7.setText("නම/තීරු අංකයෙන් සෙවීම");

            productAdd_btnSave.setText("සුරකින්න");
            productAdd_btnClear.setText("මකන්න");
            productAdd_btnPrint.setText("මුද්රණය කරන්න");
            productAdd_btnChangeActive.setText("තත්ත්වය වෙනස් කරන්න");

            productAdd_findActive.setText("සක්‍රීය ");
            productAdd_findDeactive.setText("අක්‍රීය");
            productAdd_findAll.setText("සියළු");

            TitledBorder t1 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t1.setTitle("නිෂ්පාදන විස්තර");
            t1.setTitleColor(Color.WHITE);
            t1.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t2 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t2.setTitle("සියළු නිෂ්පාදන ");
            t2.setTitleColor(Color.WHITE);
            t2.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t3 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t3.setTitle("ඒකකයක් එකතු කරන්න");
            t3.setTitleColor(Color.WHITE);
            t3.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t4 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t4.setTitle("නිෂ්පාදන ගණයක් එකතු කරන්න");
            t4.setTitleColor(Color.WHITE);
            t4.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t5 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t5.setTitle("වෙළඳ නාමයක් එකතු කරන්න");
            t5.setTitleColor(Color.WHITE);
            t5.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            jPanel14.setBorder(t1);
            jPanel17.setBorder(t2);

            //pane 1_2
            jPanel15.setBorder(t3);
            jPanel19.setBorder(t4);
            jPanel20.setBorder(t5);

            //pane 2_1
            jTabbedPane3.setTitleAt(0, "තොග මිලදී ගැනීම");
            jTabbedPane3.setTitleAt(1, "සියළු තොග");

            jLabel_2_1_1.setText("සැපයුම්කරු");
            jLabel_2_1_2.setText("නිෂ්පාදනය ");
            jLabel_2_1_3.setText("මිළදී ගන්නා දිනය ");
            jLabel_2_1_4.setText("කල් ඉකුත් වන දිනය ");
            jLabel_2_1_5.setText("ප්රමාණය");
            jLabel_2_1_6.setText("ඒකක මිල");
            jLabel_2_1_7.setText("වට්ටම");
            jLabel_2_1_8.setText("බද්ද");
            jLabel_2_1_9.setText("ඒ.ගැනීම් මිල");
            jLabel_2_1_10.setText("ඒ.විකුණුම් මිල");
            jLabel_2_1_11.setText("උප එකතුව");
            jLabel_2_1_12.setText("මුළු එකතුව ");
            jLabel_2_1_13.setText("වට්ටම");
            jLabel_2_1_14.setText("බද්ද");
            jLabel_2_1_15.setText("උප එකතුව");
            jLabel_2_1_16.setText("මුළු එකතුව ");
            jLabel_2_1_17.setText("ගෙවීම");
            jLabel_2_1_18.setText("ගෙවීමේ ආකාරය ");
            jLabel_2_1_19.setText("ශේෂය");

            stockAdd_btnAddStock.setText("එකතු කරන්න");
            stockAdd_btnSave.setText("සුරකින්න");

            TitledBorder t6 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t6.setTitle("තොග ගැනීම");
            t6.setTitleColor(Color.WHITE);
            t6.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t7 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t7.setTitle("භාණ්ඩ ගැනීම් පත්‍රය");
            t7.setTitleColor(Color.WHITE);
            t7.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            jPanel22.setBorder(t6);
            jPanel23.setBorder(t7);

        } else {
            jTabbedPane1.setTitleAt(0, "PRODUCTS");
            jTabbedPane1.setTitleAt(1, "STOCK");

            jTabbedPane2.setTitleAt(0, "ADD PRODUCTS");
            jTabbedPane2.setTitleAt(1, "ADD OTHERS");

            //pane 1_1
            jLabel_1_1_1.setText("Image");
            jLabel_1_1_2.setText("Bar Code ID");
            jLabel_1_1_3.setText("Product Name");
            jLabel_1_1_4.setText("Brand");
            jLabel_1_1_5.setText("Type");
            jLabel_1_1_6.setText("Measurements Unit");
            jLabel_1_1_7.setText("Search by bar code or name");

            productAdd_btnSave.setText("SAVE");
            productAdd_btnClear.setText("CLEAR");
            productAdd_btnPrint.setText("PRINT");
            productAdd_btnChangeActive.setText("CHANGE STATUS");

            productAdd_findActive.setText("ACTIVE");
            productAdd_findDeactive.setText("DEACTIVE");
            productAdd_findAll.setText("ALL");

            TitledBorder t1 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t1.setTitle("PRODUCT DETAILS");
            t1.setTitleColor(Color.WHITE);
            t1.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t2 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t2.setTitle("ALL PRODUCTS");
            t2.setTitleColor(Color.WHITE);
            t2.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t3 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t3.setTitle("ADD UNIT");
            t3.setTitleColor(Color.WHITE);
            t3.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t4 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t4.setTitle("ADD TYPE");
            t4.setTitleColor(Color.WHITE);
            t4.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t5 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t5.setTitle("ADD BRAND");
            t5.setTitleColor(Color.WHITE);
            t5.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            jPanel14.setBorder(t1);
            jPanel17.setBorder(t2);

            jPanel15.setBorder(t3);
            jPanel19.setBorder(t4);
            jPanel20.setBorder(t5);

            //pane 2_1
            jTabbedPane3.setTitleAt(0, "ADD STOCK");
            jTabbedPane3.setTitleAt(1, "ALL STOCK");

            jLabel_2_1_1.setText("Supplier");
            jLabel_2_1_2.setText("Product");
            jLabel_2_1_3.setText("Add Date");
            jLabel_2_1_4.setText("Expire Date");
            jLabel_2_1_5.setText("Quantity");
            jLabel_2_1_6.setText("Unit Price");
            jLabel_2_1_7.setText("Discount");
            jLabel_2_1_8.setText("Tax");
            jLabel_2_1_9.setText("Unit Buying Price");
            jLabel_2_1_10.setText("Unit Selling Price");
            jLabel_2_1_11.setText("Sub Total");
            jLabel_2_1_12.setText("Total");
            jLabel_2_1_13.setText("Discount");
            jLabel_2_1_14.setText("Tax");
            jLabel_2_1_15.setText("Sub Total");
            jLabel_2_1_16.setText("Total");
            jLabel_2_1_17.setText("Payment");
            jLabel_2_1_18.setText("Payment Method");
            jLabel_2_1_19.setText("Balance");

            stockAdd_btnAddStock.setText("ADD STOCK");
            stockAdd_btnSave.setText("SAVE");

            TitledBorder t6 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t6.setTitle("PURCHASE STOCK");
            t6.setTitleColor(Color.WHITE);
            t6.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            TitledBorder t7 = BorderFactory.createTitledBorder(new SoftBevelBorder(0));
            t7.setTitle("GRN DETAILS");
            t7.setTitleColor(Color.WHITE);
            t7.setTitleFont(new Font("Nirmala UI", Font.BOLD, 17));

            jPanel22.setBorder(t6);
            jPanel23.setBorder(t7);

        }

    }

    private void loadProductTbl(Criteria c) {

        try {

            DefaultTableModel dtm = (DefaultTableModel) productAdd_alltBL.getModel();
            if (!c.list().isEmpty()) {

                dtm.setRowCount(0);

                List<Product> list = c.list();

                for (Product p : list) {
                    Vector v = new Vector();
                    v.add(p.getIdproduct());
                    v.add(p.getName());
                    v.add(p.getProductBrand().getBrand());
                    v.add(p.getProductType().getType());
                    v.add(p.getUnit().getUnit());
                    v.add(p.getStatus());
                    dtm.addRow(v);

                }
            } else {

                dtm.setRowCount(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearProductFields() {

        product = null;

        productIsUpdatable = false;

        productAdd_img.setIcon(null);
        productAdd_barcodeImg.setIcon(null);

        productAdd_name.setText(null);
        productAdd_barCode.setText(null);
        productAdd_brand.setSelectedIndex(0);
        productAdd_type.setSelectedIndex(0);
        productAdd_unit.setSelectedIndex(0);
        imgpath = "";
        barCodePath = "";
    }

    private ArrayList<String> checkAddProductFields() {
        ArrayList<String> err = new ArrayList<>();
        if (productAdd_name.getText().isEmpty()) {
            err.add(jLabel_1_1_3.getText());
        }
        if (productAdd_barCode.getText().isEmpty()) {
            err.add(jLabel_1_1_2.getText());
        }
        if (productAdd_brand.getSelectedItem().toString().isEmpty()) {
            err.add(jLabel_1_1_4.getText());
        }
        if (productAdd_type.getSelectedItem().toString().isEmpty()) {
            err.add(jLabel_1_1_5.getText());
        }
        if (productAdd_unit.getSelectedItem().toString().isEmpty()) {
            err.add(jLabel_1_1_6.getText());
        }
        return err;

    }

    private void loadCombos() {

        try {

            Criteria c1 = EXTCLASS.getHibSession().createCriteria(ProductBrand.class);
            Criteria c2 = EXTCLASS.getHibSession().createCriteria(ProductType.class);
            Criteria c3 = EXTCLASS.getHibSession().createCriteria(Unit.class);

            if (!c1.list().isEmpty()) {

                List<ProductBrand> list = c1.list();
                Vector v = new Vector();
                for (ProductBrand productBrand : list) {

                    v.add(productBrand.getBrand() + " - " + productBrand.getIdproductBrand());

                }
                productAdd_brand.setModel(new DefaultComboBoxModel(v));
            }
            if (!c2.list().isEmpty()) {

                List<ProductType> list = c2.list();
                Vector v = new Vector();
                for (ProductType producttype : list) {

                    v.add(producttype.getType() + " - " + producttype.getIdproductType());

                }
                productAdd_type.setModel(new DefaultComboBoxModel(v));
            }
            if (!c3.list().isEmpty()) {

                List<Unit> list = c3.list();
                Vector v = new Vector();
                for (Unit unit : list) {

                    v.add(unit.getUnit() + " - " + unit.getIdunit());

                }
                productAdd_unit.setModel(new DefaultComboBoxModel(v));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadBrandsTbl() {
        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(ProductBrand.class);
            if (!c.list().isEmpty()) {

                DefaultTableModel dtm = (DefaultTableModel) othersAdd_tblBrand.getModel();
                dtm.setRowCount(0);

                List<ProductBrand> list = c.list();
                for (ProductBrand productBrand : list) {
                    Vector v = new Vector();
                    v.add(productBrand.getIdproductBrand());
                    v.add(productBrand.getBrand());

                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadTypeTbl() {
        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(ProductType.class);
            if (!c.list().isEmpty()) {

                DefaultTableModel dtm = (DefaultTableModel) othersAdd_tblType.getModel();
                dtm.setRowCount(0);

                List<ProductType> list = c.list();
                for (ProductType productType : list) {
                    Vector v = new Vector();
                    v.add(productType.getIdproductType());
                    v.add(productType.getType());

                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadUnitTbl() {

        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(Unit.class);
            if (!c.list().isEmpty()) {

                DefaultTableModel dtm = (DefaultTableModel) othersAdd_tblUnit.getModel();
                dtm.setRowCount(0);

                List<Unit> list = c.list();
                for (Unit productUnit : list) {
                    Vector v = new Vector();
                    v.add(productUnit.getIdunit());
                    v.add(productUnit.getUnit());

                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changeProductstate(String st, String tb) {
        try {
            Criteria c = null;
            if (tb.equals("product")) {

                c = EXTCLASS.getHibSession().createCriteria(Product.class);
                c.add(Restrictions.eq("status", st));
                loadProductTbl(c);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isAlreadyHave(String name, String text) {
        boolean isAlredyHave = false;
        try {
            Criteria c = null;
            if (name.equals("unit")) {
                c = EXTCLASS.getHibSession().createCriteria(Unit.class);
                c.add(Restrictions.eq("unit", text));

            } else if (name.equals("brand")) {
                c = EXTCLASS.getHibSession().createCriteria(ProductBrand.class);
                c.add(Restrictions.eq("brand", text));

            } else if (name.equals("type")) {
                c = EXTCLASS.getHibSession().createCriteria(ProductType.class);
                c.add(Restrictions.eq("type", text));

            }

            if (c.list().isEmpty()) {
                isAlredyHave = false;
            } else {
                isAlredyHave = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAlredyHave;

    }

    private void loadProductsCombo() {
        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(Product.class);
            c.add(Restrictions.eq("status", "active"));
            if (!c.list().isEmpty()) {

                List<Product> list = c.list();
                Vector v = new Vector();
                v.add("Select Product");
                for (Product p : list) {
                    v.add(p.getName() + " - " + p.getIdproduct());
                }

                stockAdd_product.setModel(new DefaultComboBoxModel(v));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadSupplierCombo() {

        try {

            Criteria c = EXTCLASS.getHibSession().createCriteria(Supplier.class);
            c.add(Restrictions.eq("status", "active"));
            if (!c.list().isEmpty()) {

                List<Supplier> list = c.list();
                Vector v = new Vector();
                v.add("Select Supplier");
                for (Supplier p : list) {
                    v.add(p.getName() + " - " + p.getIdsupplier());
                }

                stockAdd_supplier.setModel(new DefaultComboBoxModel(v));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double qty = 0;
    private double uPrice = 0;
    private double uBPrice = 0;
    private double uSPrice = 0;
    private double dis = 0;
    private double tax = 0;
    private double disAll = 0;
    private double taxAll = 0;
    private double subTot = 0;
    private double tot = 0;

    DecimalFormat def = new DecimalFormat("0.00");

    private boolean setCalculationValues() {

        boolean isDouble = false;

        try {

            if (!stockAdd_qty.getText().isEmpty()) {

                qty = Double.parseDouble(stockAdd_qty.getText());
                System.out.println("qty is " + qty);
            }
            if (!stockAdd_uPrice.getText().isEmpty()) {

                uPrice = Double.parseDouble(stockAdd_uPrice.getText());
                System.out.println("unit price is " + uPrice);
            }
            if (!stockAdd_uBPrice.getText().isEmpty()) {

                uBPrice = Double.parseDouble(stockAdd_uBPrice.getText());
                System.out.println("unit buying price is " + uBPrice);
            }
            if (!stockAdd_dis.getText().isEmpty()) {

                dis = Double.parseDouble(stockAdd_dis.getText());
                System.out.println("dis is " + dis);
            }
            if (!stockAdd_tax.getText().isEmpty()) {

                tax = Double.parseDouble(stockAdd_tax.getText());
                System.out.println("tax is " + tax);
            }
            if (!stockAdd_uSPrice.getText().isEmpty()) {

                uSPrice = Double.parseDouble(stockAdd_uSPrice.getText());
                System.out.println("usPrice is " + uSPrice);
            }

            isDouble = true;

        } catch (NumberFormatException e) {
            isDouble = false;
            e.printStackTrace();
        }
        return isDouble;

    }

}
