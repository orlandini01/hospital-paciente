package hospital;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    public void alterarPaciente(int id, Paciente novoPaciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId() == id) {
                pacientes.set(i, novoPaciente);
                System.out.println("Paciente alterado com sucesso!");
                return;
            }
        }
        System.out.println("Paciente com ID " + id + " não encontrado.");
    }

    public void removerPaciente(int id) {
        pacientes.removeIf(paciente -> paciente.getId() == id);
        System.out.println("Paciente removido com sucesso!");
    }
}
