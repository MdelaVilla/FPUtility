package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import view.AddElement;

public class TransactionSelection implements ActionListener {

    private AddElement view;

    public TransactionSelection(AddElement view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> jcb = (JComboBox<String>) e.getSource();
        view.isExternalQuery("EQ".equals(jcb.getSelectedItem()));
    }

}
