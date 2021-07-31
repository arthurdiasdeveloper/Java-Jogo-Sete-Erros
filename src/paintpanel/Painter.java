/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintpanel;
//testando o painel 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author Arthur Dias
 */
public class Painter {

    //adicinar uma imagen icon na Jframe
    ImageIcon jogo = new ImageIcon(getClass().getResource("jogo.jpg"));

    public static void main(String[] args) {

        //instacie o objeto porque o jframe é uma classe normal
        JFrameResultadoJogo tp = new JFrameResultadoJogo();

        //ele mostra a janela
        tp.setVisible(true);

        //cria o jframe
        JFrame application = new JFrame("DESENHE NESTA JANELA!");

        PaintPanel paintPanel = new PaintPanel(); // cria o painel de pintura
        application.add(paintPanel, BorderLayout.CENTER);
        //cria um rotulo e o coloca em south do borderlayout 
        application.add(new JLabel("CRIADOR: ARTHUR DIAS."),
                BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 400);
        application.setVisible(true);

    }

}
