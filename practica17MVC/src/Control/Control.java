
package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Modelo;
import Vista.Vista;
/**
 *
 * @author Personal
 */
public class Control implements ActionListener{
    
    private Vista view;
    private Modelo model;

    public Control(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.operadorSuma.addActionListener(this);
    }
    
    public void Iniciar(){
        view.setTitle("Usted va a sumar por medio de MVC");
        view.setLocationRelativeTo(null);
        view.txt1.setText(String.valueOf(model.getV1()));
        view.txt2.setText(String.valueOf(model.getV2()));
        view.txt3.setText(String.valueOf(model.getTotal()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        model.setV1(Integer.parseInt(view.txt1.getText()));
        model.setV2(Integer.parseInt(view.txt2.getText()));
        model.sumar();
        view.txt3.setText(String.valueOf(model.getTotal()));
    }

    public void iniciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

