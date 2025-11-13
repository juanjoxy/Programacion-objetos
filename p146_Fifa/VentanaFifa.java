import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class VentanaFifa extends JFrame {

    private GestorJugadores gestor;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private JTextField txtNombre, txtNacionalidad, txtPeso, txtFecha, txtRating;
    private JComboBox<String> comboPosicion, comboPie;
    private JButton btnEditar, btnNuevo, btnGuardar, btnAnterior, btnSiguiente, btnEstadistica;

    private File archivoActual = null;

    public VentanaFifa() {
        super("Gestión de Jugadores FIFA");
        gestor = new GestorJugadores();
        configurarVentana();
        configurarEventos();
    }

    private void configurarVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());

        JMenuBar barra = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGrabar = new JMenuItem("Grabar");
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGrabar);
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemTeclas = new JMenuItem("Teclas");
        JMenuItem itemAcerca = new JMenuItem("Acerca de");
        menuAyuda.add(itemTeclas);
        menuAyuda.add(itemAcerca);
        barra.add(menuArchivo);
        barra.add(menuAyuda);
        setJMenuBar(barra);

        modeloTabla = new DefaultTableModel(
            new Object[]{"Nombre", "Nacionalidad", "Peso (kg)", "F. Nacimiento", "Posición", "Pie", "Rating"}, 0
        );
        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        JPanel panelDatos = new JPanel(new GridLayout(4, 4, 5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos del Jugador"));

        txtNombre = new JTextField();
        txtNacionalidad = new JTextField();
        txtPeso = new JTextField();
        txtFecha = new JTextField();
        txtRating = new JTextField();

        comboPosicion = new JComboBox<>(new String[]{"Delantero", "Mediocentro", "Defensa", "Portero"});
        comboPie = new JComboBox<>(new String[]{"Derecho", "Izquierdo"});

        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(txtNombre);
        panelDatos.add(new JLabel("Nacionalidad:"));
        panelDatos.add(txtNacionalidad);
        panelDatos.add(new JLabel("Peso (kg):"));
        panelDatos.add(txtPeso);
        panelDatos.add(new JLabel("F. Nacimiento (YYYY-MM-DD):"));
        panelDatos.add(txtFecha);
        panelDatos.add(new JLabel("Posición:"));
        panelDatos.add(comboPosicion);
        panelDatos.add(new JLabel("Pie Preferido:"));
        panelDatos.add(comboPie);
        panelDatos.add(new JLabel("Rating (1-99):"));
        panelDatos.add(txtRating);

        add(panelDatos, BorderLayout.SOUTH);

        JPanel panelBotones = new JPanel();
        btnEditar = new JButton("Editar");
        btnNuevo = new JButton("Nuevo");
        btnGuardar = new JButton("Guardar");
        btnAnterior = new JButton("Anterior");
        btnSiguiente = new JButton("Siguiente");
        btnEstadistica = new JButton("Estadística");
        panelBotones.add(btnEditar);
        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnAnterior);
        panelBotones.add(btnSiguiente);
        panelBotones.add(btnEstadistica);
        add(panelBotones, BorderLayout.NORTH);

        itemAbrir.addActionListener(e -> abrirArchivo());
        itemGrabar.addActionListener(e -> guardarArchivo());
        itemTeclas.addActionListener(e -> mostrarTeclas());
        itemAcerca.addActionListener(e -> mostrarAcercaDe());
    }

    private void configurarEventos() {
        btnNuevo.addActionListener(e -> limpiarCampos());
        btnGuardar.addActionListener(e -> guardarJugador());
        btnEditar.addActionListener(e -> cargarDesdeTabla());
        btnAnterior.addActionListener(e -> mostrarAnterior());
        btnSiguiente.addActionListener(e -> mostrarSiguiente());
    }

    private void abrirArchivo() {
        JFileChooser fc = new JFileChooser();
        int resp = fc.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            archivoActual = fc.getSelectedFile();
            try {
                ArrayList<Jugador> lista = ArchivoUtil.cargar(archivoActual);
                gestor.getJugadores().clear();
                gestor.getJugadores().addAll(lista);
                actualizarTabla();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void guardarArchivo() {
        JFileChooser fc = new JFileChooser();
        int resp = fc.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            archivoActual = fc.getSelectedFile();
            try {
                ArchivoUtil.guardar(gestor.getJugadores(), archivoActual);
                JOptionPane.showMessageDialog(this, "Archivo guardado correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void mostrarTeclas() {
        JOptionPane.showMessageDialog(this,
            "Teclas de Acceso Rápido:\n\nCtrl + A Abrir archivo\nCtrl + G Grabar archivo\nCtrl + D Borrar\nCtrl + I Nuevo",
            "Ayuda - Teclas", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarAcercaDe() {
        JOptionPane.showMessageDialog(this,
            "Aplicación de Gestión de Jugadores FIFA\nVersión: 2.0\nProgramador: ChatGPT",
            "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limpiarCampos() {
        txtNombre.setText(""); txtNacionalidad.setText(""); txtPeso.setText(""); 
        txtFecha.setText(""); txtRating.setText(""); comboPosicion.setSelectedIndex(0); comboPie.setSelectedIndex(0);
    }

    private void guardarJugador() {
        try {
            String nombre = txtNombre.getText();
            String nac = txtNacionalidad.getText();
            double peso = Double.parseDouble(txtPeso.getText());
            LocalDate fecha = LocalDate.parse(txtFecha.getText());
            String pos = comboPosicion.getSelectedItem().toString();
            String pie = comboPie.getSelectedItem().toString();
            int rating = Integer.parseInt(txtRating.getText());

            gestor.agregar(new Jugador(nombre, nac, peso, fecha, pos, pie, rating));
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Jugador guardado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarDesdeTabla() {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            Jugador j = gestor.getJugadores().get(fila);
            txtNombre.setText(j.getNombre());
            txtNacionalidad.setText(j.getNacionalidad());
            txtPeso.setText(String.valueOf(j.getPeso()));
            txtFecha.setText(j.getFechaNacimiento().toString());
            comboPosicion.setSelectedItem(j.getPosicion());
            comboPie.setSelectedItem(j.getPiePreferido());
            txtRating.setText(String.valueOf(j.getRating()));
        }
    }

    private void mostrarAnterior() { gestor.anterior(); mostrarJugadorActual(); }
    private void mostrarSiguiente() { gestor.siguiente(); mostrarJugadorActual(); }

    private void mostrarJugadorActual() {
        Jugador j = gestor.getActual();
        if (j != null) {
            txtNombre.setText(j.getNombre());
            txtNacionalidad.setText(j.getNacionalidad());
            txtPeso.setText(String.valueOf(j.getPeso()));
            txtFecha.setText(j.getFechaNacimiento().toString());
            comboPosicion.setSelectedItem(j.getPosicion());
            comboPie.setSelectedItem(j.getPiePreferido());
            txtRating.setText(String.valueOf(j.getRating()));
        }
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        for (Jugador j : gestor.getJugadores()) {
            modeloTabla.addRow(new Object[]{ j.getNombre(), j.getNacionalidad(), j.getPeso(),
                j.getFechaNacimiento(), j.getPosicion(), j.getPiePreferido(), j.getRating() });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaFifa().setVisible(true));
    }
}
