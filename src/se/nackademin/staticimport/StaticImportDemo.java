package se.nackademin.staticimport;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-06
 * Time: 10:41
 * Project: KVALIT20-OOP-Lektion20
 * Copyright: MIT
 */
public class StaticImportDemo {
  public static void main(String[] args) {

    String name = showInputDialog("Vad heter du?");
    showMessageDialog(null,"Hello " + name);

    double random = random();
    showMessageDialog(null, "PI = " + PI);

  }
}
