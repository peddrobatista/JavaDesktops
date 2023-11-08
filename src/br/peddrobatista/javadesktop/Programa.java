package br.peddrobatista.javadesktop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Programa {
    public static void main(String[] args) {
        final String USER = "peddro";
        final String PASS = "geek";

        JFrame frame = new JFrame("Pedro Batista :: Acesso ao Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblUsuario = new JLabel("Usuário: ");
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setToolTipText("Informe seu usuário de acesso!");

        JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField(20);
        txtSenha.setToolTipText("Informe sua senha de acesso!");

        JButton btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)) {
                    JOptionPane.showMessageDialog(frame, "Acesso Autorizado!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Acesso Negado!");
                }
            }
        });

        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblSenha);
        panel.add(txtSenha);

        panel.add(btnLogin);

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
