package controler;

import java.util.IntSummaryStatistics;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import view.ChangeFeatures;

public class ListenerJTable implements TableModelListener {
    
    private ChangeFeatures view;
    private JTable table;
    
    public ListenerJTable(ChangeFeatures view, JTable table) {
        this.view = view;
        this.table = table;
    }
    
    @Override
    public void tableChanged(TableModelEvent e) {
        try {
            String str;
            IntSummaryStatistics stat = new IntSummaryStatistics();
            for (int i = 0; i < 14; i++) {
                str = table.getValueAt(i, 1).toString();
                stat.accept(Integer.parseInt(str.substring(0, 1)));
            }
            view.setSum(String.valueOf(stat.getSum()));
        } catch (Exception ex) {
            view.setSum("####");
        }
    }
    
}
