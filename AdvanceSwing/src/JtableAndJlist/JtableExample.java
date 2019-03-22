
package JtableAndJlist;

import javax.swing.*;

public class JtableExample {
    JFrame f;

    JtableExample() {
        f=new JFrame();
        String data[][]={{"101","A","670000"},
            {"102","B","780000"},
            {"103","C","700000"}};//row
        String column[]={"ID","NAME","SALARY"};
        
        JTable jt=new JTable(data, column);
        jt.getColumnModel().getColumn(0).setResizable(false);
        jt.setEnabled(false);
        jt.setBounds(30, 40, 200, 300);
        
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JtableExample();
    }
}
