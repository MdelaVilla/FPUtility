package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import view.AddTransaction;

public class CntrVwAddTrnsctn implements ActionListener {
    
    private AddTransaction view;
    private JComboBox box;

    public CntrVwAddTrnsctn(AddTransaction view, JComboBox box) {
        this.view = view;
        this.box = box;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        view.isExternalQuery(box.getSelectedIndex() == 4);
    }

}
