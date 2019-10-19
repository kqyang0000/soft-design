package com.kqyang.chapter08.visitor.example;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MaterialWin extends JFrame implements ItemListener {
    JPanel centerJP;
    SetMaterial os;
    Company company1, company2;
    String[] select;

    public MaterialWin() {
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton art;
        JRadioButton mint;
        os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());
        company1 = new ArtCompany();
        company2 = new Mint();
        this.setBounds(10, 10, 750, 350);
        this.setResizable(false);
        centerJP = new JPanel();
        this.add("Center", centerJP);
        JPanel southJP = new JPanel();
        JLabel y1 = new JLabel("原材料有：铜和纸，请选择生产公司");
        art = new JRadioButton("艺术公司", true);
        mint = new JRadioButton("造币公司");
        art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(art);
        group.add(mint);
        southJP.add(y1);
        southJP.add(art);
        southJP.add(mint);
        this.add("South", southJP);
        select = os.accpet(company1).split(" ");
        showPicture(select[0], select[1]);

    }

    public void showPicture(String cuprum, String paper) {
        centerJP.removeAll();
        centerJP.repaint();
        String fileName1 = "src/image/" + cuprum + ".jpg";
        String fileName2 = "src/image/" + paper + ".jpg";
        JLabel lb = new JLabel(new ImageIcon(fileName1), JLabel.CENTER);
        JLabel rb = new JLabel(new ImageIcon(fileName2), JLabel.CENTER);
        centerJP.add(lb);
        centerJP.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jc = (JRadioButton) e.getSource();
        if (jc.isSelected()) {
            if ("造币公司".equals(jc.getText())) {
                select = os.accpet(company2).split(" ");
            } else {
                select = os.accpet(company1).split(" ");
            }
            showPicture(select[0], select[1]);
        }
    }
}
