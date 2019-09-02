/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_7;

// importa o pacote awt

import java.awt.*;
// importa os eventos do awt
import java.awt.event.*;
// importa o pacote swing
import javax.swing.*;
// a classe Exercicio_7 herda as características da classe JFrame
// e implementa uma interface para os eventos de ActionListener
// para verificar qual botão foi pressionado para determinar
// as ações (comandos) de cada botão.

/**
 *
 * @author denis
 */

class Exercicio_7 extends JFrame implements ActionListener {
// define os atributos para criar posteriormente os objetos gráficos da GUI

    JLabel LNum1, LNum2, LResultado;
    JButton BSoma, BSubtrai, BMultiplica, BDivide, BLimpa, BQuadrado, BPotencia, BRaiz;
    JTextField TNum1, TNum2, TResultado;
// método principal da classe Exercicio_7

    public static void main(String args[]) {
// cria o objeto GUI que conterá uma janela
        JFrame GUI = new Exercicio_7();
// exibe a janela na tela.
        GUI.setVisible(true);
// define a ação do botão fechar
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // fim do método principal
// método construtor da classe que define as características da GUI

    public Exercicio_7() {
// ajusta o título da janela
        setTitle("GUI de Calculadora");
// ajusta o tamanho da janela (largura e altura)

        setSize(450, 150);
// define a posição da janela (horizontal e vertical) do canto superior esquerdo
        setLocation(200, 200);
// ajusta a cor de fundo da janela
        getContentPane().setBackground(new Color(220, 220, 220));
// ajusta o layout da tela para uma matriz de 3 linhas e 4 colunas
        setLayout(new GridLayout(4, 4));
// cria o objeto de rótulo LNum1 com o texto indicado
        LNum1 = new JLabel("1°Núm.");
// ajusta a cor da fonte do rótulo LNum1
        LNum1.setForeground(Color.blue);
// ajusta a fonte do rótulo LNum1
        LNum1.setFont(new Font("", Font.BOLD, 16));
// cria o objeto de rótulo LNum2 com o texto indicado
        LNum2 = new JLabel("2°Núm.");
// ajusta a cor da fonte do rótulo LNum2
        LNum2.setForeground(Color.blue);
// ajusta a fonte do rótulo LNum2
        LNum2.setFont(new Font("", Font.BOLD, 16));
// cria o objeto de rótulo LResultado com o texto indicado
        LResultado = new JLabel("Resultado");
// ajusta a fonte do rótulo LResultado
        LResultado.setFont(new Font("", Font.BOLD, 16));
// ajusta a cor da fonte do rótulo LResultado
        LResultado.setForeground(Color.red);
// cria o objeto de botão BSoma
        BSoma = new JButton("+");
// define que o botão BSoma terá o tratamento de eventos.
        BSoma.addActionListener(this);
// cria o objeto de botão BSubtrai
        BSubtrai = new JButton("-");
// define que o botão BSubtrai terá o tratamento de eventos.
        BSubtrai.addActionListener(this);
// cria o objeto de botão BMultiplica
        BMultiplica = new JButton("x");
// define que o botão BMultiplica terá o tratamento de eventos.
        BMultiplica.addActionListener(this);
// cria o objeto de botão BDivide
        BDivide = new JButton("/");
// define que o botão BDivide terá o tratamento de eventos.
        BDivide.addActionListener(this);
        BQuadrado = new JButton("Quadrado");
// define que o botão BQuadrado terá o tratamento de eventos.
        BQuadrado.addActionListener(this);
        BPotencia = new JButton("Potência");
// define que o botão BPotencia terá o tratamento de eventos.
        BPotencia.addActionListener(this);
        BRaiz = new JButton("Raiz");
// define que o botão BRaiz terá o tratamento de eventos.
        BRaiz.addActionListener(this);    
        BLimpa = new JButton("Limpar");
// define que o botão BLimpa terá o tratamento de eventos.
        BLimpa.addActionListener(this);
// ajusta a cor de fundo do botão BLimpa
        BLimpa.setBackground(Color.red);
// ajust a cor da fonte do botão BLimpa
        BLimpa.setForeground(Color.white);
// cria o objeto de caixa de texto TNum1
        TNum1 = new JTextField();
// cria o objeto de caixa de texto TNum2
        TNum2 = new JTextField();
// cria o objeto de caixa de texto TResultado
        TResultado = new JTextField();
// desabilita a edição da caixa de texto TResultado
        TResultado.setEditable(false);
// adiciona o rótulo LNum1 ao Frame
        add(LNum1);
// adiciona a caixa de texto TNum1 ao Frame
        add(TNum1);
// adiciona o botão BSoma ao Frame
        add(BSoma);
// adiciona o botâo BSubtrai ao Frame
        add(BSubtrai);
// adiciona o rótulo LNum2 ao Frame
        add(LNum2);
// adiciona a caixa de texto TNum2 ao Frame
        add(TNum2);
// adiciona o botão BMultiplica ao Frame
        add(BMultiplica);
// adiciona o botão BDivide ao Frame
        add(BDivide);
// adiciona o rótulo LResultado ao Frame
        add(LResultado);
// adiciona a caixa de texto TResultado ao Frame
        add(TResultado);
// adiciona o botão BQuadrado ao Frame
        add(BQuadrado);
// adiciona o botão BPotencia ao Frame
        add(BPotencia);
// adiciona espaços vazios para ajustar o layout        
        add(new JLabel(""));
// adiciona espaços vazios para ajustar o layout        
        add(new JLabel(""));
// adiciona o botão BRaiz ao Frame
        add(BRaiz);
// adiciona o botão BLimpa ao Frame
        add(BLimpa);
    } // fim do método construtor da classe
// método que implementa uma interface para os eventos da janela
// para verificar qual botão foi pressionado e para determinar
// as ações (comandos) de cada botão.

    public void actionPerformed(ActionEvent evento) {
// verifica se o botão BLimpa foi clicado e limpa as caixas de texto
        if (evento.getSource() == BLimpa) {
            // limpa a caixa de textoTNum1
            TNum1.setText("");
// limpa a caixa de textoTNum2
            TNum2.setText("");
// limpa a caixa de textoTResultado
            TResultado.setText("");
// retorna para o método principal (main)
            return;
        }
// cria as variáveis internas para efetuar os cálculos
        double num1 = 0, num2 = 0, resultado = 0;
// o bloco try possibilita o tratamento de alguma exceção (erro)
// que possa ocorrer nos comandos contidos neste bloco, como tentar
// converter os números nas caixas de texto e não houver um valor
// numérico preenchido.
        try {
// atribui à varíavel num1 o valor armazenado na caixa de texto
// TNum1, mas faz a conversão de String (cadeia) para double (real)
// antes de fazer a atribuição
            num1 = Double.parseDouble(TNum1.getText());
// atribui à varíavel num2 o valor armazenado na caixa de texto
// TNum2, mas faz a conversão de String (cadeia) para double (real)
// antes de fazer a atribuição
            if(!TNum2.getText().isEmpty()){
                num2 = Double.parseDouble(TNum2.getText());
            }
            
        } // fim do bloco try
        // tratamento da exceção (erro) de conversão inválida de números.
        catch (NumberFormatException erro) {
// apresenta na caixa de texto TResultado a mensagem de erro
            TResultado.setText("Erro");
// retorna ao método principal (main)
            return;
        } // fim do bloco catch
// verifica se o botão BSoma foi clicado e faz a operação da Soma
        if (evento.getSource() == BSoma) {
            resultado = num1 + num2;
        }
// verifica se o botão BSubtrai foi clicado e faz a operação da Subtração
        if (evento.getSource() == BSubtrai) {
            resultado = num1 - num2;
        }
// verifica se o botão BMultiplica foi clicado e faz a operação de Multiplicação
        if (evento.getSource() == BMultiplica) {
            resultado = num1 * num2;
        }
// verifica se o botão BDivide foi clicado e faz a operação de Divisão
        if (evento.getSource() == BDivide) {
            if(num2==0.0){
                JOptionPane.showMessageDialog(null, "Divisão por 0 é indeterminada");
            }else{
                resultado = num1 / num2;
            }
            
            
        }
// verifica se o botão BQuadrado foi clicado e faz a operação de Quadrado
        if (evento.getSource() == BQuadrado) {
            resultado = num1 * num1;
        }        
// verifica se o botão BPotencia foi clicado e faz a operação de Potência
        if (evento.getSource() == BPotencia) {
            resultado = Math.pow(num1,num2);
        }
// verifica se o botão BRaiz foi clicado e faz a operação de Raiz
        if (evento.getSource() == BRaiz) {
            resultado = Math.sqrt(num1);
        }        
// Apresenta o valor da variável resultado dentro da caixa de texto
// TResultado, mas faz a conversão de double (real) para String (cadeia)
// antes de apresentar o valor.
        TResultado.setText(String.valueOf(resultado));
    } // fim do método que implementa a interface para eventos da janela
} // fim da classe

