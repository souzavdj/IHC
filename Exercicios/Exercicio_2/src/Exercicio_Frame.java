/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author souza
 */
public class Exercicio_Frame extends JFrame{
    
    JLabel titulo, rotulo1, rotulo2, rotulo3;
    
    ImageIcon imagem = new ImageIcon("img/TV1.gif");
    
    Exercicio_Frame() {
        setTitle("Primeiro Exercício");
        this.titulo = new JLabel("Programação de Hoje", JLabel.CENTER);
        this.titulo.setForeground(Color.BLUE);
        this.titulo.setFont(new Font("Courier", Font.BOLD, 20));
        setSize(400, 400);
        setResizable(false);
        getContentPane().setBackground(new Color(220, 220, 220));
        this.rotulo1 = new JLabel("14h40 - Início do Curso", JLabel.LEFT);
        this.rotulo1.setForeground(Color.GREEN);
        this.rotulo1.setIcon(this.imagem);
        this.rotulo1.setToolTipText("Erro na Imagem!!!");
        this.rotulo2 = new JLabel("16h45 - Início das Atividades", JLabel.CENTER);
        this.rotulo2.setForeground(Color.ORANGE);
        this.rotulo2.setIcon(this.imagem);
        this.rotulo2.setToolTipText("Erro na Imagem!!!");
        this.rotulo3 = new JLabel("18h15 - Término do Curso", JLabel.RIGHT);
        this.rotulo3.setForeground(Color.RED);
        this.rotulo3.setIcon(this.imagem);
        this.rotulo3.setToolTipText("Erro na Imagem!!!");
        setLayout(new GridLayout(4, 1));
        add(titulo);
        add(rotulo1);
        add(rotulo2);
        add(rotulo3);
    }

    public static void main(String args[]) {
        JFrame GUI_1 = new Exercicio_Frame();
        GUI_1.setVisible(true);
        GUI_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
