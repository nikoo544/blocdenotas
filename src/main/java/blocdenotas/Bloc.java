package blocdenotas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class Bloc extends javax.swing.JFrame implements ActionListener {

    public Bloc() throws IOException {
        initComponents();
        strFinal = textArea.getText();
    }

    //Variables para el control de cambio 
    Boolean flag = false;
    String str;
    String strFinal;
    String ruta;
    String title = "Nuevo archivo.txt : Bloc de notas";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        barrita = new javax.swing.JToolBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5000, 32767));
        currentposition = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        barraMenu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        itemNuevo = new javax.swing.JMenuItem();
        itemAbrir = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemGuardarComo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        selectall = new javax.swing.JMenuItem();
        horayfecha = new javax.swing.JMenuItem();
        formato = new javax.swing.JMenu();
        ajusteLinea = new javax.swing.JCheckBoxMenuItem();
        itemFont = new javax.swing.JMenuItem();
        ver = new javax.swing.JMenu();
        itemAlwaysOnTop = new javax.swing.JCheckBoxMenuItem();
        itemStatusBar = new javax.swing.JCheckBoxMenuItem();
        ayuda = new javax.swing.JMenu();
        webproject = new javax.swing.JMenuItem();
        itemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(title);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(500, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jScrollPane3.setBorder(null);

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setBorder(null);
        textArea.setDragEnabled(true);
        textArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                position(evt);
            }
        });
        jScrollPane3.setViewportView(textArea);

        barrita.setBackground(new java.awt.Color(231, 231, 231));
        barrita.setBorder(null);
        barrita.setFloatable(false);
        barrita.setToolTipText("");
        barrita.setBorderPainted(false);
        barrita.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        barrita.add(filler1);

        currentposition.setText("Línea 1 , Columna 1");
        barrita.add(currentposition);
        barrita.add(filler2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
            .addComponent(barrita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(barrita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, "card2");

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));
        barraMenu.setBorder(null);
        barraMenu.setBorderPainted(false);

        archivo.setText("Archivo");

        itemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNuevo.setText("Nuevo");
        itemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoActionPerformed(evt);
            }
        });
        archivo.add(itemNuevo);

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAbrir.setText("Abrir...");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        archivo.add(itemAbrir);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardar.setText("Guardar");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        archivo.add(itemGuardar);

        itemGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemGuardarComo.setText("Guardar como...");
        itemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarComoActionPerformed(evt);
            }
        });
        archivo.add(itemGuardarComo);
        archivo.add(jSeparator3);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        archivo.add(itemSalir);

        barraMenu.add(archivo);

        edicion.setText("Edición");

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copiar.setText("Copiar");
        copiar.setEnabled(false);
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        edicion.add(copiar);

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cortar.setText("Cortar");
        cortar.setEnabled(false);
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        edicion.add(cortar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        edicion.add(pegar);

        eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        eliminar.setText("Eliminar");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        edicion.add(eliminar);
        edicion.add(jSeparator2);

        selectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        selectall.setText("Seleccionar todo");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });
        edicion.add(selectall);

        horayfecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        horayfecha.setText("Hora y fecha");
        horayfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        edicion.add(horayfecha);

        barraMenu.add(edicion);

        formato.setText("Formato");

        ajusteLinea.setSelected(true);
        ajusteLinea.setText("Ajuste de línea");
        ajusteLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajusteLineaActionPerformed(evt);
            }
        });
        formato.add(ajusteLinea);

        itemFont.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemFont.setText("Fuente...");
        itemFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFontActionPerformed(evt);
            }
        });
        formato.add(itemFont);

        barraMenu.add(formato);

        ver.setText("Ver");

        itemAlwaysOnTop.setText("Siempre visible");
        itemAlwaysOnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlwaysOnTopActionPerformed(evt);
            }
        });
        ver.add(itemAlwaysOnTop);

        itemStatusBar.setSelected(true);
        itemStatusBar.setText("Barra de estado");
        itemStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStatusBarActionPerformed(evt);
            }
        });
        ver.add(itemStatusBar);

        barraMenu.add(ver);

        ayuda.setText("Ayuda");

        webproject.setText("Página del Proyecto");
        webproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webprojectActionPerformed(evt);
            }
        });
        ayuda.add(webproject);

        itemAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        itemAcercaDe.setText("Acerca del Bloc de Notas");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        ayuda.add(itemAcercaDe);

        barraMenu.add(ayuda);

        setJMenuBar(barraMenu);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed

        //Crea un nuevo objeto de clase AcercaDe, lo posiciona en el medio y
        //lo hace visible.
        AcercaDe cartelito = new AcercaDe(this, false);
        cartelito.setLocationRelativeTo(null);
        cartelito.setVisible(true);

    }//GEN-LAST:event_acercaDeActionPerformed

    private void itemStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStatusBarActionPerformed

