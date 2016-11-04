/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaMain;

import Controller.Tarefa;
import Controller.Usuario;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();

        // Se encontrada tarefa id número 3   
        if (tarefa.encontradoId(Long.valueOf(3))) {

            // Se não foi possível excluir a tarefa
            if (!tarefa.desarmazenado()) {
                JOptionPane.showMessageDialog(null, "Tarefa não pode ser excluída");
            }
        }

    }
}
