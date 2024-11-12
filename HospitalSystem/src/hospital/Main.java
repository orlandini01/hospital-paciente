package hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.adicionarPaciente(new Paciente(1, "João Silva", 70.5, 1.75, 1));
        hospital.adicionarPaciente(new Paciente(2, "Maria Souza", 60.0, 1.60, 2));

        hospital.listarPacientes();

        hospital.alterarPaciente(1, new Paciente(1, "João Pereira", 72.0, 1.75, 1));

        hospital.removerPaciente(2);

        hospital.listarPacientes();
    }
}
