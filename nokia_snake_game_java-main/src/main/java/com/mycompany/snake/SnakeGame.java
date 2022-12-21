/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snake;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author iam-wolverine
 */
public class SnakeGame extends Applet implements Runnable,KeyListener{
    
    public void init(){
        this.resize(400,400);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 400,400);
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void repaint(Graphics g){
        paint(g);
    }

    @Override
    public void run() {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        //init();
    }
}
