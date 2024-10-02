package Hospital.service;

import Hospital.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataFarmacia {
    private List<Medicamento> listaMedicamentos;

    public DataFarmacia() {
        listaMedicamentos = new ArrayList<>();
        cargarMedicamentos();
    }

    private void cargarMedicamentos() {
        listaMedicamentos.add(new Medicamento("Paracetamol", "Tableta", "500 mg", "Paracetamol",
                LocalDate.of(2024, 8, 30), "L1234", 5.00, "Analgésico", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Ibuprofeno", "Tableta", "400 mg", "Ibuprofeno",
                LocalDate.of(2024, 12, 15), "L2345", 8.50, "Antiinflamatorio", "Úlcera gástrica"));
        listaMedicamentos.add(new Medicamento("Amoxicilina", "Cápsula", "500 mg", "Amoxicilina",
                LocalDate.of(2025, 3, 10), "L3456", 12.00, "Antibiótico", "Alergia a penicilinas"));
        listaMedicamentos.add(new Medicamento("Diclofenaco", "Tableta", "50 mg", "Diclofenaco",
                LocalDate.of(2024, 10, 22), "L4567", 7.00, "Antiinflamatorio", "Gastritis"));
        listaMedicamentos.add(new Medicamento("Metformina", "Tableta", "850 mg", "Metformina",
                LocalDate.of(2025, 1, 10), "L5678", 10.00, "Diabetes tipo 2", "Insuficiencia renal"));
        listaMedicamentos.add(new Medicamento("Aspirina", "Tableta", "100 mg", "Ácido Acetilsalicílico",
                LocalDate.of(2024, 7, 15), "L6789", 3.50, "Anticoagulante", "Úlceras gástricas"));
        listaMedicamentos.add(new Medicamento("Clorfenamina", "Jarabe", "2 mg", "Clorfenamina",
                LocalDate.of(2024, 5, 12), "L7890", 6.00, "Antihistamínico", "Glaucoma"));
        listaMedicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20 mg", "Omeprazol",
                LocalDate.of(2025, 6, 20), "L8901", 15.00, "Reflujo gástrico", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Simvastatina", "Tableta", "10 mg", "Simvastatina",
                LocalDate.of(2025, 4, 18), "L9012", 18.00, "Colesterol alto", "Enfermedad hepática"));
        listaMedicamentos.add(new Medicamento("Losartán", "Tableta", "50 mg", "Losartán",
                LocalDate.of(2025, 11, 5), "L0123", 12.50, "Hipertensión", "Embarazo"));

        listaMedicamentos.add(new Medicamento("Alprazolam", "Tableta", "1 mg", "Alprazolam",
                LocalDate.of(2025, 2, 10), "L1123", 20.00, "Ansiedad", "Depresión respiratoria"));
        listaMedicamentos.add(new Medicamento("Azitromicina", "Tableta", "500 mg", "Azitromicina",
                LocalDate.of(2024, 9, 30), "L2234", 25.00, "Infecciones bacterianas", "Alergias"));
        listaMedicamentos.add(new Medicamento("Furosemida", "Tableta", "40 mg", "Furosemida",
                LocalDate.of(2025, 5, 12), "L3345", 5.00, "Edema", "Anuria"));
        listaMedicamentos.add(new Medicamento("Levotiroxina", "Tableta", "50 mcg", "Levotiroxina",
                LocalDate.of(2025, 10, 15), "L4456", 7.00, "Hipotiroidismo", "Insuficiencia suprarrenal"));
        listaMedicamentos.add(new Medicamento("Carbamazepina", "Tableta", "200 mg", "Carbamazepina",
                LocalDate.of(2025, 7, 20), "L5567", 30.00, "Epilepsia", "Insuficiencia hepática"));
        listaMedicamentos.add(new Medicamento("Cetirizina", "Tableta", "10 mg", "Cetirizina",
                LocalDate.of(2024, 6, 12), "L6678", 4.00, "Alergias", "Insuficiencia renal"));
        listaMedicamentos.add(new Medicamento("Prednisona", "Tableta", "20 mg", "Prednisona",
                LocalDate.of(2025, 12, 18), "L7789", 10.00, "Inflamación", "Infecciones virales"));
        listaMedicamentos.add(new Medicamento("Acetaminofén", "Jarabe", "160 mg/5 mL", "Acetaminofén",
                LocalDate.of(2024, 8, 9), "L8890", 8.00, "Fiebre", "Daño hepático"));
        listaMedicamentos.add(new Medicamento("Ranitidina", "Tableta", "150 mg", "Ranitidina",
                LocalDate.of(2024, 11, 22), "L9901", 9.00, "Úlceras gástricas", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Ciprofloxacina", "Tableta", "500 mg", "Ciprofloxacina",
                LocalDate.of(2024, 10, 28), "L1012", 28.00, "Infecciones bacterianas", "Alergias"));

        listaMedicamentos.add(new Medicamento("Dexametasona", "Tableta", "4 mg", "Dexametasona",
                LocalDate.of(2025, 9, 14), "L1112", 12.00, "Alergias graves", "Infecciones"));
        listaMedicamentos.add(new Medicamento("Enalapril", "Tableta", "10 mg", "Enalapril",
                LocalDate.of(2025, 8, 3), "L1213", 15.00, "Hipertensión", "Embarazo"));
        listaMedicamentos.add(new Medicamento("Tramadol", "Tableta", "50 mg", "Tramadol",
                LocalDate.of(2024, 12, 2), "L1314", 18.00, "Dolor agudo", "Depresión respiratoria"));
        listaMedicamentos.add(new Medicamento("Insulina Glargina", "Inyección", "100 UI/mL", "Insulina Glargina",
                LocalDate.of(2025, 2, 25), "L1415", 50.00, "Diabetes tipo 1 y 2", "Hipoglucemia"));
        listaMedicamentos.add(new Medicamento("Ketorolaco", "Tableta", "10 mg", "Ketorolaco",
                LocalDate.of(2024, 11, 17), "L1516", 22.00, "Dolor moderado", "Insuficiencia renal"));
        listaMedicamentos.add(new Medicamento("Clonazepam", "Tableta", "2 mg", "Clonazepam",
                LocalDate.of(2024, 10, 4), "L1617", 16.00, "Ansiedad", "Insuficiencia hepática"));
        listaMedicamentos.add(new Medicamento("Loratadina", "Tableta", "10 mg", "Loratadina",
                LocalDate.of(2024, 7, 20), "L1718", 6.00, "Alergias", "Insuficiencia hepática"));
        listaMedicamentos.add(new Medicamento("Tamsulosina", "Cápsula", "0.4 mg", "Tamsulosina",
                LocalDate.of(2025, 3, 11), "L1819", 14.00, "Hiperplasia prostática", "Hipotensión ortostática"));
        listaMedicamentos.add(new Medicamento("Warfarina", "Tableta", "5 mg", "Warfarina",
                LocalDate.of(2025, 5, 25), "L1920", 40.00, "Trombosis", "Embarazo"));
        listaMedicamentos.add(new Medicamento("Fluoxetina", "Cápsula", "20 mg", "Fluoxetina",
                LocalDate.of(2024, 12, 30), "L2021", 35.00, "Depresión", "Manía"));
        listaMedicamentos.add(new Medicamento("Propranolol", "Tableta", "40 mg", "Propranolol",
                LocalDate.of(2025, 1, 5), "L2122", 20.00, "Ansiedad", "Asma"));

        listaMedicamentos.add(new Medicamento("Levofloxacina", "Tableta", "500 mg", "Levofloxacina",
                LocalDate.of(2025, 7, 28), "L2223", 32.00, "Infecciones bacterianas", "Tendinitis"));
        listaMedicamentos.add(new Medicamento("Atorvastatina", "Tableta", "20 mg", "Atorvastatina",
                LocalDate.of(2024, 10, 7), "L2324", 18.00, "Colesterol alto", "Enfermedad hepática"));
        listaMedicamentos.add(new Medicamento("Esomeprazol", "Cápsula", "40 mg", "Esomeprazol",
                LocalDate.of(2025, 8, 19), "L2425", 22.00, "Reflujo gástrico", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Glimepirida", "Tableta", "4 mg", "Glimepirida",
                LocalDate.of(2024, 9, 5), "L2526", 15.00, "Diabetes tipo 2", "Hipoglucemia"));
        listaMedicamentos.add(new Medicamento("Sertralina", "Tableta", "50 mg", "Sertralina",
                LocalDate.of(2025, 4, 10), "L2627", 25.00, "Depresión", "Hipersensibilidad"));
        listaMedicamentos.add(new Medicamento("Rosuvastatina", "Tableta", "10 mg", "Rosuvastatina",
                LocalDate.of(2024, 11, 12), "L2728", 30.00, "Colesterol alto", "Enfermedad hepática"));
        listaMedicamentos.add(new Medicamento("Valproato", "Tableta", "200 mg", "Valproato",
                LocalDate.of(2025, 5, 23), "L2829", 40.00, "Epilepsia", "Hepatotoxicidad"));
        listaMedicamentos.add(new Medicamento("Amlodipino", "Tableta", "5 mg", "Amlodipino",
                LocalDate.of(2024, 12, 3), "L2930", 12.00, "Hipertensión", "Insuficiencia hepática"));
        listaMedicamentos.add(new Medicamento("Doxiciclina", "Cápsula", "100 mg", "Doxiciclina",
                LocalDate.of(2024, 6, 6), "L3031", 25.00, "Infecciones bacterianas", "Fotosensibilidad"));
    }

    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }
}
