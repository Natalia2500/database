/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.gluonhq.charm.glisten.control.TextField;
import dao.ProductDao;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import entity.Product;


/**
 * FXML Controller class
 *
 * @author Natalia
 */
public class CreateProductController implements Initializable {

    @FXML
    private Button createProductBtn;
    @FXML
    private TextField nomeTextInput;
    @FXML
    private Text codBarreLabel;
    @FXML
    private TextField codBarreTextInput1;
    @FXML
    private TextField qtaTextInput;
    @FXML
    private TextField prezzoTextInput;
    @FXML
    private Text nomeLabel;
    @FXML
    private Text qtaLabel;
    @FXML
    private Text prezzoLabel;
    
    private ProductDao productDao= new ProductDao();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createProduct(ActionEvent event) throws SQLException {
        
        //prendere dati dai textFields
        int codBarre= Integer.parseInt(codBarreTextInput1.getText());
        String nome = nomeTextInput.getText();
        int qta= Integer.parseInt(qtaTextInput.getText());
        int prezzo= Integer.parseInt(prezzoTextInput.getText());
        
        
        //invocare il metodo add sul ProductEntity 
        Product p = new Product(codBarre, nome, qta, prezzo);
        productDao.save(p);
        
        cleanFields();
        
    }
    
    private void cleanFields(){
        nomeTextInput.setText("");
        codBarreTextInput1.setText("");
        qtaTextInput.setText("");
        prezzoTextInput.setText("");
    }
}
