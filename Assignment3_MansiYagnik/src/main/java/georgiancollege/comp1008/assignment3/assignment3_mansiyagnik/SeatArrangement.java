//MANSI PARIMAL YAGNIK
//200515355
package georgiancollege.comp1008.assignment3.assignment3_mansiyagnik;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Random;

//INITIALIZING MAIN JAVA CLASS
public class SeatArrangement {
    //INPUTS FROM GUI TO CONTROL THEM

    //LABEL FOR MESSAGE SHOWN WHEN ADDING A SEAT
    @FXML
    Label Message;

    //COLOR LIST FOR SELECTING A COLOR
    @FXML
    ColorPicker SelectedColor;

    //TEXT-BOX FOR ENTERING STUDENT NAME
    @FXML
    TextField StudentName;

    //BOXES TO SHOW SEAT COLOR
    @FXML
    Rectangle ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9;

    //LABELS FOR SHOWING THE NAME OF STUDENT
    @FXML
    Label n1,n2,n3,n4,n5,n6,n7,n8,n9;

    //ARRAY LIST TO STORE THE COLOR SELECTED
    ArrayList<Object> ColorChoice = new ArrayList<>();

    //ARRAY LIST TO STORE THE STUDENT'S NAME
    ArrayList<Integer> StudentList = new ArrayList<>();

    //METHOD TO SHOW MESSAGE ABOUT CURRENT ACTION AND TO PERFORM CURRENT ACTION
    public void buttonPress() {
        Message.setText("SEAT ASSIGNED");
        if (StudentName.getText().isEmpty()){
            Message.setText("PLEASE ENTER STUDENT'S NAME");
        }else{
            seatUnTaken();
        }
    }

    private void seatUnTaken(){
        Random rnd = new Random();
        int number = rnd.nextInt(9);

        //CHECK FOR UN-TAKEN SEAT AND ASSIGNING SEAT
        if (StudentList.size() < 9){
            if (StudentList.contains(number)){
                seatUnTaken();
            }else{
                seatAssign(number);
            }
        }else{
            Message.setText("SEATS ARE ALL OCCUPIED");
        }
    }

    //METHOD TO ASSIGN SEAT
    private void seatAssign(int a){
        if (ColorChoice.contains(SelectedColor.getValue())){
            Message.setText("CAN'T SELECT COLOR: COLOR ALREADY TAKEN");
        }else {
            if(a==0){
                ps1.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n1.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==1){
                ps2.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n2.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);
            }
            if(a==2){
                ps3.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n3.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==3){
                ps4.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n4.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==4){
                ps5.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n5.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==5){
                ps6.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n6.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==6){
                ps7.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n7.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==7){
                ps8.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n8.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }
            if(a==8){
                ps9.setFill(Color.web(String.valueOf(SelectedColor.getValue())));
                n9.setText(StudentName.getText());
                ColorChoice.add(SelectedColor.getValue());
                StudentList.add(a);

            }

        }
    }
}
