/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaMain;

import Controller.Tarefa;
import Controller.Usuario;
import View.JFrameLogin;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();

        JFrameLogin jFrameLogin = new JFrameLogin();
        jFrameLogin.setLocationRelativeTo(null);
        jFrameLogin.setVisible(true);
     
    }
}