//Se declara una variable booleana para que tome el estado del checkbox.
        boolean dog;
        dog = itemStatusBar.getState();

        //Si el checkbox devuelve "falso" la barra inferior se esconde.  
        if (dog == true) {

            barrita.setVisible(true);
        } //Si no , la barra aparece.
        else {
            barrita.setVisible(false);
        }

    }//GEN-LAST:event_itemStatusBarActionPerformed

    private void itemFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFontActionPerformed
        //Crea un objeto de clase Fonts.     
        Fuente fontchooser = new Fuente(this, true);
        //Posiciona la ventana en el centro de la pantalla.
        fontchooser.setLocationRelativeTo(null);
        //Lo hace visible.
        fontchooser.setVisible(true);
    }//GEN-LAST:event_itemFontActionPerformed

    private void position(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_position

        //Activador de copiar, cortar y eliminar
        if (textArea.getSelectedText() == null) {
            copiar.setEnabled(false);
            cortar.setEnabled(false);
            eliminar.setEnabled(false);
        } else {
            copiar.setEnabled(true);
            cortar.setEnabled(true);
            eliminar.setEnabled(true);
        }

        // Barra de estado 
        int linea = 1;
        int columna = 1;

        try {
            int col = textArea.getCaretPosition();
            linea = textArea.getLineOfOffset(col);
            columna = col - textArea.getLineStartOffset(linea);

            linea++;
            columna++;

        } catch (BadLocationException ex) {

        }
        currentposition.setText("Línea " + linea + " , Columna " + columna);

        //Listener de modificación de archivo.
        if (!strFinal.equals(textArea.getText())) {
            setTitle("*" + title);
        }

    }//GEN-LAST:event_position

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        //Cierra el programa.
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        //Si el archivo no tiene un path, lo crea. 
        if (ruta == null) {
            guardarcomo();
        } else {
            save();
        }
    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed

        //Si se modificó el archivo pregunta si guardar.
        if (strFinal.equals(textArea.getText())) {
            abrir();
        } else {
            opendialog();
        }

    }//GEN-LAST:event_itemAbrirActionPerformed

    private void itemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoActionPerformed
        // Setea el área de texto con un String vacío.
        if (strFinal.equals(textArea.getText())) {
            textArea.setText("");
            setter();
            //Actualiza el título
            title = "Nuevo archivo.txt : Bloc de notas";
            setTitle(title);
            ruta = null;
        } else { //Si hay un cambio en el archivo pregunta si desea guardar.
            newdialog();
            if (strFinal.equals(textArea.getText())) {
                textArea.setText("");
                setter();
                //Actualiza el título
                title = "Nuevo archivo.txt : Bloc de notas";
                setTitle(title);
                ruta = null;
            }
        }
    }//GEN-LAST:event_itemNuevoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // formWindowClosing si es que se abrió un archivo.    
        if (flag == true) {

            if (!strFinal.equals(textArea.getText())) {

                closedialog();

            } else {
                System.exit(0);
            }

        } else {

            //formWindowClosing si NO se abrió un archivo.
            if (!"".equals(textArea.getText())) {

                closedialog();

            } else {
                System.exit(0);
            }

    }//GEN-LAST:event_formWindowClosing
    }

    private void ajusteLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajusteLineaActionPerformed
