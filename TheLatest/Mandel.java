import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.animation.*;
import javafx.scene.image.*;
import java.util.*;
import java.awt.image.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.paint.*;
import java.io.*;
import javax.imageio.*;
import javafx.embed.swing.*;

public class Mandel extends Application{
    public int width=1000;
    public int height=1000;
    
    public static void main(String[] args){
        launch(args);
    }
    
    //Where the magic happens
    public void start(Stage mainStage){
        Group root=new Group();
        Scene scene=new Scene(root);
        mainStage.setScene(scene);
        
        Canvas canvas=new Canvas(width,height);
        root.getChildren().add(canvas);
        GraphicsContext gc=canvas.getGraphicsContext2D();
        
        //For key presses
        List<String> input=new ArrayList<>();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent e){
                String code = e.getCode().toString();
                // only add once... prevent duplicates
                if ( !input.contains(code) )
                    input.add( code );
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent e){
                String code = e.getCode().toString();
                input.remove( code );
            }
        });
        
        //Starting animation
        final long startNanoTime=System.nanoTime();
        
        new AnimationTimer(){
            public void handle(long currentNanoTime){
                //Stuff here
                
                //End stuff
            }
        }.start();
        mainStage.show();
    }
}
