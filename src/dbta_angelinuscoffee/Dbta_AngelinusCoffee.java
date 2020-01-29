/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbta_angelinuscoffee;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;

/**
 *
 * @author user
 */
public class Dbta_AngelinusCoffee extends Application {
   
    @Override
  
    public void start(Stage primaryStage) {
       Labels lab = new Labels();
        // FX init
        Group root = new Group(lab.Title(),lab.Num(),lab.AddressText(),lab.Tlp()
        ,lab.ManagerText(),lab.Pos(),lab.Product(),lab.SubTotal(),
                lab.PajakResto(),lab.Total(),lab.Cash(),lab.Credits(),
                lab.CardNo(),lab.ConfirmNo(),lab.ReceiptN(),lab.FacebookWebsite(),
                lab.ThankYou(),lab.Password(),lab.Reccomendation(),
                lab.dash(),lab.dash_2(),lab.dash_3()); 
        Scene scene = new Scene(root, 350, 630,Color.AZURE);  
        //Setting title to the Stage 
        primaryStage.setTitle("AngelinusCoffee"); 
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(false);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */

public class DB(
        private Connection conn;
        private Statement stm;
        private ResultSet rs;
        private String url;
        private String user="root";
        private String pass="";
        private String query;

        public DB(String serverLink, String dbname, String user, String pass){
            this.url="jdbc:mysql://"+serverLink+"/"+dbname;
            this.user=user;
            this.pass=pass;
        }

        public void connectDB(){
            try{
                conn=DriverManager.getConnection(url, user,pass);
                stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, Result.Set.CONCUR_UPDATABLE);
            } catch(Exception e){
                System.out.println("DB: "+e.getMessage());
            }
        }

        public void close(){
            try{
                conn.close();
                System.out.println("DB: Disconnected");
            } catch (SQLException e){
                System.out.println("DB: "+e.getMessage());
            }
        }

        public void execute(String query){
            try{
                this.query=query;
                stm.execute(query);
            } catch(SQLException e){
                System.out.println("DB: "+e.getMessage());
            }
        }

        public void exSelect(String query){
            this.query=query;
            rs=stm.executeQuery(query);
            while (rs.next){
                rs.getString(1);
            }
        }
            )
    public static void main(String[] args) {
        launch(args);
    }    
}
