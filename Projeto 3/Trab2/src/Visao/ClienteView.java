package Visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import Controle.ClienteControle;


public class ClienteView extends JFrame implements ActionListener {

    private JLabel labelNome, labelCpf, labelEmail, labelData;
    public JButton buttonCadastro, buttonEditar, buttonRemover;
    public JTextField fieldCpf, fieldNome, fieldEmail, fieldData;


    public ClienteView() {
        super("Cadastro de UsuÃ¡rio");

        // Criando e posicionando os labels
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(10, 40, 80, 25);
        add(labelNome);

        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(10, 70, 80, 25);
        add(labelCpf);

        labelEmail = new JLabel("E-mail:");
        labelEmail.setBounds(10, 100, 80, 25);
        add(labelEmail);
        
        labelData = new JLabel("Nascimento:");
        labelData.setBounds(10, 130, 80, 25);
        add(labelData);

        
        // Criando e posicionando os campos de texto
        fieldNome = new JTextField();
        fieldNome.setBounds(90, 40, 200, 25);
        add(fieldNome);

        fieldCpf = new JTextField();
        fieldCpf.setBounds(90, 70, 200, 25);
        add(fieldCpf);

        fieldEmail = new JTextField();
        fieldEmail.setBounds(90, 100, 200, 25);
        add(fieldEmail);
        
        try {
            MaskFormatter formatterData = new MaskFormatter("##/##/####");
            formatterData.setPlaceholderCharacter('0');
            fieldData = new JFormattedTextField(formatterData);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        fieldData.setBounds(90, 130, 200, 25);
        add(fieldData);

        
        // Criando e posicionando o botÃ£o 
        buttonCadastro = new JButton("Cadastrar");
        buttonCadastro.setBounds(10, 200, 100, 25);
        buttonCadastro.addActionListener(this); 
        add(buttonCadastro);
        
        buttonEditar = new JButton("Editar");
        buttonEditar.setBounds(130, 200, 100, 25);
        buttonEditar.addActionListener(this); 
        add(buttonEditar);

        buttonRemover = new JButton("Excluir");
        buttonRemover.setBounds(250, 200, 100, 25);
        buttonRemover.addActionListener(this); 
        add(buttonRemover);
        
        // Definindo layout e propriedades da tela
        setLayout(null);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}