// Activa el ajuste de línea dependiendo si el check box esta activado.
        boolean dog;
        dog = ajusteLinea.getState();
        if (dog == true) {
            textArea.setLineWrap(true);
        } else {
            textArea.setLineWrap(false);
        }

    }//GEN-LAST:event_ajusteLineaActionPerformed

    private void itemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarComoActionPerformed
        guardarcomo();
    }//GEN-LAST:event_itemGuardarComoActionPerformed

    private void webprojectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webprojectActionPerformed
        //Abre en el navegador el string url.
        String url = "https://github.com/nikoo544/blocdenotas";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_webprojectActionPerformed

    private void itemAlwaysOnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlwaysOnTopActionPerformed
        // Activa el Siempre visible, dependiendo si el check box esta activado.
        boolean dog;
        dog = itemAlwaysOnTop.getState();
        if (dog == true) {
            setAlwaysOnTop(true);
        } else {
            setAlwaysOnTop(false);
        }
    }//GEN-LAST:event_itemAlwaysOnTopActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed

        //Declara una variable de tipo Date
        Date date = new Date();
        //Declara una variable de tipo SimpleDateFormat y se le pasa el formato.
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd-MM-yyyy ");
        //Setea el área de texto con todo el contenido que tenia antes y le suma el
        //String de la fecha y hora.
        textArea.replaceSelection("");
        textArea.setText(textArea.getText() + formatter.format(date));
    }//GEN-LAST:event_horaActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        //Selecciona todo
        textArea.selectAll();
    }//GEN-LAST:event_selectallActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        //Reemplaza el texto seleccionado con un string nulo.
        textArea.replaceSelection(null);
    }//GEN-LAST:event_eliminarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        //Pega
        textArea.paste();
    }//GEN-LAST:event_pegarActionPerformed

    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
        //Corta
        textArea.cut();
    }//GEN-LAST:event_cortarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        //Copia
        textArea.copy();
    }//GEN-LAST:event_copiarActionPerformed

    //Ventana al cerrar.    
    public void closedialog() {
        //Abre JOptionPane. 
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?",
                "Bloc de Notas", JOptionPane.YES_NO_CANCEL_OPTION);
        //Opción Sí.
        if (valor == JOptionPane.YES_OPTION) {
           //Si el archivo dispone de una ruta, lo guarda directamente.
            if (ruta == null) {
                guardar();
            } else {
                save();
                System.exit(0);
            }
        }
        //Opción No.
        if (valor == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }

    //Ventana nuevo.
    public void newdialog() {

        //Abre JOptionPane. 
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?",
                "Bloc de Notas", JOptionPane.YES_NO_CANCEL_OPTION);
        //Opción Sí.
        if (valor == JOptionPane.YES_OPTION) {
            //Si el archivo dispone de una ruta, lo guarda directamente.
            if (ruta == null) {
                guardarcomo();
            } else {
                save();
            }

            //Opción No.
            if (valor == JOptionPane.NO_OPTION) {
                textArea.setText(null);
                setter();
                //Actualiza el título
                title = "Nuevo archivo.txt : Bloc de notas";
                setTitle(title);
            }
        }
    }

    //Ventana al abrir.
    public void opendialog() {

        //Abre JOptionPane. 
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?",
                "Bloc de Notas", JOptionPane.YES_NO_CANCEL_OPTION);
        //Opción Sí.
        if (valor == JOptionPane.YES_OPTION) {
            //Si el archivo dispone de una ruta, lo guarda directamente.
            if (ruta == null) {
                guardarcomo();
            } else {
                save();
            }

            // Si se guardo el archivo ejecuta abrir().
            if (strFinal.equals(textArea.getText())) {
                abrir();
            }
        }
        //Opción No.
        if (valor == JOptionPane.NO_OPTION) {
            abrir();
        }
    }

    //Accion de abrir.
    public void abrir() {

        // Abre el FileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);

        //Selecciona y lee el archivo.
        try {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File file = new File(ruta);
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "utf-8"))) {
                textArea.setText("");
                while ((str = in.readLine()) != null) {
                    textArea.append(str + "\n");

                    // Variables para el control de cambio
                    flag = true;
                    setter();
                    //Actualiza el título
                    title = file.getName() + " : Bloc de notas";
                    setTitle(title);
                }
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //Guardar y salir
    public void guardar() {

        JFileChooser fileChooser = new JFileChooser();

        int guardar = fileChooser.showSaveDialog(textArea);
        if (guardar == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file == null) {
                return;
            }
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getParentFile(), file.getName() + ".txt");
            }
            try {
                textArea.write(new OutputStreamWriter(new FileOutputStream(file),
                        "utf-8"));

                System.exit(0);

            } catch (IOException e) {
            }
        }

    }

    //Guardar sobreescribiendo el archivo que ya esta abierto.
    public void save() {

        File file = new File(ruta);

        try {
            textArea.write(new OutputStreamWriter(new FileOutputStream(file),
                    "utf-8"));
            setter();
            //Actualiza el título
            title = file.getName() + " : Bloc de notas";
            setTitle(title);

        } catch (IOException e) {

        }

    }

    //Guardar como.
    public void guardarcomo() {

        JFileChooser fileChooser = new JFileChooser();

        int guardar = fileChooser.showSaveDialog(textArea);
        if (guardar == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file == null) {
                return;
            }
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getParentFile(), file.getName() + ".txt");
            }
            try {
                textArea.write(new OutputStreamWriter(new FileOutputStream(file),
                        "utf-8"));

                ruta = file.getAbsolutePath();
                setter();
                //Actualiza el título
                title = file.getName() + " : Bloc de notas";
                setTitle(title);

            } catch (IOException e) {
            }
        }

    }

    //Adquiere la ultima modificación en el area de texto.
    public void setter() {
        strFinal = textArea.getText();
    }

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new Bloc().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem ajusteLinea;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JToolBar barrita;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    public javax.swing.JLabel currentposition;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JMenu formato;
    private javax.swing.JMenuItem horayfecha;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JCheckBoxMenuItem itemAlwaysOnTop;
    public static javax.swing.JMenuItem itemFont;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemGuardarComo;
    private javax.swing.JMenuItem itemNuevo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JCheckBoxMenuItem itemStatusBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem selectall;
    public static javax.swing.JTextArea textArea;
    private javax.swing.JMenu ver;
    private javax.swing.JMenuItem webproject;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
