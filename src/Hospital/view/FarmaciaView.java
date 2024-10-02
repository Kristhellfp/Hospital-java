package Hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FarmaciaView extends JFrame {
    private ArrayList<String[]> medicamentos;

    public FarmaciaView() {
        setTitle("Farmacia");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Cargar los medicamentos
        cargarMedicamentos();

        // Panel de medicamentos
        JPanel panelMedicamentos = crearPanelMedicamentos();
        JScrollPane scrollPane = new JScrollPane(panelMedicamentos);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void cargarMedicamentos() {
        // Listado de 40 medicamentos
        medicamentos = new ArrayList<>();
        medicamentos.add(new String[]{"Paracetamol", "500 mg", "12"});
        medicamentos.add(new String[]{"Ibuprofeno", "400 mg", "15"});
        medicamentos.add(new String[]{"Amoxicilina", "250 mg", "10"});
        medicamentos.add(new String[]{"Losartán", "50 mg", "8"});
        medicamentos.add(new String[]{"Aspirina", "100 mg", "20"});
        medicamentos.add(new String[]{"Loratadina", "10 mg", "25"});
        medicamentos.add(new String[]{"Metformina", "850 mg", "30"});
        medicamentos.add(new String[]{"Ciprofloxacino", "500 mg", "10"});
        medicamentos.add(new String[]{"Omeprazol", "20 mg", "14"});
        medicamentos.add(new String[]{"Simvastatina", "20 mg", "9"});
        medicamentos.add(new String[]{"Enalapril", "10 mg", "18"});
        medicamentos.add(new String[]{"Atorvastatina", "10 mg", "22"});
        medicamentos.add(new String[]{"Salmeterol", "50 mcg", "5"});
        medicamentos.add(new String[]{"Furosemida", "40 mg", "15"});
        medicamentos.add(new String[]{"Dexametasona", "1 mg", "30"});
        medicamentos.add(new String[]{"Ranitidina", "150 mg", "20"});
        medicamentos.add(new String[]{"Clonazepam", "0.5 mg", "25"});
        medicamentos.add(new String[]{"Bupropión", "150 mg", "18"});
        medicamentos.add(new String[]{"Duloxetina", "30 mg", "20"});
        medicamentos.add(new String[]{"Citalopram", "20 mg", "12"});
        medicamentos.add(new String[]{"Sertralina", "50 mg", "22"});
        medicamentos.add(new String[]{"Hydrochlorothiazide", "12.5 mg", "15"});
        medicamentos.add(new String[]{"Esomeprazol", "20 mg", "14"});
        medicamentos.add(new String[]{"Tramadol", "50 mg", "10"});
        medicamentos.add(new String[]{"Prednisona", "20 mg", "8"});
        medicamentos.add(new String[]{"Ketorolaco", "10 mg", "15"});
        medicamentos.add(new String[]{"Atenolol", "50 mg", "20"});
        medicamentos.add(new String[]{"Propranolol", "40 mg", "22"});
        medicamentos.add(new String[]{"Amiodarona", "200 mg", "10"});
        medicamentos.add(new String[]{"Carvedilol", "12.5 mg", "18"});
        medicamentos.add(new String[]{"Diltiazem", "120 mg", "30"});
        medicamentos.add(new String[]{"Nifedipina", "30 mg", "25"});
        medicamentos.add(new String[]{"Montelukast", "10 mg", "12"});
        medicamentos.add(new String[]{"Fluticasona", "250 mcg", "20"});
        medicamentos.add(new String[]{"Salbutamol", "100 mcg", "18"});
        medicamentos.add(new String[]{"Levofloxacino", "500 mg", "10"});
        medicamentos.add(new String[]{"Metoprolol", "50 mg", "15"});
        medicamentos.add(new String[]{"Venlafaxina", "75 mg", "14"});
        medicamentos.add(new String[]{"Pantoprazol", "40 mg", "20"});
        medicamentos.add(new String[]{"Mirtazapina", "30 mg", "10"});
        medicamentos.add(new String[]{"Isotretinoína", "20 mg", "12"});
        medicamentos.add(new String[]{"Tamsulosina", "0.4 mg", "15"});
        medicamentos.add(new String[]{"Sitagliptina", "100 mg", "20"});
        medicamentos.add(new String[]{"Glimepirida", "2 mg", "18"});
        medicamentos.add(new String[]{"Insulina", "100 UI/ml", "25"});
        medicamentos.add(new String[]{"Liraglutida", "1.2 mg", "8"});
        medicamentos.add(new String[]{"Metformina", "500 mg", "30"});
        medicamentos.add(new String[]{"Rabeprazol", "20 mg", "10"});
        medicamentos.add(new String[]{"Aciclovir", "200 mg", "22"});
    }

    private JPanel crearPanelMedicamentos() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (String[] medicamento : medicamentos) {
            JPanel rowPanel = new JPanel();
            rowPanel.setLayout(new GridLayout(1, 3));

            for (String dato : medicamento) {
                JLabel label = new JLabel(dato);
                label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                rowPanel.add(label);
            }

            panel.add(rowPanel);
        }

        return panel;
    }

    public static void main(String[] args) {
        new FarmaciaView();
    }
}

