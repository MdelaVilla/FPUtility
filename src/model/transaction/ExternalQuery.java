package model.transaction;

import model.Complexity;

public class ExternalQuery extends Transaction {

    public ExternalQuery(String name, int det_in, int ftr_in,
            int det_out, int ftr_out) {
        ExternalInput ei = new ExternalInput(name, det_in, ftr_in);
        ExternalOutput eo = new ExternalOutput(name, det_out, ftr_out);
        Complexity c1 = ei.getComplexity(), c2 = eo.getComplexity();
        setName(name);
        setComplexity((c1.compareTo(c2) < 0 ? c2 : c1));
    }

}
