/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbta_angelinuscoffee;

import java.awt.Label;
import java.awt.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author user
 */
public class Labels {

    public Labels() 
    {
        System.out.println("This is a Constructor");
    }
     
    public Text Title()
    {
        Text title = new Text();
        title.setText("AngelinusCoffee"); 
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
        title.setX(20); 
        title.setY(50); 
        return title;
    }
    
    public Text Num()
    {
        Text num = new Text();
        num.setText("Ready Number 016");
        num.setFont(Font.font("Times New Roman",FontWeight.SEMI_BOLD,20));
        num.setX(95);
        num.setY(90);
        return num;
    }
    public Text AddressText()
    {
        Text addressText = new Text();
        addressText.setText("Address : ");
        addressText.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        addressText.setX(20);
        addressText.setY(125);
        return addressText;
    }
     public Text Tlp()
    {
        Text tlp = new Text();
        tlp.setText("Tlp :");
        tlp.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        tlp.setX(20);
        tlp.setY(140);
        return tlp;
    }
    public Text ManagerText()
    {
        Text mT = new Text();
        mT.setText("Manager Store :");
        mT.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        mT.setX(20);
        mT.setY(155);
        return mT;
    }
    public Text Pos()
    {
        Text pos = new Text();
        pos.setText("POS#3 :");
        pos.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        pos.setX(20);
        pos.setY(170);
        return pos;
    }
    public Text Product()
    {
        Text prod = new Text();
        prod.setText("Product Name");
        prod.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        prod.setX(20);
        prod.setY(190);
        return prod;
        
    }
    public Text SubTotal()
    {
        Text st = new Text();
        st.setText("Sub Total:");
        st.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        st.setX(150);
        st.setY(290);
        return st;
    }
    
    public Text PajakResto()
    {
        Text pr = new Text();
        pr.setText("Pajak Restaurant 10%:");
        pr.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        pr.setX(80);
        pr.setY(310);
        return pr;
    }
     public Text Total()
    {
        Text total = new Text();
        total.setText("Total :");
        total.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        total.setX(20);
        total.setY(360);
        return total;
    }
     public Text Cash()
    {
        Text cash = new Text();
        cash.setText("Cash :");
        cash.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        cash.setX(20);
        cash.setY(385);
        return cash;
    }
        public Text Credits()
    {
        Text cr = new Text();
        cr.setText("Credit :");
        cr.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        cr.setX(20);
        cr.setY(410);
        return cr;
    }
        
     public Text CardNo()
    {
        Text cn = new Text();
        cn.setText("Card No :");
        cn.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        cn.setX(20);
        cn.setY(470);
        return cn;
    }
      public Text ConfirmNo()
    {
        Text cn = new Text();
        cn.setText("Confrim No :");
        cn.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        cn.setX(20);
        cn.setY(495);
        return cn;
    }
      public Text ReceiptN()
    {
        Text r = new Text();
        r.setText("Receipt N :");
        r.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        r.setX(20);
        r.setY(515);
        return r;
    }
      public Text ThankYou()
      {
        Text t = new Text();
        t.setText("TERIMA KASIH,TAKE YOU TIME!!:");
        t.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,18));
        t.setX(20);
        t.setY(540);
        return t;
      }
     public Text Password()
     {
        Text t = new Text();
        t.setText("Password Wifi:");
        t.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        t.setX(20);
        t.setY(565);
        return t;
     }
     public Text FacebookWebsite()
     {
        Text t = new Text();
        t.setText("FACEBOOK WEBSITE:");
        t.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        t.setX(20);
        t.setY(590);
        return t;
     }
     public Text Reccomendation()
     {
        Text t = new Text();
        t.setText("Reccomend : Cappucino :)");
        t.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD,16));
        t.setX(20);
        t.setY(610);
        return t;
     }
    public Text dash()
    {
        Text dash = new Text();
        dash.setText("----------------------------------------------------------"
                + "----------------");
        dash.setX(1);
        dash.setY(270);
        return dash;
    }
   public Text dash_2()
    {
        Text dash2 = new Text();
        dash2.setText("----------------------------------------------------------"
                + "----------------");
        dash2.setX(1);
        dash2.setY(340);
        return dash2;
    }
      public Text dash_3()
    {
        Text dash3 = new Text();
        dash3.setText("----------------------------------------------------------"
                + "----------------");
        dash3.setX(1);
        dash3.setY(440);
        return dash3;
    }
}
