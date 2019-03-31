/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Mapa extends JFXPanel {
//Variable encargada de renderizar el website

    private WebEngine engine;

    //Constructor de la clase
    public Mapa() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView view = new WebView();
                engine = view.getEngine();
                setScene(new Scene(view));
            }
        });
        setVisible(true);
    }
//Método para cargar la URL de la página web

    public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String tmp = toURL(url);
                if (tmp == null) {
                    tmp = toURL(url);
                }
                engine.load(tmp);

            }
        });
    }

    private String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }
}
